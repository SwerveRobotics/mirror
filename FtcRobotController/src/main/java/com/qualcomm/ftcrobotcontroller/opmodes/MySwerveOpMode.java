package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 * Created by bob on 2016-09-04.
 */
public class MySwerveOpMode extends LinearOpMode
    {
    @Override public void runOpMode() throws InterruptedException
        {
        while (opModeIsActive())
            {
            waitOneFullHardwareCycle();
            }
        }
    }
