package SistemaBancario.Executar;
import SistemaBancario.Executar.Executar;
import SistemaBancario.System.SistemaBanco;

public class Executar{

    public static void main(String[] args) {
        SistemaBanco sistema = new SistemaBanco();

        sistema.iniciar();
    }
}


