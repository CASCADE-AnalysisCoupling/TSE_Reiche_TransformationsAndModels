/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.tests;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlow;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Allowed Flow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllowedFlowTest extends TestCase {

	/**
	 * The fixture for this Allowed Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllowedFlow fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AllowedFlowTest.class);
	}

	/**
	 * Constructs a new Allowed Flow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedFlowTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Allowed Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AllowedFlow fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Allowed Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllowedFlow getFixture() {
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
		setFixture(TainttrackingFactory.eINSTANCE.createAllowedFlow());
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

} //AllowedFlowTest
