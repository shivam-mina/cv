public class Lasagna {

    static int x=40;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return x;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int t){
        if(t>x) return 0;
        return x-t;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int l){
        return 2*l;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int l, int t) {
        return t + (l*2);
    }
}
