package com.epam.train;

public class Locomotive {

    private int power;
    private TypeLocomotive typeLocomotive;
    private int id;
    private static int locomotiveCounter = 1;

    public Locomotive(int power, TypeLocomotive typeLocomotive) {
        this.typeLocomotive = typeLocomotive;
        this.power = power;
        this.id = locomotiveCounter++;
    }

    public int getPower() {
        return power;
    }

    public TypeLocomotive getTypeLocomotive() {
        return typeLocomotive;
    }

    public int getId() {
        return id;
    }

    public static int getLocomotiveCounter() {
        return locomotiveCounter-1;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setTypeLocomotive(TypeLocomotive typeLocomotive) {
        this.typeLocomotive = typeLocomotive;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setLocomotiveCounter(int locomotiveCounter) {
        Locomotive.locomotiveCounter = locomotiveCounter;
    }

    @Override
    public String toString() {
        return "Locomotive{" +
                "power=" + power +
                ", typeLocomotive=" + typeLocomotive +
                ", id=" + id +
                '}';
    }
}
