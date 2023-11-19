public class Loja {
    /**
     * Métodos de acesso: crie os métodos de acesso (getters e setters) para todos
     * os atributos da classe.
     */
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Integer quantidadeFuncionarios;

    public Integer getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(Integer quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    protected Integer salarioBaseFuncionario = -1;

    public Integer getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(Integer salarioBaseFuncionario2) {
        this.salarioBaseFuncionario = salarioBaseFuncionario2;
    }

    private Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    private Data dataFundacao;

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataDeFundacao) {
        this.dataFundacao = dataDeFundacao;
    }

    /**
     * Métodos Construtores: crie 2 construtores para a classe, sendo que um recebe
     * parâmetros para inicializar todos os atributos e outro recebe apenas valores
     * para inicializar o nome e a quantidade de funcionários, colocando -1 no
     * salário base dos funcionários.
     */
    public Loja(
            String nome,
            Integer quantidadeFuncionarios,
            Integer salarioBaseFuncionario,
            Endereco endereco,
            Data dataDeFundacao,
            Integer quantidadeMaximaProdutos) {
        this.setNome(nome);
        this.setQuantidadeFuncionarios(quantidadeFuncionarios);
        this.setSalarioBaseFuncionario(salarioBaseFuncionario);
        this.setEndereco(endereco);
        this.setDataFundacao(dataDeFundacao);
    }

    public Loja(
            String nome,
            Integer quantidadeFuncionarios,
            Endereco endereco,
            Data dataDeFundacao) {
        this.setNome(nome);
        this.setQuantidadeFuncionarios(quantidadeFuncionarios);
        this.setEndereco(endereco);
        this.setDataFundacao(dataDeFundacao);
    }

    public Loja(String nome2, Integer quantidadeFuncionarios2, Integer salarioBaseFuncionario2, Endereco endereco,
            Data dataDeFundacao) {
    }

    public Loja(String nomeLoja, String enderecoLoja) {
    }

    public Loja(String nome2, int parseInt, String endereco2, String[] data) {
    }

    /*
     * Método toString: se necessário, pesquise sobre o método toString e
     * implemente-o nesta classe, retornando uma String formatada da forma que você
     * desejar, desde que contenha as informações de todos os atributos da classe.
     */
    public String toString() {
        StringBuilder conteudo = new StringBuilder();

        conteudo.append("Nome: " + this.getNome() + "\n");
        conteudo.append("Quantidade de Funcionários: " + this.getQuantidadeFuncionarios() + "\n");
        conteudo.append("Salário Base Funcionário: " + this.getSalarioBaseFuncionario() + "\n");
        conteudo.append("Gastos Com Salarios:" + this.gastosComSalario() + "\n");
        conteudo.append("Tamanho da Loja:" + this.tamanhoDaLoja() + "\n");
        // Na classe Loja, atualize o métodotoString incluindo a informação acrescentada
        // na etapa 2, para retornar também o endereço (do tipo Endereco) e a data de
        // fundação (do tipo Data)
        conteudo.append("Endereco: " + this.getEndereco().toString() + "\n");
        conteudo.append("Data Fundacao: " + this.getDataFundacao().toString() + "\n");

        return conteudo.toString();
    }

    /*
     * Método gastosComSalario: este método não recebe parâmetros e retorna quanto a
     * loja gasta com o salário de todos os seus funcionários. Atente para o fato de
     * que não é possível realizar este cálculo caso o valor do salário base seja
     * -1. Neste caso, não realize o cálculo e retorne -1.
     */
    public Integer gastosComSalario() {
        if (this.salarioBaseFuncionario == -1)
            return -1;

        return this.salarioBaseFuncionario * this.quantidadeFuncionarios;
    }

    /*
     * Método tamanhoDaLoja: este método não recebe parâmetros e retorna um dos
     * seguintes caracteres: ‘P’, caso a loja possua menos de 10 funcionários; ‘M’,
     * caso a loja possua entre 10 (inclusive) e 30 (inclusive) funcionários; ou
     * ‘G’, caso a loja possua mais do que 31 (inclusive) funcionários.
     */
    public char tamanhoDaLoja() {
        if (this.quantidadeFuncionarios < 10)
            return 'P';

        if (this.quantidadeFuncionarios <= 30)
            return 'M';

        return 'G';
    }

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Dos Andradas", "Porto Alegre", "RS", "Brasil", "94828-760", "188", "0");
        Data data = new Data(28, 10, 2023);

    
        // quantidadeFuncionarios
        // salarioBaseFuncionario

        Loja loja1 = new Loja("E1", 5, endereco, data);
        Loja loja2 = new Loja("E7", 20, 2000, endereco, data);

        System.out.println("-------------------------");
        System.out.println("IMPRIMINDO");
        System.out.println(loja1.toString());
        System.out.println(loja2.toString());
        
    }

    public Object getTipo() {
        return null;
    }

    public double getValorSeguroEletronicos() {
        return 0;
    }

}