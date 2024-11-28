import java.util.Scanner;
public class Principal10 {
public static void main(String[]args) {
Scanner scanner= new Scanner(System.in);
	
System.out.println("dame un gasto comida");
int gasto1=scanner.nextInt();
System.out.println("dame un gasto cafes y desayunos");
int gasto2=scanner.nextInt();
System.out.println("dame un gasto cena");
int gasto3=scanner.nextInt();

System.out.println("la comida es:"+gasto1);
System.out.println("los cafes y desayuno:"+gasto2);
System.out.println("la cena es:"+gasto3);

if(gasto1>100) {
	System.out.println("estas despedido");
}else {
	if(gasto1+gasto2>110) {
		System.out.println("estas despedido");
	}else {
		if(gasto1+gasto2+gasto3>150) {
			System.out.println("estas despedido");
		}
	}
}	 
 }
}
