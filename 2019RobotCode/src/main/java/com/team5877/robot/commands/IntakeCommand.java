package com.team5877.robot.commands;

import com.team5877.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


public class IntakeCommand extends Command {

    public IntakeCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.oi.getJoy2RightTrigger() != 0) {
        	Robot.intake.spinBoxClockwise();
    	} else if (Robot.oi.getJoy2LeftTrigger() != 0) {
    		Robot.intake.spinBoxCounterClockwise();
    	} else if (Robot.oi.getJoy2RightBumper().get()) {
    		Robot.intake.intakeBox(.5);;
    	} else if (Robot.oi.getJoy2LeftBumper().get()) {
            Robot.intake.intakeBox(-.5);
        } else if (Robot.oi.getJoy2ButtonA().get()) {
            Robot.intake.intakeBox(-.3);
        } else {
            Robot.intake.stopIntake();
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
