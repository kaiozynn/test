public class Repositorio {
  private Socio BD [];
  private int indice;

  public Repositorio() {
    BD = new Socio[10];
    indice = 0;
  }

  public void inserir(Socio s) {
    BD[indice] = s;
    indice++;
  }

  public void remover(String m) {
    for(int i = 0; i < indice; i++ ) {
      if (BD[i].matricula == m) {
        BD[i] = BD[indice-1];
        BD[indice-1] = null;
        indice--;
      }
    }
  }

  public void maisVelho(Socio s) {

  }
}
