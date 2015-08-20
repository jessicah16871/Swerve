package com.edinarobotics.swerve;

import com.edinarobotics.swerve.commands.GamepadDriveCommand;
import com.edinarobotics.utils.gamepad.GamepadNew;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

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

        GamepadNew gamepad = Controls.getInstance().gamepad;
        Components.getInstance().drivetrain.setDefaultCommand(new GamepadDriveCommand(gamepad));

    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void disabledInit() {
        stop();
    }

    public void testPeriodic() {

    }

    public void stop() {
        Components.getInstance().drivetrain.setDrivetrain(0, 0, 0);
    }

}
