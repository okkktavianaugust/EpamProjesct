package com.epam.train;


public class Main {
    public static void main(String[] args){

        Train train = new Train();
        Wagon wagon = new Wagon(TypeWagon.PASSENGERWAGON,20);
        Wagon wagon1 = new Wagon(TypeWagon.CARGOWAGON,60);
        Wagon wagon2 = new Wagon(TypeWagon.PASSENGERWAGON, TypePassengerWagon.SUITE,60);
        Locomotive locomotive = new Locomotive(40, TypeLocomotive.ELECTRIC);
        Locomotive locomotive1 = new Locomotive(60,TypeLocomotive.DIESEL);

        train.addWagon(wagon);
        train.addWagon(wagon1);
        train.addWagon(wagon2);
        train.addLocomotive(locomotive);
        train.addLocomotive(locomotive1);
        train.printWagon(3);
        train.totalNumberOfWagonsInTrain();
    }
}
