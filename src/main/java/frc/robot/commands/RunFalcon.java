/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.FalconSubsystem;
import frc.robot.subsystems.SparkSubsystem;

public class RunFalcon extends CommandBase {
  FalconSubsystem motor;
  DoubleSupplier power;
  JoystickButton run;

  /**
   * Creates a new RunSpark.
   */
  public RunFalcon(FalconSubsystem motor, DoubleSupplier power, JoystickButton run) {

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(motor);
    this.motor = motor;
    this.power = power;
    this.run = run;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(run.get()) {
		  double pow = power.getAsDouble();
      motor.set(pow);
      SmartDashboard.putNumber("falcon set power", pow);
      SmartDashboard.putNumber("falcon out voltage", motor.getMotor().getBusVoltage());
      SmartDashboard.putNumber("falcon out current", motor.getMotor().getStatorCurrent());

	  }
	  else {
		  motor.set(0.0);
	  }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}