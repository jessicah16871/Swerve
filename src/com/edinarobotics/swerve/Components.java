package com.edinarobotics.swerve;

import edu.wpi.first.wpilibj.Gyro;

public class Components {

    private static Components instance;

    public Gyro gyro;

    private Components(){



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
