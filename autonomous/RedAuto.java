package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
@TeleOp
public class RedAuto extends LinearOpMode {
    DcMotor motorLeftback;
    DcMotor motorRightback;
    DcMotor motorLeft;
    DcMotor motorRight;
    DcMotor motorWheel;
    DcMotor motorWheelred;
    
    @Override
    public void runOpMode() {
       waitForStart();
        motorLeft = hardwareMap.get(DcMotor.class, "motorLeft");
        motorRight = hardwareMap.get(DcMotor.class, "motorRight");
        
        motorLeftback = hardwareMap.get(DcMotor.class, "motorLeftback");
        motorRightback = hardwareMap.get(DcMotor.class, "motorRightback");
        
        motorWheel = hardwareMap.get(DcMotor.class, "motorWheel");
        motorWheelred = hardwareMap.get(DcMotor.class, "motorWheelred");
        
        motorRight.setDirection(DcMotor.Direction.REVERSE);
        motorRightback.setDirection(DcMotor.Direction.REVERSE);
        
        //forward
        motorLeft.setPower(-1);
        motorLeftback.setPower(-1);
        
        motorRight.setPower(-1);
        motorRightback.setPower(-1);
        
        sleep(3920);
        
        //turn
        motorLeft.setPower(1);
        motorLeftback.setPower(1);
        
        motorRight.setPower(-1);
        motorRightback.setPower(-1);
        sleep(990);
        
         //forward and intake
        motorWheel.setPower(-.5);
        motorWheelred.setPower(-.5);
        
        motorLeft.setPower(-.5);
        motorLeftback.setPower(-.5);
        
        motorRight.setPower(-.5);
        motorRightback.setPower(-.5);
        
        
        
        sleep(2550);
        
        motorWheel.setPower(0);
        motorWheelred.setPower(0);
        motorLeft.setPower(0);
        motorLeftback.setPower(0);
        
        motorRight.setPower(0);
        motorRightback.setPower(0);
            
            
    }
    
        
    }
    
