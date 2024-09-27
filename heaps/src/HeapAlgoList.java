import javax.swing.*;
import java.util.List;

public class HeapAlgoList {
    public void heapDeleteHead(List<Integer> list){
        int swap = list.get(0);
        list.set(0,list.get(list.size() - 1));
        list.set(list.size() - 1, swap);
        list.remove(list.size() - 1);
        maxHeapL(list);
    }
    public void heapAdd(int number, List<Integer> list){
        list.add(number);
        maxHeapL(list);
    }
    public void maxHeapL(List<Integer> list){
        int size = list.size();
        for(int i = size/2 -1; i>=0; i--){
            maxHeapifyL(list,size,i);
        }
    }
    public void maxHeapifyL(List<Integer> list, int n, int i){
        int largest = i;
        int left = 2*i +1;
        int right = 2*i+2;

        if( left < n && list.get(left) > list.get(largest)){
            largest = left;
        }

        if( right < n && list.get(right) > list.get(largest)){
            largest = right;
        }

        if (largest != i){
            int swap = list.get(i);
            list.set(i,list.get(largest));
            list.set(largest,swap);

            maxHeapifyL(list,n,largest);
        }
    }
}
