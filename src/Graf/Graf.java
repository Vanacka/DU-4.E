package Graf;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Graf implements Serializable {
    private Map<String, Vrchol> seznamVrcholu;

    public Graf() {
        this.seznamVrcholu = new HashMap<String, Vrchol>();
    }

    /**
     * nacti Graf ulozeny do souboru
     *
     * @param jmenoSouboru soubor s grafem ulozenym pomoci metody [#ulozGrafDoSouboru]
     */
    public Graf(String jmenoSouboru) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(jmenoSouboru))) {
            Graf g = (Graf) ois.readObject();
            this.seznamVrcholu = g.seznamVrcholu;
        }
    }

    /**
     * vrati Vrchol grafu podle jmena.
     *
     * Pokud vrchol s timto jmenem jeste neexistuje, vytvori novy. Pokud uz
     * existuje,
     * vrati jiz existujici.
     *
     * @return vrchol s danym jmenem
     */
    public Vrchol dejVrchol(String jmeno) {
        if (!this.seznamVrcholu.containsKey(jmeno)) {
            seznamVrcholu.put(jmeno, new Vrchol(jmeno));
        }
        return seznamVrcholu.get(jmeno);
    }

    /**
     * ulozi existujici graf do souboru.
     */
    public void ulozGrafDoSouboru(String jmenoSouboru) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(jmenoSouboru))) {
            oos.writeObject(this);
        }
    }
}
