package utilerias;
public class SelectionSort {  
   
    public static int selectionSort(int[] arr){  
        int n = arr.length;
        int comparaciones=0;
        int intercambio=0;
        int inserciones=0;
        for (int i = 0; i < n - 1; i++){  
            int min = i;  
            inserciones+=1;
            for (int j = i + 1; j < n; j++){ 
                comparaciones++;  
                 if (arr[j] < arr[min]){
                    min = j;  
                    inserciones++;
                }                      
            }  
            
            Utilerias.swap(arr, i,min);
             intercambio++;
             //inserciones++; 
                 
        }  
        return intercambio+inserciones+comparaciones;
    }  
 

}  