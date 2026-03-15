class NeedForSpeed {
    private int speed;
    private int drain;
    private int dist;
    private int battery;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed=speed;
        this.drain=batteryDrain;
        this.dist=0;
        this.battery=100;
    }

    public boolean batteryDrained() {
        if(battery<drain || battery<=0) return true;
        return false;
    }

    public int getSpeed(){
        return this.speed;
    }

    public int distanceDriven() {
        return this.dist;
    }

    public void drive() {
        if(!batteryDrained()){
            dist=dist+speed;
            battery=battery-drain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int track;
    RaceTrack(int distance) {
        this.track=distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int speed=car.getSpeed();

        int race=0;
        while(!car.batteryDrained()){
            car.drive();
            race=race+speed;
        }
    
        if(race>=track) return true;
        return false;
    }
}
