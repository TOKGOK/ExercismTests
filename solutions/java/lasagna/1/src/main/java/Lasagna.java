public class Lasagna {
    private int expectMinutes;

    private int prepareMinutes;

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        this.expectMinutes = 40;
        return expectMinutes;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutes){
        this.expectMinutes = 40 - minutes > 0 ? 40 - minutes : 0;
        return expectMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int piles){
        this.prepareMinutes = piles << 1;
        return prepareMinutes;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int piles,int cookMinutes){
        return (piles << 1) + cookMinutes;
    }
}
