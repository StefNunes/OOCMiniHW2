/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicles;

/**
 *
 * @author Stefani Nunes
 */
public class Bus extends Vehicle implements Drivable {
    public Bus(String make, String type, int numPassengers) {
        this.make = make;
        this.type = type;
        this.numWheels = 4;
        this.numPassengers = numPassengers;
    }
//all override from drivable 
    @Override
    public void accelerate(float speed) {
        // Implement the acceleration logic for a car.
    }

    @Override
    public void brake() {
        // Implement the braking logic for a car.
    }

    @Override
    public void turn(float angle) {
        // Implement the turning logic for a car.
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
