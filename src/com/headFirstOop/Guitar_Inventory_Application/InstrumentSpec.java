package com.headFirstOop.Guitar_Inventory_Application;

//just like instrument abstract class, this is abstract classe with common specifications of insttruments, that will be passed by end user.
public abstract class InstrumentSpec {

    private String model;
    private Builder builder;
    private Type type;
    private Wood topWood;
    private Wood backWood;

    public InstrumentSpec(String model, Builder builder, Type type, Wood topWood, Wood backWood) {
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.topWood = topWood;
        this.backWood = backWood;
    }

    public String getModel() {
        return model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public Wood getBackWood() {
        return backWood;
    }


    public boolean matchSpec(InstrumentSpec invSpec) {
        boolean flag = false;
        if ((invSpec.getBackWood() == backWood) && (invSpec.getBuilder() == builder) && (invSpec.getModel()==model) && (invSpec.getTopWood()==topWood) && (invSpec.getType()==type))  {
            flag = true;

        }
        return flag;
    }
}
