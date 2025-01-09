package Graf;

import java.io.IOException;

public class Main {
    public static void main( String[] args ) throws IOException {
        var g = new Graf();
        var v1 = g.dejVrchol("v1");
        var v2 = g.dejVrchol("v2");
        var v3 = g.dejVrchol("v3");

        v1.pridejSouseda(v2);
        v2.pridejSouseda(v3);

        if (v1.existujeCestaDo(v3) == false) {
            System.out.println("je to rozbite!!");
        } else {
            g.ulozGrafDoSouboru("graf.dat");
        }
    }
}
