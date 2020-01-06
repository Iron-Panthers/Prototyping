/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SRXSubsystem extends SubsystemBase {

  /**
   * Creates a new SRXSubsystem.
   */
  public SRXSubsystem() {
	  private final TalonSRX srx = new TalonSRX(Ports.kCANSRX1);

  }

  public void set(double power) {
	  srx.set(ControlMode.PercentOutput, power);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
