// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class ArmSystemConstants {
    // Units are shows between <>
    // Gearbox ratio of arm motor <unitless>
    public static final int kArmGearBoxRatio = 100;

    public static final double kP = 0.03;

    // The arm rotates from 0 upto 120 degrees
    // Calculate arm rotation distance in rotations <rotations> 
    public static final double kArmRotationDistance = 125.0/360.0;

    // Set position ranges to rotate arm
    // Note:  Hard stop is at zero postion  
    public static final double kMaxPosition = kArmRotationDistance * kArmGearBoxRatio;
    public static final double kMinPosition = 0;

    public static final double kLiftPosition = 45.0/360.0 * kArmGearBoxRatio;

    // Set initial arm increment
    public static final double kArmIncrement = 10.0 / 360.0 * kArmGearBoxRatio;
    
    // Time takes arm to rotate through range <seconds> 
    public static final double kArmRotationTime = 3.0;
    // Arm revolutions per minute = rotation time / ( 60 * rotation range) <rpm>
    // Note:  even though arm does not rotate one full rotation we need to
    //         include it in calculation since we are calculating revolutions per minute
    public static final double kArmRpm = kArmRotationDistance/kArmRotationTime * 60; //2000.0/kArmGearBoxRatio; // kArmRotationTime / ( 60 * kArmRotationDistance) ;
    // The motor is on the other side of the gear box and runs faster than the arm
    // To calculate motor rpm multiple the arm rpm by the gearbox ratios <rpm>
    public static final double kMotorRpm = kArmRpm * kArmGearBoxRatio;
    public static final double kMotorRpmAcc = kMotorRpm/60;

    public static final int kCANidMotor = 15;
    
  }
}
