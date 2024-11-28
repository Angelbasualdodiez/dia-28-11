import java.util.Scanner;

public class Principal8 {
	public static void main(String[]args)
	{Scanner scanner=new Scanner(System.in);
	System.out.println("introduce tu nombre:");
	String nombre = scanner.next();
	System.out.println(nombre);
	System.out.println("escribe tu nota");
	int nota=scanner.nextInt();
	if(nota==0)
	{System.out.println("Para junio");
	}else {
		if(nota>0 && nota<5)
		{System.out.println("suspenso");
		}else {
			if(nota>=5 && nota<7)
			{System.out.println("bien");
			}else {
				if(nota>=7 && nota<=8)
				{System.out.println("notable");
				}else {
					if(nota>8 && nota<10)
					{System.out.println("sobresaliente");
					}else {
						if(nota==10)
						{System.out.println("excelente");
						
					}
				}
					
			}
		}
	}
	}
	}
	}
	