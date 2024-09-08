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
            a[i]=MergeSort.mergeSort(arreglo1,0,arreglo1.length-1);
            b[i]=MergeSort.mergeSort(arreglo2,0,arreglo2.length-1);
            c[i]=MergeSort.mergeSort(arreglo3,0,arreglo3.length-1);
            d[i]=MergeSort.mergeSort(arreglo4,0,arreglo4.length-1);
            e[i]=MergeSort.mergeSort(arreglo5,0,arreglo5.length-1);
            f[i]=MergeSort.mergeSort(arreglo6,0,arreglo6.length-1);
            g[i]=MergeSort.mergeSort(arreglo7,0,arreglo7.length-1);
        }
        imprimirArreglos(arreglo1, arreglo2, arreglo3, arreglo4, arreglo5, arreglo6, arreglo7, a, b, c, d, e, f, g);
    }
    public static void imprimirOperaciones(int[] arr,int[] arreglo1){
        System.out.println("Para "+arreglo1.length+" son"+Arrays.toString(arr)+" operaciones");
    }
    public static void imprimirArreglos(int[]arreglo1,int[]arreglo2,int[]arreglo3,int[]arreglo4,int[]arreglo5,int[]arreglo6,int[]arreglo7,int[] a,int[] b,int[] c,int[] d,int[] e, int[] f,int[] g){
        System.out.println("Arreglos ordenados:");
        System.out.println("Arreglo 1");
        System.out.println(Arrays.toString(arreglo1));
        
        System.out.println("Arreglo 2");
        System.out.println(Arrays.toString(arreglo2));
        
        System.out.println("Arreglo 3");
        System.out.println(Arrays.toString(arreglo3));
        
        
        System.out.println("Arreglo 4");
        System.out.println(Arrays.toString(arreglo4));
        
        System.out.println("Arreglo 5");
        System.out.println(Arrays.toString(arreglo5));

        
        System.out.println("Arreglo 6");
        System.out.println(Arrays.toString(arreglo6));
        
        System.out.println("Arreglo 7");
        System.out.println(Arrays.toString(arreglo7));

        System.out.println("El numero total de operaciones para el algoritmo dependiendo de la cantidad de datos: ");
        imprimirOperaciones(a,arreglo1);
        imprimirOperaciones(b,arreglo2);
        imprimirOperaciones(c,arreglo3);
        imprimirOperaciones(d,arreglo4);
        imprimirOperaciones(e,arreglo5);
        imprimirOperaciones(f,arreglo6);
        imprimirOperaciones(g,arreglo7);
    }
    
}
