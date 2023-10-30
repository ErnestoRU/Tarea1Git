import java.util.Scanner;

public class Practicagit {
	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;
		int resultado = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el primer numero");
		
		numero1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dame el segundo numero");
		
		numero2 = Integer.parseInt(sc.nextLine());
		
		resultado = numero1 + numero2;
		
		System.out.println("La suma de los dos numeros es: " + resultado);
		
		if (resultado % 2 == 0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero no es par");
		}
		
		sc.close();
	}
}
