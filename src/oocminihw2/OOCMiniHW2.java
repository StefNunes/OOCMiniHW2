/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

import vehicles.AirPlane;
import vehicles.Bus;
import vehicles.SailBoat;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bus bus = new Bus("DublinBus", "Volvo", 4);
        AirPlane airplane = new AirPlane("Ryanair", "123", 300);
        SailBoat sailboat = new SailBoat("Titanic", "Sailboat", 6);
    }
    
}
