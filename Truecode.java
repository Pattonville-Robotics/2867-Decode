package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import org.firstinspires.ftc.robotcore.external.JavaUtil;

@TeleOp(name = "Truecode (Blocks to Java)")
public class Truecode extends LinearOpMode {

  private DcMotor right_wheel;
  private DcMotor right_wheelback;
  private DcMotor left_wheel;
  private DcMotor left_wheelback;
  private Servo left;
  private Servo right;

  /**
   * This function is executed when this OpMode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    right_wheel = hardwareMap.get(DcMotor.class, "right_wheel");
    right_wheelback = hardwareMap.get(DcMotor.class, "right_wheelback");
    left_wheel = hardwareMap.get(DcMotor.class, "left_wheel");
    left_wheelback = hardwareMap.get(DcMotor.class, "left_wheelback");
    left = hardwareMap.get(Servo.class, "left");
    right = hardwareMap.get(Servo.class, "right");

    // Put initialization blocks here.
    waitForStart();
  }
}
