public class Repositorio {
  private Socio BD [];
  private int indice;

  public Repositorio() {
    BD = new Socio[10];
    indice = 0;
  }

  public void inserir(Socio s) throws EISocioCadastrado {
    try {
      for (int i = 0; i < indice; i++) {
        if (BD[i] == s) {
            throw new EISocioCadastrado("Usuário já cadastrado");
        }
      }
      BD[indice] = s;
      indice++;
    } catch (EISocioCadastrado e) {
      System.out.println(e);
    }
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
