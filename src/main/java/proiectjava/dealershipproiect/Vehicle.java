/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipproiect;

/**
 *
 * @author Daria
 */
import javax.swing.ImageIcon;
import java.awt.Color;
public class Vehicle {
    int id;
    String brand;
    String model;
    int year;
    Color color;
    int price;
    int weight;
    Engine engine;
    Transmission transmission;
    ImageIcon photo;
    
    Vehicle(){
        id=0;
        brand="unknown";
        model="unknown";
        year=0;
        color=null;
        price=0;
        weight=0;
        engine=new Engine();
        transmission=new Transmission();
        photo=new ImageIcon();
    }
    Vehicle(int id, String brand, String model, int year, Color color, int price, short weight,  Engine engine,Transmission transmission, ImageIcon photo){
        this.id=id;
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
        this.weight=weight;
        this.engine=engine;
        this.transmission=transmission;
        this.photo=photo;
        
    }
    Vehicle(Vehicle vehicle){
        this.id=vehicle.id;
        this.brand=vehicle.brand;
        this.model=vehicle.model;
        this.year=vehicle.year;
        this.color=vehicle.color;
        this.price=vehicle.price;
        this.weight=vehicle.weight;
        this.engine=new Engine(vehicle.engine);
        this.transmission=new Transmission(vehicle.transmission);
        this.photo=vehicle.photo;
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }
    
}
