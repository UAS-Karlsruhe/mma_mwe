package application;

import javax.inject.Inject;

//import backgroundTask.TEST_Background;

//import com.kuka.generated.ioAccess.ProfinetIOGroup;
import com.kuka.roboticsAPI.applicationModel.RoboticsAPIApplication;
import static com.kuka.roboticsAPI.motionModel.BasicMotions.*;

//import com.kuka.roboticsAPI.controllerModel.Controller;
import com.kuka.roboticsAPI.deviceModel.LBR;
//import java.util.concurrent.TimeUnit;
//import javax.inject.Inject;
import javax.inject.Named;
//import com.kuka.roboticsAPI.geometricModel.Frame;
//import com.kuka.roboticsAPI.geometricModel.ObjectFrame;
import com.kuka.roboticsAPI.geometricModel.Tool;
//import com.kuka.roboticsAPI.motionModel.Spline;

public class TestBraun extends RoboticsAPIApplication {
	@Inject
	public static LBR lBR_iiwa_7_R800_1;
//	private Controller kuka_Sunrise_Cabinet_1;
//	public ProfinetIOGroup profinetSPS;
	
	@Inject
	@Named ("Greifer")
	private Tool greifer;

	
	boolean W1_Host;
	boolean W2_Host;
	
	public static boolean StartTask=false;
	
	@Override
	public void initialize() {
		// initialize your application here
		lBR_iiwa_7_R800_1 = getContext().getDeviceFromType(LBR.class);
//		kuka_Sunrise_Cabinet_1 = getController("KUKA_Sunrise_Cabinet_1");
		//profinetSPS = new ProfinetIOGroup(kuka_Sunrise_Cabinet_1);
		
		greifer.attachTo(lBR_iiwa_7_R800_1.getFlange());
	}

	@Override
	public void run() {
		// your application execution starts here
		
		while(true){
			
			// D.Brauns Code goes here
			lBR_iiwa_7_R800_1.move(ptp(0, 0, 0, 0, 0, 0, 0).setJointVelocityRel(.4));
			
			
//			lBR_iiwa_7_R800_1.move(ptp(getApplicationData().getFrame("/FBand")).setJointVelocityRel(.6));

			
			lBR_iiwa_7_R800_1.move(ptp(0, 0, 0, 0, 0, 0, 0).setJointVelocityRel(.4));	
			
			
	//		lBR_iiwa_7_R800_1.move(ptp(getApplicationData().getFrame("/Foerderband")).setJointVelocityRel(.4) );
			
//			greifer.move( ptp(getApplicationData().getFrame("/PickBelt")).setJointVelocityRel(.1) );
			
			/*
			profinetSPS.setGreifer_oeffnen(false);
			profinetSPS.setGreifer_schliessen(true);
			
			lBR_iiwa_7_R800_1.move( ptp(0, Math.toRadians(15), 0, Math.toRadians(20), Math.toRadians(20), Math.toRadians(90), 0).setJointVelocityRel(.1));
		
			profinetSPS.setGreifer_schliessen(false);
			profinetSPS.setGreifer_oeffnen(true);
			*/

			
			
			
		//W1_Host = profinetSPS.getSick_W1_Host();	
		//W2_Host = profinetSPS.getSick_W2_Host();
			
	/*		
		// Greifer öffnen	
		profinetSPS.setGreifer_schliessen(false);
		profinetSPS.setGreifer_oeffnen(true);
		
		
		double Velocity=0.7;
		//if(profinetSPS.getSick_W2_Host()==false){Velocity=0.2;}
			
		//lBR_iiwa_7_R800_1.move(ptpHome());
		PTP ptpToTransportPosition1= ptp(0, Math.toRadians(15), 0, Math.toRadians(20), Math.toRadians(20), Math.toRadians(90), 0);
		ptpToTransportPosition1.setJointVelocityRel(TEST_Background.Velocity);
		lBR_iiwa_7_R800_1.move(ptpToTransportPosition1);
		
		
		// Greifer schließen
		profinetSPS.setGreifer_oeffnen(false);
		profinetSPS.setGreifer_schliessen(true);
		
		
		PTP ptpToTransportPosition2 = ptp(0, Math.toRadians(25), 0, Math.toRadians(90), 0, 0, 0);
		ptpToTransportPosition2.setJointVelocityRel(TEST_Background.Velocity);
		lBR_iiwa_7_R800_1.move(ptpToTransportPosition2); */
		}
	}
}