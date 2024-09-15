package utilerias;
public class heapsort {
    public static int HeapSort(int[] arr){
        int suma=0;
        int n=arr.length-1;
        int heapsize=n;
        suma+=Utilerias.BuildHeap(arr);
        int i;
        for(i=n;i>0; i--){
            Utilerias.swap(arr,0,heapsize);
            suma++;
            heapsize--;
            suma+=Utilerias.Heapify(arr, 0, arr.length, heapsize);
        }
        
        return suma;
    }
}
