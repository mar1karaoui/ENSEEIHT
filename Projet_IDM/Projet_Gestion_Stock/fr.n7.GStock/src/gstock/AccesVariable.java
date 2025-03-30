/**
 */
package gstock;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acces Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gstock.AccesVariable#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @see gstock.GstockPackage#getAccesVariable()
 * @model
 * @generated
 */
public interface AccesVariable extends Expression {
	/**
	 * Returns the value of the '<em><b>Colonne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne</em>' reference.
	 * @see #setColonne(Colonne)
	 * @see gstock.GstockPackage#getAccesVariable_Colonne()
	 * @model required="true"
	 * @generated
	 */
	Colonne getColonne();

	/**
	 * Sets the value of the '{@link gstock.AccesVariable#getColonne <em>Colonne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colonne</em>' reference.
	 * @see #getColonne()
	 * @generated
	 */
	void setColonne(Colonne value);

} // AccesVariable
