package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp(name="TESTY TESTER MCTESTERFACE")
public class test extends LinearOpMode{
    DcMotorEx shooter1;

    @Override
    
    public void runOpMode() throws InterruptedException{
        shooter1 = hardwareMap.get(DcMotorEx.class, "shooter1");
        waitForStart();
        while(opModeIsActive()) {
            shooter1.setPower(gamepad1.left_stick_x);
        }
    }
}