package com.headFirstOop.Guitar_Inventory_Application;

import com.sun.scenario.effect.impl.state.LinearConvolveRenderState;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Instrument> instrumentList;//object doesn't get created until done with new operator. Here just declared.

    public Inventory() {

        instrumentList=new LinkedList();
    }




 /*   public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {    //adding new guitar object ot list

        Instrument ins=null;

        if (spec instanceof  GuitarSpec){
            ins=new Guitar(serialNumber,price,(GuitarSpec)spec);
        }
        else if(spec instanceof MandolinSpecs){
            ins=new Mandolin(serialNumber,price,(MandolinSpecs) spec);
        }

        instrumentList.add(ins);

        //had guitar object been passed here from main, this method did not require change
    }
*/

    public void addInstrument(Instrument ins) {
        instrumentList.add(ins)  ;
    }



        public Instrument get(String serialNumber ) {         //owner search based upon number., by iterating inventory list
        for (Instrument obj:instrumentList){
if (obj.getSerialNumber().equals(serialNumber)) {
   return obj ;
}
else{
    continue;}
        }
return null;

    }




    /*public Guitar search(Guitar guitarObj) {            //client search based upon guitar field preference. by iterating inventory list
    Guitar guitarobj2=null;
       if (guitarObj!=null) {
           for (Guitar obj : guitarList) {
               if (obj.getBackWood().equals(guitarObj.getBackWood()) && obj.getBuilder().equals(guitarObj.getBuilder()) && obj.getModel().equalsIgnoreCase(guitarObj.getModel()) && obj.getType().equals(guitarObj.getType()) && obj.getTopWood().equals(guitarObj.getTopWood())) {
                   guitarobj2 = obj;

               }
           }

       }
       return guitarobj2;

}*/


//new business requirements, with new guitars getting added in inventory// returning multiple guitars matching client preference
   /* public List<Instrument> search(GuitarSpec guitarObj) {            //client search based upon guitar field preference. by iterating inventory list
        List<Instrument>  guitar=new LinkedList<Instrument>();
        if (guitarObj!=null) {
            for (Instrument obj : instrumentList) {

                *//* if (obj.getGuitarspec().getBackWood()==(guitarObj.getBackWood()) && obj.getGuitarspec().getBuilder()==(guitarObj.getBuilder()) && obj.getGuitarspec().getModel().equalsIgnoreCase(guitarObj.getModel()) && obj.getGuitarspec().getType()==(guitarObj.getType()) && obj.getGuitarspec().getTopWood()==(guitarObj.getTopWood())&& obj.getGuitarspec().getNoOfStrings()==(guitarObj.getNoOfStrings())) {*//*
                //  guitar.add(obj); this shall give NPE

                {
                    if(obj.getSpecification().matchSpec(guitarObj))                               //delegating comparison task to GuitarSpec object, than comparing here
//above if to be worked upon
                        guitar.add(obj);
                }
            }

        }
        return guitar ;

    }*/


    /*public List<Instrument> search(MandolinSpecs mandolinObj) {            //client search based upon guitar field preference. by iterating inventory list
        List<Instrument>  mandolin=new LinkedList<Instrument>();
        if (mandolinObj!=null) {
            for (Instrument obj : instrumentList) {

                *//* if (obj.getGuitarspec().getBackWood()==(guitarObj.getBackWood()) && obj.getGuitarspec().getBuilder()==(guitarObj.getBuilder()) && obj.getGuitarspec().getModel().equalsIgnoreCase(guitarObj.getModel()) && obj.getGuitarspec().getType()==(guitarObj.getType()) && obj.getGuitarspec().getTopWood()==(guitarObj.getTopWood())&& obj.getGuitarspec().getNoOfStrings()==(guitarObj.getNoOfStrings())) {*//*
                //  guitar.add(obj); this shall give NPE

                {
                    if(obj.getSpecification().matchSpec(mandolinObj))                               //delegating comparison task to GuitarSpec object, than comparing here
//above if to be worked upon
                        mandolin.add(obj);
                }
            }

        }
        return mandolin ;

    }*/



    // search instrument based upon client specifications.
    public List<Instrument>  search(InstrumentSpec insSpec){
        List<Instrument> list=new LinkedList<Instrument>();
if (insSpec!=null) {
    for (Instrument list1:instrumentList) {
        if (list1.getSpecification().matchSpec(insSpec)){

if ((insSpec instanceof GuitarSpec) && (list1.getSpecification() instanceof  GuitarSpec)){
    GuitarSpec  guitarSpec=(GuitarSpec) insSpec;
    GuitarSpec  guitarSpec1=(GuitarSpec) list1.getSpecification() ;
    if (guitarSpec.getNoOfStrings()==guitarSpec1.getNoOfStrings()){
list.add(list1);
    }

}

            else if ((insSpec instanceof MandolinSpecs) && (list1.getSpecification() instanceof  MandolinSpecs)){
                MandolinSpecs  mandolinSpec=(MandolinSpecs) insSpec;
                MandolinSpecs  mandolinSpec1=(MandolinSpecs) list1.getSpecification() ;

    if (mandolinSpec.getStyle()==mandolinSpec1.getStyle()){
        list.add(list1);
    }
            }


        }
    }
}
return list;

    }

}
