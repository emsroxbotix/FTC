package org.firstinspires.ftc.robotcontroller.external.samples;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by Tejas Mehta on 11/9/2016.
 */

public class DriveForwardControl extends OpMode {

    DcMotor leftMotor;
    DcMotor rightMotor;


    public void init() {

        leftMotor = hardwareMap.dcMotor.get("Motor_2");
        rightMotor = hardwareMap.dcMotor.get("Motor_1");

        rightMotor.setDirection(DcMotor.Direction.REVERSE);
    }

    public void loop() {

        float xValue = gamepad1.left_stick_x;
        float yValue = -gamepad1.right_stick_y;

        float leftPower = yValue + xValue;
        float rightPower = yValue - xValue;

        leftPower = Range.clip(leftPower, -1, 1);
        rightPower = Range.clip(rightPower, -1, 1);

        leftMotor.setPower(leftPower);
        rightMotor.setPower(rightPower);

    }
}
