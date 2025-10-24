package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.robotcore.external.hardware.camera.Camera;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import java.util.List;
import org.opencv.core.Point;

@TeleOp
public class CameraTester extends LinearOpMode {

    @Override
    public void runOpMode()
    {
telemetry.addData("State", "starting");
telemetry.update();
        CameraColorSensor colorSensor = new CameraColorSensor ("Webcam", hardwareMap, this);
        
        // set up configuration parameters
        colorSensor.UsingWebcam = false;
        colorSensor.RegionTopLeft[0] = new Point(10, 198);
        colorSensor.RegionTopLeft[1] = new Point(210, 10);
        colorSensor.RegionTopLeft[2] = new Point(400, 50);
        colorSensor.RegionWidth = 200;
        colorSensor.RegionHeight = 120;

telemetry.addData("State", "waiting");
telemetry.update();
int count = 0;
        while (!colorSensor.isCameraInitialized()) {
            sleep(100);
telemetry.addData("Count", count++);
telemetry.update();
        }
telemetry.addData("State", "initialized");
telemetry.update();

int x = 20;
while (x < 20)
{
                // print any telemetry data from the camera
            List<CameraColorSensor.TelemetryData> telemetryList = colorSensor.getTelemetryData();
            for (CameraColorSensor.TelemetryData data : telemetryList)
            {
                telemetry.addData(data.caption, data.object);
            }
            telemetry.update();
            sleep(100);
}
        
        waitForStart();
        
        while (opModeIsActive())
        {
            CameraColorSensor.Color_Enum color = CameraColorSensor.Color_Enum.Color_None;
            
            if (colorSensor.isRegionGreen(0)) color = CameraColorSensor.Color_Enum.Color_Green;
            else if (colorSensor.isRegionYellow(0)) color = CameraColorSensor.Color_Enum.Color_Yellow;
            else if (colorSensor.isRegionRed(0)) color = CameraColorSensor.Color_Enum.Color_Red;
            else if (colorSensor.isRegionBlue(0)) color = CameraColorSensor.Color_Enum.Color_Blue;
            else color = CameraColorSensor.Color_Enum.Color_None;
            
            telemetry.addData("Region 0", color);

            if (colorSensor.isRegionGreen(1)) color = CameraColorSensor.Color_Enum.Color_Green;
            else if (colorSensor.isRegionYellow(1)) color = CameraColorSensor.Color_Enum.Color_Yellow;
            else if (colorSensor.isRegionRed(1)) color = CameraColorSensor.Color_Enum.Color_Red;
            else if (colorSensor.isRegionBlue(1)) color = CameraColorSensor.Color_Enum.Color_Blue;
            else color = CameraColorSensor.Color_Enum.Color_None;
            
            telemetry.addData("Region 1", color);

            if (colorSensor.isRegionGreen(2)) color = CameraColorSensor.Color_Enum.Color_Green;
            else if (colorSensor.isRegionYellow(2)) color = CameraColorSensor.Color_Enum.Color_Yellow;
            else if (colorSensor.isRegionRed(2)) color = CameraColorSensor.Color_Enum.Color_Red;
            else if (colorSensor.isRegionBlue(2)) color = CameraColorSensor.Color_Enum.Color_Blue;
            else color = CameraColorSensor.Color_Enum.Color_None;
            
            telemetry.addData("Region 2", color);

            // print any telemetry data from the camera
            List<CameraColorSensor.TelemetryData> telemetryList = colorSensor.getTelemetryData();
            for (CameraColorSensor.TelemetryData data : telemetryList)
            {
                telemetry.addData(data.caption, data.object);
            }
            telemetry.update();
            sleep(100);
        }
    }
}
