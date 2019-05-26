import javax.swing.JOptionPane;
public class gasolina {
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Double tempoGastoNaViagem;
        Double preco;
        Double gasto;
        Double distanciakm;
        Double litros_usados;
        Double mediaconsumo;
        
 
        System.out.println("Informe a distância em KM ");
        distanciakm = Double.parseDouble(JOptionPane.showInputDialog("Informe a distância em KM"));
 
        System.out.println("Informe o Preço do compoustivel");
        preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o Preço do compoustivel"));
        
        System.out.println("Informe a Média de consumo");
        mediaconsumo = Double.parseDouble(JOptionPane.showInputDialog("Informe a Média de consumo"));
 
        gasto = distanciakm*(preco/mediaconsumo);
 
        System.out.println("O custo da viagem é: R$ " + gasto  );
    }
}