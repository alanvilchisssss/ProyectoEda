package utilerias;
public class BubbleSort {
    public static int Bubblesort(int lista[]){
        int comparaciones=0;
        int i=lista.length;
        int n=lista.length;
        int j=0;
        int contador=0;
        boolean valor=true;
        //System.out.println("\n*******************\n");
        //System.out.println("Algoritmo Bubblesort\n\n");
        for(j=0; j<n-1; j++){
            if(lista[j]>lista[j+1]){
                valor=true;
                comparaciones++;
            }
        }
        if(valor==true){
            for(i=n;i>0;i--){
                contador=0;
                for(j=0;j<n-1;j++){
                    if(lista[j]<lista[j+1]){
                        contador++;
                        comparaciones++;
                    }
                }
                if(contador==n-1){
                    valor=false;
                    comparaciones++;
                    break;
                }
                for(j=0;j<i-1; j++){
                    if(lista[j]>lista[j+1]){
                        Utilerias.swap(lista, j, j+1);
                        comparaciones+=2;
                    }
                }
                //System.out.println("\nIteración numero " +(cont)+ "\n");
                //Utilerias.imprimirArreglo(lista);
            }
        }
        /*if(valor==false){
            System.out.println("\n\n  *****************************El arreglo ordenado es:************\n");
            Utilerias.imprimirArreglo(lista);
        }*/
        return comparaciones;
    }
}
