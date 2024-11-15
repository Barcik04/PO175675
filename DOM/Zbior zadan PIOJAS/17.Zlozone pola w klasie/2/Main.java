import Uni.TechnicalUniversity;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Engeneer", "Bombaclaut"));
        TechnicalUniversity tUni = new TechnicalUniversity("UWM", "Olsztyn", list, 17);
        System.out.println(tUni);

        tUni.addProgram("Jarglak");
        System.out.println(tUni);

        tUni.removeProgram("Bombaclaut");
        System.out.println(tUni);
    }
}