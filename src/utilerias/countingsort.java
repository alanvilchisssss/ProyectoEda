package utilerias;
import java.util.Scanner;
import java.util.Arrays;
public class countingsort {
    public static int AlgoritmoCounting(int[] arr){
        int comparaciones[]=new int[arr.length];
        int suma=0;
        int j=0;
        int elem=0;
        int n=arr.length;
        int max=findMax(arr,comparaciones);
        int[] count=new int[max+1];
        int[] coleccion=new int[n];
        fillZeros(count);
        fillZeros(coleccion);
        for(j=0; j<n; j++){
            elem=arr[j];
            count[elem]++;
            comparaciones[0]++;
        }
        
        for(int i=1; i<=max;i++){
            count[i]=count[i]+count[i-1];
            comparaciones[0]++;
        }

        for(int i=0; i<count.length; i++){
            count[i]-=1;
        }
        for(j=n; j>0;j--){
            int temp=arr[j-1];
            restore(count[temp],arr,coleccion,j, comparaciones);
        }

        for(int i=0; i<n; i++){
            arr[i]=coleccion[i];
        }
        for(int i=0;i<comparaciones.length; i++){
            suma+=comparaciones[i];
        }
        return (suma);
    }
    public static int findMax(int[] arr,int[] comparaciones){
        int temp=0;
        int j=1;
        for(int i=0; i<arr.length-1;i++){
            
            if(arr[i]>arr[j] && arr[i]>temp){
                temp=arr[i];
                comparaciones[1]++;
            }else if(arr[i]<arr[j] && arr[j]>temp){
                temp=arr[j];
                comparaciones[1]++;
            }
            j++;
        }
        return temp;

    }
    public static void restore(int count, int[] arr,int[] coleccion, int j, int[] comparaciones){
        int temp=arr[j-1];
        if(temp==0){
            coleccion[0]=0;
            comparaciones[2]++;
        }else{
                if(coleccion[count]=='\0'){//caso 1, está el índice del arreglo vacía
                    coleccion[count]=temp;
                    comparaciones[2]++;
                }
                else if(coleccion[count]!='\0'){//caso 2, está el índice del arreglo lleno
                    count--;
                    restore(count, arr, coleccion, j,comparaciones);
                    comparaciones[2]++;

                }
        }
    }
    public static void fillZeros(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            arr[i]=0;
        }
    }
    public static int findMin(int[] arr,int[] comparaciones){
        int temp=findMax(arr,comparaciones);
        int j=1;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]<arr[j] && arr[i]<temp){
                temp=arr[i];
            }
            j++;
        }
        return temp;

    }
    public static void LlenarArregloConLetras(char[] Arr,Scanner scanner){
        //char[] ABECEDARIO=new char[]{'A','B','C','D','E','F','G','H','I','J'};
        //String Letras="ABCDEFGHIJ";
        String[] elemento=new String[Arr.length];
        System.out.println("LLene el arreglo de 20 elementos con letras de la A a la J");
        int contador=0;
        for(int i=0; i<Arr.length; i++){
            i=contador;
            try{
                System.out.print("Posición ["+i+"]");
                elemento[i]=scanner.next().toUpperCase();
                scanner.nextLine();
                if(Character.isDigit(elemento[i].charAt(0))){
                    throw new IllegalArgumentException("Ingresa una letra correcta");
                }else if(Character.isLetter(elemento[i].charAt(0))){
                    Arr[i]=elemento[i].charAt(0);
                    contador++;
                }
            }catch(IllegalArgumentException e){
                System.err.println("Error: " + e.getMessage());
            } 
        }
        System.out.println("\n");
    }
    public static void ArregloDeCaracteresANumeros(char[] Arr,int[] CopiaNum){
        for(int i=0; i<Arr.length;i++){
            CopiaNum[i]=Character.valueOf(Arr[i]);
        }
    }
    public static void DeNúmerosACharacteres(char[]Arr,int[] Copia){
        char[] temp=new char[20];
        for(int i=0; i<Arr.length;i++){
            temp=Character.toChars(Copia[i]);
            Arr[i]=temp[0];
        }
        System.out.println("El arreglo temporal es:"+Arrays.toString(Arr));
    }
}
