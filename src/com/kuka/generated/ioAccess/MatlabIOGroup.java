package com.kuka.generated.ioAccess;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.kuka.roboticsAPI.controllerModel.Controller;
import com.kuka.roboticsAPI.ioModel.AbstractIOGroup;
import com.kuka.roboticsAPI.ioModel.IOTypes;

/**
 * Automatically generated class to abstract I/O access to I/O group <b>Matlab</b>.<br>
 * <i>Please, do not modify!</i>
 * <p>
 * <b>I/O group description:</b><br>
 * tast

 */
@Singleton
public class MatlabIOGroup extends AbstractIOGroup
{
	/**
	 * Constructor to create an instance of class 'Matlab'.<br>
	 * <i>This constructor is automatically generated. Please, do not modify!</i>
	 *
	 * @param controller
	 *            the controller, which has access to the I/O group 'Matlab'
	 */
	@Inject
	public MatlabIOGroup(Controller controller)
	{
		super(controller, "Matlab");

		addInput("Offset_Teil_mm_Y_Richtung", IOTypes.UNSIGNED_INTEGER, 1);
		addMockedInput("Winkel_Teil_Deg", IOTypes.UNSIGNED_INTEGER, 1, 0);
		addInput("Geschwindigkeit_Foerderband", IOTypes.UNSIGNED_INTEGER, 1);
		addInput("Offset_Teil_mm_X_Richtung", IOTypes.UNSIGNED_INTEGER, 1);
	}

	/**
	 * Gets the value of the <b>digital input '<i>Offset_Teil_mm_Y_Richtung</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [0; 1]
	 *
	 * @return current value of the digital input 'Offset_Teil_mm_Y_Richtung'
	 */
	public java.lang.Integer getOffset_Teil_mm_Y_Richtung()
	{
		return getNumberIOValue("Offset_Teil_mm_Y_Richtung", false).intValue();
	}

	/**
	 * Gets the value of the <b>digital input '<i>Winkel_Teil_Deg</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [0; 1]
	 *
	 * @return current value of the digital input 'Winkel_Teil_Deg'
	* 
	 * @deprecated The output 'Winkel_Teil_Deg' has not been assigned to a field bus address - thus this operation will be <b>simulated</b> only.
	 */
	@Deprecated
	public java.lang.Integer getWinkel_Teil_Deg()
	{
		return getNumberIOValue("Winkel_Teil_Deg", false).intValue();
	}

	/**
	 * Sets the value of the <b>mocked digital input '<i>Winkel_Teil_Deg</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [0; 1]
	 *
	 * @param value
	 *            the value, which has to be written to the mocked digital input 'Winkel_Teil_Deg'
	* 
	 * @deprecated The output 'Winkel_Teil_Deg' has not been assigned to a field bus address - thus this operation will be <b>simulated</b> only.
	 */
	@Deprecated
	public void setMockedWinkel_Teil_DegValue(java.lang.Integer value)
	{
		setMockedInput("Winkel_Teil_Deg", value);
	}

	/**
	 * Gets the value of the <b>digital input '<i>Geschwindigkeit_Foerderband</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [0; 1]
	 *
	 * @return current value of the digital input 'Geschwindigkeit_Foerderband'
	 */
	public java.lang.Integer getGeschwindigkeit_Foerderband()
	{
		return getNumberIOValue("Geschwindigkeit_Foerderband", false).intValue();
	}

	/**
	 * Gets the value of the <b>digital input '<i>Offset_Teil_mm_X_Richtung</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * ./.
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [0; 1]
	 *
	 * @return current value of the digital input 'Offset_Teil_mm_X_Richtung'
	 */
	public java.lang.Integer getOffset_Teil_mm_X_Richtung()
	{
		return getNumberIOValue("Offset_Teil_mm_X_Richtung", false).intValue();
	}

}
