/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author lazar
 */
class Vehicle {
    
    private String maker;
    private int kmPerGallons;
    
    protected Vehicle(String maker, int kmPerGallons) {
        
        this.maker = maker;
        this.kmPerGallons = kmPerGallons;
    }
    
    protected void setMaker(String maker) {
        
        this.maker = maker;
    }
    protected String getMaker() {
        
        return this.maker;
    }
    protected void setKmPerGallons(int kmPerGallons) {
        
        this.kmPerGallons = kmPerGallons;
    }
    protected int getKmPerGallons() {
        
        return this.kmPerGallons;
    }
    protected int bandingVehicle(int vehicle1, int vehicle2) {
        
        if(vehicle1 < vehicle2) {
            
            return 1;
        }
        else {
            
            return -1;
        }
    }
    protected int getKmPerLiters() {
        
        int kmPerLiters = this.kmPerGallons * 3785;
        return kmPerLiters;
    }
}
