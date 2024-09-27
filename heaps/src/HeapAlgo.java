public class HeapAlgo {
    public void maxHeapify(int [] arr, int n, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if( left < n && arr[left] > arr[largest]){
            largest = left;
        }

        if( right < n && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // recursion
            maxHeapify(arr,n,largest);
        }
    }

    public void maxHeap(int [] arr){
        int n = arr.length;
        for(int i = n/2 - 1; i >= 0; i--){
            maxHeapify(arr,n,i);
        }
    }


}
