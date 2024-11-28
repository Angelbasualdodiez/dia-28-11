import java.util.Scanner;

public class Principal23 {
	public static void main(String[] args) {
//Un ejemplo de poner notas y sin sumarlas hasta que salga -1//
		Scanner scanner=new Scanner(System.in);
		int numero1=0;
		do {
			System.out.println("dame un numero");
			numero1 = scanner.nextInt();
		}while (numero1>-1 );
		System.out.println("fin");
}
}
