package Iterator;

import java.util.Iterator;
import java.util.Scanner;

public class MujRetezec implements Iterator<Character> {
    String str;
    private int currentIndex = 0;

    public MujRetezec(String str) {
        this.str = str;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < str.length();
    }

    @Override
    public Character next() {
        return str.charAt(currentIndex++);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MujRetezec mr = new MujRetezec(sc.next());
        while(mr.hasNext()) {
            System.out.println(mr.next());
        }
    }
}
