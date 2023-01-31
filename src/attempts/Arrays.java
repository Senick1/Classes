package attempts;

public class Arrays {

    public static void main(String[] args) {

        mass1();
    }

    private static void mass1() {
    int [] [] [] arr = new int[2][3][4]; // 24 elements

    // initialisation
    arr[0][0][0] = 1;
    arr[0][0][1] = 2;
    arr[0][0][2] = 3;
    arr[0][0][3] = 4;
    arr[0][1][0] = 1;
    arr[0][1][1] = 2;
    arr[0][1][2] = 3;
    arr[0][1][3] = 4;
    arr[0][2][0] = 1;
    arr[0][2][1] = 2;
    arr[0][2][2] = 3;
    arr[0][2][3] = 4;
    arr[1][0][0] = 10;
    arr[1][0][1] = 20;
    arr[1][0][2] = 30;
    arr[1][0][3] = 40;
    arr[1][1][0] = 10;
    arr[1][1][1] = 20;
    arr[1][1][2] = 30;
    arr[1][1][3] = 40;
    arr[1][2][0] = 10;
    arr[1][2][1] = 20;
    arr[1][2][2] = 30;
    arr[1][2][3] = 40;

        for (int i = 0 ; i < 2; i++) { //  for (int i = 0 ; i < arr.length; i++)
            for (int j = 0; j < 3; j++) { // for (int j = 0; j < arr [0].length; j++)
                for (int s = 0; s < 4; s++) { // for (int s = 0; s < arr [0] [0].length; j++)
                    System.out.print(" " + arr[i][j][s] + " "); // spacebar
                }
                System.out.println(); // indent
            }
            System.out.println();
        }
        System.out.println(arr.length); // 0 < i (2)
        System.out.println(arr [0] [0].length);
    }

    private static void mass2() {

        int [] [] [] arr = {
                { {1, 2, 3, 4},
                  {1, 2, 3, 4},
                  {1, 2, 3, 4} },
                { {10, 20, 30, 40},
                  {10, 20, 30, 40},
                  {10, 20, 30, 40} }
        };
        for (int[][] x : arr) { // 2D-array
            System.out.println();
            for (int[] y : x) {
                System.out.println();
                for (int z : y) {
                    System.out.print(z + " ");
                }
            }
        }
    }

    private static void mass3() {

        int [][] array = new int[4][];
        array [0] = new int[6];
        array [1] = new int[4];
        array [2] = new int[2];
        array [3] = new int[1];

        array [0][0] = 1;
        array [0][1] = 2;
        array [0][2] = 3;
        array [0][3] = 4;
        array [0][4] = 5;
        array [0][5] = 6;
        array [1][0] = 10;
        array [1][1] = 20;
        array [1][2] = 30;
        array [1][3] = 40;
        array [2][0] = 100;
        array [2][1] = 200;
        array [3][0] = 1100;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void mass4() {
        int [] [] arr = {
                {1, 2, 3, 4},
                {10, 20, 30, 40, 50, 60},
                {100, 200}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void mass5() {
        int [] [] [] arr = {
                { {1, 2, 3, 4},
                {10, 20, 30, 40, 50, 60},
                {100, 200} },
                { {1, 2},
                  {10, 20, 30},
                  {100, 200, 300, 400, 500}}
        };
        for (int[][] x : arr) { // 2D-array ragged
            System.out.println();
            for (int[] y : x) {
                System.out.println();
                for (int z : y) {
                    System.out.print(z + " ");
                }
            }
        }
    }
}