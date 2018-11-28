package com.headFirstOop.Guitar_Inventory_Application;

/*Instrument is abstract. You have to instantiate subclasses of this base class, like Guitar/Mandolin.
This shall contain common properties of all instrument type sub-classes.

Note that : any method or constructer expecting a parent bean, can take any type of sub-class bean
 */
public abstract class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec specification;// aggregation, where instrument class 'has' instrumentSpec bean.



    public Instrument(String serialNumber, double price, InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.specification=spec;
    }

    public InstrumentSpec getSpecification() {
        return specification;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }
}

