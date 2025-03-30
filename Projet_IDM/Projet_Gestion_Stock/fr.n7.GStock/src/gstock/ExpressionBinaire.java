/**
 */
package gstock;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Binaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gstock.ExpressionBinaire#getOperandeG <em>Operande G</em>}</li>
 *   <li>{@link gstock.ExpressionBinaire#getOperateur <em>Operateur</em>}</li>
 *   <li>{@link gstock.ExpressionBinaire#getOperandeD <em>Operande D</em>}</li>
 * </ul>
 *
 * @see gstock.GstockPackage#getExpressionBinaire()
 * @model
 * @generated
 */
public interface ExpressionBinaire extends Expression {
	/**
	 * Returns the value of the '<em><b>Operande G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operande G</em>' containment reference.
	 * @see #setOperandeG(Expression)
	 * @see gstock.GstockPackage#getExpressionBinaire_OperandeG()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getOperandeG();

	/**
	 * Sets the value of the '{@link gstock.ExpressionBinaire#getOperandeG <em>Operande G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operande G</em>' containment reference.
	 * @see #getOperandeG()
	 * @generated
	 */
	void setOperandeG(Expression value);

	/**
	 * Returns the value of the '<em><b>Operateur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operateur</em>' containment reference.
	 * @see #setOperateur(Operateur)
	 * @see gstock.GstockPackage#getExpressionBinaire_Operateur()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operateur getOperateur();

	/**
	 * Sets the value of the '{@link gstock.ExpressionBinaire#getOperateur <em>Operateur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operateur</em>' containment reference.
	 * @see #getOperateur()
	 * @generated
	 */
	void setOperateur(Operateur value);

	/**
	 * Returns the value of the '<em><b>Operande D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operande D</em>' containment reference.
	 * @see #setOperandeD(Expression)
	 * @see gstock.GstockPackage#getExpressionBinaire_OperandeD()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getOperandeD();

	/**
	 * Sets the value of the '{@link gstock.ExpressionBinaire#getOperandeD <em>Operande D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operande D</em>' containment reference.
	 * @see #getOperandeD()
	 * @generated
	 */
	void setOperandeD(Expression value);

} // ExpressionBinaire
