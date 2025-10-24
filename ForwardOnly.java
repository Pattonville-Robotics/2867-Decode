// package org.firstinspires.ftc.teamcode;
// 
// import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import com.qualcomm.robotcore.hardware.DcMotor;
// 
// @Autonomous(name = "ForwardOnly (Blocks to Java)")
// public class ForwardOnly extends LinearOpMode {
// 
//   private DcMotor right_drive;
//   private DcMotor spin1;
// 
//   /**
//    * This function is executed when this OpMode is selected from the Driver Station.
//    */
//   @Override
//   public void runOpMode() {
//     right_drive = hardwareMap.get(DcMotor.class, "right_drive");
//     spin1 = hardwareMap.get(DcMotor.class, "spin1");
// 
//     // Put initialization blocks here.
//     right_drive.setDirection(DcMotor.Direction.REVERSE);
//     spin1.setDirection(DcMotor.Direction.REVERSE);
//     waitForStart();
//     if (opModeIsActive()) {
//       // Put run blocks here.
//       while (opModeIsActive()) {
//         // Put loop blocks here.
//         spin1.setPower(1);
//         right_drive.setPower(1);
//         sleep(2000);
//         requestOpModeStop();
//       }
//     }
//   }
// }
// 