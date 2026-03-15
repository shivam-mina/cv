class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int dist;
    private int victory;

    ProductionRemoteControlCar (){
        this.dist=0;
        this.victory=0;
    }

    public void drive() {
        dist=dist+10;
    }

    public int getDistanceTravelled() {
        return dist;
    }

    public int getNumberOfVictories() {
        return victory;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victory=numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar car){
        return Integer.compare(this.victory,car.getNumberOfVictories());
    }
}
