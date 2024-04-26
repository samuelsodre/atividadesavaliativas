import java.util.Scanner;

public class Cliente {

  private String id;
  private String senha;

  public Cliente(String id, String senha) {
    this.id = id;
    this.senha = senha;
  }

  public void fazerLogin(String id, String senha) {
    Scanner sc = new Scanner(System.in);
    System.out.println("usuário: ");
    id = sc.nextLine();
    System.out.println("senha: ");
    senha = sc.nextLine();
    sc.close();
  }

}