package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "FalseShepherd (Blocks to Java)")
public class FalseShepherd extends LinearOpMode {

  private Servo right;

  /**
   * This function is executed when this OpMode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    right = hardwareMap.get(Servo.class, "right");

    // Put initialization blocks here.
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        // Put loop blocks here.
        right.setPosition((-gamepad1.right_stick_y + 1) / 2);
        telemetry.update();
      }
    }
  }
}
