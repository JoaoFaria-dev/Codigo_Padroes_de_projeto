public class Memento {
    private final String estadoSalvo;

    public Memento(String estado) {
        this.estadoSalvo = estado;
    }

    public String getEstadoSalvo() {
        return estadoSalvo;
    }
}
