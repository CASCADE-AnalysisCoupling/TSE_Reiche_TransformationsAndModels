/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.tests;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevel;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Security Level</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityLevelTest extends TestCase {

	/**
	 * The fixture for this Security Level test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityLevel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SecurityLevelTest.class);
	}

	/**
	 * Constructs a new Security Level test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Security Level test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SecurityLevel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Security Level test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityLevel getFixture() {
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
		setFixture(TainttrackingFactory.eINSTANCE.createSecurityLevel());
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

} //SecurityLevelTest
