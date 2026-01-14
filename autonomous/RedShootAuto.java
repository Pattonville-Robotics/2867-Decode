package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
@TeleOp
public class RedShootAuto extends LinearOpMode {
    DcMotor motorLeftback;
    DcMotor motorRightback;
    DcMotor motorLeft;
    DcMotor motorRight;
    DcMotor motorWheel;
    DcMotor motorWheelred;
    Servo pusherahhting;
    
    @Override
    public void runOpMode() {
       waitForStart();
        motorLeft = hardwareMap.get(DcMotor.class, "motorLeft");
        motorRight = hardwareMap.get(DcMotor.class, "motorRight");
        
        motorLeftback = hardwareMap.get(DcMotor.class, "motorLeftback");
        motorRightback = hardwareMap.get(DcMotor.class, "motorRightback");
        
        motorWheel = hardwareMap.get(DcMotor.class, "motorWheel");
        motorWheelred = hardwareMap.get(DcMotor.class, "motorWheelred");
        
        Servo pusherahhting = hardwareMap.get(Servo.class, "pusherahhting");
        
        motorRight.setDirection(DcMotor.Direction.REVERSE);
        motorRightback.setDirection(DcMotor.Direction.REVERSE);
        
        //backwards
        motorLeft.setPower(-0.6);
        motorLeftback.setPower(-0.6);
        
        motorRight.setPower(-0.85);
        motorRightback.setPower(-0.85);
        
        sleep(1000);
        
        motorLeft.setPower(0);
        motorLeftback.setPower(0);
        
        motorRight.setPower(0);
        motorRightback.setPower(0);
        
        
        
        
        
        // motorLeft.setPower(-.5);
        // motorLeftback.setPower(-.5);
        
        // motorRight.setPower(-.5);
        // motorRightback.setPower(-.5);
        
    }

        
    }
    
