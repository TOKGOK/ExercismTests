
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0,2,5,3,7,8,4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int cn : birdsPerDay){
            if (cn == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int cnt = 0;
        for(int i = 0 ;i < numberOfDays && i < birdsPerDay.length ;i++){
            cnt += birdsPerDay[i];
        }
        return cnt;
    }

    public int getBusyDays() {
        int cnt = 0;
        for(int cn : birdsPerDay){
            if(cn >= 5){
                cnt++;
            }
        }
        return cnt;
    
    }
}
