public interface Iconta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valo,conta contaDestino);

    void imprimirExtrato();
}
