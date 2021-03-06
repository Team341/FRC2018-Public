package missdaisy.commands;

import edu.wpi.first.wpilibj.command.Command;
import missdaisy.subsystems.Wrist;

/**
 *
 */
public class ResetWristEncoder extends Command {
  
    private Wrist mWrist;
  
    public ResetWristEncoder() {
        // Use requires() here to declare subsystem dependencies
        super("ResetWristEncoder");
        
        mWrist = Wrist.getInstance();
        
        // requires(mWrist);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
      mWrist.resetWristEncoder();
      mWrist.setDesiredWristAngle(0.0);
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
      mWrist.setDesiredWristAngle(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}
