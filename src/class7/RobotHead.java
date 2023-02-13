package class7;

public class RobotHead implements Factory {

    @Override
    public void generateElement1() {
        System.out.println(Head.CUBE.toString());
    }

    @Override
    public void generateElement2() {
        System.out.println(Head.SPHERE.toString());
    }

    @Override
    public void generateElement3() {
        System.out.println(Head.PYRAMID.toString());
    }
}
