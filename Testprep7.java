import java.util.Scanner;

public class Testprep7 {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        System.out.println("What is the dimension of the pattern?");
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();

        System.out.println("What is the special character?");
        String sCharacter = scanner.nextLine();
        String ddimension = scanner.nextLine();

        printPattern(dimension, ddimension);
    }

    private static void printPattern(int dimension, String sCharacter) {
        String finalPrint = "";

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (j == i) {
                    finalPrint += sCharacter;
                } else {
                    finalPrint += "X";
                }
            }
            finalPrint += "\n";

        }

        System.out.println(finalPrint);

    }
}
