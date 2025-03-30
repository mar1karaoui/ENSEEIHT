/**
 */
package gstock.tests;

import gstock.Colonne_derivee;
import gstock.GstockFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Colonne derivee</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Colonne_deriveeTest extends ColonneTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Colonne_deriveeTest.class);
	}

	/**
	 * Constructs a new Colonne derivee test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colonne_deriveeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Colonne derivee test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Colonne_derivee getFixture() {
		return (Colonne_derivee)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GstockFactory.eINSTANCE.createColonne_derivee());
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

} //Colonne_deriveeTest
