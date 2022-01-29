public class conta implements Iconta {

    protected static final int AGENCIAPADRAO = 1;
    protected static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected cliente cliente;

    public conta(cliente cliente) {
        this.agencia = conta.AGENCIAPADRAO;
        this.numero = SEQUENCIAL ++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void transferir(double valor, conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    @Override
    public void imprimirExtrato() {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Numero: %d",this.numero));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }
}
