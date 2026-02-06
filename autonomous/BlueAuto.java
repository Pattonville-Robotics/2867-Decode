package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
@TeleOp
public class BlueAuto extends LinearOpMode {
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
        //Wait 
        
        sleep(10000);
        motorLeft.setPower(0);
        motorLeftback.setPower(0);
        
        motorRight.setPower(0);
        motorRightback.setPower(0);
    
        
        //Forwards
        motorLeft.setPower(.45);
        motorLeftback.setPower(.45);
        
        motorRight.setPower(.5);
        motorRightback.setPower(.5);
        
        sleep(2600);
        
        motorLeft.setPower(.0);
        motorLeftback.setPower(.0);
        
        sleep(200);
       
        //Turn
        motorRight.setPower(.5);
        motorRightback.setPower(.5);
        sleep(800);
        motorRight.setPower(.0);
        motorRightback.setPower(.0);
        sleep(500);
        //shoot
        sleep(1100);
        motorWheel.setVelocity(1000);
        motorWheelred.setVelocity(-1000);
        sleep(1000);
        pusherahhting.setPosition(0.25);
        sleep(1000);
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
        
        //End
        motorLeft.setPower(0);
        motorLeftback.setPower(0);
        
        motorRight.setPower(0);
        motorRightback.setPower(0);
        sleep(500);
        
        
        motorLeft.setPower(-0.5);
        motorLeftback.setPower(0.5);
        
        motorRight.setPower(0.5);
        motorRightback.setPower(-0.5);
        
        sleep(500);
        sleep(500);
        
        //End
        motorLeft.setPower(0);
        motorLeftback.setPower(0);
        
        motorRight.setPower(0);
        motorRightback.setPower(0);
        // motorWheel.setPower(1);
        // motorWheelred.setPower(1);
        
        
        // pusherahhting.setPosition(.13);
        // sleep(5000);
        // pusherahhting.setPosition(.03);
        // sleep(5000);
        
        // motorWheel.setPower(1);
        // motorWheelred.setPower(1);
        
        
        // pusherahhting.setPosition(.13);
        // sleep(5000);
        // pusherahhting.setPosition(.03);
        // sleep(5000);
        
        
        
        // motorLeft.setPower(-.5);
        // motorLeftback.setPower(-.5);
        
        // motorRight.setPower(-.5);
        // motorRightback.setPower(-.5);
        
        
        
        
        
        // motorWheel.setPower(0);
        // motorWheelred.setPower(0);
        // motorLeft.setPower(0);
        // motorLeftback.setPower(0);
        
        // motorRight.setPower(0);
        // motorRightback.setPower(0);
            
            
    }
    
        
    }
    
