public class Ex4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Quantidae = 0, It = 0, St = 0, Si = 0, Cont = 1;
		float Ms = 0, Mi = 0, Msm = 0, Msf = 0;
		
		String Sx;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos trabalhadores tem na empresa ?");
		Quantidae = sc.nextInt();
		
		while (Cont <= Quantidae) {
			System.out.println("Digite a idade do " + Cont + "° trabalhador :");
			It = sc.nextInt();
			Si += It;
			
			System.out.println("Digite o salário do " + Cont + "° trabalhador :");
			St = sc.nextInt();
			Ms += St;

			do {
				System.out.println("Digite o Sexo do " + Cont + "° trabalhador (M/F) :");
				Sx = sc.next();
			} while (!Sx.equals("M") && !Sx.equals("F"));
			
			if(Sx.equals("M") && St > Msm) {
				Msm += St;
			}else {
				if(Sx.equals("F") && St > Msm) {
				Msf += St;
				}
			}
			Cont++;
		}
		
		Mi = (Si / Quantidae);
		Ms = (Ms / Quantidae); 
		
		System.out.println(" A média de Idade  é : " + Mi);
		System.out.println(" A média de Salário é : " + Ms);
		System.out.println(" O maior salário Masculino é : " + Msm);
		System.out.println(" O maior salário Feminino é :" + Msf);
	}
}