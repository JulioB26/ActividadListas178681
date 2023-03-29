package package1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Manager {
	  public void ejecutar() {
	  
	    List<Integer> numeros = Fibonacci.generarFibonacci();

	 
	    List<Integer> pares = Splitter.obtenerPares(numeros);
	    List<Integer> impares = Splitter.obtenerImpares(numeros);

	    
	    try {
	      FileWriter writer = new FileWriter("pares.txt");
	      for (Integer numero : pares) {
	        writer.write(numero + "\n");
	      }
	      writer.close();
	    } catch (IOException e) {
	      System.out.println("Error al escribir en el archivo pares.txt");
	      e.printStackTrace();
	    }
	    
	    try {
		      FileWriter writer = new FileWriter("impares.txt");
		      for (Integer numero : impares) {
		        writer.write(numero + "\n");
		      }
		      writer.close();
		    } catch (IOException e) {
		      System.out.println("Error al escribir en el archivo pares.txt");
		      e.printStackTrace();
		    }

	  }
}