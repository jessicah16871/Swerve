package com.edinarobotics.swerve.subsystems;

import com.edinarobotics.swerve.Components;
import edu.wpi.first.wpilibj.Gyro;

public class SwerveDrive {

    private final double WHEELBASE = 12;
    private final double TRACKWIDTH = 12;

    private double fwd;
    private double str;
    private double r;

    private static final Gyro gyro = Components.getInstance().gyro;

    public void drive(double forward, double strafe, double rotation){

        double fwd = (forward * Math.cos(gyro.getAngle())) + strafe * Math.sin(gyro.getAngle());
        double str = (-forward*Math.sin(gyro.getAngle())) + strafe*Math.cos(gyro.getAngle());

        double r = Math.sqrt((WHEELBASE * WHEELBASE) + (TRACKWIDTH * TRACKWIDTH));



    }


}
