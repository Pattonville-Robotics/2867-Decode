package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "TestWheels (Blocks to Java)")
public class TestWheels extends LinearOpMode {

  private DcMotor right_wheel;
  private DcMotor right_wheelback;
  private DcMotor left_wheel;

  /**
   * This function is executed when this OpMode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    float vert;
    float horz;
    float spin;

    right_wheel = hardwareMap.get(DcMotor.class, "right_wheel");
    right_wheelback = hardwareMap.get(DcMotor.class, "right_wheel back");
    left_wheel = hardwareMap.get(DcMotor.class, "left_wheel");

    // Put initialization blocks here.
    waitForStart();
    if (opModeIsActive()) {
      right_wheel.setDirection(DcMotor.Direction.REVERSE);
      right_wheelback.setDirection(DcMotor.Direction.REVERSE);
      while (opModeIsActive()) {
        // Put loop blocks here.
        telemetry.update();
        vert = -gamepad1.left_stick_y;
        horz = gamepad1.left_stick_x;
        spin = gamepad1.right_stick_x;
        left_wheel.setPower(vert);
        // Put run blocks here.
      }
    }
  }
}
