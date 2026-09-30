
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Livro> listaLivros = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            Livro livro = new Livro();

            System.out.println("DIgite o título do seu livro");
            livro.setTitulo(leitor.nextLine());    
            listaLivros.add(livro);

        }

        listaLivros.setTitulo(leitor.nextLine());


        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("kalil");
        listaNomes.remove(0);
        int tamanhoLista = listaNomes.size();


    }
}
