package com.epam.train;

import java.util.ArrayList;
import java.util.List;

public class Train {


    List<Wagon> wagons = new ArrayList<>();
    List<Locomotive> locomotives = new ArrayList<>();

    public void addWagon(Wagon wagon) {
        if (wagon == null) {
            throw new IllegalArgumentException("Wagon can not be null");
        }
        if (!checkExistWagon(wagon)) {
            wagons.add(wagon);
            System.out.println("Wagon " + wagon.getId() + " was added to part of the train");
        } else {
            System.out.println("Wagon " + wagon.getId() + " is part of the train");
        }
    }

    public void deleteWagon(Wagon wagon) {
        if (wagon == null) {
            throw new IllegalArgumentException("Wagon can not be null");
        }
        if (checkExistWagon(wagon)) {
            wagons.remove(wagon);
            System.out.println("Wagon " + wagon.getId() + " was removed from part of the train");
        } else {
            System.out.println("Wagon " + wagon.getId() + " is not part of the train");
        }
    }

    public void printWagon(int id) {
        for (Wagon wagon : wagons) {
            if (id == wagon.getId()) {
                System.out.println(wagon);
            }
        }
    }

    public void addLocomotive(Locomotive locomotive) {
        if (locomotive == null) {
            throw new IllegalArgumentException("Locomotive can not be null");
        }
        if (checkExistLocomotive(locomotive)) {
            System.out.println("Train already has a locomotive");
        }
        if (checkExistLocomotive(locomotive)) {
            System.out.println("Locomotive " + locomotive.getId() + " is part of the train");
        }
        if (locomotives.size() != 1) {
            locomotives.add(locomotive);
            System.out.println("Locomotive " + locomotive.getId() + " was added to part of the train");
        }
    }

    public void deleteLocomotive(Locomotive locomotive) {
        if (locomotive == null) {
            throw new IllegalArgumentException("Locomotive can not be null");
        }
        if (checkExistLocomotive(locomotive)) {
            locomotives.remove(locomotive);
            System.out.println("Locomotive " + locomotive.getId() + " was removed from part of the train");
        } else {
            System.out.println("Locomotive " + locomotive.getId() + " is not part of the train");
        }
    }

    public void printLocomotive(int id) {
        for (Locomotive locomotive : locomotives) {
            if (id == locomotive.getId()) {
                System.out.println(locomotive);
            }
        }
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public List<Locomotive> getLocomotives() {
        return locomotives;
    }

    public void totalNumberOfWagonsInTrain() {
        System.out.println("Train has " + getWagons().size() + " wagons");
    }

    private boolean checkExistWagon(Wagon wagon) {
        for (Wagon wag : wagons) {
            if (wag.equals(wagon)) return true;
        }
        return false;
    }

    private boolean checkExistLocomotive(Locomotive locomotive) {
        for (Locomotive loc : locomotives) {
            if (loc.equals(locomotive)) return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Train{" +
                "wagons=" + wagons + '\n' +
                ", locomotives=" + locomotives +
                '}';
    }
}