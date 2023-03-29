package package1;

import java.util.*;

public class Fibonacci {
	 
	public static List<Integer> generarFibonacci() {
		    List<Integer> fib = new ArrayList<Integer>();
		    int a = 0;
		    int b = 1;
		    int c = 1;
		    while (c <= 1000000) {
		      fib.add(c);
		      a = b;
		      b = c;
		      c = a + b;
		    }
		    return fib;
		  }
	 

	public static List<Integer> obtenerImpares(List<Integer> numeros) {
		  List<Integer> impares = new ArrayList<Integer>();
		  for (Integer numero : numeros) {
		    if (numero % 2 != 0) {
		      impares.add(numero);
		    }
		  }
		  return impares;
		}

}
