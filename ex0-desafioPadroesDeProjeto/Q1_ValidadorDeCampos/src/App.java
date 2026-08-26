public class App {
     Validador validador = new Validador();
    public static void main(String[] args) throws Exception {
        var validador = new Validador();

        validador.setEstrategia(new ValidaEmail());
        testa(validador, "Email", "bernardo.copstein@pucrs.br");
        testa(validador, "Email", "copstein.pucrs.br");
    }
    public static void testa(Validador val, String tipo, String valor){
        String resultado = val.valida( valor) ? "válido" : "inválido";
        System.out.println("O valor "+ valor +" do tipo "+ tipo + " é "+ resultado);
    }
}
