import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		String nome;
		
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, Mt = 0, Ma = 0;
		
		int Quantidae;
		
		System.out.println("Digite o numero de alunos :");
		Quantidae = sc.nextInt();
		
		for (int i = 0; i < Quantidae; i++) {
			
			System.out.println("Digite seu nome :");
			nome = sc.next();
			
			System.out.println("Digite sua primeira nota :");
			n1 = sc.nextFloat();
			
			System.out.println("Digite sua segunda nota :");
			n2 = sc.nextFloat();
			
			Ma = (n1 + n2) / 2;
			Mt = Mt + Ma;
			
			System.out.println("Seu Nome é " + nome + " e sua primeira nota é " + n1 + " e a segunda é " + n2 + " sua média é " + Ma);
		}
		
		System.out.println("A média da turma é " + Mt / Quantidae);
	}
}
