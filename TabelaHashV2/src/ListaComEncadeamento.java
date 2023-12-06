import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListaComEncadeamento<T> implements List<T>{
    private NoLista<T> primeiro;
    private NoLista<T> ultimo;
    private int contador;

    public ListaComEncadeamento(){
        primeiro = null;
        ultimo = null;
        contador = 0;
    }

    @Override
    public int size() {
        return contador;
    }

    @Override
    public boolean isEmpty() {
        return (contador == 0);
    }

    @Override
    public boolean contains(Object o) {
        T obj = (T) o;
        NoLista<T> tmp = primeiro;

        while (tmp != null){
            if(tmp.getInfo().equals(obj)){
                return true;
            }
            tmp = tmp.getProximo();
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T obj) {
        //Adiciona na última posição
        NoLista<T> tmp = new NoLista<T>(obj, null);
        if(contador == 0){
            primeiro = tmp;
        } else{
            ultimo.setProximo(tmp);
        }
        ultimo = tmp;
        contador++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        T obj = (T) o;
        NoLista<T> tmp = primeiro;
        NoLista<T> ant = null;

        while (tmp != null){
            //ant = tmp.getProximo();

            if(tmp.getInfo().equals(obj)){
                if(ant != null){
                    ant.setProximo(tmp.getProximo());
                } else {
                    primeiro = tmp.getProximo();
                }
                contador--;
                return true;
            }
            tmp = tmp.getProximo();
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
    @Override
    public String toString(){
        String s = "";
        NoLista<T> tmp = primeiro;
        while (tmp != null) {
            s += tmp.getInfo().toString() + ", ";
            tmp = tmp.getProximo();
        }
        return s;
    }
}
