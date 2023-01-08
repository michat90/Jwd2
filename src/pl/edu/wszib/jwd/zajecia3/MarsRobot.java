package pl.edu.wszib.jwd.zajecia3;

public class MarsRobot {
    String status;
    int speed;
    int power;

    MarsRobot(String status, int speed, int  power) {
        this.status = status;
        this.speed = speed;
        this.power = power;
    }

    MarsRobot() {} //Moze byc ale jezeli nie korzystamy to moze go nie byc

    public static void main(String[] args) {
        MarsRobot marsRobot = new MarsRobot("w bazie",0,4);
        System.out.println(marsRobot.status);
    }
}
