package lab_7;

public class ex_4 {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        System.out.println("Печать массива в main построено:");
        for (double element : myList) {
            System.out.println("element= " + element);
        }

        printArray(myList);
    }

    public static void printArray(double[] massiv) {
        System.out.println("Печать 1-го массива в методе printArray:");
        for (double element : massiv) {
            System.out.println(element);
        }

        int dlina = massiv.length;
        System.out.println("dlina= " + dlina);

        double[] myArray = new double[dlina];
        System.out.println("Печать 2-го массива в методе printArray:");
        for (int j = 0; j < dlina; j++) {
            System.out.println("massiv[" + j + "]=" + massiv[j]);
        }

        int k = 0;
        for (int l = dlina - 1; l >= 0; l--) {
            // System.out.println("l = " + l);
            // System.out.println(massiv[l] + " ");
            myArray[k] = massiv[l];
            k++;
        }

        for (double value : myArray) {
            System.out.println("value = " + value);
        }
    }
}
