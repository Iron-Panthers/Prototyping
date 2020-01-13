/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.SRXSubsystem;

public class RunSRX extends CommandBase {
	private final SRXSubsystem motor;
	private final DoubleSupplier power;
	private final JoystickButton run;

  /**
   * Creates a new RunSRX.
   */
  public RunSRX(SRXSubsystem motor, DoubleSupplier power, JoystickButton run) {
	addRequirements(motor);
	this.motor = motor;
	this.power = power;
	this.run = run;

    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
	  if(run.get()) {
		  motor.set(power.getAsDouble());
	  }
	  else {
		  motor.set(0.0);
	  }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
	motor.set(0.0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
