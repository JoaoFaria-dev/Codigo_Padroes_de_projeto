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

        /*
        // Sem Memento - estado exposto diretamente
            Editor editor = new Editor();
            editor.setEstado("Versão 1");
            editor.setEstado("Versão 2");
            // Para desfazer, precisamos manipular diretamente o estado
            editor.setEstado("Versão 1"); // código "hardcoded" e acoplado

        // Com Memento - estado encapsulado
            Editor editor2 = new Editor();
            Historico historico = new Historico();

            editor2.setEstado("Versão 1");
            historico.adicionarMemento(editor2.salvarEstado());

            editor2.setEstado("Versão 2");
            historico.adicionarMemento(editor2.salvarEstado());

            // Restaurando sem acessar detalhes internos
            editor2.restaurarEstado(historico.getMemento(2));

         */
    }


}
