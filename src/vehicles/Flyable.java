/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vehicles;

import vehicles.Drivable;

/**
 *
 * @author sweis
 */
public interface Flyable extends Drivable {
    public void changeAltitude(float change);
    public float getAltitude();
}
