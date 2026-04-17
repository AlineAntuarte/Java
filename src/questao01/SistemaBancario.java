package questao01;
import java.util.List;
import java.util.Scanner;

public class SistemaBancario {

    static Scanner leia = new Scanner(System.in);

    static void main() {

        BancoService db = new BancoService();
        List<Conta> contas = db.getContas();


        System.out.println("Bem vindo");

        System.out.println("Agência: ");
        String agencia = leia.nextLine();

        System.out.println("Conta: ");
        String Numconta = leia.nextLine();

        System.out.println("Senha: ");
        String senha = leia.nextLine();

        // Autenticar!!!
        Conta conta =
                autenticar(agencia,
                        Numconta,
                        senha,
                        contas);

        if (conta != null) {
            System.out.println("Bem vindo " + conta.getTitular());
            mostrarMenu(conta);
        } else {
            System.out.println("Erro: Dados inválidos");
        }






    }

    private static void mostrarMenu(Conta conta) {

        int opcao = 0;
        do {

            System.out.println("---- MENU PRINCIPAL ------");
            System.out.println("1. Ver Saldo");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Sair");
            opcao = leia.nextInt();

            switch (opcao)  {

                case 1:

                case 2:

                case 3:

                case 4:
                    

                default:


            }



        } while (opcao != 4);


    }

    private static Conta autenticar(String agencia, String numconta, String senha, List<Conta> contas) {

        for (Conta conta : contas) {
            if (conta.getAgencia().equals(agencia)
                && conta.getNumConta().equals(numconta)
                && conta.getSenha().equals(senha)
            ) {
                return conta;
            }
        }
        return null;


    }





}
