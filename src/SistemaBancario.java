
import java.util.List;
import java.util.Scanner;

public class SistemaBancario {

    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {

        BancoService db = new BancoService();
        List<Conta> contas = db.getContas();

        System.out.println("Bem vindo");

        Conta conta = null;

        while (conta == null) {
            System.out.print("Agência: ");
            String agencia = leia.nextLine();

            System.out.print("Conta: ");
            String numConta = leia.nextLine();

            System.out.print("Senha: ");
            String senha = leia.nextLine();

            conta = autenticar(agencia, numConta, senha, contas);

            if (conta == null) {
                System.out.println("Dados inválidos bb, por favor, tenta de novo.\n");
            }
        }

        System.out.println("Bem vindo, " + conta.getTitular() + "!");
        mostrarMenu(conta);

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

            switch (opcao) {

                case 1:
                    System.out.printf("Seu saldo atual: R$ %.2f%n", conta.verificarSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: R$ ");
                    double valorSaque = leia.nextDouble();
                    leia.nextLine();

                    if (valorSaque > conta.verificarSaldo()) {
                        System.out.println("Saldo insuficiente, ô pobreza miserável que nois ta");
                    } else {
                        conta.sacar(valorSaque);
                        System.out.printf("Saque de R$ %.2f realizado, cheio de grana hein fi!%n", valorSaque);
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double valorDeposito = leia.nextDouble();
                    leia.nextLine();

                    conta.depositar(valorDeposito);
                    System.out.printf("Depósito de R$ %.2f realizado com sucesso, amou?%n", valorDeposito);
                    break;

                case 4:
                    System.out.println("Vazando, jae? Até mais, " + conta.getTitular() + "!");
                    break;

                default:
                    System.out.println("Opção inválida/Maior caô");
                    break;
            }

        } while (opcao != 4);

    }

    private static Conta autenticar(String agencia, String numconta, String senha, List<Conta> contas) {

        for (Conta conta : contas) {
            if (conta.getAgencia().equals(agencia)
                    && conta.getNumConta().equals(numconta)
                    && conta.getSenha().equals(senha)) {
                return conta;
            }
        }
        return null;

    }

}
