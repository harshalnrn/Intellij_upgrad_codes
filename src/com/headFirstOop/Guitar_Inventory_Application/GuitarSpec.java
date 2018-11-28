package com.headFirstOop.Guitar_Inventory_Application;


//Guitarspec inherits all properties of instrumentSpec, and then defines it own unique member.

public class GuitarSpec extends  InstrumentSpec {

    /*private Builder builder; //replaced with enum
    private String model;
    private Type type;//replaced with enum
    private Wood backWood;//replaced with enum
    private Wood topWood;//replaced with enum*/
    private int noOfStrings;

    public GuitarSpec(String model, Builder builder, Type type, Wood topWood, Wood backWood, int noOfStrings) {
        super(model, builder, type, topWood, backWood);
        this.noOfStrings = noOfStrings;
    }
    //this constrcter adds to guitar specific properties using the extended properties. Also it constrcuted such that calls to parent goes.

  /* public Builder getBuilder() {
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
    }*/

    public int getNoOfStrings() {
        return noOfStrings;
    }




    //override the superclass matches () . note method overriding shall only have different implementation.
@Override
    public boolean matchSpec(InstrumentSpec spec) {

        if (!super.matchSpec(spec))
           return false;

        if (!(spec instanceof  GuitarSpec))
    return false;

        //also matching the unique properties of GuitarSpec
    GuitarSpec guitarSpec =(GuitarSpec) spec ;
    if (getNoOfStrings()!=guitarSpec.getNoOfStrings())
    return false;

    return true;
}
        }


