package net.kdt.pojavlaunch.customcontrols;

public class ControlJoystickData extends ControlData {

    /* Whether the joystick can stay forward */
    public boolean forwardLock = false;
    /*
     * Whether the finger tracking is absolute (joystick jumps to where you touched)
     * or relative (joystick stays in the center)
     */
    public boolean absolute = false;

    /* Key to press when joystick is fully pushed, -1 means disabled */
    public int fullPushKey = -1;

    /* Joystick strength threshold to trigger full push action (0-100) */
    public int fullPushThreshold = 85;

    public ControlJoystickData(){
        super();
    }

    public ControlJoystickData(ControlJoystickData properties) {
        super(properties);
        forwardLock = properties.forwardLock;
        absolute = properties.absolute;
	fullPushKey = properties.fullPushKey;
	fullPushThreshold = properties.fullPushThreshold;
   }
}
