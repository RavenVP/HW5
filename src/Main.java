public class Main {
    public static void main(String[] args) {
        // Задание 1 \\
        int[] arrOne = new int[3];
        arrOne[0] = 1;
        arrOne[1] = 2;
        arrOne[2] = 3;
        double[] arrTwo = { 1.57, 7.654, 9.986};
        int[] arrThree = new int[]{1, 2, 3, 4, 5,};

        // Задание 2 \\
        for (int i = 0; i < arrOne.length ; i++) {
            if (i==arrOne.length - 1)
                    System.out.print(arrOne[i]);
            else System.out.print(arrOne[i] + ", ");}

        System.out.println("");

        for (int z = 0; z < arrTwo.length; z++) {
            if (z == arrTwo.length - 1)
                System.out.print(arrTwo[z]);
            else System.out.print(arrTwo[z] + ", ");}

        System.out.println("");

        for (int x = 0; x < arrThree.length; x++) {
            if (x == arrThree.length - 1)
                System.out.print(arrThree[x]);
            else System.out.print(arrThree[x] + ", ");}
        System.out.println("");

        // Задание 3 \\
        for (int r = arrOne.length - 1; r >= 0; r--) {
            System.out.print(arrOne[r]);
            if (r != 0) {System.out.print(", ");}
        }
        System.out.println("");

        for (int c = arrTwo.length - 1; c >= 0; c--) {
            System.out.print(arrTwo[c]);
            if (c != 0) {System.out.print(", ");}
        }
        System.out.println("");

        for (int f = arrThree.length - 1; f >= 0; f--) {
            System.out.print(arrThree[f]);
            if (f != 0) {System.out.print(", ");}
        }
        System.out.println("");
        // Задание 4 \\
        for( int e = 0; e < arrOne.length; e++) {
            if (arrOne[e] % 2 == 0) {
                System.out.print(arrOne[e] + " ");
            }
            else System.out.print(arrOne[e] + 1 + " ");
        }

    }
}