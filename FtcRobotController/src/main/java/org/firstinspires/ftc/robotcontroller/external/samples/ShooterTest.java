package org.firstinspires.ftc.robotcontroller.external.samples;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

/**
 * Created by steamuser on 1/11/2017.
 */

public class ShooterTest extends OpMode {

    HardwarePushbot  robot = new HardwarePushbot();

    public void init() {

        robot.init(hardwareMap);

    }


    public void loop() {

        float a = gamepad1.right_trigger;

        if (a > 0) {

            robot.cannon.setPower(0.5);

        } else if (a == 0) {

            robot.cannon.setPower(0);

        }

    }
}
