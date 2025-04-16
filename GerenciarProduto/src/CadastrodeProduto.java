import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


public class CadastrodeProduto {
    public static void main(String[] args) {
//        String nome = "Camisa";
//        double preco = 49.90;
//
//        System.out.println("Produto cadastrado:");
//        System.out.println("Nome: " + nome);
//        System.out.println("Preço: R$ " + preco);

        boolean estaAtivo = true;
        String entrada;

        Scanner s = new Scanner(System.in);
        ArrayList<String> listaProdutos = new ArrayList<>();

        while (estaAtivo) {
            System.out.println("Digite o que deseja:\n" +
                    "1 - Adicionar\n" +
                    "2 - Remover\n" +
                    "3 - Alterar\n" +
                    "4 - Listar\n" +
                    "x - sair");
            entrada = s.nextLine();

            boolean querContinuar = true;

            switch (entrada) {

                case "1":
                    while(querContinuar) {
                        System.out.println("Escreva o nome do item que deseja adicionar");
                        entrada = s.nextLine();
                        listaProdutos.add(entrada);

                        System.out.println("O item " + entrada + " foi adicionado com sucesso! Deseja adicionar mais? s/n");
                        entrada = s.nextLine();

                        if (entrada.equals("s")){
                            querContinuar = true;
                        } else {
                            querContinuar = false;
                        }


                    }
                    break;

                case "2":
                    while(querContinuar) {
                        System.out.println("Escreva o nome do item que deseja remover");
                        entrada = s.nextLine();

                        if (listaProdutos.contains(entrada)) {
                            listaProdutos.remove(entrada);
                            System.out.println("Este item foi removido com sucesso");
                        } else {
                            System.out.println("Este item não contém na lista");
                        }

                        listaProdutos.remove(entrada);


                        System.out.println("Deseja remover mais? s/n");
                        entrada = s.nextLine();

                        if (entrada.equals("s")) {
                            querContinuar = true;
                        } else {
                            querContinuar = false;
                        }
                    }
                    break;

                case "3":
                    while (querContinuar) {
                        System.out.println("Escreva o nome do item que deseja alterar");
                        entrada = s.nextLine();

                        if (listaProdutos.contains(entrada)) {
                            int index = listaProdutos.indexOf(entrada);

                            System.out.println("Escreva o novo nome para o item:");
                            String novoItem = s.nextLine();

                            listaProdutos.set(index, novoItem);
                            System.out.println("O item foi alterado com sucesso");
                        } else {
                            System.out.println("Este item não está na lista");
                        }

                        System.out.println("Deseja alterar mais algum item? s/n");
                        entrada = s.nextLine();

                        if (entrada.equalsIgnoreCase("s")) {
                            querContinuar = true;
                        } else {
                            querContinuar = false;
                        }
                    }
                    break;

                case "4":

                    break;

                case "x":
                    System.out.println("Finalizando o programa...");
                    estaAtivo = false;
                    break;

            }
        }
        System.out.println(listaProdutos);

    }
}
