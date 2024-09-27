import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] arr = { 1,5,8,3,2,4,19,18,7};
        HeapAlgo heapAlgo = new HeapAlgo();
        heapAlgo.maxHeap(arr);
        System.out.println("Max-Heap array: ");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 8, 3, 2, 4, 19, 18, 7));
        HeapAlgoList heapAlgoList = new HeapAlgoList();
        heapAlgoList.maxHeapL(list);
        System.out.println(list);
        heapAlgoList.heapAdd(19,list);
        System.out.println(list);
        heapAlgoList.heapDeleteHead(list);
        System.out.println(list);
    }
}