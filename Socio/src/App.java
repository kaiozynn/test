public class App {
    public static void main(String[] args) throws Exception {
        Repositorio rep = new Repositorio();

        Especialidade es1 = new Especialidade("Tecnologia da informação");
        Estudante e1 = new Estudante("Caio", "202321190006", 1500, 19, "IFBA", es1);
        Profissional p1 = new Profissional("Crescencio", "5682", 3000, 50, "IFBA");
        
        rep.inserir(p1);
        rep.inserir(e1);
    }
}
