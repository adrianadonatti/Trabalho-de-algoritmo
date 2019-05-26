public class Ex05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int base = 0, alt = 0;
		float area = 0;
		
		for (int i = 1; i < 6; i++) {
			System.out.println("Digite a " + i + "° base do " + i + "° triangulo");
			base = sc.nextInt();
			
			System.out.println("Digite a " + i + "° altura do " + i + "° triangulo");
			alt = sc.nextInt();
			
			area = (base * alt) / 2;
			
			System.out.println("A área do " + i + "° trinagulo é " + area);
		}
	}
}