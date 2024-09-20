/**
 */
package edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.tests;

import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.FieldAnnotation;
import edu.kit.kastel.sdq.coupling.models.codeql.tainttracking.TainttrackingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Field Annotation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldAnnotationTest extends SecurityLevelAnnotationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FieldAnnotationTest.class);
	}

	/**
	 * Constructs a new Field Annotation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldAnnotationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Field Annotation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FieldAnnotation getFixture() {
		return (FieldAnnotation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TainttrackingFactory.eINSTANCE.createFieldAnnotation());
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

} //FieldAnnotationTest
