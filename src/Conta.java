
public class Conta {

   private String titular;
   private String agencia;
   private String numConta;
   private String senha;
   private double saldo;

    public Conta(String titular, String agencia, String numConta, String senha, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numConta = numConta;
        this.senha = senha;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double verificarSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }

    public void depositar(double valor){
        this.saldo = saldo + valor;

    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", agencia='" + agencia + '\'' +
                ", numConta='" + numConta + '\'' +
                ", senha='" + senha + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
