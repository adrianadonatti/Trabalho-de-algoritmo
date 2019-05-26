public class Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Sf = 0;

		for (int i = 0; i <= 9; i++) {
			System.out.println("Digite o " + i + "° Número : ");
			int n = sc.nextInt();
			
			Sf += n;
		}
		
		System.out.println("A soma total dos números é : " + Sf);
	}
}