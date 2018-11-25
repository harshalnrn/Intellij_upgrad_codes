package com.headFirstOop.Guitar_Inventory_Application;

import com.sun.scenario.effect.impl.state.LinearConvolveRenderState;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitarList;//object doesn't get created until done with new operator. Here just declared.

    public Inventory() {
        guitarList=new LinkedList<Guitar>();
    }




    public void addGuitar(Guitar newGuitar) {    //adding new guitar object ot list

        guitarList.add(newGuitar);

        //had guitar object been passed here from main, this method did not require change
    }






    public Guitar getGuitar(String serialNumber ) {         //owner search based upon number., by iterating inventory list
        for (Guitar obj:guitarList){
if (obj.getSerialNumber().equals(serialNumber)) {
    Guitar guitarobj1 = obj;
   return guitarobj1;

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
    public List<Guitar> search(GuitarSpec guitarObj) {            //client search based upon guitar field preference. by iterating inventory list
        List<Guitar>  guitar=new LinkedList<Guitar>();
        if (guitarObj!=null) {
            for (Guitar obj : guitarList) {

               /* if (obj.getGuitarspec().getBackWood()==(guitarObj.getBackWood()) && obj.getGuitarspec().getBuilder()==(guitarObj.getBuilder()) && obj.getGuitarspec().getModel().equalsIgnoreCase(guitarObj.getModel()) && obj.getGuitarspec().getType()==(guitarObj.getType()) && obj.getGuitarspec().getTopWood()==(guitarObj.getTopWood())&& obj.getGuitarspec().getNoOfStrings()==(guitarObj.getNoOfStrings())) {*/
                  //  guitar.add(obj); this shall give NPE

                {
                if(obj.getGuitarspec().matchSpec(guitarObj,obj.getGuitarspec()))                               //delegating comparison task to GuitarSpec object, than comparing here
//above if to be worked upon
                    guitar.add(obj);
                }
            }

        }
        return guitar ;

    }




}
