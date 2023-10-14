/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicles;

import vehicles.Vehicle;

/**
 *
 * @author Stefani Nunes
 */
 public class SailBoat extends Vehicle implements Sailable {
      private boolean sailHoisted;
      
    public SailBoat(String make, String type, int numPassengers) {
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
        this.numSails = 1; // A typical sailboat has 1 sail
    }

    @Override
    public void hoistSail() {
        sailHoisted = true;
    }

    @Override
    public void lowerSail() {
        sailHoisted = false;
    }

    @Override
    public boolean isSailHoisted() {
        return sailHoisted;
    }

    @Override
    public void landHo() {
       
    }
}

   
