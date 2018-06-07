
import java.util.ArrayList;

/*
 * @author Alunos
 */
public class Exemplo02 {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Jennifer");
        nomes.add("Poney");
        nomes.add("Homem da Cadeira Ambulante");
        nomes.add("Eu aqui");

        //int qtdItensArray = nomes.size();
        //System.out.println(qtdItensArray);
        String maiorNome = "";

        if (nomes.get(0).length() > maiorNome.length()) {
            maiorNome = nomes.get(0);
        }
        if (nomes.get(1).length() > maiorNome.length()) {
            maiorNome = nomes.get(1);
        }
        if (nomes.get(2).length() > maiorNome.length()) {
            maiorNome = nomes.get(2);
        }
        if (nomes.get(3).length() > maiorNome.length()) {
            maiorNome = nomes.get(3);
        }
        System.out.println("Maior nome: " + maiorNome);

        String menorNome = "";

        for (int i = 65; i <= 90; i++) {
            for (int j = 65; j <= 90; j++) {
                menorNome += (char) i + "" + (char) j + "\n";
            }
        }
        System.out.println(menorNome);
        if (nomes.get(0).length() < menorNome.length()) {
            menorNome = nomes.get(0);
        }
        if (nomes.get(1).length() < menorNome.length()) {
            menorNome = nomes.get(1);
        }
        if (nomes.get(2).length() < menorNome.length()) {
            menorNome = nomes.get(2);
        }
        if (nomes.get(3).length() < menorNome.length()) {
            menorNome = nomes.get(3);
        }
        System.out.println("Menor nome: " + menorNome);
    }
}
