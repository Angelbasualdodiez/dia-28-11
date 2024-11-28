import java.util.Scanner;

public class Principal20 {
	public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);
int numero1=0;
	do {
		System.out.println("dame una nota");
		numero1 = scanner.nextInt();
		System.out.println(numero1);
		if(numero1<0) {
			System.out.println("el numero tiene que ser mayor que 0");
		}
	    if(numero1>10) {
	    	System.out.println("el numero debe ser menor que 10");
	    }
	} while (numero1>-10 && numero1<20);
	System.out.println("fin");
}
	}
