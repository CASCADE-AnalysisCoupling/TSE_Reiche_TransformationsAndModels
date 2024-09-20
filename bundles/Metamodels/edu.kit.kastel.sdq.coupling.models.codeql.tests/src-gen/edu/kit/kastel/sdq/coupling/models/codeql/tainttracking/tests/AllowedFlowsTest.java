/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.tests;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.AllowedFlows;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Allowed Flows</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllowedFlowsTest extends TestCase {

	/**
	 * The fixture for this Allowed Flows test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllowedFlows fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AllowedFlowsTest.class);
	}

	/**
	 * Constructs a new Allowed Flows test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedFlowsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Allowed Flows test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AllowedFlows fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Allowed Flows test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllowedFlows getFixture() {
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
		setFixture(TainttrackingFactory.eINSTANCE.createAllowedFlows());
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

} //AllowedFlowsTest
