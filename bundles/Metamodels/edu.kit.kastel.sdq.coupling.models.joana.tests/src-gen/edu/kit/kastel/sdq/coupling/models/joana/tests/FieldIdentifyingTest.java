/**
 */
package edu.kit.kastel.sdq.coupling.models.joana.tests;

import edu.kit.kastel.sdq.coupling.models.joana.FieldIdentifying;
import edu.kit.kastel.sdq.coupling.models.joana.JoanaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Field Identifying</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldIdentifyingTest extends SystemElementIdentifyingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FieldIdentifyingTest.class);
	}

	/**
	 * Constructs a new Field Identifying test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldIdentifyingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Field Identifying test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FieldIdentifying getFixture() {
		return (FieldIdentifying)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JoanaFactory.eINSTANCE.createFieldIdentifying());
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

} //FieldIdentifyingTest
