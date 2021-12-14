import java.util.Scanner;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
       Scanner sh = new Scanner(System.in);
       Random r = new Random();
       System.out.print("De que tamaño quiere que sea el arreglo a ordenar? ");
       int n = sh.nextInt();
       int[] arreglo = new int[n];
       long inicio = System.currentTimeMillis();

       for(int i=0;i<n;i++){
	   
	   arreglo[i] = r.nextInt();
       }
        System.out.println("Arreglo original: ");
        imprimeArreglo(arreglo);
        
        quicksort(arreglo, 0, arreglo.length-1);

        System.out.println("Arreglo Ordenado: ");
        imprimeArreglo(arreglo);


        long tiempo = System.currentTimeMillis() - inicio;
        System.out.println("El programa tardo en ejecutarse "+ tiempo +" milisegundos.");

    }

    //METODO PARA IMPRIMIR EL ARREGLO
    public static void imprimeArreglo(int[] arreglo) {
    
        for(int i = 0 ; i < arreglo.length ; i++) {
            System.out.print(arreglo[i]+" ");
        }
        System.out.println();
    }
    
    public static void quicksort(int[] arreglo, int izq, int der) {


        // ELEGIR PIVOTE
        int pivote = arreglo[(izq+der)/2];
        
        int i = izq;
        int j = der;
        
        int swap;
        
        // SE EVALUAN LOS ELEMENTOS PARA UBICAR EL NUEVO PIVOTE
        while(i < j) {
            // MIENTRAS QUE arreglo[i] SEA MENOR O IGUAL AL PIVOTE SE AUMENTA EL VALOR DE i
            // CUANDO NO SE CUMPLE EL WHILE, EL ELEMENTO EN arreglo[i] ES MAYOR AL PIVOTE
            // Y DEBE IR A LA DERECHA
            while(arreglo[i] <= pivote && i < j) {
                i++;
            }
            // MIENTRAS QUE EL arreglo[j] SEA MAYOR AL PIVOTE SE DISMINUYE j
            // CUANDO NO SE CUMPLE EL WHILE EL ELEMENTO EN arreglo[j] ES MENOR O IGUAL AL PIVOTE
            // Y DEBE IR A LA IZQUIERDA
            while(arreglo[j] > pivote) {
                j--;
            }
            // SIEMPRE Y CUANDO i SEA MENOR A j, SE HACE UN CAMBIO DE LOS ELEMENTOS
            if(i < j) {
                swap = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = swap;
                
            }
        }
	//EL PIVOTE SE REACOMODA EN LA POSICIOÓN EN LA QE TANTO i COMO j SON EL MISMO VALOR, DEJANDO DEL LADO DERECHO A LOS NÚMEROS MAYORES AL PIVOTE
	// Y A LA IZQUIERDA LOS MENORES
        arreglo[izq] = arreglo[j];
        arreglo[j] = pivote;


	//SE MANDA A LLAMAR AL METODO  A CADA UNO DE LOS ARREGLOS GENERERADOS A LA IZQUIERDA Y DERECHA DEL PIVOTE
        if(izq < j - 1) {
	// [2,4,3,1] izq = 0, j-1 = 3
            quicksort(arreglo, izq, j - 1);
        }
        if(j + 1 < der) {
            quicksort(arreglo, j + 1, der);
        }
    }
   
}
