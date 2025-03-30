/**
 */
package gstock;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne derivee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gstock.Colonne_derivee#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see gstock.GstockPackage#getColonne_derivee()
 * @model
 * @generated
 */
public interface Colonne_derivee extends Colonne {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see gstock.GstockPackage#getColonne_derivee_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link gstock.Colonne_derivee#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // Colonne_derivee
