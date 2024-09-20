/**
 */
package edu.kit.kastel.sdq.coupling.models.joana.tests;

import edu.kit.kastel.sdq.coupling.models.joana.JoanaFactory;
import edu.kit.kastel.sdq.coupling.models.joana.MethodIdentifying;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Method Identifying</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MethodIdentifyingTest extends SystemElementIdentifyingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MethodIdentifyingTest.class);
	}

	/**
	 * Constructs a new Method Identifying test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodIdentifyingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Method Identifying test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MethodIdentifying getFixture() {
		return (MethodIdentifying)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JoanaFactory.eINSTANCE.createMethodIdentifying());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MethodIdentifyingTest
