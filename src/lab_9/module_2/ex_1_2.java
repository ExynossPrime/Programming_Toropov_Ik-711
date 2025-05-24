package lab_9.module_2;

public class ex_1_2 {
    public static void main(String[] args) {
        Scores obj = new Scores();

        int[] myScores = {5, 5, 4, 3, 2, 4};

        obj.setScores(myScores);
        obj.displayScores();

        myScores[1] = 1;
        obj.displayScores();
    }
}

class Scores {
    private int[] scores;

//    public void setScores(int[] scores) {
//        this.scores = scores;
//    }

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

