package class11;

import java.io.*;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Pattern;

public class OrdersList {

    File file = Path.of("resources", "order.txt").toFile();

    Goods milk = new Goods(new String[]{"milk", "10.02.2023"});
    Goods sourCream = new Goods(new String[]{"sour cream", "15.02.2023"});
    Goods butter = new Goods(new String[]{"butter", "07.02.2023"});
    Goods cheese = new Goods(new String[]{"cheese", "27.02.2023"});
    Goods curd = new Goods(new String[]{"curd", "21.02.2023"});
    Goods yogurt = new Goods(new String[]{"yogurt", "19.02.2023"});

    public void seeProducts() {
        List<Goods> list = List.of(milk, sourCream, butter, cheese, curd, yogurt);
        list.forEach(System.out::println);
    }

    public void createOrderFile() {
        List<Goods> list1 = List.of(milk, sourCream);
        List<Goods> list2 = List.of(curd, yogurt, butter);
        List<Goods> list3 = List.of(cheese, yogurt);

        Order order1 = new Order(list1);
        String order1Str = order1.toString();
        String order2 = new Order(list2).toString();
        String order3 = new Order(list3).toString();

        try (FileOutputStream outputStream = new FileOutputStream(file, true)) {
                outputStream.write(order1Str.getBytes());
                outputStream.write(10);
                outputStream.write(order2.getBytes());
                outputStream.write(10);
                outputStream.write(order3.getBytes());
                outputStream.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void haveOrders() {
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte [] bytes = inputStream.readAllBytes();
            String text = new String(bytes);
            System.out.println(text);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addOrder() {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        System.out.println("Enter the number of product you want to add");
        List<Goods> list = new ArrayList<>();

        if (n.equals(milk.getId().toString())) {
            list.add(milk);
        } else if (n.equals(sourCream.getId().toString())) {
            list.add(sourCream);
        } else if (n.equals(butter.getId().toString())) {
            list.add(butter);
        } else if (n.equals(cheese.getId().toString())) {
            list.add(cheese);
        } else if (n.equals(curd.getId().toString())) {
            list.add(curd);
        } else if (n.equals(yogurt.getId().toString())) {
            list.add(yogurt);
        } else {
            System.out.println("wrong meaning");
        }
        createOrder(list);
    }

    public void deleteOrderById(String id) {
        Pattern pattern =
                Pattern.compile("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$");
        if (pattern.matcher(id).matches()) {
            File newFile = Path.of("resources", "order2.txt").toFile();
            try { var inputStream = new BufferedReader(new FileReader(file));
                var outputStream = new BufferedWriter(new FileWriter(newFile));
                String orderLine;
                while ((orderLine = inputStream.readLine()) != null) {
                    String[] orderEl = orderLine.split(" ");
                    String idGoods = orderEl[0];
                    if(!idGoods.equals(id)) {
                        outputStream.write(orderLine + System.lineSeparator());
                    }
                }
                inputStream.close();
                outputStream.close();
                if (file.delete()) {
                    boolean renameResult = newFile.renameTo(file);
                    System.out.println("order was deleted: " + renameResult);}
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else System.out.println("not UUID");
    }

    private void createOrder(List<Goods> l) {
        Order myOrder = new Order(l);
        String order = myOrder.toString();

        try (FileOutputStream outputStream = new FileOutputStream(file, true)) {
            outputStream.write(10);
            outputStream.write(order.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}