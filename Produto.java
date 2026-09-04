public class Produto {
    int id;
    String nome;
    double preco;

    void aplicarDesconto(double porcentagem) {
        double desconto = this.preco * (porcentagem / 100);
        this.preco = this.preco - desconto;
    }

    void exibirDetalhes() {
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + String.format("%.2f", this.preco));
        System.out.println("------------------------");
    }
}
