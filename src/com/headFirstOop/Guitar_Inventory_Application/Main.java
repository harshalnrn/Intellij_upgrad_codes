package com.headFirstOop.Guitar_Inventory_Application;

import com.sun.deploy.security.ValidationState;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //first add guitar to inv
        //try to search this added with serail number
        //do client search to get the added guitar as matched result

        Inventory inventory = new Inventory();
        List<Guitar> list = new ArrayList<Guitar>();
        initializeInventory(inventory);

        System.out.println("Received following details from inv for searched serial number: " + inventory.getGuitar("100").getPrice()); // owner entry

        System.out.println("-----------------------------------------------------------------------------");

        GuitarSpec guitar = new GuitarSpec(Builder.FENDER, "2018USA", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, 12, 2018); //client entry


        //Improvement.
        //1)Facilitating client search, where bugs dont occur dues so spell mistake/case ??. Eighter using String methods / replacing string altogether by enums .(Enums helps categorize constants, where compilation errors occur whenever type/value violated).
        //Each enum take place of class properties(instance variables),giving type/value safety during their usage as inputs.

        //2) Also returning nearing matching alternatives, apart from matched search results.

        //   System.out.println("Hello client. here is available guitar, that matches your search :" + inventory.search(guitar).getSerialNumber() + '\n' + inventory.search(guitar).getType() + '\n' + inventory.search(guitar).getModel() +'\n'+ inventory.search(guitar).getPrice());

        list = inventory.search(guitar);
        System.out.println("Hello Client. Total matching guitars of 12 stringsare : " + list.size() + ". Prices of matching guitars are as follows" + '\n');
        for (Guitar guitar1 : list) {
            System.out.println(guitar1.getPrice());
            System.out.println(guitar1.getGuitarspec().getType());
            System.out.println(guitar1.getGuitarspec().getNoOfStrings());


        }
    }

    private static void initializeInventory(Inventory inventory) {
        GuitarSpec spec = new GuitarSpec(Builder.FENDER, "2018usa", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD, 12, 2018);
        Guitar guitar = new Guitar("100", 10023.0, spec);
        Guitar guitar1 = new Guitar("101", 1001.0, spec);
        Guitar guitar2 = new Guitar("102", 10232.0, spec);
        Guitar guitar3 = new Guitar("103", 15000.0, spec);


        inventory.addGuitar(guitar);
        inventory.addGuitar(guitar1);
        inventory.addGuitar(guitar2);
        inventory.addGuitar(guitar3);
        System.out.println("New guitars added");
        System.out.println("-----------------------------------------------------------------------------");

    }


}
