/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Ports;

public class SparkSubsystem extends SubsystemBase {

  private final CANSparkMax spark;

  /**
   * Creates a new SparkSubsystem.
   */
  public SparkSubsystem() {
    spark = new CANSparkMax(Ports.kCANSPARK1, MotorType.kBrushless);

  }

  public void set(double power) {
    spark.set(power);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public CANSparkMax getMotor() {
    return spark;
  }
}
