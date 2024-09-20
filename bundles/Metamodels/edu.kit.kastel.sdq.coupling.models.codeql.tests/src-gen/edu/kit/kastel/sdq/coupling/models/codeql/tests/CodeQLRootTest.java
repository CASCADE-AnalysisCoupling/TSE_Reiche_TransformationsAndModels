/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tests;

import edu.kit.kastel.sdq.coupling.models.codeql.CodeQLRoot;
import edu.kit.kastel.sdq.coupling.models.codeql.CodeqlFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Code QL Root</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodeQLRootTest extends TestCase {

	/**
	 * The fixture for this Code QL Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeQLRoot fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CodeQLRootTest.class);
	}

	/**
	 * Constructs a new Code QL Root test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeQLRootTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Code QL Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CodeQLRoot fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Code QL Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeQLRoot getFixture() {
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
		setFixture(CodeqlFactory.eINSTANCE.createCodeQLRoot());
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

} //CodeQLRootTest
