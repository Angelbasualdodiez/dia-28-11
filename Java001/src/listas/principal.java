package listas;

public class principal {
//ejemplo de lista con arrive
	public static void main(String[] args) {
int[] lista= new int[] {2,20,10};
	System.out.println(lista[0]);
	System.out.println(lista[1]);
	System.out.println(lista[2]);
	
	for(int i=0;i<lista.length;i++){
		System.out.println("posicion"+i);
		System.out.println(lista[i]);
	}
	}
}
