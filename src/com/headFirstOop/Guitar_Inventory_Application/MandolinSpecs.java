package com.headFirstOop.Guitar_Inventory_Application;

public class MandolinSpecs extends  InstrumentSpec {

    private Style style;

    public MandolinSpecs(String model, Builder builder, Type type, Wood topWood, Wood backWood, Style style) {
        super(model, builder, type, topWood, backWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }


    @Override
    public boolean matchSpec(InstrumentSpec spec) {

        if (!super.matchSpec(spec))
            return false;

        if (!(spec instanceof  MandolinSpecs))
            return false;

        MandolinSpecs mandolinSpecs =(MandolinSpecs) spec ;
        if (getStyle()!=mandolinSpecs.getStyle())
            return false;

        return true;
    }
}
