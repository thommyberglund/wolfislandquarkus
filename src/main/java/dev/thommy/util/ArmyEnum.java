package dev.thommy.util;

import java.util.stream.Stream;

public enum ArmyEnum {
    DEATH_GUARD("Death Guard"),
    SPACE_WOLVES("Space Wolves"),
    THOUSAND_SONS("Thousand Sons"),
    ASTRA_MILITARUM("Asta Militarum"),
    DARK_ANGELS("Dark Angels"),
    BLOOD_ANGELS("Blood Angels"),
    TYRANIDS("Tyranids"),
    SISTERS_BATTLE("Sisters of Battle"),
    ELDAR("Eldar"),
    DARK_ELDAR("Dark Eldar"),
    ORKS("Orks"),
    SPACE_MARINES("Space Marines"),
    CSM("Chaos Space Marines"),
    DAEMONS("Daemons"),
    ADMECH("Adeptus Mechanicum");

    private String armyName;

    public String toString(){
        return armyName;
    }

    ArmyEnum(String armyName) {
        this.armyName = armyName;
    }

    public String getArmyName() {
        return armyName;
    }

    public static ArmyEnum of(String armyName) {
        return Stream.of(ArmyEnum.values())
                .filter(p -> p.getArmyName() == armyName)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
