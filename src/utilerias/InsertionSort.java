package utilerias;

public class InsertionSort{  
    
    public static int insertionSort(int array[]) {  
        int n = array.length;  
        int comparaciones=0;
        int intercambios=0;
        int insercion=0;
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                comparaciones++;
                array [i+1] = array [i];  
                i--;  
                intercambios++;
            }  
            array[i+1] = key;  
            insercion++;
        }  
        return insercion+intercambios+comparaciones;
    } 
}