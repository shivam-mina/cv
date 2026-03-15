public class CarsAssemble {

    public static int BASE=221;

    public double productionRatePerHour(int speed) {
        double prod=BASE*speed;

            if(speed<5) {prod=prod*1.0;
            }
            else if (speed>4 && speed<9){prod=prod*0.9;
                }
            else if (speed==9) {prod=prod*0.8;
                }
            else {prod=prod*0.77;}

        return prod;
        
    }

    public int workingItemsPerMinute(int speed) {
        double ans=productionRatePerHour(speed)/60;
        return (int) ans;
    }
}
