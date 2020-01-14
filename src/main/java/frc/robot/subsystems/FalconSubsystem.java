/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Ports;

public class FalconSubsystem extends SubsystemBase {

  private final TalonFX falcon;

  /**
   * Creates a new FalconSubsystem.
   */
  public FalconSubsystem() {
    falcon = new TalonFX(Ports.kCANFALCON1);
    falcon.configFactoryDefault();

  }

  public void set(double power) {
    falcon.set(TalonFXControlMode.PercentOutput, power);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public TalonFX getMotor() {
    return falcon;
  }
}
