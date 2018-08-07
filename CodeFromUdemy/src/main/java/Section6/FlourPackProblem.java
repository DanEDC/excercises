package Section6;

public class FlourPackProblem {

    public static void main(String[] args) {
        System.out.println(canPack(2, 10, 18));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            int sum = (5 * bigCount) + smallCount;
            if (sum > goal) {
                if (bigCount == 0 && smallCount >= goal) {
                    return true;
                } else if ((5 * bigCount) % goal == 0 && smallCount >= 0) {
                    return true;
                } else if ((5 * bigCount) % goal != 0 && smallCount >= (goal / bigCount)) {
                    return true;
                } else return false;
            }
            if (sum == goal) {
                return true;
            } else return false;
        }
        return false;
    }
}
