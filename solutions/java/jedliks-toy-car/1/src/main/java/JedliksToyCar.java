public class JedliksToyCar {

    private int battery;
    private int totalMeter;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public JedliksToyCar() {
        this.battery = 100;
        this.totalMeter = 0;
    }


    public String distanceDisplay() {
        return "Driven " + this.totalMeter + " meters"; 
    }

    public String batteryDisplay() {
        if (this.battery <= 0){
            return "Battery empty";
        }
        return "Battery at " + this.battery + "%";
        
    }

    public void drive() {
        if(this.battery > 0){
              this.battery--;
            this.totalMeter += 20;
        }
    }


    public int getBattery() {
        return this.battery;
    }

    public int getTotalMeter() {
        return this.totalMeter;
    }
}
