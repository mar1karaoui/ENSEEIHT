/**
 */
package gstock;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operateur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gstock.Operateur#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see gstock.GstockPackage#getOperateur()
 * @model
 * @generated
 */
public interface Operateur extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link gstock.Operations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see gstock.Operations
	 * @see #setType(Operations)
	 * @see gstock.GstockPackage#getOperateur_Type()
	 * @model
	 * @generated
	 */
	Operations getType();

	/**
	 * Sets the value of the '{@link gstock.Operateur#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see gstock.Operations
	 * @see #getType()
	 * @generated
	 */
	void setType(Operations value);

} // Operateur
