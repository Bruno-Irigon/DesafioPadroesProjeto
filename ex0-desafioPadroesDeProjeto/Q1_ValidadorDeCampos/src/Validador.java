public class Validador{
    private ValidadorInterface tipo;
    
    public void setTipo(ValidadorInterface tipo) {
        this.tipo = tipo;
    }

    public Validador(ValidadorInterface tipo) {
        this.tipo = tipo;
    }

    public boolean valida(ValidadorInterface tipo,String valor){
       return tipo.valida(valor);
    }
}