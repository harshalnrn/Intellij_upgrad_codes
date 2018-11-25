package com.headFirstOop.Guitar_Inventory_Application;

public class GuitarSpec {

    private Builder builder; //replaced with enum
    private String model;
    private Type type;//replaced with enum
    private Wood backWood;//replaced with enum
    private Wood topWood;//replaced with enum
    private int noOfStrings;
    private int makeYear;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int noOfStrings, int makeYear) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.noOfStrings = noOfStrings;
        this.makeYear = makeYear;
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

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public int getMakeYear() {
        return makeYear;
    }

    public boolean matchSpec(GuitarSpec spec, GuitarSpec invSpec) {
        boolean flag = false;
        if (invSpec.getBackWood() == (spec.getBackWood()) && invSpec.getBuilder() == (spec.getBuilder()) && invSpec.getModel().equalsIgnoreCase(spec.getModel()) && invSpec.getType() == (spec.getType()) && invSpec.getTopWood() == (spec.getTopWood()) && invSpec.getNoOfStrings() == (spec.getNoOfStrings()) && invSpec.makeYear == (spec.makeYear)) {
            flag = true;

        }
        return flag;
    }
}
