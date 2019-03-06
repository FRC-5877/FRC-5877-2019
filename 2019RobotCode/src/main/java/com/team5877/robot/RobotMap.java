/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package com.team5877.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static int rightMotor1 = 4;
	public static int rightMotor2 = 3;
	public static int leftMotor1 = 5;
	public static int leftMotor2 = 2;
	
	public static int clawMotor = 1;
	
	public static int rightIntakeMotor = 1;
	public static int leftIntakeMotor = 0;
}
