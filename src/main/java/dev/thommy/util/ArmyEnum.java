package dev.thommy.util;

import java.util.stream.Stream;

public enum ArmyEnum {
    DEATH_GUARD("Death Guard"),
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
