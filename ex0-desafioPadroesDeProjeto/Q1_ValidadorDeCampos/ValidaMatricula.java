public class ValidaMatricula implements ValidadorInterface{
    private final ValidadorInterface validaInteiro;

    public ValidaMatricula() {
        this(new ValidaInteiro());
    }

    public ValidaMatricula(ValidadorInterface validadorDeInteiro) {
        this.validaInteiro = validadorDeInteiro;
    }
    @Override
    public boolean valida(String valor) {
        if (!validaInteiro.valida(valor)) {
            return false;
        }
        int soma = 0;
        for (int i = 0; i < valor.length() - 1; i++) {
            soma += Character.getNumericValue(valor.charAt(i));
        }
        int verificador = soma % 10;
        return verificador == Character.getNumericValue(valor.charAt(valor.length() - 1));
    }
}