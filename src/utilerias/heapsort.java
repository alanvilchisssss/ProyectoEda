package utilerias;
public class heapsort {
    public static void HeapSort(int[] arr){
        int n=arr.length-1;
        int heapsize=n;
        Utilerias.BuildHeap(arr);
        int i;
        System.out.println("Eliminación de la raíz:");
        for(i=n;i>0; i--){
            Utilerias.swap(arr,0,heapsize);
            Utilerias.imprimirArreglo(arr);
            heapsize--;
            Utilerias.Heapify(arr, 0, arr.length, heapsize);
        }
        System.out.println("termino de eliminación de la raíz");

        System.out.println("Arreglo ordenado:");
        Utilerias.imprimirArreglo(arr);
    }
}
