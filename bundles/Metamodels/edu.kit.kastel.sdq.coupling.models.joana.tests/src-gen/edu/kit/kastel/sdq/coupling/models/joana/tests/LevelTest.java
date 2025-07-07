/**
 */
package edu.kit.kastel.sdq.coupling.models.joana.tests;

import edu.kit.kastel.sdq.coupling.models.joana.JoanaFactory;
import edu.kit.kastel.sdq.coupling.models.joana.Level;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LevelTest extends TestCase {

	/**
	 * The fixture for this Level test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Level fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LevelTest.class);
	}

	/**
	 * Constructs a new Level test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Level test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Level fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Level test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Level getFixture() {
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
		setFixture(JoanaFactory.eINSTANCE.createLevel());
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

} //LevelTest
