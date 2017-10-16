public class Main {

    public static void main(String[] args) {

        boolean gameover = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        calculateScore(true, 800, 5, 102);

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less then 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        }
        if (gameover) {
            int finalscore = score + (levelCompleted * bonus);
            finalscore += 1000;
            System.out.println("Your final score was " + finalscore);
        }
    }

    public static void calculateScore(boolean gameover, int score, int levelCompleted, int bonus) {

        if (gameover) {
            int finalscore = score + (levelCompleted * bonus);
            finalscore += 1000;
            System.out.println("Your final score was " + finalscore);
        }
    }
}

