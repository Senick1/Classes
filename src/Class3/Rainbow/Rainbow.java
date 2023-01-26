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
    private static final String red = "красно-";
    private static final String orange = "оранжево-";
    private static final String yellow = "жёлто-";
    private static final String green = "зелёно-";
    private static final String azure = "голубо-";
    private static final String blue = "сине-";
    private static final String violet = "фиолетово-";

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
                System.out.println(red + "оранжевый");
                break;
            }
            case 13,  31: {
                System.out.println(red + "жёлтый");
                break;
            }
            case 14,  41: {
                System.out.println(red + "зелёный");
                break;
            }
            case 15,  51: {
                System.out.println(red + "голубой");
                break;
            }
            case 16,  61: {
                System.out.println(red + "синий");
                break;
            }
            case 17,  71: {
                System.out.println(red + "фиолетовый");
                break;
            }
            case 23, 32: {
                System.out.println(orange + "жёлтый");
                break;
            }
            case 24, 42: {
                System.out.println(orange + "зелёный");
                break;
            }
            case 25, 52: {
                System.out.println(orange + "голубой");
                break;
            }
            case 26, 62: {
                System.out.println(orange + "синий");
                break;
            }
            case 27, 72: {
                System.out.println(orange + "фиолетовый");
                break;
            }
            case 34, 43: {
                System.out.println(yellow + "зелёный");
                break;
            }
            case 35, 53: {
                System.out.println(yellow + "голубой");
                break;
            }
            case 36, 63: {
                System.out.println(yellow + "синий");
                break;
            }
            case 37, 73: {
                System.out.println(yellow + "фиолетовый");
                break;
            }
            case 45, 54: {
                System.out.println(green + "голубой");
                break;
            }
            case 46, 64: {
                System.out.println(green + "синий");
                break;
            }
            case 47, 74: {
                System.out.println(green + "фиолетовый");
                break;
            }
            case 56, 65: {
                System.out.println(azure + "синий");
                break;
            }
            case 57, 75: {
                System.out.println(azure + "фиолетовый");
                break;
            }
            case 67, 76: {
                System.out.println(blue + "фиолетовый");
                break;
            }
            default: {
                System.out.println("Неверные данные");
                break;
            }
        }
        }
    }