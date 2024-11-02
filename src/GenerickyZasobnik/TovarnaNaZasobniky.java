package GenerickyZasobnik;

public class TovarnaNaZasobniky<T> {
    public Zasobnik<T> vyrobZasobnik(String typ, int velikost) {
        if (typ.equals("list")) {
            return new ZasobnikList();
        }
        else if (typ.equals("pole")) {
            return new ZasobnikPole(velikost);
        }
        else {
            throw new IllegalArgumentException("Unsupported type: " + typ);
        }
    }
}
