import java.util.Random;

    public class UC2 {

        static boolean isHumanTurn;
        static char humanSymbol;
        static char computerSymbol;

        public static void main(String[] args) {
            tossAndAssignSymbols();
            displayTossResult();
        }

        static void tossAndAssignSymbols() {
            Random random = new Random();

            // Generate 0 or 1 (random toss)
            int toss = random.nextInt(2);

            // Debug (optional, can remove later)
            System.out.println("Toss value: " + toss);

            if (toss == 0) {
                isHumanTurn = true;
                humanSymbol = 'X';
                computerSymbol = 'O';
            } else {
                isHumanTurn = false;
                humanSymbol = 'O';
                computerSymbol = 'X';
            }
        }

        static void displayTossResult() {
            System.out.println("----- Toss Result -----");

            if (isHumanTurn) {
                System.out.println("Human starts first");
            } else {
                System.out.println("Computer starts first");
            }

            System.out.println("Human Symbol: " + humanSymbol);
            System.out.println("Computer Symbol: " + computerSymbol);
        }
    }

