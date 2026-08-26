public class LogMaiusculas extends LogDecorator {
    public LogMaiusculas(Log componente) { super(componente); }

    @Override
    protected String decorar(String m) { return m.toUpperCase(); }
}