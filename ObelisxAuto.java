package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
@TeleOp
public class ObelisxAuto extends LinearOpMode {
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
        
        //forward
        motorWheel.setPower(0);
        motorWheelred.setPower(0);
        motorLeft.setPower(-1);
        motorLeftback.setPower(-1);
        
        motorRight.setPower(-1);
        motorRightback.setPower(-1);
        
        sleep(1000);
        
        motorLeft.setPower(0);
        motorLeftback.setPower(0);
        
        motorRight.setPower(0);
        motorRightback.setPower(0);
        
        //shoot
        sleep(1000);
        motorWheel.setPower(-1);
        motorWheelred.setPower(1);
        sleep(5000);
        pusherahhting.setPosition(0.25);
        
        motorWheel.setPower(1);
        motorWheelred.setPower(1);
        
        
        pusherahhting.setPosition(.13);
        sleep(5000);
        pusherahhting.setPosition(.03);
        sleep(5000);
        
        motorWheel.setPower(1);
        motorWheelred.setPower(1);
        
        
        pusherahhting.setPosition(.13);
        sleep(5000);
        pusherahhting.setPosition(.03);
        sleep(5000);
        
        
        
        motorLeft.setPower(-.5);
        motorLeftback.setPower(-.5);
        
        motorRight.setPower(-.5);
        motorRightback.setPower(-.5);
        
        
        
        
        
        motorWheel.setPower(0);
        motorWheelred.setPower(0);
        motorLeft.setPower(0);
        motorLeftback.setPower(0);
        
        motorRight.setPower(0);
        motorRightback.setPower(0);
            
            
    }
    
        
    }
    
