/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicles;

/**
 *
 * @author Stefani Nunes
 */
public class AirPlane extends Vehicle implements Flyable {
    public AirPlane(String make, String type, int numPassengers) {
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
        this.numWings = 2; 
    }
 
   @Override
    public void changeAltitude(float change) {
       
    }

    @Override
    public float getAltitude() {
        return 0; 
    }
     @Override
    public void accelerate(float speed) {
       
    }

    @Override
    public void brake() {
      
    }

    @Override
    public void turn(float angle) {
      
    }

    @Override
    public float getDirection() {
        return direction;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getType() {
        return type;
    }
    
}
