package package1;

import java.util.ArrayList;
import java.util.List;


public class Splitter {
	  
	
	
	public static List<Integer> obtenerPares(List<Integer> numeros) {
		  List<Integer> pares = new ArrayList<Integer>();
		  for (Integer numero : numeros) {
		    if (numero % 2 == 0) {
		      pares.add(numero);
		    }
		  }
		  return pares;
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
