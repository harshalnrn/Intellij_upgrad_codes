package com.headFirstOop.Guitar_Inventory_Application;

public class Guitar extends Instrument {

   /* class Guitar extends Instrument, to get the common instrument properties,
            and then define their own constructor with the right type of 'spec class'.*/

/*    private String serialNumber;
    private double price;
    private Builder builder; //replaced with enum
    private String model;
    private Type type;//replaced with enum
    private Wood backWood;//replaced with enum
    private Wood topWood;//replaced with enum

    //introducing good OOP design

    private GuitarSpec guitarspec;//association: guitar class has a guitar bean

    public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Guitar(String serialNumber, double price, GuitarSpec guitarspec)          //important : Having default constrcuter in super class, vimp practise in inheritence.
    {

        this.serialNumber = serialNumber;
        this.price = price;
        this.guitarspec = guitarspec;
        //above and below are no more needed, since they can be just extended from Instrument class.

    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

      public GuitarSpec getGuitarspec() {
        return guitarspec;
    }
}*/

    //appropriate constructer such that it takes right kind of object, and does appropriate calls to super class.
    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        super(serialNumber, price, spec);
    }
}
