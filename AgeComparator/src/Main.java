public class Main {
    public static void main(String[] args) {
        int vasyaAge = 55;
        int katyaAge = 17;
        int mishaAge = 17;

        int min = -1;
        int middle = -1;
        int max = -1;

        int maxVasyaKatya = vasyaAge > katyaAge ? vasyaAge : katyaAge;
        max = maxVasyaKatya > mishaAge ? maxVasyaKatya : mishaAge;

        if (max == vasyaAge) {
            middle = katyaAge > mishaAge ? katyaAge : mishaAge;
            min =  middle == katyaAge ? mishaAge : katyaAge;
        }

        if (max == katyaAge) {
            middle = vasyaAge > mishaAge ? vasyaAge : mishaAge;
            min = middle == vasyaAge ? mishaAge : vasyaAge;
        }

        if (max == mishaAge) {
            middle = vasyaAge > katyaAge ? vasyaAge : katyaAge;
            min = middle == vasyaAge ? katyaAge : vasyaAge;
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximum age: " + max);
    }
}