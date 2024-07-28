public class Estudante extends Socio{
  private String universidade;
  private Especialidade esp;
  
  public Estudante(String n, String m, double vA, int i, String u, Especialidade e) {
    super(n, m, vA, i);
    universidade = u;
    esp = e;
  }

  public void imprimir() {
    System.out.println("Meu nome é: " + nome);
    System.out.println("Sua matrícula: " + matricula);
    System.out.println("Valor anuidade é: " + valorAnuidade);
    System.out.println("Sua idade é: " + idade);
    System.out.println("Estuda na universidade: " + universidade);
    System.out.println("Sua area de formação é: " + esp);
  }
}
