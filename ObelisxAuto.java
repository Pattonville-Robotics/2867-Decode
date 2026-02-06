package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
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
    DcMotorEx motorWheel;
    DcMotorEx motorWheelred;
    Servo pusherahhting;
    
    @Override
    public void runOpMode() {
       waitForStart();
        motorLeft = hardwareMap.get(DcMotor.class, "motorLeft");
        motorRight = hardwareMap.get(DcMotor.class, "motorRight");
        
        motorLeftback = hardwareMap.get(DcMotor.class, "motorLeftback");
        motorRightback = hardwareMap.get(DcMotor.class, "motorRightback");
        
        motorWheel = hardwareMap.get(DcMotorEx.class, "motorWheel");
        motorWheelred = hardwareMap.get(DcMotorEx.class, "motorWheelred");
        
        Servo pusherahhting = hardwareMap.get(Servo.class, "pusherahhting");
        
        motorRight.setDirection(DcMotor.Direction.REVERSE);
        motorRightback.setDirection(DcMotor.Direction.REVERSE);
        
        //forward
        motorWheel.setPower(0);
        motorWheelred.setPower(0);
        motorLeft.setPower(-0.6);
        motorLeftback.setPower(-0.6);
        
        motorRight.setPower(-0.7);
        motorRightback.setPower(-0.7);
        
        sleep(1100);
        
        motorLeft.setPower(0);
        motorLeftback.setPower(0);
        
        motorRight.setPower(0);
        motorRightback.setPower(0);
        
        
        
        //shoot
        sleep(1000);
        motorWheel.setVelocity(1000);
        motorWheelred.setVelocity(-1000);
        sleep(1000);
        pusherahhting.setPosition(0.25);
        sleep(1000);
        sleep(500);
        pusherahhting.setPosition(0.0);
        sleep(1000);
        motorWheel.setVelocity(1000);
        motorWheelred.setVelocity(-1000);
        sleep(1000);
        pusherahhting.setPosition(0.25);
        sleep(1000);
        pusherahhting.setPosition(0.0);
        motorWheel.setVelocity(1000);
        motorWheelred.setVelocity(-1000);
        sleep(1000);
        pusherahhting.setPosition(0.25);
        sleep(1000);
        pusherahhting.setPosition(0.0);
        sleep(500);

        
        
        motorLeft.setPower(-.5);
        motorLeftback.setPower(-.5);
        
        motorRight.setPower(-.5);
        motorRightback.setPower(-.5);
        
        
        
        
        motorWheel.setVelocity(0);
        motorWheelred.setVelocity(0);
        motorLeft.setPower(0);
        motorLeftback.setPower(0);
        
        motorRight.setPower(0);
        motorRightback.setPower(0);
            
        sleep(500);
        motorWheel.setPower(0);
        motorWheelred.setPower(0);
        motorLeft.setPower(0.5);
        motorLeftback.setPower(0.55);
        
        motorRight.setPower(0.7);
        motorRightback.setPower(0.7);
        sleep(500);
        motorWheel.setPower(0);
        motorWheelred.setPower(0);
        motorLeft.setPower(0);
        motorLeftback.setPower(0.0);
        
        motorRight.setPower(0.0);
        motorRightback.setPower(-0.0);
        
        
        sleep(100);
        motorWheel.setPower(0);
        motorWheelred.setPower(0);
        motorLeft.setPower(-0.5);
        motorLeftback.setPower(0.55);
        
        motorRight.setPower(0.7);
        motorRightback.setPower(-0.7);
        
        sleep(500);
        
        
        motorLeft.setPower(0);
        motorLeftback.setPower(0);
        
        motorRight.setPower(0);
        motorRightback.setPower(0);    
    }
    
        
    }
    
