package org.firstinspires.ftc.robotcontroller.external.samples;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;
/**
 * Created by steamuser on 11/28/2016.
 */
@Autonomous(name = "AutoTest", group = "EmsRoxbotix1")
public class AutoTest extends OpMode{
    DcMotor leftMotor;
    DcMotor rightMotor;
    DcMotor spinner;

    final static int ENCODER_CPR = 1440;
    final static double GEAR_RATIO = 1;
    final static int WHEEL_DIAMETER = 40;
    final static int DISTANCE = 60;

    final static double CIRCUMFERENCE = Math.PI * WHEEL_DIAMETER;
    final static double ROTATIONS = DISTANCE/CIRCUMFERENCE;
    final static double COUNTS = ENCODER_CPR * ROTATIONS * GEAR_RATIO;
@Override
    public void init(){

        leftMotor = hardwareMap.dcMotor.get("Motor_2");
        rightMotor = hardwareMap.dcMotor.get("Motor_1");

        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        leftMotor.setDirection(DcMotor.Direction.FORWARD);
        /*leftMotor.setMode(DcMotor.RunMode.RESET_ENCODERS);
        rightMotor.setMode(DcMotor.RunMode.RESET_ENCODERS);*/


    }
@Override
    public void start(){

        leftMotor.setTargetPosition(2880);
        rightMotor.setTargetPosition(2880);

            leftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            rightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            leftMotor.setPower(0.25);
            rightMotor.setPower(0.25);



    }
    @Override
    public void loop(){

        telemetry.addData("Motor Target", 2880);
        telemetry.addData("Left Position", leftMotor.getCurrentPosition());
        telemetry.addData("Rigt Position", rightMotor.getCurrentPosition());
    }
    @Override
    public void stop(){

        leftMotor.setPower(0.0);
        rightMotor.setPower(0.0);
    }
}
