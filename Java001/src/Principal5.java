import java.util.Scanner;

public class Principal5 {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
	System.out.println("dame una edad:");
	int edad=scanner.nextInt();
	
	if(edad>0 && edad<18) {
		System.out.println("entras gratis");
	}else  
		if(edad>18 && edad<65) {
		System.out.print("pagas");
	}else {
		System.out.println("te hacemos un 30%");
	}
	}
	}


