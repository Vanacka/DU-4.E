package Graf;

import static org.junit.Assert.*;

public class GrafTest {

    // Zkontroluje zdali je mozne vytvorit prazdny graf
    @org.junit.Test
    public void testPrazdnyGraf(){
        Graf g = new Graf();
        assertTrue(g.seznamVrcholu.isEmpty());
    }

    // Zkontroluje zdali je mozne vytvorit graf s jednim vrcholem
    @org.junit.Test
    public void testGrafJedenVrchol(){
        Graf g = new Graf();
        g.dejVrchol("poke");
        assertTrue(g.seznamVrcholu.size() == 1);
    }

    // Zkontroluje zdali je mozne vytvorit graf s jednou hranou
    @org.junit.Test
    public void testGrafJedenaHrana(){
        Graf g = new Graf();
        var A = g.dejVrchol("A");
        var B = g.dejVrchol("B");

        A.pridejSouseda(B);
        assertTrue((A.sousede.size() == 1 && B.sousede.size() != 1) || (A.sousede.size() != 1 && B.sousede.size() == 1));
    }

    @org.junit.Test
    public void testStrukturaGrafu(){
        Graf g = new Graf();
        var A = g.dejVrchol("A");
        var B = g.dejVrchol("B");
        var C = g.dejVrchol("C");

        A.pridejSouseda(B);
        B.pridejSouseda(C);

        assertTrue(A.existujeCestaDo(B));
        assertTrue(B.existujeCestaDo(C));
        assertFalse(C.existujeCestaDo(A));
    }
}