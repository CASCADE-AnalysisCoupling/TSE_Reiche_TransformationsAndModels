/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.tests;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.SecurityLevelAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Security Level Annotation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityLevelAnnotationTest extends TestCase {

	/**
	 * The fixture for this Security Level Annotation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityLevelAnnotation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SecurityLevelAnnotationTest.class);
	}

	/**
	 * Constructs a new Security Level Annotation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevelAnnotationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Security Level Annotation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SecurityLevelAnnotation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Security Level Annotation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityLevelAnnotation getFixture() {
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
		setFixture(TainttrackingFactory.eINSTANCE.createSecurityLevelAnnotation());
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

} //SecurityLevelAnnotationTest
