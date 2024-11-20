/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipproiect;

/**
 *
 * @author Raul
 */

import javax.swing.ImageIcon;
import java.awt.Color;

public class Yacht extends Vehicle{
    private int nauticalMiles;
    private int maxCrew;
    private String flag;
    
    public Yacht(){
        super();
        this.nauticalMiles=0;
        this.maxCrew=0;
        this.flag="";
    }

    public Yacht( int id,String brand, String model,int year,Color color, int price,int weight,Engine engine,Transmission transmission,
            ImageIcon photo,int nauticalMiles, int maxCrew, String flag) {
        super(id, brand, model,year, color, price, weight, engine, transmission, photo);
        this.nauticalMiles = nauticalMiles;
        this.maxCrew = maxCrew;
        this.flag = flag;
    }

    public int getNauticalMiles() {
        return nauticalMiles;
    }

    public void setNauticalMiles(int nauticalMiles) {
        this.nauticalMiles = nauticalMiles;
    }

    public int getMaxCrew() {
        return maxCrew;
    }

    public void setMaxCrew(int maxCrew) {
        this.maxCrew = maxCrew;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
    
    public Yacht(Yacht yacht) {
        this.nauticalMiles = yacht.nauticalMiles;
        this.maxCrew = yacht.maxCrew;
        this.flag = yacht.flag;
    }

    @Override
    public String toString() {
        return super.toString()+"Yacht{" + "nauticalMiles=" + nauticalMiles + ", maxCrew=" + maxCrew + ", flag=" + flag + "}\n";
    }
    
}
