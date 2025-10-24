package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "TestWheels3 (Blocks to Java)")
public class TestWheels3 extends LinearOpMode {

  private DcMotor left_wheel;
  private DcMotor left_wheelback;
  private DcMotor right_wheel;
  private DcMotor right_wheelback;

  /**
   * This function is executed when this OpMode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    float vert;
    float horz;
    float spin;

    left_wheel = hardwareMap.get(DcMotor.class, "left_wheel");
    left_wheelback = hardwareMap.get(DcMotor.class, "left_wheel back");
    right_wheel = hardwareMap.get(DcMotor.class, "right_wheel");
    right_wheelback = hardwareMap.get(DcMotor.class, "right_wheel back");

    // Put initialization blocks here.
    waitForStart();
    if (opModeIsActive()) {
      left_wheel.setDirection(DcMotor.Direction.REVERSE);
      left_wheelback.setDirection(DcMotor.Direction.REVERSE);
      while (opModeIsActive()) {
        // Put loop blocks here.
        telemetry.update();
        vert = gamepad1.left_stick_y;
        horz = gamepad1.left_stick_x;
        spin = gamepad1.right_stick_x;
        left_wheel.setPower(-vert + spin + horz);
        left_wheelback.setPower(vert + (spin - horz));
        right_wheel.setPower(-vert - (spin - horz));
        right_wheelback.setPower(vert - (spin + horz));
        // Put run blocks here.
      }
    }
  }
}
