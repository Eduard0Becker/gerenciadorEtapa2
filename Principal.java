import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Principal {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String opcaoSelecionada;
        do {
            opcaoSelecionada = exibirMenu(reader);

            switch (opcaoSelecionada) {
                case "1":
                    criarLoja(reader);
                    break;
                case "2":
                    criarProduto(reader);
                    break;
                case "3":
                    fecharApp();
                    break;
                default:
                    System.out.println("Opcao Invalida");
                    break;
            }

        } while (!opcaoSelecionada.equals("3"));
    }

    private static String exibirMenu(BufferedReader reader) throws IOException {
        System.out.println("Selecione uma das opcoes abaixo:");
        System.out.println("(1) Criar uma loja");
        System.out.println("(2) Criar um produto");
        System.out.println("(3) Sair");

        String opcaoSelecionada = reader.readLine();

        return opcaoSelecionada;
    }

    private static void criarLoja(BufferedReader reader) throws IOException {
        StringBuilder conteudo = new StringBuilder();
        System.out.println("Criar Loja");

        // 
        // Loja loja2 = new Loja("E7", 20, 2000, endereco, data);

        System.out.println("Digite o nome:");
        String nome = reader.readLine();

        System.out.println("Digite a Quantidade de funcionarios:");
        String funcionarios = reader.readLine();

        System.out.println("Digite o Salario:");
        String salario = reader.readLine();

        System.out.println("Digite o Endereco:");
        String endereco = reader.readLine();

         System.out.println("Digite a data de Fundacao:");
        String[] data = reader.readLine().split("/");
        Data dataFundcao = new Data(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]));

        Loja loja2 = new Loja(nome, Integer.parseInt(salario), endereco, data);

        conteudo.append("Loja criado:");
        conteudo.append("Nome: " + loja2.getNome());



    }

    private static void criarProduto(BufferedReader reader) throws IOException {
        StringBuilder conteudo = new StringBuilder();
        System.out.println("Criar Produto:");

        System.out.println("Digite o nome:");
        String nome = reader.readLine();

        System.out.println("Digite o preco:");
        String preco = reader.readLine();

        System.out.println("Digite a data de validade:");
        String[] data = reader.readLine().split("/");
        Data dataValidade = new Data(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]));

        Produto produto = new Produto(nome, Integer.parseInt(preco), dataValidade);

        conteudo.append("Produto criado:");
        conteudo.append("Nome: " + produto.getNome());

        conteudo.append("Produto vencido?: " + (produto.estaVencido(new Data(20, 10, 2023)) ? "Sim" : "Nao"));

        System.out.println(conteudo.toString());

    }

    private static void fecharApp() {
        System.out.println("Fechando app");
        System.exit(0);
    }

}
