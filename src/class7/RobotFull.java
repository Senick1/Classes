package class7;

public class RobotFull{

    RobotBody robotBody = new RobotBody();
    RobotHead robotHead = new RobotHead();

    void createRobot() {

        System.out.print("Ilya: ");
        robotBody.generateElement1();
        robotHead.generateElement1();

        System.out.print("Igor: ");
        robotBody.generateElement2();
        robotHead.generateElement1();

        System.out.print("Petya: ");
        robotBody.generateElement3();
        robotHead.generateElement1();

        System.out.print("Anya: ");
        robotBody.generateElement1();
        robotHead.generateElement2();

        System.out.print("Kate: ");
        robotBody.generateElement2();
        robotHead.generateElement2();

        System.out.print("Walli: ");
        robotBody.generateElement3();
        robotHead.generateElement2();

        System.out.print("Eva: ");
        robotBody.generateElement1();
        robotHead.generateElement3();

        System.out.print("Tanya: ");
        robotBody.generateElement2();
        robotHead.generateElement3();

        System.out.print("Senya: ");
        robotBody.generateElement3();
        robotHead.generateElement3();
    }
}
