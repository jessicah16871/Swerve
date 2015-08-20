package com.edinarobotics.swerve;

import com.edinarobotics.swerve.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.Gyro;

public class Components {

    private static Components instance;

    public Drivetrain drivetrain;
    public Gyro gyro;

    // CAN Constants

        // Drivetrain Constants
        private static final int TOP_LEFT_DRIVE_CANTALON = 3;
        private static final int TOP_RIGHT_DRIVE_CANTALON = 1;
        private static final int BOTTOM_LEFT_DRIVE_CANTALON = 2;
        private static final int BOTTOM_RIGHT_DRIVE_CANTALON = 5;
        // End Drivetrain Constants

        // Steerdrive Constants
        private static final int TOP_LEFT_STEER_CANTALON = 3;
        private static final int TOP_RIGHT_STEER_CANTALON = 1;
        private static final int BOTTOM_LEFT_STEER_CANTALON = 2;
        private static final int BOTTOM_RIGHT_STEER_CANTALON = 5;
        // End Steerdrive Constants

    // End CAN Constants

    private Components() {

        drivetrain = new Drivetrain(TOP_LEFT_DRIVE_CANTALON, TOP_RIGHT_DRIVE_CANTALON, BOTTOM_LEFT_DRIVE_CANTALON,
                BOTTOM_RIGHT_DRIVE_CANTALON, TOP_LEFT_STEER_CANTALON, TOP_RIGHT_STEER_CANTALON,
                BOTTOM_LEFT_STEER_CANTALON, BOTTOM_RIGHT_STEER_CANTALON);

    }


    /**
     * Returns the proper instance of Components. This method creates a new
     * Components object the first time it is called and returns that object for
     * each subsequent call.
     *
     * @return The current instance of Components.
     */
    public static Components getInstance(){
        if (instance == null){
            instance = new Components();
        }
        return instance;
    }

}
