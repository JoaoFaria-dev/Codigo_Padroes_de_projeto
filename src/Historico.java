import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Historico {

    public List <Memento> historico = new ArrayList<>();

    public void adicionarMemento(Memento memento){
        historico.add(memento);
    }

    public Memento getMemento(int indice){
        return historico.get(indice);
    }
/*
    //-> Versão com Pilha

    private Stack<Memento> historico = new Stack<>();

     public void adicionarMemento(Memento memento) {
        historico.push(memento);
    }

    public Memento getUltimoMemento() {
        if (historico.isEmpty()) {
            return null;
        }
        return historico.pop();
    }
*/
}
