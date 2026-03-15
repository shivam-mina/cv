public class JedliksToyCar {
    private int battery;
    private int dist;

    public JedliksToyCar() {
        this.battery=100;
        this.dist=0;
    }
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + String.valueOf(dist) + " meters";
    }

    public String batteryDisplay() {
        if(battery==0) return "Battery empty";
        return "Battery at " + String.valueOf(battery) + "%";
    }

    public void drive() {
        if(battery>0) {
          battery=battery-1;
          dist=dist+20;  
        }
        
    }
}
