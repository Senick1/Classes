package class5;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix {

    private final Random rand = new Random();
    private final DecimalFormat dF = new DecimalFormat("0.00000");
    private final String [][] arrayInitial = new String [10][10];
    private final String [] mainDiagonal = new String[10];
    private final String [] secondaryDiagonal = new String[10];

    public void printArrayInitial() {
        for (int i = 0; i < arrayInitial.length; i++) {
            for (int j = 0; j < arrayInitial[i].length; j++) {
                if (i+j == 2 || i+j == 5 || i+j == 8 || i+j == 11 || i+j == 14 || i+j == 17)
                    arrayInitial [i] [j] = dF.format(rand.nextDouble());
                else arrayInitial [i] [j] = generateRandomString();
                System.out.print(arrayInitial [i] [j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void compareDiagonal() {
        for (int i = 0; i < mainDiagonal.length; i++) {
            mainDiagonal [i] = arrayInitial [i] [i];
        }

        for (int i = 0; i < secondaryDiagonal.length; i++) {
            secondaryDiagonal [i] = arrayInitial [i] [9 - i];
        }

        boolean isEqual = Arrays.equals(mainDiagonal, secondaryDiagonal);
        System.out.println(isEqual);
    }

    public void printElementsNumber() {
        Pattern pattern = Pattern.compile("\\d.\\d{5}");
        Matcher matcher = pattern.matcher(createDiagonalArray());
        int n = 0;

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String num = createDiagonalArray().substring(start, end);
            n = (int) Math.round(Double.parseDouble(num.replaceAll(",", ".")));
        }
        int [] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number [i] = n;
            System.out.print(number [i] + "_");
        }
        System.out.println();
    }

    public void printElementsWord() {
        Pattern patternStr = Pattern.compile("\\b\\D{7}\\b");
        Matcher matcherStr = patternStr.matcher(createDiagonalArray());

        while (matcherStr.find()) {
            int start = matcherStr.start();
            int end = matcherStr.end();
            StringBuilder text = new StringBuilder(createDiagonalArray().substring(start, end));
            text.deleteCharAt(0);
            text.delete(4, 6);
            System.out.print(text + ", ");
        }
    }

    private String generateRandomString() {
        String alphabetLower = "abcdefghijklmnopqrstuvwxyz";
        String alphabetUpper = alphabetLower.toUpperCase();
        String alphabet = alphabetLower + alphabetUpper;

        String [] elements = new String [7];
        for (int i = 0; i < 7; i++) {
            char ch = alphabet.charAt(rand.nextInt(alphabet.length()));
            elements [i] = String.valueOf(ch);
        }
        return String.join("", elements);
    }

    private String createDiagonalArray() {
        String [] newArray = Arrays.copyOf(mainDiagonal, mainDiagonal.length + secondaryDiagonal.length);
        System.arraycopy(secondaryDiagonal, 0, newArray, mainDiagonal.length, secondaryDiagonal.length);
        return String.join(" ", newArray);
    }
}