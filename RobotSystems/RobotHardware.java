package org.firstinspires.ftc.teamcode.RobotSystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class RobotHardware {
    public DcMotor module1 = null;
    public DcMotor module2 = null;

    public Servo grabServo = null;

    public DcMotor arm = null;

    HardwareMap hwMap = null;

    public void init (HardwareMap ahwMap){
        hwMap = ahwMap;


        // DriveTrain
        module1 = hwMap.get(DcMotor.class, "md1");
        module2 = hwMap.get(DcMotor.class, "md2");

        module1.setDirection(DcMotor.Direction.REVERSE);
        module2.setDirection(DcMotor.Direction.FORWARD);

        module1.setPower(0);
        module2.setPower(0);

        module1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        module2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        // DriveTrain End

        grabServo = hwMap.get(Servo.class, "grabServo");
        grabServo.setDirection(Servo.Direction.FORWARD);

        arm = hwMap.get(DcMotor.class, "arm");
        arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        arm.setDirection(DcMotor.Direction.FORWARD);
        arm.setPower(0);
    }
}




