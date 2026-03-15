public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int dist;

    ExperimentalRemoteControlCar () {
        this.dist=0;
    }
    
    public void drive() {
        dist=dist+20;
    }

    public int getDistanceTravelled() {
        return dist;
    }
}
