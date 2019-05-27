import java.util.Scanner;

public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    	 
    	    int n = 6; 
    	    double v[][] = new double[n][n]; 
    	    int i,i2; 
    	    String[] nome = new String[6];
    	    
    	    for (i=1; i<6; i++) {
    	    	 System.out.println("Digite o nome do aluno n"+(i)+"º : ");
    	    	 nome[i] = sc.nextLine();
    	    	
    	    }
    	    
    	    
    	    for (i=1; i<n; i++) {
        	    for (i2=1; i2<3; i2++) {
        	      System.out.printf("Informe a Nota "+i2 + " do Aluno " + i +" : ");
	    	      v[i][i2] = sc.nextDouble();
        	    }
    	    }
    	    
    	    
    	    for (i=1; i<n; i++) {
     	    	 System.out.printf("\n");
    	    	 System.out.printf("O aluno "+ nome[i] +" teve a nota  1 : "+ v[i][1] + "");
    	    	 System.out.printf(", E a nota  2 : "+ v[i][2] + "");
    	    	 System.out.printf("- A média do aluno : "+ i +"  foi de : "+ (v[i][1]+v[i][2])/2 + "");
    	    	 
    	    	 System.out.printf("\n");

    	    }

    }
}
