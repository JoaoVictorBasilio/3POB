package secao3;

public class Chickens01 {
    public static void main(String[] args) {
        int eggsPerChicken = 4;
        int chickenCount = 8;

        int mondayEggs = chickenCount * eggsPerChicken;
        int tuesdayChickens = chickenCount + 1;
        int tuesdayEggs = tuesdayChickens * eggsPerChicken;
        int wednesdayChickens = tuesdayChickens / 2;
        int wednesdayEggs = wednesdayChickens * eggsPerChicken;

        int totalEggs = mondayEggs + tuesdayEggs + wednesdayEggs;

        System.out.println(totalEggs);
    }
}
