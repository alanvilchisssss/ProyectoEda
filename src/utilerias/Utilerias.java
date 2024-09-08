package utilerias;
import java.util.Random;
import java.util.Scanner;
public class Utilerias {
    public static void imprimirArreglo(int[] arreglo){
        for(int i:arreglo){  
            System.out.print("["+i+"] ");  
        }
        System.out.println(" ");
    }
    public static void imprimirArregloChar(char[] arreglo){
        for(char i:arreglo){  
            System.out.print("["+i+"] ");  
        }
        System.out.println(" ");
    }
    public static void imprimirArregloString(String[] arreglo){
        for(String i:arreglo){  
            System.out.print("["+i+"] ");  
        }
        System.out.println(" ");
    }
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];   
        arr[x] = arr[y];  
        arr[y] = temp;
    }
    public static int Aleatorio(int maximo){
        Random random=new Random();
        int numero=random.nextInt(maximo);
        return numero;
    }
    public static void ArregloAleatorio(int[] arr,int n, Scanner scanner){
        int i=0;
        //System.out.println("Arreglo de "+n+" unidades:");
        for(i=0; i<n;i++){
            arr[i]=Aleatorio(10000);
            //System.out.print("["+arr[i]+"]");
        }
        System.out.println("\n");
    }
    public static void printSubArray(int[] arr, int low, int high){
        int i;
        System.out.println("Sub array: ");
        for(i=low;i<=high; i++){
            System.out.print("["+arr[i]+"]");
        }
        System.out.println("\n");
    }
    public static void IngresoNumeros(String[] arr2, Scanner scanner){
        System.out.println("Ingrese los [15] numeros con longitud máxima de 4 dígitos, utilizando los números del 0 al 4");
        System.out.println("Ejemplo: [1000][0100][0010][0001]");
        int contador=0;
        for(int i=0; i<arr2.length; i++){
            String temp2="";
            i=contador;
            System.out.print("Posición["+i+"]");
            temp2=scanner.next();
            scanner.nextLine();
            if(temp2.length()<=4){   
                    contador++;
                    arr2[i]=temp2;
            }else if(temp2.length()<=4){
                    System.out.println("Ingrese menos de 4 dígitos");
            }
        }
        System.out.println("\n");
    }
    public static void BuildHeap(int[] arr){
        int n=arr.length-1;
        int i;
        System.out.println("\n Construcción del heap:\n");
        for(i =n/2; i>=0;i--){
            Heapify(arr,i,n+1,n);
            imprimirArreglo(arr);
            System.out.println("Termino de construcción del heap.");
        }
    }
    public static void Heapify(int[] arr, int i,int size, int heapSize){
        int l=2*i+1;
        int r = 2 * i + 2;
	    int largest;
        if(l <= heapSize && arr[l] > arr[i])
    	    largest = l;
  	    else
    	    largest = i;
  	    if(r <= heapSize && arr[r] > arr[largest])
    	    largest = r;
  	    if(largest != i){
            swap(arr,i,largest);
    	    Heapify(arr, largest,size,heapSize);
        }
    }
    public static void menu(Scanner scanner){
        int opcion=0;
        do{
            System.out.println("***Menu para poder ejecutar cada algoritmo e imprimir el número de las operaciones que realiza***");
            System.out.println("¿Que algortimo desea utilizar?");
            System.out.println("1.-InsertionSort");
            System.out.println("2.-selectionSort");
            System.out.println("3.-Bubblesort");
            System.out.println("4.-Quicksort");
            System.out.println("5.-HeapSort");
            System.out.println("6.-MergeSort");
            System.out.println("7.-CountingSort"); 
            System.out.println("8.-Salir");
            opcion=scanner.nextInt();

            switch(opcion){
                case 1->{

                }
                case 2->{
                    
                }
                case 3->{
                    PuntoDeEntrada.OperacionesBubbleSort(scanner);
                }
                case 4->{
                    
                }
                case 5->{
                    
                }
                case 6->{
                    PuntoDeEntrada.OperacionesMergeSort(scanner);
                }
                case 7->{
                    PuntoDeEntrada.OperacionesCountingSort(scanner);
                    
                }
                case 8->{
                    System.out.println("Proyecto terminado.");
                }
            }
            
        }while(opcion!=8);
    }
}
