/**
 * generated by Xtext 2.32.0
 */
package fr.n7.gs1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acces Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.gs1.AccesVariable#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @see fr.n7.gs1.Gs1Package#getAccesVariable()
 * @model
 * @generated
 */
public interface AccesVariable extends Expression
{
  /**
   * Returns the value of the '<em><b>Colonne</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colonne</em>' reference.
   * @see #setColonne(Colonne)
   * @see fr.n7.gs1.Gs1Package#getAccesVariable_Colonne()
   * @model
   * @generated
   */
  Colonne getColonne();

  /**
   * Sets the value of the '{@link fr.n7.gs1.AccesVariable#getColonne <em>Colonne</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Colonne</em>' reference.
   * @see #getColonne()
   * @generated
   */
  void setColonne(Colonne value);

} // AccesVariable
