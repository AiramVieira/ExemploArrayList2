
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * @author Alunos
 */
public class Exemplo03 {

    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add(Integer.parseInt
                       (JOptionPane.showInputDialog("Digite um número")));
            
        }
    }
}