class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int gdt;
    int gnv;
    
    public ProductionRemoteControlCar(){
        this.gnv = gnv;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other){
        return Integer.compare(other.gnv,this.gnv);
    }
    
    public void drive() {
        this.gdt += 10;
    }

    public int getDistanceTravelled() {
        return gdt;
    }

    public int getNumberOfVictories() {
        return gnv;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.gnv = numberOfVictories;
    }
    
}
