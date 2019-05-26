public class Ex06 {
	public static void main(String[] args) {
		
		int fat = 1;
		int valor; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor para receber seu fetorial :");
		valor = sc.nextInt();
		
		for(int i = 2; i <= valor; i++ )
		{ 
		     fat *= i;
		}
		System.out.println( "O fatorial de " + valor + " é igual a " + fat );
	}
}