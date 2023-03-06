package class11;

import java.util.Scanner;

public class ConsoleMenu {

    public void writeIn() {
        GoodsList goodsList = new GoodsList();
        goodsList.createList();
        OrdersList ordersList = new OrdersList();
        ordersList.createOrderFile();
        while (true) {
            System.out.println("""
                Choose the appropriate option:
                1 - goods;
                2 - orders;
                stop - stop program;
                """);
            Scanner scanner = new Scanner(System.in);
            String x = scanner.nextLine();
            switch (x) {
                case "1": {
                    System.out.println("""
                        Choose the appropriate option:
                        1 - have a list;
                        2 - add goods;
                        3 - delete goods;
                        0 - stop program;
                        """);
                    int z = scanner.nextInt();
                    if (z == 1) {
                        goodsList.haveGoods();
                        break;
                    } else if (z == 2) {
                        System.out.println("Write parameters (product name date(ex.: name 11.02.2023))");
                        goodsList.addGoods();
                        break;
                    } else if (z == 3) {
                        System.out.println("Enter id of the product you want to delete");
                        goodsList.deleteGoods(scanner.next());
                        break;
                    } else if (z == 0) {
                        System.exit(0);
                    }
                }
                case "2": {
                    System.out.println("""
                            Choose the appropriate option:
                            1 - have orders;
                            2 - add order;
                            3 - delete order;
                            0 - stop program;
                            """);
                    int a = scanner.nextInt();
                    if (a == 1) {
                        ordersList.haveOrders();
                        break;
                    } else if (a == 2) {
                        ordersList.seeProducts();
                        System.out.println("Enter id of the product you want to add");
                        ordersList.addOrder();
                        break;
                    } else if (a == 3) {
                        System.out.println("Enter id of order you want to delete");
                        ordersList.deleteOrderById(scanner.next());
                        break;
                    } else if (a == 0) {
                        System.exit(0);
                    } else {
                        System.out.println("error");
                        break;
                    }
                }
                case "stop": {
                    System.exit(0);
                }
                default: {
                    System.out.println("Enter one of assigned values");
                    break;
                }
            }
        }
    }
}
