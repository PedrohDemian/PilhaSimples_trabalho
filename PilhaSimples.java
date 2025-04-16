import java.util.ArrayList;
import java.util.Collections;

public class PilhaSimples implements IEstruturaSimples {
    private ArrayList<Object> elementos;

    public PilhaSimples() {
        this.elementos = new ArrayList<>();
    }

    @Override
    public void adicionar(Object valor) {
        elementos.add(valor);
    }

    @Override
    public void remover() {
        if (!elementos.isEmpty()) {
            elementos.remove(elementos.size() - 1);
        } else {
            System.out.println("Pilha vazia!");
        }
    }

    @Override
    public void exibir() {
        if (elementos.isEmpty()) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Pilha:");
            for (int i = elementos.size() - 1; i >= 0; i--) {
                System.out.println("[" + i + "] -> " + elementos.get(i));
            }
        }
    }

    @Override
    public void ordenarCrescente() {
        if (elementos.isEmpty()) {
            System.out.println("Pilha vazia! Nada para ordenar.");
        } else {
            ArrayList<Integer> temp = new ArrayList<>();
            for (Object obj : elementos) {
                temp.add(Integer.parseInt(obj.toString()));
            }
            Collections.sort(temp);
            elementos.clear();
            for (Integer val : temp) {
                elementos.add(val);
            }
            System.out.println("Pilha ordenada com sucesso!");
        }
    }

    @Override
    public void editarElemento(int posicao, Object novoValor) {
        if (posicao >= 0 && posicao < elementos.size()) {
            elementos.set(posicao, novoValor);
            System.out.println("Elemento atualizado com sucesso.");
        } else {
            System.out.println("Posição inválida.");
        }
    }
}
