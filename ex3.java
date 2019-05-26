import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int cont = 1, Mf = 1, Mult = 1;
		
		while (cont < 10) {
			System.out.println("Digite o " + cont + "° número : ");
			Mult = sc.nextInt();
			Mf = Mf * Mult;
			
			cont++;
		}
		
		System.out.println("A multiplicação final é : " + Mf);
	}
}
