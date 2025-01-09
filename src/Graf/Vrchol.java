package Graf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Vrchol implements Serializable {
    private String jmeno;
    private Set<Vrchol> sousede;


    Vrchol(String jmeno) {
        this.jmeno = jmeno;
        this.sousede = new HashSet<>();
    }

    /**
     * pridej vrchol `v` do seznamu sousednich vrcholu
     */
    public void pridejSouseda(Vrchol v) {
        sousede.add(v);
    }

    /**
     * otestuje, zda je vrchol `v` mym sousdem
     *
     * @return true pokud je v mym primym sousedem
     */
    public boolean jeSousedem(Vrchol v) {
        return sousede.contains(v);
    }

    /**
     * otestuje, zda existuje cesta mezi mnou a vrcholem `v`
     *
     * @return true pokud cesta existuje
     */
    public boolean existujeCestaDo(Vrchol v) {
        Set<Vrchol> navstivene = new HashSet<>();
        return dfs(this, v, navstivene);
    }

    private boolean dfs (Vrchol aktualni, Vrchol cil, Set<Vrchol> navstivene) {
        if (aktualni.equals(cil)) {
            return true;
        }
        navstivene.add(aktualni);
        for (Vrchol soused : aktualni.sousede) {
            if (!navstivene.contains(soused)) {
                if (dfs(soused, cil, navstivene)) {
                    return true;
                }
            }
        }
        return false;
    }
}
