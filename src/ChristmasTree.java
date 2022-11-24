import java.util.Random;

public class ChristmasTree {
    public static void main(String[] args) {
        int treeHigh = 18;
        int levelAmount;
        int lastLevelAmount;
        int oneSideSpaceAmount;
        if (args.length > 0) {
            treeHigh = Integer.parseInt(args[0]);
        }
        lastLevelAmount = setLastLevelAmount(treeHigh) + 2;
        levelAmount = -1;
        for (int i = 1; i <= treeHigh; i++) {
            levelAmount += 2;
            oneSideSpaceAmount = (lastLevelAmount - levelAmount) / 2;
            printSpaces(oneSideSpaceAmount);
            addDecorations(levelAmount);
            printSpaces(oneSideSpaceAmount);
            System.out.print("\n");
        }
    }

    public static int setLastLevelAmount(int treeSize) {
        int lastLevelAmount;
        lastLevelAmount = -1;
        for (int i = 1; i <= treeSize; i++) {
            lastLevelAmount += 2;
        }
        return lastLevelAmount;
    }

    public static void printSpaces(int counter) {
        for (int j = 0; j < counter; j++) {
            System.out.print(" ");
        }
    }

    public static void addDecorations(int levelAmount) {
        int decAmount;
        Random random = new Random();
        char[] treeDecorations = {'+', '.', '*', '~', '^', 'o' };
        decAmount = treeDecorations.length - 1;
        for (int j = 0; j < levelAmount; j++) {
            System.out.print(treeDecorations[random.nextInt(decAmount)]);
        }
    }
}
