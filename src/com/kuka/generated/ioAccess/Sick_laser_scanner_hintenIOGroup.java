package com.kuka.generated.ioAccess;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.kuka.roboticsAPI.controllerModel.Controller;
import com.kuka.roboticsAPI.ioModel.AbstractIOGroup;
import com.kuka.roboticsAPI.ioModel.IOTypes;

/**
 * Automatically generated class to abstract I/O access to I/O group <b>Sick_laser_scanner_hinten</b>.<br>
 * <i>Please, do not modify!</i>
 * <p>
 * <b>I/O group description:</b><br>
 * sd
 */
@Singleton
public class Sick_laser_scanner_hintenIOGroup extends AbstractIOGroup
{
	/**
	 * Constructor to create an instance of class 'Sick_laser_scanner_hinten'.<br>
	 * <i>This constructor is automatically generated. Please, do not modify!</i>
	 *
	 * @param controller
	 *            the controller, which has access to the I/O group 'Sick_laser_scanner_hinten'
	 */
	@Inject
	public Sick_laser_scanner_hintenIOGroup(Controller controller)
	{
		super(controller, "Sick_laser_scanner_hinten");

		addInput("B_sick_trigger_schutzfeld", IOTypes.BOOLEAN, 1);
		addInput("A_sick_trigger_warnfeld", IOTypes.BOOLEAN, 1);
		addInput("A_sick_trigger_schutzfeld", IOTypes.BOOLEAN, 1);
		addInput("B_sick_trigger_warnfeld", IOTypes.BOOLEAN, 1);
	}

	/**
	 * Gets the value of the <b>digital input '<i>B_sick_trigger_schutzfeld</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * True = 1 - Wenn Warnfeld betreten wurde, dann auf 1 
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'B_sick_trigger_schutzfeld'
	 */
	public boolean getB_sick_trigger_schutzfeld()
	{
		return getBooleanIOValue("B_sick_trigger_schutzfeld", false);
	}

	/**
	 * Gets the value of the <b>digital input '<i>A_sick_trigger_warnfeld</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * True = 1 - Wenn Warnfeld betreten wurde, dann auf 1 
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'A_sick_trigger_warnfeld'
	 */
	public boolean getA_sick_trigger_warnfeld()
	{
		return getBooleanIOValue("A_sick_trigger_warnfeld", false);
	}

	/**
	 * Gets the value of the <b>digital input '<i>A_sick_trigger_schutzfeld</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * True = 1 - Wenn Warnfeld betreten wurde, dann auf 1 
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'A_sick_trigger_schutzfeld'
	 */
	public boolean getA_sick_trigger_schutzfeld()
	{
		return getBooleanIOValue("A_sick_trigger_schutzfeld", false);
	}

	/**
	 * Gets the value of the <b>digital input '<i>B_sick_trigger_warnfeld</i>'</b>.<br>
	 * <i>This method is automatically generated. Please, do not modify!</i>
	 * <p>
	 * <b>I/O direction and type:</b><br>
	 * digital input
	 * <p>
	 * <b>User description of the I/O:</b><br>
	 * True = 1 - Wenn Warnfeld betreten wurde, dann auf 1 
	 * <p>
	 * <b>Range of the I/O value:</b><br>
	 * [false; true]
	 *
	 * @return current value of the digital input 'B_sick_trigger_warnfeld'
	 */
	public boolean getB_sick_trigger_warnfeld()
	{
		return getBooleanIOValue("B_sick_trigger_warnfeld", false);
	}

}
