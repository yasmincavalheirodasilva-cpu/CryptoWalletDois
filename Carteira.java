public class Carteira {
    String dono;
    double saldoBitcoin;
    String senhaAcesso = "123456";

    public Carteira(String dono) {
        this.dono = dono;
        this.saldoBitcoin = 0.0;
    }

    void depositar(double valor) {
        saldoBitcoin += valor;
    }
}