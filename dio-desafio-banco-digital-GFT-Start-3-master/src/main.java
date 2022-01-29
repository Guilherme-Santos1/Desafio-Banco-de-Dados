public class main {

    public static void main(String[] args) {
        cliente Gabriel = new cliente();
        Gabriel.setNome("Gabriel");


        conta cc = new contaCorrente(Gabriel);

        conta poupanca = new contaPoupanca(Gabriel);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
