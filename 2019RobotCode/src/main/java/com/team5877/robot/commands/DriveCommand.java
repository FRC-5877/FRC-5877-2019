package com.team5877.robot.commands;

import com.team5877.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


public class DriveCommand extends Command {

    public DriveCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (Robot.oi.getJoy1RightBumper().get()) {
            Robot.drive.arcadeDrive(Robot.oi.getJoy1LeftStickYAxis(), Robot.oi.getJoy1RightStickXAxis());
        } else {
            Robot.drive.arcadeDrive(Robot.oi.getJoy1LeftStickYAxis() * .5, Robot.oi.getJoy1RightStickXAxis() * .5);
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
