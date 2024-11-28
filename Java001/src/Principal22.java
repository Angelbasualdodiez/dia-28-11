import java.util.Scanner;

public class Principal22 {
	public static void main(String[] args) {
//Un ejemplo de poner notas y sumarlas hasta que salga -1//
		Scanner scanner=new Scanner(System.in);
		int i = 0;
		int suma = 0;
		int numero1=0;
		do {
			System.out.println("dame un numero");
			numero1 = scanner.nextInt();
			suma=suma+numero1;
			i++;
		}while (numero1>-1 );
		
		System.out.print("la suma es:");
		System.out.println(suma);
		System.out.print("la media es:");
		System.out.println(suma/i);
		System.out.println("fin");
}
}
