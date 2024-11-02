package GenerickyZasobnik;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ZasobnikList<T> implements Zasobnik<T> {

    private ArrayList<T> list = new ArrayList<T>();

    @Override
    public void push(T prvek) {
        list.add(prvek);
    }

    @Override
    public T pop() {
        return list.remove(list.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "ZasobnikList{" +
                "list=" + list +
                '}';
    }
}
