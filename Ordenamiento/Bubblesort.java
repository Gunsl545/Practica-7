/**
 *@author Adrián Lima García
 * @version 1.0
 */

import java.util.Scanner;
import java.util.Random;

public class Bubblesort{
    public static void main(String[] args){
	Scanner sh = new Scanner(System.in);
	Random r = new Random();

	// Definimos la cantidad de elementos que tendra el arreglo
	System.out.println("De que cantidad de n�meros quiere el arreglo?");
	int num,aux;
	do{
	    num = sh.nextInt();
	    if(num<=0){
		System.out.println("El n�mero ingresado no es un entero positivo: ");
	    }
	}while(num<=0);
	long inicio = System.currentTimeMillis();
	int[] arreglo = new int[num];

	//LLenamos el arreglo
	for(int i=0;i<num;i++){
	     
	    arreglo[i] = r.nextInt();
	}

	for(int i=0;i<num;i++){
	    System.out.print(arreglo[i]+" ");
	}
	System.out.println("\n");


	//Acomodando

	for(int i=0;i<(num-1);i++){
	    for(int k=0;k<(num-1);k++){
		if(arreglo[k]>arreglo[k+1]){
		    aux = arreglo[k];
		    arreglo[k]=arreglo[k+1];
		    arreglo[k+1]=aux;
		}
	    }
	}

	for(int i=0;i<num;i++){
	    System.out.print(arreglo[i]+" ");
	}

	long tiempo = System.currentTimeMillis() - inicio;
              System.out.println("El programa tardo en ejecutarse "+ tiempo +" milisegundos.");

	
    }
}
