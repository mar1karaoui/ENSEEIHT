/**
 */
package gstock;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gstock.GstockPackage
 * @generated
 */
public interface GstockFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GstockFactory eINSTANCE = gstock.impl.GstockFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Colonne derivee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colonne derivee</em>'.
	 * @generated
	 */
	Colonne_derivee createColonne_derivee();

	/**
	 * Returns a new object of class '<em>Colonne referencee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colonne referencee</em>'.
	 * @generated
	 */
	Colonne_referencee createColonne_referencee();

	/**
	 * Returns a new object of class '<em>Colonnesimple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colonnesimple</em>'.
	 * @generated
	 */
	Colonnesimple createColonnesimple();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Expression Binaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Binaire</em>'.
	 * @generated
	 */
	ExpressionBinaire createExpressionBinaire();

	/**
	 * Returns a new object of class '<em>Operateur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operateur</em>'.
	 * @generated
	 */
	Operateur createOperateur();

	/**
	 * Returns a new object of class '<em>Acces Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acces Variable</em>'.
	 * @generated
	 */
	AccesVariable createAccesVariable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GstockPackage getGstockPackage();

} //GstockFactory
