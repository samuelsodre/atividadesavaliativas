import java.util.Scanner;

public class Produtos {
  private double valor;
  private String descricao;
  private String produto;
  private String[] listaProdutos;
  
  public void procurarProduto(String produtoProcurado){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o nome do produto que você procura: ");
    produtoProcurado = sc.nextLine();
    sc.close();
    
    for (int i=0; i<listaProdutos.length; i++){
      if (produtoProcurado == listaProdutos[i]){
        System.out.println("O produto que você procura tem no nosso estoque!!");
      } else{
        System.out.println("Produto não encontrado!");
      }
    }
  }

  public void adicionarCarrinho(){
    String[] meuCarrinho = {};
    meuCarrinho[0] = produto;
  }
  
  
}