package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 10000);

        var p2 = new Produto("Caneta Preta", 20);
        double precofinal1 = p1.precoComDesconto();
        double precofinal2 = p2.precoComDesconto();

        System.out.printf("O preço final do produto %s é %.2f", p1.nome, precofinal1);
        System.out.printf("""
                        \nO preço inicial do produto %s é %.2f, aplicando o desconto de %.2f 
                        \nficará por apenas %.2f""",
                        p2.nome, p2.preco, p2.desconto, p2.precoComDesconto());





        

    }

}
