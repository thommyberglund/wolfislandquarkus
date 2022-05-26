package dev.thommy.entity;

import dev.thommy.util.ArmyEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ARMY")
public class ArmyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String armyName;
    int armyPoints;
    int armyPowerLevel;
    @Enumerated(EnumType.STRING)
    @Column(name="armytype")
    ArmyEnum armyType;

    public ArmyEntity() {

    }

    public ArmyEntity(String armyName, int armyPoints, ArmyEnum armyType) {
        this.armyName = armyName;
        this.armyPoints = armyPoints;
        this.armyType = armyType;
    }

    public String getArmyName() {
        return armyName;
    }

    public void setArmyName(String armyName) {
        this.armyName = armyName;
    }

    public int getArmyPoints() {
        return armyPoints;
    }

    public void setArmyPoints(int armyPoints) {
        this.armyPoints = armyPoints;
    }

    public int getArmyPowerLevel() {
        return armyPowerLevel;
    }

    public void setArmyPowerLevel(int armyPowerLevel) {
        this.armyPowerLevel = armyPowerLevel;
    }

    public ArmyEnum getArmyType() {
        return armyType;
    }

    public void setArmyType(ArmyEnum armyType) {
        this.armyType = armyType;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Army{" +
                "id=" + id +
                ", armyName='" + armyName + '\'' +
                ", armyPoints=" + armyPoints +
                ", armyPowerLevel=" + armyPowerLevel +
                ", armyType=" + armyType +
                '}';
    }
}
