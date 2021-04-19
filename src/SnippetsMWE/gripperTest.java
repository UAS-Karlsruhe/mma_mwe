package SnippetsMWE;


import javax.inject.Inject;
import javax.inject.Named;

import com.kuka.common.ThreadUtil;
import com.kuka.generated.ioAccess.GripperIOGroup;
import com.kuka.roboticsAPI.applicationModel.RoboticsAPIApplication;
import static com.kuka.roboticsAPI.motionModel.BasicMotions.*;
import com.kuka.roboticsAPI.deviceModel.LBR;
import com.kuka.roboticsAPI.geometricModel.Tool;
import com.sun.org.apache.xalan.internal.lib.Extensions;

/**
 * Implementation of a robot application.
 * <p>
 * The application provides a {@link RoboticsAPITask#initialize()} and a 
 * {@link RoboticsAPITask#run()} method, which will be called successively in 
 * the application lifecycle. The application will terminate automatically after 
 * the {@link RoboticsAPITask#run()} method has finished or after stopping the 
 * task. The {@link RoboticsAPITask#dispose()} method will be called, even if an 
 * exception is thrown during initialization or run. 
 * <p>
 * <b>It is imperative to call <code>super.dispose()</code> when overriding the 
 * {@link RoboticsAPITask#dispose()} method.</b> 
 * 
 * @see UseRoboticsAPIContext
 * @see #initialize()
 * @see #run()
 * @see #dispose()
 */
public class gripperTest extends RoboticsAPIApplication {
	@Inject
	private LBR lBR_iiwa_7_R800_1;
	@Inject
	public GripperIOGroup gripper;
	
	
	
	@Override
	public void initialize() {
		// initialize your application here
	}

	@Override
	public void run() {
		// your application execution starts here
		lBR_iiwa_7_R800_1.move(ptpHome());
		//gripper.getSetClose() = 1;
		gripper.setSetOpen(false);
		gripper.setSetClose(true);
		ThreadUtil.milliSleep(2000);
		gripper.setSetOpen(true);
		gripper.setSetClose(false);

		
	}
}