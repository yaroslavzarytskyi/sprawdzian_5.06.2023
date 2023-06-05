import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NaPewnoZdam zdam1 = new NaPewnoZdam("jezyk polski", 2, "bobrowski");
        NaPewnoZdam zdam2 = new NaPewnoZdam("matematyka", 2, "nowak");
        NaPewnoZdam zdam3 = new NaPewnoZdam("java", 2, "karczewski");
        Zdalem zdalem = new Zdalem("biologia", 5, "mikrut", LocalDate.now());
        zdalem.radosc("zdalem z biologii");
        List<NaPewnoZdam> lista = new ArrayList<>();
        lista.add(zdam1);
        lista.add(zdam2);
        lista.add(zdam3);
        lista.add(zdalem);
        for (NaPewnoZdam naPewnoZdam : lista) {
            System.out.println(naPewnoZdam);
        }
        lista.remove(3);
    }
}