package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import org.firstinspires.ftc.robotcore.external.JavaUtil;

@TeleOp(name = "Truecode25 (Blocks to Java)")
public class Truecode25 extends LinearOpMode {

  private DcMotor right_wheelback;
  private DcMotor right_wheel;
  private Servo right;
  private DcMotor left_wheel;
  private DcMotor left_wheelback;
  private Servo left;
  private DcMotor arm;

  /**
   * This function is executed when this OpMode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    float vertical;
    double horzontal;
    float pivot;
    double dimonamater;

    right_wheelback = hardwareMap.get(DcMotor.class, "right_wheelback");
    right_wheel = hardwareMap.get(DcMotor.class, "right_wheel");
    right = hardwareMap.get(Servo.class, "right");
    left_wheel = hardwareMap.get(DcMotor.class, "left_wheel");
    left_wheelback = hardwareMap.get(DcMotor.class, "left_wheelback");
    left = hardwareMap.get(Servo.class, "left");
    arm = hardwareMap.get(DcMotor.class, "arm");

    // Put initialization blocks here.
    right_wheelback.setDirection(DcMotor.Direction.REVERSE);
    right_wheel.setDirection(DcMotor.Direction.REVERSE);
    right.setDirection(Servo.Direction.REVERSE);
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        // Put loop blocks here.
        vertical = -gamepad1.left_stick_y;
        horzontal = gamepad1.left_stick_x * 1.1;
        pivot = gamepad1.right_stick_x;
        dimonamater = JavaUtil.maxOfList(JavaUtil.createListWith(1, Math.abs(vertical) + Math.abs(horzontal) + Math.abs(pivot)));
        right_wheel.setPower((vertical - (pivot - horzontal)) / dimonamater);
        left_wheel.setPower((vertical + pivot + horzontal) / dimonamater);
        right_wheelback.setPower((vertical - (pivot - horzontal)) / dimonamater);
        left_wheelback.setPower((vertical + pivot + horzontal) / dimonamater);
        left.setPosition((gamepad2.left_stick_y + 1) / 2);
        right.setPosition(left.getPosition());
        arm.setPower(gamepad2.right_stick_y / 2);
        telemetry.update();
      }
    }
  }
}
