/*package background;


import javax.inject.Inject;
import java.util.concurrent.TimeUnit;

import com.kuka.generated.ioAccess.ProfinetIOGroup;
import com.kuka.roboticsAPI.applicationModel.tasks.CycleBehavior;
import com.kuka.roboticsAPI.applicationModel.tasks.RoboticsAPICyclicBackgroundTask;
import com.kuka.roboticsAPI.controllerModel.Controller;
import com.kuka.roboticsAPI.deviceModel.LBR;

import Applikation.PickAndPlace;
import Applikation.TEST;
import javax.inject.Inject;
import com.kuka.roboticsAPI.geometricModel.Frame;
//import javax.inject.Named;



public class TEST_Background extends RoboticsAPICyclicBackgroundTask {
	@Inject
	Controller kUKA_Sunrise_Cabinet_1;

	public static LBR lBR_iiwa_7_R800_1;
	private Controller kuka_Sunrise_Cabinet_1;
	public ProfinetIOGroup profinetSPS;
	
	public static double Velocity=0.5;
	
	@Override
	public void initialize() {
		// initialize your task here
		initializeCyclic(0, 500, TimeUnit.MILLISECONDS,
				CycleBehavior.BestEffort);
		lBR_iiwa_7_R800_1 = getContext().getDeviceFromType(LBR.class);
		kuka_Sunrise_Cabinet_1 = getController("KUKA_Sunrise_Cabinet_1");
		profinetSPS = new ProfinetIOGroup(kuka_Sunrise_Cabinet_1);
	}

	@Override
	public void runCyclic() {
		// your task execution starts here
		Velocity=0.7;
		
		
		boolean W2_Host_BG=profinetSPS.getSick_W2_Host();
		if(W2_Host_BG==false){Velocity=0.4;}
		
		boolean W1_Host_BG=profinetSPS.getSick_W1_Host();
		if(W1_Host_BG==false){Velocity=0.1;}
		
//		if(TEST.StartTask == true){
//			boolean W1_Host_BG=profinetSPS.getSick_W1_Host();
//			if(W1_Host_BG==false){Velocity=0.1;}
//			
//			boolean W2_Host_BG=profinetSPS.getSick_W2_Host();
//			if(W2_Host_BG==false){Velocity=0.3;}
//		}
		
	}
}

*/
