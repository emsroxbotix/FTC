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

    HardwarePushbot         robot   = new HardwarePushbot();

    public void init() {

        robot.init(hardwareMap);

    }

    public void loop() {

        float leftY = gamepad1.left_stick_y;
        float rightY = gamepad1.right_stick_y;
        float cannon = -gamepad2.right_trigger;
        float spinnerR = gamepad2.left_trigger;


        robot.leftMotor.setPower(leftY);
        robot.rightMotor.setPower(rightY);

        robot.spinner.setPower(spinnerR);
        robot.cannon.setPower(cannon);
        // hello world! i may or may not be a comment
        // plz dont kill meh
        // plzplzplzplzplzplzplzplzplzplz
        // i didnt do anything wrong D:D:D:D:D:D:D:D:D:D:D:D:D:D:

    }
}


