package moldeCaneta;

public class Caneta {
  public String modelo;
  public String cor;
  public float ponta;
  protected int carga;
  private boolean tampada;

  public void status() {
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Uma caneta " + this.cor);
    System.out.println("Ponta: " + this.ponta);
    System.out.println("Carga: " + this.carga);
    System.out.println("Está tampada? " + this.tampada);
  }

  public void rabiscar() {
    if (this.tampada == true) {
      System.out.println("ERRO! Não posso rabiscar, porque a caneta está tampada!");
    } else {
      System.out.println("A caneta está destampada. Estou rabiscando!");
    }
  }

  public void tampar() {
    // this é uma referência para o próprio objeto que chamou.
    this.tampada = true;
  }

  public void destampar() {
    this.tampada = false;
  }
}
