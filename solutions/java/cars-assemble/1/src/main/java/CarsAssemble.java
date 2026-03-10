public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        return speed * 221 * ( speed <= 4 ? 1 : speed <= 8 ? 0.9 : speed <=9 ? 0.8 : 0.77 );
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60);
    }
}
