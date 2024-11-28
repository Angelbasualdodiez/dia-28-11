import java.util.Scanner;

public class Principal6{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("introduce tu nombre:");
		String nombre = scanner.next();
		System.out.println(nombre);

		System.out.println("introduceme la edad");
		int edad = scanner.nextInt();

		if (edad < 18) {
			System.out.println("es gratis campeon/a");
		} else {
			if (edad < 18 && edad < 30) {
				System.out.println("te hacemos un 20%");
			} else if (edad > 30 && edad < 50) {
				System.out.println("te hacemos un 20%");
			} else {
				System.out.println("te hacemos un 10%");
			}
		}
	}
}

	
	
	
	
	
