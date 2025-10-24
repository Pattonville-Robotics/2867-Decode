package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
@TeleOp
public class BasicAutonomous extends LinearOpMode {
    DcMotor motorLeftback;
    DcMotor motorRightback;
    DcMotor motorLeft;
    DcMotor motorRight;
    DcMotor motorWheel;
    
    @Override
    public void runOpMode() {
       waitForStart();
        motorLeft = hardwareMap.get(DcMotor.class, "motorLeft");
        motorRight = hardwareMap.get(DcMotor.class, "motorRight");
        
        motorLeftback = hardwareMap.get(DcMotor.class, "motorLeftback");
        motorRightback = hardwareMap.get(DcMotor.class, "motorRightback");
        
        motorWheel = hardwareMap.get(DcMotor.class, "motorWheel");
        
        motorRight.setDirection(DcMotor.Direction.REVERSE);
        motorRightback.setDirection(DcMotor.Direction.REVERSE);
            
        motorLeft.setPower(-1);
        motorLeftback.setPower(-1);
        
        motorRight.setPower(-1);
        motorRightback.setPower(-1);
        
        sleep(1200);
        
        motorLeft.setPower(1);
        motorLeftback.setPower(1);
        
        motorRight.setPower(-.5);
        motorRightback.setPower(-.5);
        sleep(1000);
        
        // motorLeft.setPower(-1);
        // motorLeftback.setPower(-1);
        
        // motorRight.setPower(-1);
        // motorRightback.setPower(-1);
        
        // sleep(230);
        
        // motorLeft.setPower(0);
        // motorLeftback.setPower(-1);
        
        // motorRight.setPower(0);
        // motorRightback.setPower(-1);
        // sleep(500);
        
            
            
    }
    
        
    }
    
