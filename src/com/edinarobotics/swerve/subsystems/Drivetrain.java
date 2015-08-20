package com.edinarobotics.swerve.subsystems;

import com.edinarobotics.utils.subsystems.Subsystem1816;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Command;

public class Drivetrain extends Subsystem1816 {

    private SwerveDrive swerveDrive;

    private CANTalon topLeftDrive, topRightDrive, bottomLeftDrive, bottomRightDrive,
            topLeftSteer, topRightSteer, bottomLeftSteer, bottomRightSteer;
    private double forward, strafe, rotation;

    public Drivetrain(int topLeftDrive, int topRightDrive, int bottomLeftDrive, int bottomRightDrive,
                      int topLeftSteer, int topRightSteer, int bottomLeftSteer, int bottomRightSteer){

        this.topLeftDrive = new CANTalon(topLeftDrive);
        this.topRightDrive = new CANTalon(topRightDrive);
        this.bottomLeftDrive = new CANTalon(bottomLeftDrive);
        this.bottomRightDrive = new CANTalon(bottomRightDrive);
        this.topLeftSteer = new CANTalon(topLeftSteer);
        this.topRightSteer = new CANTalon(topRightSteer);
        this.bottomLeftSteer = new CANTalon(bottomLeftSteer);
        this.bottomRightSteer = new CANTalon(bottomRightSteer);

        this.topLeftDrive.changeControlMode(CANTalon.ControlMode.PercentVbus);
        this.topRightDrive.changeControlMode(CANTalon.ControlMode.PercentVbus);
        this.bottomLeftDrive.changeControlMode(CANTalon.ControlMode.PercentVbus);
        this.bottomRightDrive.changeControlMode(CANTalon.ControlMode.PercentVbus);

        swerveDrive = new SwerveDrive();

    }

    public void setDrivetrain(double forward, double strafe, double rotation){
        this.forward = forward;
        this.strafe = strafe;
        this.rotation = rotation;
        update();
    }

    @Override
    public void update() {
        swerveDrive.drive(forward, strafe, rotation);
    }

    public void setDefaultCommand(Command command){
        if(getDefaultCommand() != null){
            super.getDefaultCommand().cancel();
        }
        super.setDefaultCommand(command);
    }

    public void setForward(double forward) {
        this.forward = forward;
    }

    public void setStrafe(double strafe) {
        this.strafe = strafe;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }
}
