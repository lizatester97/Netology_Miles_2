public class BonusMilesService {
    public static int calculate(int cost) {
        int rub_for_mile = 20;
        return (cost/rub_for_mile);
    }
}