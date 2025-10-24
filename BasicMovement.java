package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
@TeleOp
public class BasicMovement extends LinearOpMode {
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
        
        telemetry.addData("y", gamepad1.left_stick_y);
        while(opModeIsActive()){
            motorLeft.setPower(Range.clip(gamepad1.left_stick_y,-1,1));
            motorLeftback.setPower(Range.clip(gamepad1.left_stick_y,-1,1));
            motorRight.setPower(Range.clip(gamepad1.left_stick_y,-1,1));
            motorRightback.setPower(Range.clip(gamepad1.left_stick_y,-1,1));
            
            double leftPower=0;
            double rightPower=0;
            double leftPowerback=0;
            double rightPowerback=0;
            
            
            //Strayfing RIGHT
            if (gamepad1.left_stick_x>0){
                leftPower+=(-1);
                leftPowerback+=(1);
                rightPower+=(1);
                rightPowerback+=(-1);
            }
            if (gamepad1.left_stick_x==0){
                 leftPower+=(0);
                leftPowerback+=(0);
                rightPower+=(0);
                rightPowerback+=(0);
            }
            /* if (gamepad1.left_stick_x>0 & gamepad1.left_stick_y<0){
                 motorLeft.setPower(-1);
                 motorLeftback.setPower(-1);
                 motorRight.setPower(-1);
                 motorRightback.setPower(-1);
             }
            */
            //Strayfing LEFT
            if (gamepad1.left_stick_x<0){
                leftPower+=(1);
                leftPowerback+=(1);
                rightPower+=(-1);
                rightPowerback+=(-1);
            }
            if (gamepad1.left_stick_x==0){
                 leftPower+=(0);
                leftPowerback+=(0);
                rightPower+=(0);
                rightPowerback+=(0);
            }
            //forward
            if (gamepad1.left_stick_y<0){
                leftPower+=(-1);
                leftPowerback+=(-1);
                rightPower+=(-1);
                rightPowerback+=(-1);
            }
            if (gamepad1.left_stick_y==0){
               leftPower+=(0);
                leftPowerback+=(0);
                rightPower+=(0);
                rightPowerback+=(0);
            }  
            //Backwards
            if (gamepad1.left_stick_y>0){
               leftPower+=(1);
                leftPowerback+=(1);
                rightPower+=(1);
                rightPowerback+=(1);
            }
            if (gamepad1.left_stick_y==0){
               leftPower+=(0);
                leftPowerback+=(0);
                rightPower+=(0);
                rightPowerback+=(0);
            }
            
            //turn wheel
            if (gamepad1.right_trigger>0){
                motorWheel.setPower(-1);
            }
            if (gamepad1.right_trigger ==0){
                 motorWheel.setPower(0);
            }
            if (gamepad1.left_trigger>0){
                motorWheel.setPower(1);
            }
            if (gamepad1.left_trigger ==0){
                 motorWheel.setPower(0);
            }
          
            //turn left
            if (gamepad1.right_stick_x<0){
                leftPower+=(1);
                leftPowerback+=(1);
                rightPower+=(-1);
                rightPowerback+=(-1);
            }
            if (gamepad1.right_stick_x==0){
                 leftPower+=(0);
                leftPowerback+=(0);
                rightPower+=(0);
                rightPowerback+=(0);
            }
            
            //turn right
            if (gamepad1.right_stick_x>0){
                leftPower+=(-1);
                leftPowerback+=(-1);
                rightPower+=(1);
                rightPowerback+=(1);
            }
            if (gamepad1.right_stick_x==0){
                leftPower+=(0);
                leftPowerback+=(0);
                rightPower+=(0);
                rightPowerback+=(0);
            }
            
            motorLeft.setPower(leftPower);
            motorRight.setPower(rightPower);
            motorLeftback.setPower(leftPowerback);
            motorRightback.setPower(leftPowerback);
    }
    
        }}  
    
    
    