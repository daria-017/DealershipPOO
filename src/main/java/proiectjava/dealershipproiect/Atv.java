/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipproiect;

/**
 *
 * @author hcosm
 */
public class Atv extends Vehicle {

String Usage;
boolean forYouth;
boolean offroad;
int rackCapacity;
String suspensionType;

        public Atv() {
        super();
        this.Usage = "Unknown";
        this.forYouth = false;
        this.offroad = false;
        this.rackCapacity = 0;
        this.suspensionType = "Unknown";
    }
        
        public Atv(String Usage, boolean forYouth, boolean offroad, int rackCapacity, String suspensionType) {
        super(id, brand, model,year, color, price, weight, engine, transmission, photo);
        this.Usage = Usage;
        this.forYouth = forYouth;
        this.offroad = offroad;
        this.rackCapacity = rackCapacity;
        this.suspensionType = suspensionType;
    }
    @Override
    public String toString() {
        return super.toString()+"Atv{" + "Usage=" + Usage + ", forYouth=" + forYouth + ", offroad=" + offroad + ", rackCapacity=" + rackCapacity + ", suspensionType=" + suspensionType + '}';
    }




    public String getUsage() {
        return Usage;
    }

    public boolean isForYouth() {
        return forYouth;
    }

    public boolean isOffroad() {
        return offroad;
    }

    public int getRackCapacity() {
        return rackCapacity;
    }

    public String getSuspensionType() {
        return suspensionType;
    }

    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    public void setForYouth(boolean forYouth) {
        this.forYouth = forYouth;
    }

    public void setOffroad(boolean offroad) {
        this.offroad = offroad;
    }

    public void setRackCapacity(int rackCapacity) {
        this.rackCapacity = rackCapacity;
    }

    public void setSuspensionType(String suspensionType) {
        this.suspensionType = suspensionType;
    }

    
}
