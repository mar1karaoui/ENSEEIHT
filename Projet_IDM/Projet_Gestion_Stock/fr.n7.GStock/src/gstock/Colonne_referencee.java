/**
 */
package gstock;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne referencee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gstock.Colonne_referencee#getTable <em>Table</em>}</li>
 *   <li>{@link gstock.Colonne_referencee#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @see gstock.GstockPackage#getColonne_referencee()
 * @model
 * @generated
 */
public interface Colonne_referencee extends Colonne {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(Table)
	 * @see gstock.GstockPackage#getColonne_referencee_Table()
	 * @model required="true"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link gstock.Colonne_referencee#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Colonne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne</em>' reference.
	 * @see #setColonne(Colonne)
	 * @see gstock.GstockPackage#getColonne_referencee_Colonne()
	 * @model required="true"
	 * @generated
	 */
	Colonne getColonne();

	/**
	 * Sets the value of the '{@link gstock.Colonne_referencee#getColonne <em>Colonne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colonne</em>' reference.
	 * @see #getColonne()
	 * @generated
	 */
	void setColonne(Colonne value);

} // Colonne_referencee
