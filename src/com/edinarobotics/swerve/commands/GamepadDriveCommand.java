package com.edinarobotics.swerve.commands;

import com.edinarobotics.swerve.Components;
import com.edinarobotics.swerve.subsystems.Drivetrain;
import com.edinarobotics.utils.gamepad.GamepadNew;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Copyright Elliott Olson (c) 2015. All Rights Reserved.
 * Any code contained within this document, and any associated APIs with similar brandings
 * are the sole property of Elliott Olson. Distribution, reproduction, taking snippits, or
 * claiming any contents as your own will break the terms of the license, and void any
 * agreements with you, the third party.
 */
public class GamepadDriveCommand extends Command {

    private Drivetrain drivetrain;
    private GamepadNew gamepad;

    public GamepadDriveCommand(GamepadNew gamepad){
        super("GamepadDriveCommand");
        this.gamepad = gamepad;
        drivetrain = Components.getInstance().drivetrain;
        requires(drivetrain);
    }

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        double rotation = gamepad.getRightJoystick().getX();
        double strafe = gamepad.getLeftJoystick().getX();
        double forward = gamepad.getLeftJoystick().getY();
        drivetrain.setDrivetrain(forward, strafe, rotation);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {

    }

    @Override
    protected void interrupted() {

    }
}
