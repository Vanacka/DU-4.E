package GenerickyZasobnik;

import lombok.Data;

import java.util.Arrays;

@Data
public class ZasobnikPole<T> implements Zasobnik<T>{

    T[] pole;
    int index = 0;

    public ZasobnikPole(int velikost) {
        this.pole = (T[]) new Object[velikost];
    }

    @Override
    public void push(T prvek) {
        this.pole[this.index] = prvek;
        this.index++;
    }

    @Override
    public T pop() {
        this.index--;
        T odebiranyPrvek = this.pole[this.index];
        this.pole[this.index] = null;
        return odebiranyPrvek;
    }

    @Override
    public boolean isEmpty() {
        return this.index == 0;
    }

    @Override
    public String toString() {
        return "ZasobnikPole{" +
                "pole=" + Arrays.toString(pole) +
                ", index=" + index +
                '}';
    }
}
