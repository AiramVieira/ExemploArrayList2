
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * @author Airam
 */
public class Exemplo05 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            while (true) {
                int quantidade = 0;
                try {
                    numeros.add(Integer.parseInt
                        (JOptionPane.showInputDialog
                        ("Digite o " + (i + 1) + "º número")));
                    
                    break;
                } catch (Exception e) {
                    quantidade++;
                    JOptionPane.showMessageDialog(null, 
                            "Número inválido"+
                            "\nTentativas restantes: " + (5 - quantidade));
                        if(5 - quantidade == 0){
                            JOptionPane.showMessageDialog(null, "WASTED");
                            System.exit(0);
                        }
                }
            }           
        }
    }
}
