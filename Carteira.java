public class Carteira {
    String dono;
    double saldoBitcoin;
    String senhaAcesso;

    public Carteira(String dono) {
        this.dono = dono;
        this.saldoBitcoin = 0.0;
        this.senhaAcesso = "1234";
    }

    public void depositar(double qtd) {
        this.saldoBitcoin += qtd;
    }
}