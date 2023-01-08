package pl.edu.wszib.jwd.zajecia3;

public class WashingMachineTester {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.modeForSensitiveClothes();
        System.out.println(washingMachine);
        System.out.println();
        washingMachine.modeForTowelsAndBedLinen();
        System.out.println(washingMachine);
    }
}
