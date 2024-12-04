package Stepik._3_OOP;

public class moveRobot {
    public static void main(String[] args) {
        Robot robot = new Robot(0,0, Direction.DOWN);
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot (int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {
            return dir;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            if      (dir == Direction.UP)    {dir = Direction.LEFT;}
            else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
            else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
            else if (dir == Direction.RIGHT) {dir = Direction.UP;}
        }

        public void turnRight() {
            if      (dir == Direction.UP)    {
                dir = Direction.RIGHT;
            }
            else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
            else if (dir == Direction.LEFT)  {dir = Direction.UP;}
            else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
        }

        public void stepForward() {
            if (dir == Direction.UP)    {y++;}
            if (dir == Direction.DOWN)  {y--;}
            if (dir == Direction.LEFT)  {x--;}
            if (dir == Direction.RIGHT) {x++;}
        }
    }
    // крутим робота по часовой, пока не совпадет заданное направление
    // как совпадет, двигает вперед до нужной точки
//    public static void moveRobot(Robot robot, int toX, int toY) {
//        if (robot.getY() < toY ) {
//            while (robot.getDirection() != Direction.UP)
//                robot.turnRight();
//            while (robot.getY() < toY)
//                robot.stepForward();
//        }
//        else if (robot.getY() > toY){
//            while (robot.getDirection() != Direction.DOWN)
//                robot.turnRight();
//            while (robot.getY() > toY)
//                robot.stepForward();
//        }
//        if (robot.getX() < toX){
//            while (robot.getDirection()!=Direction.RIGHT)
//                robot.turnRight();
//            while (robot.getX() < toX)
//                robot.stepForward();
//        }
//        else if (robot.getX() > toX){
//            while (robot.getDirection() != Direction.LEFT)
//                robot.turnRight();
//            while (robot.getX() > toX)
//                robot.stepForward();
//        }
//        System.out.println(robot.getDirection() + " " + robot.getX() + " " + toX);
//        System.out.println(robot.getY() + " " + toY);
//    }
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 1; i <= 3; i++) {
            try (RobotConnection robot = robotConnectionManager.getConnection()) {
                robot.moveRobotTo(toX, toY);
                i = 4;
            } catch (RobotConnectionException ex1) {
                if (i == 3) {
                    throw new RobotConnectionException("Error");
                }
            }
        }
    }
}
