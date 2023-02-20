package class8;


public class Realization {
    public static void main(String[] args) {
        MyArrayList<Integer> integerMyList20 = new MyArrayList<>(20);
        MyArrayList<Integer> integerMyList = new MyArrayList<>();
        integerMyList.add(3);
        integerMyList.add(5);
        integerMyList.add(7);
        integerMyList.add(9);
        integerMyList.add(6);
        integerMyList.add(3);
        integerMyList.add(5);
        integerMyList.add(7);
        integerMyList.add(9);
        integerMyList.add(6);
        integerMyList.add(3);
        integerMyList.add(5);
        integerMyList.add(7);
        integerMyList.add(9);
        integerMyList.add(9);
        integerMyList.add(9);
        MyArrayList<Integer> integerMyListOnList = new MyArrayList<>(integerMyList);
        integerMyListOnList.add(437);
        System.out.println("using coll: " + integerMyListOnList);
        System.out.println("size:" + integerMyListOnList.size());
        System.out.println("isEmpty: " + integerMyList.isEmpty());
        System.out.println("contains 3: " + integerMyList.contains(3));
        System.out.println("contains 1: " + integerMyList.contains(1));
        System.out.println("list: " + integerMyList);
        integerMyList.add(2, 25);
        System.out.println("add 25 by index 2: " + integerMyList);
        System.out.println("add by nonexistent index: " + integerMyList.add(10,null));
        System.out.println("add null: " + integerMyList.add(null));
        System.out.println("new size: " + integerMyList.size());
        integerMyList.remove(2);
        System.out.println("removed element is " + integerMyList.remove(2) + "\nresult:" + integerMyList);
        System.out.println("new size: " + integerMyList.size());
        integerMyList.remove((Integer) 3);
        System.out.println("remove 3: " + integerMyList);
        System.out.println("new size: " + integerMyList.size());
        System.out.println("remove nonexistent element: " + integerMyList.remove((Integer) 45));
        integerMyList.addAll(integerMyList);
        System.out.println("newList: " + integerMyList);
        System.out.println("add nullArrayList: " + integerMyList.addAll(integerMyList20));
        System.out.println("size + length addArray (15): " + integerMyList.size());
        System.out.println("element with index 1 is " + integerMyList.get(1));
        integerMyList.set(1, 76);
        System.out.println("change element with index 1 on " + integerMyList.set(1, 76) + "\nresult:" + integerMyList);
        System.out.println("indexOf (9): " + integerMyList.indexOf(9));
        System.out.println("indexOf not found object: " + integerMyList.indexOf(17));

    }
}