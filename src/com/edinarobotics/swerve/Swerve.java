package com.edinarobotics.swerve;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Swerve extends IterativeRobot {

    public void robobtInIt(){

        Controls.getInstance();
        Components.getInstance();

    }

    @Override
    public void autonomousInit() {

    }

    @Override
    public void autonomousPeriodic() {

    }

    @Override
    public void teleopInit() {

    }

    public void teleopPeriodic() {

    }

    @Override
    public void disabledInit() {
        stop();
    }

    public void testPeriodic() {

    }

    public void stop() {

    }

}
