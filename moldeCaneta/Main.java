package moldeCaneta;

public class Main {
  public static void main(String[] args) {
    Caneta c1 = new Caneta();
    // consigo definir dados porque a modelo, cor, são públicos.
    c1.modelo = "BIC Cristal";
    c1.cor = "Azul";
    // ponta não é private, não consigo mexer/informar dados.
    c1.ponta = 0.5f;
    c1.carga = 80;
    // c1.tampar = true;
    c1.destampar();
    c1.status();
    c1.rabiscar();
  }
}
