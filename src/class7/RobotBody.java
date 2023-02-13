package class7;

public class RobotBody implements Factory{
    @Override
    public void generateElement1() {
        System.out.print(Body.RED.getTitle() + ", ");;
    }

    @Override
    public void generateElement2() {
        System.out.print(Body.BLACK.getTitle() + ", ");;
    }

    @Override
    public void generateElement3() {
        System.out.print(Body.GREEN.getTitle() + ", ");;
    }
}
