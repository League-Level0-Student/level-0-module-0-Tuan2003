import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {

Robot Bob = new Robot();
Bob.miniaturize();
Bob.penDown();
Bob.setSpeed(30);
Bob.turn(90);
Bob.move(200);
Bob.turn(-90);
Bob.turn(-45);
Bob.move(100);
}
}
