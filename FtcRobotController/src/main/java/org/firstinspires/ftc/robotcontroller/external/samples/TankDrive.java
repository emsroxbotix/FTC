package org.firstinspires.ftc.robotcontroller.external.samples;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by Tejas Mehta on 11/21/16.
 */

public class TankDrive extends OpMode {

    DcMotor leftMotor;
    DcMotor rightMotor;
    DcMotor spinner;


    public void init() {

        leftMotor = hardwareMap.dcMotor.get("Motor_2");
        rightMotor = hardwareMap.dcMotor.get("Motor_1");
        spinner = hardwareMap.dcMotor.get("Motor_3");
        spinnerR = hardwareMap.dcMotor.get("Motor_3");

        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        leftMotor.setDirection(DcMotor.Direction.REVERSE);
        spinner.setDirection(DcMotor.Direction.REVERSE);
    }

    public void loop() {

        float leftY = -gamepad1.left_stick_y;
        float rightY = -gamepad1.right_stick_y;
        float spinnerF = -gamepad1.right_trigger;
        float spinnerR = -gamepad1.left_trigger;

        leftMotor.setPower(leftY);
        rightMotor.setPower(rightY);
        if (gamepad1.right_trigger == 1 ) {

            spinner.setPower(spinnerF);

        } else {

            spinner.setPower(spinnerR);

        }

    }
}


