/**
 * generated by Xtext 2.32.0
 */
package fr.n7.gs1.impl;

import fr.n7.gs1.AccesVariable;
import fr.n7.gs1.Colonne;
import fr.n7.gs1.Gs1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acces Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.gs1.impl.AccesVariableImpl#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccesVariableImpl extends ExpressionImpl implements AccesVariable
{
  /**
   * The cached value of the '{@link #getColonne() <em>Colonne</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColonne()
   * @generated
   * @ordered
   */
  protected Colonne colonne;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AccesVariableImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Gs1Package.Literals.ACCES_VARIABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Colonne getColonne()
  {
    if (colonne != null && colonne.eIsProxy())
    {
      InternalEObject oldColonne = (InternalEObject)colonne;
      colonne = (Colonne)eResolveProxy(oldColonne);
      if (colonne != oldColonne)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, Gs1Package.ACCES_VARIABLE__COLONNE, oldColonne, colonne));
      }
    }
    return colonne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Colonne basicGetColonne()
  {
    return colonne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setColonne(Colonne newColonne)
  {
    Colonne oldColonne = colonne;
    colonne = newColonne;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Gs1Package.ACCES_VARIABLE__COLONNE, oldColonne, colonne));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Gs1Package.ACCES_VARIABLE__COLONNE:
        if (resolve) return getColonne();
        return basicGetColonne();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Gs1Package.ACCES_VARIABLE__COLONNE:
        setColonne((Colonne)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Gs1Package.ACCES_VARIABLE__COLONNE:
        setColonne((Colonne)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Gs1Package.ACCES_VARIABLE__COLONNE:
        return colonne != null;
    }
    return super.eIsSet(featureID);
  }

} //AccesVariableImpl
