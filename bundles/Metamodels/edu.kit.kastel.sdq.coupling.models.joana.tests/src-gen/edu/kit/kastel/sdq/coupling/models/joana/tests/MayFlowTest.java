/**
 */
package edu.kit.kastel.sdq.coupling.models.joana.tests;

import edu.kit.kastel.sdq.coupling.models.joana.JoanaFactory;
import edu.kit.kastel.sdq.coupling.models.joana.MayFlow;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>May Flow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MayFlowTest extends TestCase {

	/**
	 * The fixture for this May Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MayFlow fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MayFlowTest.class);
	}

	/**
	 * Constructs a new May Flow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MayFlowTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this May Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MayFlow fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this May Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MayFlow getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JoanaFactory.eINSTANCE.createMayFlow());
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

} //MayFlowTest
