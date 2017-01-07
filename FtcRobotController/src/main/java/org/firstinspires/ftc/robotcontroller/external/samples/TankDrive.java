package org.firstinspires.ftc.robotcontroller.external.samples;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by Tejas Mehta on 11/21/16.
 */
@TeleOp(name="TankDrive", group="A-Team")
public class TankDrive extends OpMode {

    DcMotor leftMotor;
    DcMotor rightMotor;
    DcMotor spinner;
    Servo indexer;


    public void init() {

        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        spinner = hardwareMap.dcMotor.get("Motor_3");
        indexer = hardwareMap.servo.get("Servo_1");


        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        spinner.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void loop() {

        float leftY = gamepad1.left_stick_y;
        float rightY = gamepad1.right_stick_y;
        float spinnerF = gamepad1.right_trigger;
        float spinnerR = gamepad1.left_trigger;


        leftMotor.setPower(leftY);
        rightMotor.setPower(rightY);

        if (gamepad1.a) {

            indexer.setPosition(1);

        } else if (gamepad1.b) {

            indexer.setPosition(0);

        }

        if (gamepad1.right_trigger == 1 ) {

            spinner.setDirection(DcMotorSimple.Direction.REVERSE);
            spinner.setPower(spinnerF);

        } else if (gamepad1.left_trigger == 1) {

            spinner.setDirection(DcMotorSimple.Direction.FORWARD);
            spinner.setPower(spinnerR);

        } else {

            spinner.setPower(0);


        }

    }
}


