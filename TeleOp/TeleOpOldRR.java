package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.RobotSystems.DriveTrain;

@TeleOp(name="TeleOpOldRR", group="11846")
public class TeleOpOldRR extends OpMode{
    DriveTrain driveTrain = new DriveTrain();

    double left = 0.00;
    double right = 0.00;
    double armPower = 0.00;
    final double SLIDE_POWER = 1.00;

    @Override
    public void init() {
        driveTrain.initHW(hardwareMap);
    }

    @Override
    public void loop() {
        left = -gamepad1.left_stick_y;
        right = -gamepad1.right_stick_y;
        armPower = -gamepad2.left_stick_y;

        driveTrain.LeftDrive(right);
        driveTrain.RightDrive(left);
        driveTrain.moveArm(armPower/5);

        if(gamepad1.right_bumper){
            driveTrain.openServo();
        }
        if(gamepad1.left_bumper){
            driveTrain.closeServo();
        }



        telemetry.addData("grabSensorPos", driveTrain.robotHardware.grabServo.getPosition());
        telemetry.update();

    }
}