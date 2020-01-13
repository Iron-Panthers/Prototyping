/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * Ports contains all IDs on the robot. While similar to constants in theory, it
 * should ONLY contain the hardware/firmware level IDs for electronic components
 * of the robot (CAN bus ids, PCM ids, etc.).
 */
public final class Ports {

    private Ports() {
        /* disallow construction of this class */
        throw new UnsupportedOperationException("don't try to construct an instance of Ports");
    }

    // public static final int kMyPort = 1;

    public static final int kCANSRX1 = 1;

}
