class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    public int driveDistance;
    public int totalButtery;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.driveDistance = 0;
        this.totalButtery = 100;
    }

    public boolean batteryDrained() {
        return this.totalButtery < this.batteryDrain ;
    }

    public int distanceDriven() {
        return driveDistance;
    }

    public void drive() {
        if(batteryDrained()){
            return;
        }
        this.driveDistance += this.speed;
        this.totalButtery -= this.batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    public int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return this.distance - car.speed * (car.totalButtery / car.batteryDrain) <= 0 ;
    }
}
