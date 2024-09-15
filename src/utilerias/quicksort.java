package utilerias;
public class quicksort{
    static int comparaciones=0;
    static int intercambios=0;
    public static int partition(int arr[], int low, int high){
        int pivot=arr[high];
        int i=(low-1);
        for(int j=low; j<high;j++){
            comparaciones++;
            if(arr[j]<= pivot){
                i++;
                Utilerias.swap(arr, i, j);
                intercambios++;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        intercambios++;
        return i+1;
    }
    public static int Quicksort(int arr[], int low, int high){
        if(low<high){
            int pi=partition(arr,low,high);
            Quicksort(arr, low, pi-1);
            //Utilerias.printSubArray(arr, low, high);
            Quicksort(arr, pi+1, high);
            //Utilerias.printSubArray(arr, low, high);
        }
        return comparaciones+intercambios;
    }
    public static void reinciar(){
        comparaciones=0;
        intercambios=0;
    }
}
