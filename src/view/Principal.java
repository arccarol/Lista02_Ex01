package view;

import java.util.LinkedList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		 List<Integer> lista = new LinkedList<Integer>();
		 
		try {
			
		    lista.add(10);
			lista.add(5);
			lista.add(8);
			lista.add(1);
			lista.add(9);
			lista.add(2);
			lista.add(4);
			lista.add(7);
			lista.add(3);
			lista.add(6);
			ordenacaoBubleSort(lista);  
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	 public static  void ordenacaoBubleSort(List<Integer> lista) {

	     for(int i = 0; i < lista.size(); i++) {
	         for(int j = 0; j < (lista.size() - 1 - i); j++) {
	             if(lista.get(j) > lista.get(j + 1)) {
	                 Integer aux = lista.get(j);
	                 lista.set(j, lista.get(j + 1));
	                 lista.set(j + 1, aux);
	             }
	             

	         }
	     }

	     System.out.println(lista);
	 }
}
