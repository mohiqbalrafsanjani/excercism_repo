public class JedliksToyCar {
    public int distance = 0;
    public int battery = 100;
    public static JedliksToyCar buy() {
       return new JedliksToyCar();      
    }

    public String distanceDisplay() {
        if(battery < 1){
            distance -=20;
        }
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        if(battery < 1){
            return "Battery empty";
        }
        return "Battery at " + battery + "%";
    }

    public void drive() {
        battery -= 1; 
        distance += 20;
    }
}
