
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        int i= this.birdsPerDay[6] + 1;
        this.birdsPerDay[6]=i;
    }

    public boolean hasDayWithoutBirds() {
        int[] days=this.birdsPerDay;
        for (int day : days) {
            if(day==0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int[] days=this.birdsPerDay;
        int count=0;
        for(int i=0;i<numberOfDays && i<days.length;i++){
            count=count+days[i];
        }
        return count;
    }

    public int getBusyDays() {
        int[] days=this.birdsPerDay;
        int count=0;
        for(int i=0;i<days.length;i++){
            if(days[i]>4) 
                count++;
        }
        return count;
    }
    
}
