package org.firstinspires.ftc.teamcode.RobotSystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

public class DriveTrain {
    public RobotHardware robotHardware = new RobotHardware();

    double grabServoMax = 2;
    double grabServoMin = 0;


    public void initHW(HardwareMap ahw) { // init All Hardware/Devices
        robotHardware.init(ahw);
    }

    public void initRobot() {
    }

    public void openServo(){
        robotHardware.grabServo.setPosition(grabServoMax);
    }

    public void closeServo(){
        robotHardware.grabServo.setPosition(grabServoMin);
    }

//    public void holdArmMotor(){
//        int currentPos = robotHardware.arm.getCurrentPosition();
//        while (true) {
//            wait(10);
//            robotHardware.arm.setTargetPosition(currentPos);
//        }
//
//    }
//    public void releaseArmMotor(){
//        robotHardware.arm.setPower(0);
//    }



    public void moveArm(double power) {
        robotHardware.arm.setPower(-power);
    }

    public void Drive(double p) {
        robotHardware.module1.setPower(-p);
        robotHardware.module2.setPower(-p);
    }

    public void StopDrive() {
        robotHardware.module1.setPower(0);
        robotHardware.module2.setPower(0);
    }

    public void RightDrive(double p) {
        robotHardware.module1.setPower(p);
    }

    public void LeftDrive(double p) {
        robotHardware.module2.setPower(p);
    }

    public void TurnRight(double p){
        robotHardware.module1.setPower(-p);
        robotHardware.module2.setPower(p);
    }

    public void TurnLeft(double p){
        robotHardware.module1.setPower(p);
        robotHardware.module2.setPower(-p);
    }

    public void wait(int sleeptime) {
        ElapsedTime timer = new ElapsedTime();
        timer.reset();
        while (timer.milliseconds() < sleeptime) {

        }
    }
}