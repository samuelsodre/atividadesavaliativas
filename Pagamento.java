import java.util.Scanner;

public class Pagamento {
  private double valorFinal;
  private String formaPagamento;
  private Boolean pagamentoDinheiro;
  private Boolean pagamentoCartao;

  public void formaPagamento(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Escolha a opção do pagamento: \n 1- Cartão \n 2- Dinheiro.");
    formaPagamento = sc.next();
    if (formaPagamento == "1"){
      pagamentoCartao = true;
      pagamentoDinheiro = false;
    } else if (formaPagamento == "2"){
      pagamentoDinheiro = true;
      pagamentoCartao = false;
    } else {
      System.out.println("Forma de pagamento inválida!");
    }

    sc.close();
  }
}