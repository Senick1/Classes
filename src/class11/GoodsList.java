package class11;

import java.io.*;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class GoodsList {

    File file = Path.of("resources", "goods.txt").toFile();

    public void createList() {

        Goods milk = new Goods(new String[]{"milk", "10.02.2023"});
        Goods sourCream = new Goods(new String[]{"sour cream", "15.02.2023"});
        Goods butter = new Goods(new String[]{"butter", "07.02.2023"});
        Goods cheese = new Goods(new String[]{"cheese", "27.02.2023"});
        Goods curd = new Goods(new String[]{"curd", "21.02.2023"});
        Goods yogurt = new Goods(new String[]{"yogurt", "19.02.2023"});

        List<String> list = List.of(milk.toString(), sourCream.toString(), butter.toString(), cheese.toString(),
                curd.toString(), yogurt.toString());

        try (var outputStream = new BufferedWriter(new FileWriter(file))) {
            for (String good: list) {
                outputStream.write(good + System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void haveGoods() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addGoods() {
        Scanner scanner = new Scanner(System.in);
            Goods goods = new Goods(scanner.nextLine().split(" "));
            try (var outputStream = new BufferedWriter(new FileWriter(file, true))) {
                    outputStream.append(String.valueOf(goods)).append(System.lineSeparator());
        } catch (FileNotFoundException e) {
                System.out.println("wrong name");
        } catch (IOException e) {
                e.printStackTrace();
        }
    }

    public void deleteGoods(String id) {
        File newFile = Path.of("resources", "goods2.txt").toFile();
        try { var inputStream = new BufferedReader(new FileReader(file));
        var outputStream = new BufferedWriter(new FileWriter(newFile));
                String goodsLine;
                while ((goodsLine = inputStream.readLine()) != null) {
                    String[] goodsEl = goodsLine.split(" ");
                    String idGoods = goodsEl[0];
                    if(!idGoods.equals(id)) {
                        outputStream.write(goodsLine + System.lineSeparator());
                    }
                }
                inputStream.close();
                outputStream.close();
                if (file.delete()) {
                boolean renameResult = newFile.renameTo(file);
                System.out.println("Goods were deleted: " + renameResult);
                }
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}

