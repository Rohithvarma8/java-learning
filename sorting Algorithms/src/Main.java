import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // will implement selection, insertion, bubble, merge and quick sort in this code
    // Striver a2z dsa sheet is used as reference

    public static void selectionSort(int [] arr , int n){
        for (int i = 0; i < n-1; i++) {
            int temp = i;
            for (int j = i ; j < n; j++) {
                if(arr[temp] > arr[j]) {
                    temp = j;
                }
            }
            int temp_var = arr[i];
            arr[i] = arr[temp];
            arr[temp] = temp_var;
        }
    }

    public static void bubbleSort(int [] arr , int n){
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int [] arr , int n){
       for (int i = 1; i < n; i++) {
           int high = i;
           while (high > 0 && arr[high] < arr[high - 1]) {
               int temp = arr[high];
               arr[high] = arr[high - 1];
               arr[high - 1] = temp;
               high--;
           }

       }
    }

    public static void merge (int [] arr , int low , int mid , int high){
        ArrayList <Integer> temp = new ArrayList<>();
        int right = mid + 1;
        int left = low;
        System.out.println("Im here");
        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i-low);
        }
    }

    public static void mergeSort(int [] arr , int low , int high){
        if(low >= high) return;
        int mid = (low + high)/2;
        mergeSort(arr , low , mid);
        mergeSort(arr , (mid + 1), high);
        merge(arr,low, mid, high);
    }


    public static void main(String[] args) {
        int [] arr = new int [] {7,5,3,67,4,73,32,57,65,57,8};

        //selectionSort(arr,arr.length);
        //bubbleSort(arr,arr.length);
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        //insertionSort(arr,arr.length);
        int n = arr.length;
        mergeSort(arr,0,n-1);
        System.out.println("Sorted Array: "+ Arrays.toString(arr));

        

    }
}