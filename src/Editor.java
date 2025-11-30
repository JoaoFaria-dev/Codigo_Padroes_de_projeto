public class Editor {
    private String estado;

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public Memento salvarEstado(){
        return new Memento(estado);
    }

    public void restaurarEstado(Memento memento){
        this.estado = memento.getEstadoSalvo();
    }




}
