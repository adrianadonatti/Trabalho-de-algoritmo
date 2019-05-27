import java.util.Scanner;

public class Ex9 {
	
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    	 
    	    int n = 3; 
    	    int idade[]= new int[3];
    	    int i; 
    	    String[] nome = new String[3];
    	    
    	    for (i=0; i<n; i++) {
    	    	 System.out.println("Digite o nome: ");
    	    	 nome[i] = sc.next();
    	    	 
    	    	 System.out.printf("Informe a Idade:");
    	    	 idade[i] = sc.nextInt();
    	    }    	    
    	    
    	    for (i=0; i<n; i++) {
    	    	if(idade[i]>=18) {
         	    	 System.out.printf(nome[i]+" é maior de idade -- ("+ idade[i] +") anos \n\n" );
    	    	}else {
        	    	 System.out.printf(nome[i]+" é menor de idade -- ("+ idade[i] +") anos \n\n" );
    	    	}

    	    }

    }
}
