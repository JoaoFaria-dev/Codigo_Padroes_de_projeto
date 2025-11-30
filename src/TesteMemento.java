public class TesteMemento {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Historico historico = new Historico();

        editor.setEstado("Versão 1");
        editor.setEstado("Versão 2");
        historico.adicionarMemento(editor.salvarEstado());

        editor.setEstado("Versão 3");
        historico.adicionarMemento(editor.salvarEstado());

        editor.setEstado("Versão 4");
        historico.adicionarMemento(editor.salvarEstado());

        editor.setEstado("Versão 5");
        historico.adicionarMemento(editor.salvarEstado());

        System.out.println("Estado atual: " + editor.getEstado());


        editor.restaurarEstado(historico.getMemento(1));
        System.out.println("Estado restaurado: " + editor.getEstado());

        editor.restaurarEstado(historico.getMemento(3));
        System.out.println("Estado restaurado: " + editor.getEstado());


        /*
        // Versão com pilha:

        editor.restaurarEstado(historico.getUltimoMemento());
        System.out.println("Estado restaurado para o último salvo: " + editor.getEstado());
        editor.restaurarEstado(historico.getUltimoMemento());
        System.out.println("Estado restaurado para o penúltimo salvo: " + editor.getEstado());
        */
    }


}
