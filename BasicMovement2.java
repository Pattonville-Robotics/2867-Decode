package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class BasicMovement2 extends LinearOpMode{
    @Override
    public void runOpMode() throws InterruptedException {

        DcMotor motorRight = hardwareMap.dcMotor.get("motorRight"); //
        DcMotor motorRightback = hardwareMap.dcMotor.get("motorRightback");   //
        DcMotor motorLeft = hardwareMap.dcMotor.get("motorLeft"); //
        DcMotor motorLeftback = hardwareMap.dcMotor.get("motorLeftback");   //
        DcMotor motorWheel = hardwareMap.get(DcMotor.class, "motorWheel");  //
        DcMotor motorWheelred = hardwareMap.get(DcMotor.class, "motorWheelred");
        
        

        motorLeft.setDirection(DcMotor.Direction.REVERSE);
        motorLeftback.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();
        //Stick power
        while (opModeIsActive()) {
            double y = -gamepad1.left_stick_y; // Remember, this is reversed!
            double x = gamepad1.left_stick_x * 1.1; // Counteract imperfect strafing
            double rx = gamepad1.right_stick_x;
            
            //Maths
            double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
            double LeftPower = (Math.pow((y + x + rx), 3) * 0.8) / denominator;
            double LeftbackPower = (Math.pow((y - x + rx), 3) * 0.8) / denominator;
            double RightPower = (Math.pow((y - x - rx), 3) * 0.8) / denominator;
            double RightbackPower = (Math.pow((y + x - rx), 3) * 0.8) / denominator;

            motorLeft.setPower(LeftPower);
            motorLeftback.setPower(LeftbackPower);
            motorRight.setPower(RightPower);
            motorRightback.setPower(RightbackPower);
            
             //intake
            if (gamepad1.right_trigger>0){
                motorWheel.setPower(-.5);
                motorWheelred.setPower(.5);
            }
            else if (gamepad1.right_trigger ==0){
                 motorWheel.setPower(0);
                 motorWheelred.setPower(0);
            }
            
            //output
            if (gamepad1.left_trigger>0){
                motorWheel.setPower(1);
                motorWheelred.setPower(-.5);
            }
            else if (gamepad1.left_trigger ==0){
                 motorWheel.setPower(0);
                  motorWheelred.setPower(0);
            }
            
            
            
        }
        }
    }