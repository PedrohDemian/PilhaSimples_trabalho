import java.util.Scanner;

public class MenuPilhaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PilhaSimples pilha = new PilhaSimples();

        int opcao;
        do {
            System.out.println("\n==== MENU PILHA SIMPLES ====");
            System.out.println("1 - Adicionar elemento");
            System.out.println("2 - Remover elemento");
            System.out.println("3 - Ordenar elementos (crescente)");
            System.out.println("4 - Editar elemento");
            System.out.println("5 - Exibir pilha");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor (inteiro): ");
                    int valor = scanner.nextInt();
                    pilha.adicionar(valor);
                    break;
                case 2:
                    pilha.remover();
                    break;
                case 3:
                    pilha.ordenarCrescente();
                    break;
                case 4:
                    System.out.print("Digite a posição do elemento a editar: ");
                    int pos = scanner.nextInt();
                    System.out.print("Digite o novo valor (inteiro): ");
                    int novoVal = scanner.nextInt();
                    pilha.editarElemento(pos, novoVal);
                    break;
                case 5:
                    pilha.exibir();
                    break;
                case 0:
                    System.out.println("Encerrando programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
