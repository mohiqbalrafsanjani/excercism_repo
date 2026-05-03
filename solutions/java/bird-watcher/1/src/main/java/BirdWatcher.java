
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        System.out.print(this.birdsPerDay[6]++);
    }

    public boolean hasDayWithoutBirds() {
        for(int i=0;i<birdsPerDay.length;i++){
            if(birdsPerDay[i]==0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int result = 0;
        if (numberOfDays>7){
            numberOfDays = 7;
        }
        for(int i=numberOfDays-1;i>-1;i--){
            result = result + birdsPerDay[i];
        }
        return result;
    }

    public int getBusyDays() {
        int result = 0;
        for(int i=0;i<birdsPerDay.length;i++){
            if(birdsPerDay[i]>=5){
                result += 1;
            }
        }
        return result;
    }
}
