package utilerias;
public class MergeSort {

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static int merge(int arr[], int left, int mid, int right,int[]contador) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        //Pasan valores a las sublistas
        for (int i = 0; i < n1; ++i){
            L[i] = arr[left + i];
            contador[0]++;
        }
        for (int j = 0; j < n2; ++j){
            R[j] = arr[mid + 1 + j];
            contador[0]++;
        }

        int i = 0, j = 0;

        int k = left;

        //Compara los valores y los intercambia
        while (i < n1 && j < n2) {
            contador[0]++;
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
                contador[0]++;
            } else {
                arr[k] = R[j];
                j++;
                contador[0]++;
            }
            k++;
            //contador[0]++;
        }

        //En caso de que se queden sin elementos se copia el sobrante de la lista.
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
            contador[0]++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
            contador[0]++;
        }
        
        return contador[0];
    }

    public static int mergeSort(int arr[], int left, int right,int[]contador) {
        //int[] contador=new int[1];
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid,contador);
            mergeSort(arr, mid + 1, right,contador);
            merge(arr, left, mid, right,contador);
        }
        
            return contador[0];
    }
}