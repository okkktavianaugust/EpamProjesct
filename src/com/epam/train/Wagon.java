package com.epam.train;

public class Wagon {

    private TypeWagon typeWagon;
    private int weight;
    private int id;
    private TypePassengerWagon typePassengerWagon;
    private static int wagonCounter = 1;

    public Wagon(TypeWagon typeWagon, int weight) {
        this.typeWagon = typeWagon;
        this.weight = weight;
        this.id = wagonCounter++;
    }

    public Wagon(TypeWagon typeWagon, TypePassengerWagon typePassengerWagon, int weight) {
        this.typeWagon = typeWagon;
        this.typePassengerWagon = typePassengerWagon;
        this.weight = weight;
        this.id = wagonCounter++;
    }

    public TypeWagon getTypeWagon() {
        return typeWagon;
    }

    public int getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    public static int getWagonCounter() {
        return wagonCounter - 1;
    }

    public TypePassengerWagon getTypePassengerWagon() {
        return typePassengerWagon;
    }

    public void setTypeWagon(TypeWagon typeWagon) {
        this.typeWagon = typeWagon;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTypePassengerWagon(TypePassengerWagon typePassengerWagon) {
        this.typePassengerWagon = typePassengerWagon;
    }

    public static void setWagonCounter(int wagonCounter) {
        Wagon.wagonCounter = wagonCounter;
    }

    @Override
    public String toString() {
        return "Wagon{" +
                "typeWagon=" + typeWagon +
                ", weight=" + weight +
                ", id=" + id +
                ", typePassengerWagon=" + typePassengerWagon +
                '}';
    }
}
