public class Profissional extends Socio implements Professor_EBTT {
  private String Empresa;

  public Profissional(String n, String m, double vA, int i, String e) {
    super(n, m, vA, i);
    Empresa = e;
  }

  public void desconto() {

  }

  public void imprimir() {
    System.out.println("Meu nome é: " + nome);
    System.out.println("Sua matrícula: " + matricula);
    System.out.println("Valor anuidade é: " + valorAnuidade);
    System.out.println("Sua idade é: " + idade);
    System.out.println("Estuda na universidade: " + Empresa);
  }
}
