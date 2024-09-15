package utilerias;
import java.util.Scanner;
import java.util.Arrays;
public class PuntoDeEntrada {
    public static void OperacionesBubbleSort(Scanner scanner){
        System.out.println("Algoritmo Bubblesort");
        int[] arreglo1=new int[50];
        int[] arreglo2=new int[100];
        int[] arreglo3=new int[800];
        int[] arreglo4=new int[1000];
        int[] arreglo5=new int[2000];
        int[] arreglo6=new int[5000];
        int[] arreglo7=new int[10000];
        int[] a=new int[5];
        int[] b=new int[5];
        int[] c=new int[5];
        int[] d=new int[5];
        int[] e=new int[5];
        int[] f=new int[5];
        int[] g=new int[5];
        
        
        for(int i=0; i<5;i++){
            Utilerias.ArregloAleatorio(arreglo1, arreglo1.length, scanner);
            Utilerias.ArregloAleatorio(arreglo2, arreglo2.length, scanner);
            Utilerias.ArregloAleatorio(arreglo3, arreglo3.length, scanner);
            Utilerias.ArregloAleatorio(arreglo4, arreglo4.length, scanner);
            Utilerias.ArregloAleatorio(arreglo5, arreglo5.length, scanner);
            Utilerias.ArregloAleatorio(arreglo6, arreglo6.length, scanner);
            Utilerias.ArregloAleatorio(arreglo7, arreglo7.length, scanner);
            a[i]=BubbleSort.Bubblesort(arreglo1);
            b[i]=BubbleSort.Bubblesort(arreglo2);
            c[i]=BubbleSort.Bubblesort(arreglo3);
            d[i]=BubbleSort.Bubblesort(arreglo4);
            e[i]=BubbleSort.Bubblesort(arreglo5);
            f[i]=BubbleSort.Bubblesort(arreglo6);
            g[i]=BubbleSort.Bubblesort(arreglo7);
        }
        imprimirArreglos(arreglo1, arreglo2, arreglo3, arreglo4, arreglo5, arreglo6, arreglo7, a, b, c, d, e, f, g);
    }
    public static void OperacionesCountingSort(Scanner scanner){
        System.out.println("Algoritmo Counting");
        int[] arreglo1=new int[50];
        int[] arreglo2=new int[100];
        int[] arreglo3=new int[800];
        int[] arreglo4=new int[1000];
        int[] arreglo5=new int[2000];
        int[] arreglo6=new int[5000];
        int[] arreglo7=new int[10000];
        int[] a=new int[5];
        int[] b=new int[5];
        int[] c=new int[5];
        int[] d=new int[5];
        int[] e=new int[5];
        int[] f=new int[5];
        int[] g=new int[5];
        
        
        for(int i=0; i<5;i++){
            Utilerias.ArregloAleatorio(arreglo1, arreglo1.length, scanner);
            Utilerias.ArregloAleatorio(arreglo2, arreglo2.length, scanner);
            Utilerias.ArregloAleatorio(arreglo3, arreglo3.length, scanner);
            Utilerias.ArregloAleatorio(arreglo4, arreglo4.length, scanner);
            Utilerias.ArregloAleatorio(arreglo5, arreglo5.length, scanner);
            Utilerias.ArregloAleatorio(arreglo6, arreglo6.length, scanner);
            Utilerias.ArregloAleatorio(arreglo7, arreglo7.length, scanner);
            a[i]=countingsort.AlgoritmoCounting(arreglo1);
            b[i]=countingsort.AlgoritmoCounting(arreglo2);
            c[i]=countingsort.AlgoritmoCounting(arreglo3);
            d[i]=countingsort.AlgoritmoCounting(arreglo4);
            e[i]=countingsort.AlgoritmoCounting(arreglo5);
            f[i]=countingsort.AlgoritmoCounting(arreglo6);
            g[i]=countingsort.AlgoritmoCounting(arreglo7);
        }
        imprimirArreglos(arreglo1, arreglo2, arreglo3, arreglo4, arreglo5, arreglo6, arreglo7, a, b, c, d, e, f, g);
    }
    public static void OperacionesMergeSort(Scanner scanner){
        System.out.println("Algoritmo Counting");
        int[] contador=new int[5];

        int[] arreglo1=new int[50];
        int[] arreglo2=new int[100];
        int[] arreglo3=new int[800];
        int[] arreglo4=new int[1000];
        int[] arreglo5=new int[2000];
        int[] arreglo6=new int[5000];
        int[] arreglo7=new int[10000];
        int[] a=new int[5];
        int[] b=new int[5];
        int[] c=new int[5];
        int[] d=new int[5];
        int[] e=new int[5];
        int[] f=new int[5];
        int[] g=new int[5];
        
        
        for(int i=0; i<5;i++){
            contador[0]=0;
            Utilerias.ArregloAleatorio(arreglo1, arreglo1.length, scanner);
            Utilerias.ArregloAleatorio(arreglo2, arreglo2.length, scanner);
            Utilerias.ArregloAleatorio(arreglo3, arreglo3.length, scanner);
            Utilerias.ArregloAleatorio(arreglo4, arreglo4.length, scanner);
            Utilerias.ArregloAleatorio(arreglo5, arreglo5.length, scanner);
            Utilerias.ArregloAleatorio(arreglo6, arreglo6.length, scanner);
            Utilerias.ArregloAleatorio(arreglo7, arreglo7.length, scanner);
            a[i]=MergeSort.mergeSort(arreglo1,0,arreglo1.length-1,contador);
            b[i]=MergeSort.mergeSort(arreglo2,0,arreglo2.length-1,contador);
            c[i]=MergeSort.mergeSort(arreglo3,0,arreglo3.length-1,contador);
            d[i]=MergeSort.mergeSort(arreglo4,0,arreglo4.length-1,contador);
            e[i]=MergeSort.mergeSort(arreglo5,0,arreglo5.length-1,contador);
            f[i]=MergeSort.mergeSort(arreglo6,0,arreglo6.length-1,contador);
            g[i]=MergeSort.mergeSort(arreglo7,0,arreglo7.length-1,contador);
        }
        imprimirArreglos(arreglo1, arreglo2, arreglo3, arreglo4, arreglo5, arreglo6, arreglo7, a, b, c, d, e, f, g);
    }
    public static void  operacionesQuickSort(Scanner scanner){
        System.out.println("Algoritmo QuickSort");

        int[] arreglo1=new int[50];
        int[] arreglo2=new int[100];
        int[] arreglo3=new int[800];
        int[] arreglo4=new int[1000];
        int[] arreglo5=new int[2000];
        int[] arreglo6=new int[5000];
        int[] arreglo7=new int[10000];
        int[] a=new int[5];
        int[] b=new int[5];
        int[] c=new int[5];
        int[] d=new int[5];
        int[] e=new int[5];
        int[] f=new int[5];
        int[] g=new int[5];
        for(int i=0; i<5;i++){
            Utilerias.ArregloAleatorio(arreglo1, arreglo1.length, scanner);
            Utilerias.ArregloAleatorio(arreglo2, arreglo2.length, scanner);
            Utilerias.ArregloAleatorio(arreglo3, arreglo3.length, scanner);
            Utilerias.ArregloAleatorio(arreglo4, arreglo4.length, scanner);
            Utilerias.ArregloAleatorio(arreglo5, arreglo5.length, scanner);
            Utilerias.ArregloAleatorio(arreglo6, arreglo6.length, scanner);
            Utilerias.ArregloAleatorio(arreglo7, arreglo7.length, scanner);
            quicksort.reinciar();
            a[i]=quicksort.Quicksort(arreglo1,0,arreglo1.length-1);
            quicksort.reinciar();
            b[i]=quicksort.Quicksort(arreglo2,0,arreglo2.length-1);
            quicksort.reinciar();
            c[i]=quicksort.Quicksort(arreglo3,0,arreglo3.length-1);
            quicksort.reinciar();
            d[i]=quicksort.Quicksort(arreglo4,0,arreglo4.length-1);
            quicksort.reinciar();
            e[i]=quicksort.Quicksort(arreglo5,0,arreglo5.length-1);
            quicksort.reinciar();
            f[i]=quicksort.Quicksort(arreglo6,0,arreglo6.length-1);
            quicksort.reinciar();
            g[i]=quicksort.Quicksort(arreglo7,0,arreglo7.length-1);
            quicksort.reinciar();
        }
        imprimirArreglos(arreglo1, arreglo2, arreglo3, arreglo4, arreglo5, arreglo6, arreglo7, a, b, c, d, e, f, g);
    }
    public static void  operacionesHeapSort(Scanner scanner){
        System.out.println("Algoritmo HeapSort");

        int[] arreglo1=new int[50];
        int[] arreglo2=new int[100];
        int[] arreglo3=new int[800];
        int[] arreglo4=new int[1000];
        int[] arreglo5=new int[2000];
        int[] arreglo6=new int[5000];
        int[] arreglo7=new int[10000];
        int[] a=new int[5];
        int[] b=new int[5];
        int[] c=new int[5];
        int[] d=new int[5];
        int[] e=new int[5];
        int[] f=new int[5];
        int[] g=new int[5];
        for(int i=0; i<5;i++){
            Utilerias.ArregloAleatorio(arreglo1, arreglo1.length, scanner);
            Utilerias.ArregloAleatorio(arreglo2, arreglo2.length, scanner);
            Utilerias.ArregloAleatorio(arreglo3, arreglo3.length, scanner);
            Utilerias.ArregloAleatorio(arreglo4, arreglo4.length, scanner);
            Utilerias.ArregloAleatorio(arreglo5, arreglo5.length, scanner);
            Utilerias.ArregloAleatorio(arreglo6, arreglo6.length, scanner);
            Utilerias.ArregloAleatorio(arreglo7, arreglo7.length, scanner);
            a[i]=heapsort.HeapSort(arreglo1);
            b[i]=heapsort.HeapSort(arreglo2);
            c[i]=heapsort.HeapSort(arreglo3);
            d[i]=heapsort.HeapSort(arreglo4);
            e[i]=heapsort.HeapSort(arreglo5);
            f[i]=heapsort.HeapSort(arreglo6);
            g[i]=heapsort.HeapSort(arreglo7);
        }
        imprimirArreglos(arreglo1, arreglo2, arreglo3, arreglo4, arreglo5, arreglo6, arreglo7, a, b, c, d, e, f, g);
    }
    public static void  operacionesInsertionSort(Scanner scanner){
        System.out.println("Algoritmo InsertionSort");

        int[] arreglo1=new int[50];
        int[] arreglo2=new int[100];
        int[] arreglo3=new int[800];
        int[] arreglo4=new int[1000];
        int[] arreglo5=new int[2000];
        int[] arreglo6=new int[5000];
        int[] arreglo7=new int[10000];
        int[] a=new int[5];
        int[] b=new int[5];
        int[] c=new int[5];
        int[] d=new int[5];
        int[] e=new int[5];
        int[] f=new int[5];
        int[] g=new int[5];
        for(int i=0; i<5;i++){
            Utilerias.ArregloAleatorio(arreglo1, arreglo1.length, scanner);
            Utilerias.ArregloAleatorio(arreglo2, arreglo2.length, scanner);
            Utilerias.ArregloAleatorio(arreglo3, arreglo3.length, scanner);
            Utilerias.ArregloAleatorio(arreglo4, arreglo4.length, scanner);
            Utilerias.ArregloAleatorio(arreglo5, arreglo5.length, scanner);
            Utilerias.ArregloAleatorio(arreglo6, arreglo6.length, scanner);
            Utilerias.ArregloAleatorio(arreglo7, arreglo7.length, scanner);
            a[i]=InsertionSort.insertionSort(arreglo1);
            b[i]=InsertionSort.insertionSort(arreglo2);
            c[i]=InsertionSort.insertionSort(arreglo3);
            d[i]=InsertionSort.insertionSort(arreglo4);
            e[i]=InsertionSort.insertionSort(arreglo5);
            f[i]=InsertionSort.insertionSort(arreglo6);
            g[i]=InsertionSort.insertionSort(arreglo7);
        }
        imprimirArreglos(arreglo1, arreglo2, arreglo3, arreglo4, arreglo5, arreglo6, arreglo7, a, b, c, d, e, f, g);
    }
    public static void  operacionesSelectionSort(Scanner scanner){
        System.out.println("Algoritmo SelectionSort");
        int[] arreglo1=new int[50];
        int[] arreglo2=new int[100];
        int[] arreglo3=new int[800];
        int[] arreglo4=new int[1000];
        int[] arreglo5=new int[2000];
        int[] arreglo6=new int[5000];
        int[] arreglo7=new int[10000];
        int[] a=new int[5];
        int[] b=new int[5];
        int[] c=new int[5];
        int[] d=new int[5];
        int[] e=new int[5];
        int[] f=new int[5];
        int[] g=new int[5];
        for(int i=0; i<5;i++){
            Utilerias.ArregloAleatorio(arreglo1, arreglo1.length, scanner);
            Utilerias.ArregloAleatorio(arreglo2, arreglo2.length, scanner);
            Utilerias.ArregloAleatorio(arreglo3, arreglo3.length, scanner);
            Utilerias.ArregloAleatorio(arreglo4, arreglo4.length, scanner);
            Utilerias.ArregloAleatorio(arreglo5, arreglo5.length, scanner);
            Utilerias.ArregloAleatorio(arreglo6, arreglo6.length, scanner);
            Utilerias.ArregloAleatorio(arreglo7, arreglo7.length, scanner);
            a[i]=SelectionSort.selectionSort(arreglo1);
            b[i]=SelectionSort.selectionSort(arreglo2);
            c[i]=SelectionSort.selectionSort(arreglo3);
            d[i]=SelectionSort.selectionSort(arreglo4);
            e[i]=SelectionSort.selectionSort(arreglo5);
            f[i]=SelectionSort.selectionSort(arreglo6);
            g[i]=SelectionSort.selectionSort(arreglo7);
        }
        imprimirArreglos(arreglo1, arreglo2, arreglo3, arreglo4, arreglo5, arreglo6, arreglo7, a, b, c, d, e, f, g);
    }
    public static void imprimirOperaciones(int[] arr,int[] arreglo1){
        System.out.println("Para "+arreglo1.length+" son"+Arrays.toString(arr)+" operaciones");
    }
    public static void imprimirSumasYPromedios(int[] arr,float[]arr2,int[] arreglo1, int i){
        System.out.println("Para "+arreglo1.length+" la suma es: ["+arr[i]+"] y en promedio: ["+String.format("%.2f", arr2[i])+"]");
    }
    public static void imprimirArreglos(int[]arreglo1,int[]arreglo2,int[]arreglo3,int[]arreglo4,int[]arreglo5,int[]arreglo6,int[]arreglo7,int[] a,int[] b,int[] c,int[] d,int[] e, int[] f,int[] g){
        System.out.println("Arreglos ordenados:");
        System.out.println("Arreglo 1");
        System.out.println(Arrays.toString(arreglo1));
        int[] suma=new int[7];
        int i=0;
        for(int valor : a){
            suma[i]+=valor;
        }
        float[] promedio=new float[7];
        promedio[i]=suma[i]/5;
        i++;
        System.out.println("Arreglo 2");
        System.out.println(Arrays.toString(arreglo2));
        for(int valor : b){
            suma[i]+=valor;
        }
        promedio[i]=suma[i]/5;
        i++;
        System.out.println("Arreglo 3");
        System.out.println(Arrays.toString(arreglo3));
        for(int valor : c){
            suma[i]+=valor;
        }
        promedio[i]=suma[i]/5;
        i++;
        System.out.println("Arreglo 4");
        System.out.println(Arrays.toString(arreglo4));
        for(int valor : d){
            suma[i]+=valor;
        }
        promedio[i]=suma[i]/5;
        i++;
        System.out.println("Arreglo 5");
        System.out.println(Arrays.toString(arreglo5));
        for(int valor : e){
            suma[i]+=valor;
        }
        promedio[i]=suma[i]/5;
        i++;
        
        System.out.println("Arreglo 6");
        System.out.println(Arrays.toString(arreglo6));
        for(int valor : f){
            suma[i]+=valor;
        }
        promedio[i]=suma[i]/5;
        i++;
        System.out.println("Arreglo 7");
        System.out.println(Arrays.toString(arreglo7));
        for(int valor : g){
            suma[i]+=valor;
        }
        promedio[i]=suma[i]/5;
        i++;
        System.out.println("El numero total de operaciones para el algoritmo dependiendo de la cantidad de datos: ");
        imprimirOperaciones(a,arreglo1);
        imprimirOperaciones(b,arreglo2);
        imprimirOperaciones(c,arreglo3);
        imprimirOperaciones(d,arreglo4);
        imprimirOperaciones(e,arreglo5);
        imprimirOperaciones(f,arreglo6);
        imprimirOperaciones(g,arreglo7);
        System.out.println("*****SUMAS Y PROMEDIOS*****");
        imprimirSumasYPromedios(suma, promedio, arreglo1,0);
        imprimirSumasYPromedios(suma, promedio, arreglo2,1);
        imprimirSumasYPromedios(suma, promedio, arreglo3,2);
        imprimirSumasYPromedios(suma, promedio, arreglo4,3);
        imprimirSumasYPromedios(suma, promedio, arreglo5,4);
        imprimirSumasYPromedios(suma, promedio, arreglo6,5);
        imprimirSumasYPromedios(suma, promedio, arreglo7,6);


    }
    
}
