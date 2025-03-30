/**
 * generated by Xtext 2.32.0
 */
package fr.n7.gs1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colonne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.gs1.Colonne#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.gs1.Colonne#getId <em>Id</em>}</li>
 *   <li>{@link fr.n7.gs1.Colonne#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see fr.n7.gs1.Gs1Package#getColonne()
 * @model
 * @generated
 */
public interface Colonne extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.n7.gs1.Gs1Package#getColonne_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.n7.gs1.Colonne#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(int)
   * @see fr.n7.gs1.Gs1Package#getColonne_Id()
   * @model
   * @generated
   */
  int getId();

  /**
   * Sets the value of the '{@link fr.n7.gs1.Colonne#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(int value);

  /**
   * Returns the value of the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nom</em>' attribute.
   * @see #setNom(String)
   * @see fr.n7.gs1.Gs1Package#getColonne_Nom()
   * @model
   * @generated
   */
  String getNom();

  /**
   * Sets the value of the '{@link fr.n7.gs1.Colonne#getNom <em>Nom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nom</em>' attribute.
   * @see #getNom()
   * @generated
   */
  void setNom(String value);

} // Colonne
