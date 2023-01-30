package Class3.Rainbow;

import java.util.Scanner;

public class Rainbow {

    private static final int RED = 1;
    private static final int ORANGE = 2;
    private static final int YELLOW = 3;
    private static final int GREEN = 4;
    private static final int AZURE = 5;
    private static final int BLUE = 6;
    private static final int VIOLET = 7;
    private static final String RED = "красно-";
    private static final String ORANGE = "оранжево-";
    private static final String YELLOW = "жёлто-";
    private static final String GREEN = "зелёно-";
    private static final String AZURE = "голубо-";
    private static final String BLUE = "сине-";
    private static final String VIOLET = "фиолетово-";

    public static void scanner () {
        Scanner color = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int number = color.nextInt();

        if (number == 1) {
            System.out.print("красный");
        } else if (number == 2) {
            System.out.print("оранжевый");
        } else if (number == 3) {
            System.out.print("жёлтый");
        } else if (number == 4) {
            System.out.print("зелёный");
        } else if (number == 5) {
            System.out.print("голубой");
        } else if (number == 6) {
            System.out.print("синий");
        } else if (number == 7) {
            System.out.print("фиолетовый");
        }
        switch (number) {
            case 12,  21: {
                System.out.println(RED + "оранжевый");
                break;
            }
            case 13,  31: {
                System.out.println(RED + "жёлтый");
                break;
            }
            case 14,  41: {
                System.out.println(RED + "зелёный");
                break;
            }
            case 15,  51: {
                System.out.println(RED + "голубой");
                break;
            }
            case 16,  61: {
                System.out.println(RED + "синий");
                break;
            }
            case 17,  71: {
                System.out.println(RED + "фиолетовый");
                break;
            }
            case 23, 32: {
                System.out.println(ORANGE + "жёлтый");
                break;
            }
            case 24, 42: {
                System.out.println(ORANGE + "зелёный");
                break;
            }
            case 25, 52: {
                System.out.println(ORANGE + "голубой");
                break;
            }
            case 26, 62: {
                System.out.println(ORANGE + "синий");
                break;
            }
            case 27, 72: {
                System.out.println(ORANGE + "фиолетовый");
                break;
            }
            case 34, 43: {
                System.out.println(yellow + "зелёный");
                break;
            }
            case 35, 53: {
                System.out.println(YELLOW + "голубой");
                break;
            }
            case 36, 63: {
                System.out.println(YELLOW + "синий");
                break;
            }
            case 37, 73: {
                System.out.println(YELLOW + "фиолетовый");
                break;
            }
            case 45, 54: {
                System.out.println(GREEN + "голубой");
                break;
            }
            case 46, 64: {
                System.out.println(GREEN + "синий");
                break;
            }
            case 47, 74: {
                System.out.println(GREEN + "фиолетовый");
                break;
            }
            case 56, 65: {
                System.out.println(AZURE + "синий");
                break;
            }
            case 57, 75: {
                System.out.println(AZURE + "фиолетовый");
                break;
            }
            case 67, 76: {
                System.out.println(BLUE + "фиолетовый");
                break;
            }
            default: {
                System.out.println("Неверные данные");
                break;
            }
        }
        }
    }
