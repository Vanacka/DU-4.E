package GenerickyZasobnik;

public class Main {
    public static void main(String[] args) {
        TovarnaNaZasobniky tovarna = new TovarnaNaZasobniky();
        Zasobnik<Integer> intZasobnik = tovarna.vyrobZasobnik("list", 0);
        System.out.println(intZasobnik);
        intZasobnik.push(48);
        System.out.println(intZasobnik);
        intZasobnik.push(342);
        System.out.println(intZasobnik);
        intZasobnik.push(342134);
        System.out.println(intZasobnik);
        intZasobnik.push(5677);
        System.out.println(intZasobnik);
        int i = 0;
        while (!intZasobnik.isEmpty()) {
            i = intZasobnik.pop();
            System.out.println(i);
            System.out.println(intZasobnik);
        }
        System.out.println(intZasobnik);
        intZasobnik.push(34);
        System.out.println(intZasobnik);
        i = intZasobnik.pop();
        System.out.println(i);
        System.out.println(intZasobnik);

        Zasobnik<String> stringZasobnik = tovarna.vyrobZasobnik("pole", 4);
        System.out.println(stringZasobnik);
        stringZasobnik.push("borec");
        System.out.println(stringZasobnik);
        stringZasobnik.push("pan");
        System.out.println(stringZasobnik);
        stringZasobnik.push("chalan");
        System.out.println(stringZasobnik);
        stringZasobnik.push("beast");
        System.out.println(stringZasobnik);
        String s = "";
        while (!stringZasobnik.isEmpty()) {
            s = stringZasobnik.pop();
            System.out.println(s);
            System.out.println(stringZasobnik);
        }
        System.out.println(stringZasobnik);
        stringZasobnik.push("typek");
        System.out.println(stringZasobnik);
        s = stringZasobnik.pop();
        System.out.println(s);
        System.out.println(stringZasobnik);
        stringZasobnik.push("broski");
        System.out.println(stringZasobnik);
    }
}
