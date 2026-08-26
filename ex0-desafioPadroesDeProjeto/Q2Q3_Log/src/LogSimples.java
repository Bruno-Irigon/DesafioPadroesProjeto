import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LogSimples implements Log {
    private static final LogSimples INSTANCIA = new LogSimples();
    
    private final List<String> mensagens;

    private LogSimples() {
        mensagens = new LinkedList<>();
    }

    public static LogSimples getInstance() {
        return INSTANCIA;
    }

    @Override
    public void log(String m) {
        mensagens.add(LocalDateTime.now() + " : " + m);
    }

    @Override
    public Iterator<String> iterator() {
        return Collections.unmodifiableList(mensagens).iterator();
    }
}