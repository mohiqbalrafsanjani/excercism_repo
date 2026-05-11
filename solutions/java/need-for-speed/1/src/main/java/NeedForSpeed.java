class NeedForSpeed {
    public final int speed;
    public final int batteryDrain;
    public int battery = 100;
    public int distancedriven;
    
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distancedriven = 0;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distancedriven;
    }

    public void drive() {
        if(!batteryDrained()){
        this.battery -= batteryDrain;
        this.distancedriven += speed;
        }        
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    public final int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return ((car.battery / car.batteryDrain) * car.speed) >= distance;
    }
}
