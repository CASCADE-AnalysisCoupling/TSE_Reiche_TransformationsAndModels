/**
 */
package edu.kit.kastel.sdq.coupling.models.java.tests;

import edu.kit.kastel.sdq.coupling.models.java.JavaFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageTest extends TestCase {

	/**
	 * The fixture for this Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected edu.kit.kastel.sdq.coupling.models.java.Package fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PackageTest.class);
	}

	/**
	 * Constructs a new Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(edu.kit.kastel.sdq.coupling.models.java.Package fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected edu.kit.kastel.sdq.coupling.models.java.Package getFixture() {
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
		setFixture(JavaFactory.eINSTANCE.createPackage());
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

} //PackageTest
