/*
 * @author Airam
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class ExemploFor10 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i = 0; i < 25; i++) {
            numeros.add(Integer.parseInt
            (JOptionPane.showInputDialog("Digite um número de 1 à 25"
                                        +"\nFaltam "+(25-i))));
            
            if (numeros.get(i) == 24) {
                JOptionPane.showMessageDialog(null, "",
                 "HMMM FAFADINHO",
                JOptionPane.WARNING_MESSAGE
                ,
                 new ImageIcon(
                        ExemploFor10.class.getResource("/imagens/giphy.gif")
                ));
            }
        }
    }
}