package com.edinarobotics.swerve.subsystems;

import edu.wpi.first.wpilibj.CANTalon;

public class Drivetrain {

    private CANTalon topLeftDrive, topRightDrive, bottomLeftDrive, bottomRightDrive,
            topLeftSteer, topRightSteer, bottomLeftSteer, bottomRightSteer;

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

        this.topLeftDrive.changeControlMode(CANTalon.ControlMode.Voltage);
        this.topRightDrive.changeControlMode(CANTalon.ControlMode.Voltage);

    }


}
