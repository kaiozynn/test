public abstract class Socio {
  protected String nome, matricula;
  protected double valorAnuidade;
  protected int idade;

  public Socio(String n, String m, double vA, int i) {
    nome = n;
    matricula = m;
    valorAnuidade = vA;
    idade = i;
  }

  public void imprimir() {
    System.out.println();
  }
}
