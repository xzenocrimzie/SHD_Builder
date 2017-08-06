/*
 * Copyright (C) 2017 THOMAS JENSEN
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package shd_builder;

import java.util.ArrayList;

/**
 *
 * @author THOMAS JENSEN
 */
public class Gear{
    public int quality;
    public int armour;
    public int[] mainstat = new int[3];
    public ArrayList<Object> talents = new ArrayList<>();
    public ArrayList<Object> attributesmajor = new ArrayList<>();
    public ArrayList<Object> attributesminor = new ArrayList<>();
    public ArrayList<Object> mods = new ArrayList<>();


    
    public Gear(int type){ //Constructor values are defaults
        quality = 1; // 1 = grey, 2 = green, 3 = blue, 4 = purple, 5 = High End, 6= Set, 7= Classified
        armour = 100;
        mainstat[1] = 100; //0= Firearms, 1= Stamina, 2= Electronics
        
        //create talent slot if high end
        if(quality == 5){
            talents.ensureCapacity(1);
        }
        //create attribute slots and mod slots
        switch (type) {
            case 1:
                // vest
                attributesmajor.ensureCapacity(2);
                attributesminor.ensureCapacity(1);
                mods.ensureCapacity(2);
                break;
            case 2:
                //backpack
                attributesmajor.ensureCapacity(1);
                attributesminor.ensureCapacity(1);
                mods.ensureCapacity(3);
                break;
            case 3:
                // mask
                attributesmajor.ensureCapacity(1);
                attributesminor.ensureCapacity(1);
                mods.ensureCapacity(1);
                break;
            case 4:
                //gloves
                attributesmajor.ensureCapacity(3);
                break;
            case 5:
                //kneepads
                attributesmajor.ensureCapacity(1);
                attributesminor.ensureCapacity(3);
                mods.ensureCapacity(2);
                break;
            case 6:
                //holster
                attributesmajor.ensureCapacity(1);
                mods.ensureCapacity(1);
                break;
        //literally wat
            default:
                break;
        }
    }
    public int getQuality (){
        int a = this.quality;
        return(a);
    }
    
    public void setQuality(int a){
        this.quality = a;
    }
    
    public int getArmour (){
        int a = this.armour;
        return(a);
    }
    
    public void setArmour(int a){
        this.armour = a;
    }

    public int[] getMainstat(){
        int[] a = mainstat.clone();
        return a;        
    }
    
    public void setMainstat(int[] a){
        this.mainstat = a;
    
    }


}

