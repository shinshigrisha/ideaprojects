public class MoneyCalculator {
    private static final int BANKNOTES_PER_PACK = 100;
    private static final int PACKS_IN_CASSETTE = 20;
    private int banknotesCount;
    private int casseteCount;
    public static int calculateCassetteCount(int banknotesCount){
       int pucksCount = banknotesCount / BANKNOTES_PER_PACK + (banknotesCount % PACKS_IN_CASSETTE == 0 ? 0 : 1);
        int cassetteCount = pucksCount / PACKS_IN_CASSETTE + (pucksCount % PACKS_IN_CASSETTE == 0 ? 0 : 1);
        return cassetteCount;
    }


}
