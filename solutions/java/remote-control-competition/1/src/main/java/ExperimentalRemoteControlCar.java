public class ExperimentalRemoteControlCar implements RemoteControlCar {
    int gdt;
    public void drive() {
        this.gdt += 20;
    }

    public int getDistanceTravelled() {
        return gdt;
    }
}

