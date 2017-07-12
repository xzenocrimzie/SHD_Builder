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
package GMods;

import java.util.ArrayList;

/**
 *
 * @author THOMAS JENSEN
 */
public class GearMod {
    public int[] mainstat = new int[3];
    public String bcontext; // actual mod effect
    public int bvalue; // actual effect value
    public int bvalueformat; //value format because new variables why the fuck not
    
    ArrayList<String> acontext = new ArrayList<>(); //mod context
    ArrayList<Integer> aformat = new ArrayList<>(); // context value type TODO

    public GearMod (int[] a, String b, int c){
        // a = mainstat value
        // b = context bonus
        // c = context value
        int d; // init for random ass variables
        acontext.ensureCapacity(22); //There are 22 different mod effects.
        aformat.ensureCapacity(22);
        //put all the mod contexts into memory
        
        //TODO once the rest of the system is made, you want to turn this into a switch
        // so you can work with variables instead of strings because strings are bad
        // mmk?
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
        
        // TODO Placeholder int = 1, percent = 2, 3 = distance in m
        aformat.add(1); //Shield Damage
        aformat.add(2); //Shield Damage Resilience
        aformat.add(1); // Shield Health
        aformat.add(2); // Aid Ally Heal
        aformat.add(2); // Aid Self Heal
        aformat.add(2); // MCover Damage Resilience
        aformat.add(1); // MCover Health
        aformat.add(2); // Pulse Crit Chance
        aformat.add(2); // Pulse Crit Damage
        aformat.add(2); // Pulse Duration
        aformat.add(1); // Seeker Damage
        aformat.add(3); // Seeker Radius
        aformat.add(2); // SCover Resilience
        aformat.add(1); // SCover Duration
        aformat.add(1); // Bomb Damage
        aformat.add(3); // Bomb Radius
        aformat.add(1); // Drug Station Duration
        aformat.add(1); // Drug Station Speed
        aformat.add(3); // Drug Station Range
        aformat.add(1); // Turret Damage
        aformat.add(2); // Turret Duration
        aformat.add(1); // Turret Health
        
        
        
        //appy all the values to the mod
        System.arraycopy(a, 0, mainstat, 0, 3); // mainstat values copied
        d = acontext.indexOf(b);
        bcontext = acontext.get(d); // context bonus copied
        bvalueformat = aformat.get(d);
        bvalue = c; 
        
        
        
        
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
