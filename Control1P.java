// package org.firstinspires.ftc.teamcode;
// 
// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
// import com.qualcomm.robotcore.hardware.DcMotor;
// 
// @TeleOp(name = "Control1P (Blocks to Java)")
// public class Control1P extends LinearOpMode {
// 
//   private DcMotor right_drive;
//   private DcMotor spin1;
//   private DcMotor left_drive;
// 
//   /**
//    * This function is executed when this OpMode is selected from the Driver Station.
//    */
//   @Override
//   public void runOpMode() {
//     right_drive = hardwareMap.get(DcMotor.class, "right_drive");
//     spin1 = hardwareMap.get(DcMotor.class, "spin1");
//     left_drive = hardwareMap.get(DcMotor.class, "left_drive");
// 
//     // Reverse one of the drive motors.
//     if (opModeIsActive()) {
//       // Put run blocks here.
//     }
//     // You will have to determine which motor to reverse for your robot.
//     // In this example, the right motor was reversed so that positive
//     // applied power makes it move the robot in the forward direction.
//     right_drive.setDirection(DcMotor.Direction.REVERSE);
//     // You will have to determine which motor to reverse for your robot.
//     // In this example, the right motor was reversed so that positive
//     // applied power makes it move the robot in the forward direction.
//     spin1.setDirection(DcMotor.Direction.REVERSE);
//     waitForStart();
//     while (opModeIsActive()) {
//       // Put loop blocks here.
//       // The Y axis of a joystick ranges from -1 in its topmost position to +1 in its bottommost position.
//       // We negate this value so that the topmost position corresponds to maximum forward power.
//       spin1.setPower(-gamepad1.left_stick_y);
//       right_drive.setPower(-gamepad1.left_stick_y);
//       // The Y axis of a joystick ranges from -1 in its topmost position to +1 in its bottommost position.
//       // We negate this value so that the topmost position corresponds to maximum forward power.
//       spin1.setPower(gamepad1.left_stick_x);
//       right_drive.setPower(-1 * gamepad1.left_stick_x);
//       if (gamepad1.dpad_up) {
//         left_drive.setTargetPosition(83);
//         left_drive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//         left_drive.setPower(0.5);
//       } else if (gamepad1.dpad_down) {
//         left_drive.setTargetPosition(-83);
//         left_drive.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//         left_drive.setPower(-0.2);
//       } else {
//         left_drive.setPower(0);
//       }
//     }
//   }
// }
// 