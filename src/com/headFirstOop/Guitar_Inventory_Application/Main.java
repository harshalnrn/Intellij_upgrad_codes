package com.headFirstOop.Guitar_Inventory_Application;

import com.sun.deploy.security.ValidationState;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //1. first add instruments to inventory



        Inventory inventory = new Inventory();
        List<Instrument> list = new ArrayList<Instrument>();
        initializeInventory(inventory);

        //2.try to search this added with serail number

Instrument retreivedIns=inventory.get("1001");
        System.out.println("Received following details from inventory for searched serial number: " +'\n'+retreivedIns.getPrice()); // owner entry

        System.out.println("-----------------------------------------------------------------------------");

        //3.client searches to get the added guitar as matched result

        GuitarSpec guitarSpecs = new GuitarSpec("2018",Builder.FENDER, Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, 6); //client entry

        MandolinSpecs mandolinSpecs = new MandolinSpecs("2018USA",Builder.FENDER, Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, Style.Indian); //client entry


        //Improvement.
        //1)Facilitating client search, where bugs dont occur dues so spell mistake/case ??. Eighter using String methods / replacing string altogether by enums .(Enums helps categorize constants, where compilation errors occur whenever type/value violated).
        //Each enum take place of class properties(instance variables),giving type/value safety during their usage as inputs.

        //2) Also returning nearing matching alternatives, apart from matched search results.


        list = inventory.search(guitarSpecs);
        System.out.println("Hello Client. Total matching guitars are : " + list.size() + "Prices of matching instruments are as follows" + '\n');
        for (Instrument instru : list) {
            System.out.println(instru.getPrice());
            System.out.println(instru.getSpecification().getType());
            System.out.println(instru.getSpecification().getModel());



        }


        list = inventory.search(mandolinSpecs);
        System.out.println("Hello Client. Total matching mandolins are : " + list.size() + ". Prices of matching instruments are as follows" + '\n');
        for (Instrument instru : list) {
            System.out.println(instru.getPrice());
        }

    }

    private static void initializeInventory(Inventory inventory) {
        GuitarSpec spec = new GuitarSpec("2018",Builder.FENDER,Type.ACOUSTIC,Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD,6);
        GuitarSpec spec1 = new GuitarSpec("2018",Builder.FENDER,Type.ELECTRIC ,Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD,7);
        GuitarSpec spec2 = new GuitarSpec("2017",Builder.FENDER,Type.ACOUSTIC,Wood.MAHOGANY, Wood.INDIAN_ROSEWOOD,8);
        GuitarSpec spec3 = new GuitarSpec("2017",Builder.FENDER,Type.ACOUSTIC,Wood.BRAZILIAN_ROSEWOOD, Wood.SITKA,9);

        MandolinSpecs mandolinSpecs = new MandolinSpecs("2018USA",Builder.FENDER, Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, Style.Indian);
        MandolinSpecs mandolinSpecs1 = new MandolinSpecs("2018UK",Builder.GIBSON, Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, Style.Afghani);
        MandolinSpecs mandolinSpecs2 = new MandolinSpecs("2018AUS",Builder.OLSON, Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, Style.israeli);


        Guitar obj=new Guitar("1000",15000,spec);
        Guitar obj1=new Guitar("1001",18000.50,spec1);
        Guitar obj2=new Guitar("1002",20000.20,spec2);
        Guitar obj3=new Guitar("1003",22000,spec3);

        Mandolin obj4=new Mandolin("1003",22000,mandolinSpecs);
        Mandolin obj5=new Mandolin("1003",24000,mandolinSpecs1);
        Mandolin obj6=new Mandolin("1003",26000,mandolinSpecs2);



inventory.addInstrument(obj);
        inventory.addInstrument(obj1);
        inventory.addInstrument(obj2);
        inventory.addInstrument(obj3);

        inventory.addInstrument(obj4);
        inventory.addInstrument(obj5);
        inventory.addInstrument(obj6);



        System.out.println("New guitars added");
        System.out.println("-----------------------------------------------------------------------------");

    }


}
