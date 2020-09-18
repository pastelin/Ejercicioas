package enumpackage;

import static enumpackage.HairColor.*;
import java.util.Collections;

public class Persona {

    HairColor hairColor = BLACK;

    public Persona() {

    }

    public static void main(String[] args) {

        Persona peterParker = new Persona();
        Persona spiderMan = peterParker;

        System.out.println("Hair Color of Peter Parker: " + peterParker.hairColor);

    }
}