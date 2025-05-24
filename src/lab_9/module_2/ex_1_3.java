package lab_9.module_2;

public class ex_1_3 {
    public static void main(String[] args) {
        Scores_1 obj = new Scores_1();

        int[] myScores = {5, 5, 4, 3, 2, 4}; // 1

        obj.setScores(myScores);    // 2
        obj.displayScores();        // 3

        int[] copyScores = obj.getScores(); // 4
        copyScores[1] = 1;              // 5
        obj.displayScores();                // 6
    }
}

class Scores_1 {
    private int[] scores;

//    public int[] getScores() {
//        return scores;
//    }

    public int[] getScores() {
        int[] copyScores = new int[scores.length];
        System.arraycopy(scores, 0, copyScores, 0, copyScores.length);
        return copyScores;
    }

    public void setScores(int[] scores) {
        this.scores = new int[scores.length];
        System.arraycopy(scores, 0, this.scores, 0, scores.length);
    }

    public void displayScores() {
        for (int number : scores) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}