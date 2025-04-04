/**
 * generated by Xtext 2.32.0
 */
package fr.n7.gs1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne referencee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.gs1.Colonne_referencee#getTable <em>Table</em>}</li>
 *   <li>{@link fr.n7.gs1.Colonne_referencee#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @see fr.n7.gs1.Gs1Package#getColonne_referencee()
 * @model
 * @generated
 */
public interface Colonne_referencee extends Colonne
{
  /**
   * Returns the value of the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' reference.
   * @see #setTable(Table)
   * @see fr.n7.gs1.Gs1Package#getColonne_referencee_Table()
   * @model
   * @generated
   */
  Table getTable();

  /**
   * Sets the value of the '{@link fr.n7.gs1.Colonne_referencee#getTable <em>Table</em>}' reference.
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
   * @see fr.n7.gs1.Gs1Package#getColonne_referencee_Colonne()
   * @model
   * @generated
   */
  Colonne getColonne();

  /**
   * Sets the value of the '{@link fr.n7.gs1.Colonne_referencee#getColonne <em>Colonne</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Colonne</em>' reference.
   * @see #getColonne()
   * @generated
   */
  void setColonne(Colonne value);

} // Colonne_referencee
