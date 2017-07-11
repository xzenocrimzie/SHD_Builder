/*
 * Copyright (C) 2017 JENSEN
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
package GMods;

import java.util.ArrayList;

/**
 *
 * @author JENSEN
 */
public class GearMod {
    public int[] mainstat = new int[3];
    public String bcontext;
    public int bvalue;
    
    ArrayList<String> acontext = new ArrayList<>(22); //mod context
    ArrayList<Integer> avalue = new ArrayList<>(22); // context value TODO

    public GearMod (int[] a, String b, int c){
        // a = mainstat value
        // b = context bonus
        // c = context value
        int d; // variables for later
        
        //put all the mod contexts into memory
        acontext.add("Ballistic Shield Damage"); //int?
        acontext.add("Ballistic Shield Damage Resilience"); //Percent?
        acontext.add("Ballistic Shield Health"); //int?
        acontext.add("First Aid Ally Heal");//assuming first aid values are int
        acontext.add("First Aid Self Heal"); // int?
        acontext.add("Mobile Cover Damage Resilience"); //percent?
        acontext.add("Mobile Cover Health"); //int?
        acontext.add("Pulse Critical Hit Chance"); //percent
        acontext.add("Pulse Critical Hit Damage"); //percent?
        acontext.add("Pulse Duration"); // percent
        acontext.add("Seeker Mine Damage"); //int
        acontext.add("Seeker Mine Expolosion Radius"); //int in metres
        acontext.add("Smart Cover Damage Resilience"); // percent
        acontext.add("Smart Cover Duration"); // percent?
        acontext.add("Sticky Bomb Damage"); // int
        acontext.add("Sticky Bomb Explosion Radius"); //int in metres
        acontext.add("Support Station Duration"); // percent?
        acontext.add("Support Station Healing Speed"); // percent?
        acontext.add("Support Station Range"); //int in metres
        acontext.add("Turret Damage"); //int
        acontext.add("Turret Duration"); //percent?
        acontext.add("Turret Health"); //int
        //appy all the values to the mod
        System.arraycopy(a, 0, mainstat, 0, 3); // mainstat values copied
        d = acontext.indexOf(b);
        bcontext = acontext.get(d); // context bonus copied
        bvalue = c; //TODO: also copy whether it's a percent or whatever
        
        
        
//        System.out.println(Arrays.toString(mainstat));
//        attribute.add(context); 
//        for (int i=0; i<3; i++){
//            System.out.println(context.get(i));
//        }
//        for (int i=0; i<1; i++){
//            System.out.println(attribute.get(i));
//        }
}
    
}
