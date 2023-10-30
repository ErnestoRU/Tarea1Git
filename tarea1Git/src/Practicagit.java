import java.util.Scanner;

public class Practicagit {
	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el primer numero");
		
		numero1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dame el segundo numero");
		
		numero2 = Integer.parseInt(sc.nextLine());
		
		
		System.out.println("La suma de los dos numeros es: " + (numero1 + numero2));
		
		sc.close();
	}
}
