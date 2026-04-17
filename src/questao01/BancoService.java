package questao01;
import java.util.ArrayList;
import java.util.List;

public class BancoService {

    private List<Conta> contas
            = new ArrayList<>();

    public BancoService() {
        // Simulando banco de dados em memoria
        contas.add(new Conta("Rogério", "1111", "1111", "aluno", 5000));
        contas.add(new Conta("Fabio", "2222", "2222", "aluno", 7000));
        contas.add(new Conta("Maria", "3333", "3333", "aluno", 4000));
        contas.add(new Conta("João", "4444", "4444", "aluno", 3000));
        contas.add(new Conta("Manuel", "5555", "5555", "aluno", 2000));
        contas.add(new Conta("Manuela", "6666", "6666", "aluno", 3000));
    }

    public List<Conta> getContas() {
        return contas;
    }
}
