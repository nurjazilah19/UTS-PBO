package uts.gan;

class Vehicle{
    String maker ;
    int kmPerGallons;
    
    Vehicle(String maker,int kmPerGallons){
        this.maker=maker;
        this.kmPerGallons=kmPerGallons;
    }
    
    void maker(){
        System.out.println("Kendaraan        :"+ this.maker);
    }
    int kmPerGallons(){
        System.out.println("Konsumsi         :" +this.kmPerGallons +" kmPerLiters");
        return kmPerGallons;
    }
    int bandingVehicle(int vehicle1, int vehicle2) {
        
        if(vehicle1 < vehicle2) {
            
            return 1;
        }
        else {
            
            return -1;
        }
    }
}
public class VehicleTest {

    public static void main(String[] args) {
        int liter=3875;
        
        Vehicle vehicle1 = new Vehicle("Motor", 20000);
        Vehicle vehicle2 = new Vehicle("Mobil", 10000);
        
        vehicle1.maker();
        vehicle1.kmPerGallons();
        vehicle2.maker();
        vehicle2.kmPerGallons();
        
        if(vehicle1.kmPerGallons>vehicle2.kmPerGallons){
            System.out.println("Nilai baliknya  = 1");
        }else if (vehicle2.kmPerGallons>vehicle1.kmPerGallons){
            System.out.println("Nilai baliknya  = -1");
        }
           
    }
    
}