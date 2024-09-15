package utilerias;
public class SelectionSort {  
   
    public static int selectionSort(int[] arr){  
        int n = arr.length;
        int comparaciones=0;
        int intercambio=0;
        int inserciones=0;
        for (int i = 0; i < n - 1; i++){  
            int min = i;  
            for (int j = i + 1; j < n; j++){  
                if (arr[j] < arr[min]){
                    comparaciones++;  
                    min = j;  
                }                      
            }  
            
            Utilerias.swap(arr, i,min);
             intercambio++;
             inserciones++; 
                 
        }  
        return intercambio+inserciones+comparaciones;
    }  
 

}  