package com.edinarobotics.swerve;

import com.edinarobotics.utils.gamepad.FilteredGamepad;
import com.edinarobotics.utils.gamepad.GamepadNew;
import com.edinarobotics.utils.gamepad.gamepadfilters.DeadzoneFilter;
import com.edinarobotics.utils.gamepad.gamepadfilters.GamepadFilter;
import com.edinarobotics.utils.gamepad.gamepadfilters.GamepadFilterSet;
import com.edinarobotics.utils.gamepad.gamepadfilters.PowerFilter;

import java.util.ArrayList;
import java.util.List;

public class Controls {

    private static Controls instance;

    public final GamepadNew gamepad;

    private Controls(){

        List<GamepadFilter> gamepadFilters = new ArrayList<GamepadFilter>();
        gamepadFilters.add(new DeadzoneFilter(0.1));
        gamepadFilters.add(new PowerFilter(1));
        GamepadFilterSet driveGamepadFilterSet = new GamepadFilterSet(gamepadFilters);
        gamepad = new FilteredGamepad(0, driveGamepadFilterSet);

        //Add buttons in the future if necessary

    }

    /**
     * Returns the proper instance of Controls. This method creates a new
     * Controls object the first time it is called and returns that object for
     * each subsequent call.
     *
     * @return The current instance of Controls.
     */
    public static Controls getInstance(){
        if (instance == null){
            instance = new Controls();
        }
        return instance;
    }

}
