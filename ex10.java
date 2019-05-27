import java.util.Scanner;

public class Ex10 {
	
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
   	 
	    int n = 6; 
	    double nota[][] = new double[n][n]; 
	    double trabalho[] = new double[n]; 
	    int i,i2; 
	    String[] nome = new String[n];
	    double media = 0; 
	    double notafinal = 0; 
	    
	    
	    for (i=1; i<n; i++) {
	    	 System.out.println("Digite o nome do aluno n"+(i)+"º : ");
	    	 nome[i] = sc.next();
	    	
    	    for (i2=1; i2<3; i2++) {
    	      System.out.printf("Informe a Nota "+i2 + " do Aluno " + nome[i] +" : ");
    	      nota[i][i2] = sc.nextDouble();
    	    }
    	    
    	    
    	    System.out.println("Digita a nota do trabalho do Aluno " + nome[i] +" : ");
    	    trabalho[i] = sc.nextDouble();
	    }
	    
	    
	    for (i=1; i<n; i++) {
 	    	 System.out.printf("\n");
	    
	    	 
	    	 if(nota[i][1]>nota[i][2]) {
	    		 media = (nota[i][1]+nota[i][2])/2;
	    	 }else {
	    		 media = nota[i][2];
	    	 }
	    	 

	    	 if(media >= 6) {
	    		notafinal = (media * 0.75)+(trabalho[i]* 0.25); 
	    	 }else {
	    		notafinal = media*0.75; 
	    	 }

	    	 
	    	
	    	 if(notafinal >= 8.5) {
	    		 System.out.printf("O Aluno: "+nome[i]+" Teve o cenceito A - Nota: "+notafinal);
	    	 }
	    	 
	    	 
	    	 if( (notafinal > 7 ) && (notafinal <= 8.4)) {
	    		 System.out.printf("O Aluno: "+nome[i]+" Teve o cenceito B - Nota: "+notafinal);
	    	 }
	    	 
	    	 if( (notafinal > 6 ) && (notafinal <= 6.9)) {
	    		 System.out.printf("O Aluno: "+nome[i]+" Teve o cenceito C- Nota: "+notafinal);
	    	 }
	    	 
	    	 if( (notafinal > 0.1) && (notafinal <= 5.9)) {
	    		 System.out.printf("O Aluno: "+nome[i]+" Teve o cenceito D - Nota: "+notafinal);
	    	 }
	    	 
	    	 if(notafinal <= 0) {
	    		 System.out.printf("O Aluno: "+nome[i]+" Teve o cenceito E - Nota: "+notafinal);
	    		 
	    	 }
	    	 
	    	 
	    	 
	    	 System.out.printf("\n");

	    }

    }
}
