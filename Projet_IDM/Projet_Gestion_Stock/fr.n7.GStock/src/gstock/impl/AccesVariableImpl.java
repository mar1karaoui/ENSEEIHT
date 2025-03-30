/**
 */
package gstock.impl;

import gstock.AccesVariable;
import gstock.Colonne;
import gstock.GstockPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acces Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gstock.impl.AccesVariableImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link gstock.impl.AccesVariableImpl#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccesVariableImpl extends MinimalEObjectImpl.Container implements AccesVariable {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

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
	protected AccesVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GstockPackage.Literals.ACCES_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GstockPackage.ACCES_VARIABLE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colonne getColonne() {
		if (colonne != null && colonne.eIsProxy()) {
			InternalEObject oldColonne = (InternalEObject)colonne;
			colonne = (Colonne)eResolveProxy(oldColonne);
			if (colonne != oldColonne) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GstockPackage.ACCES_VARIABLE__COLONNE, oldColonne, colonne));
			}
		}
		return colonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colonne basicGetColonne() {
		return colonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColonne(Colonne newColonne) {
		Colonne oldColonne = colonne;
		colonne = newColonne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GstockPackage.ACCES_VARIABLE__COLONNE, oldColonne, colonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GstockPackage.ACCES_VARIABLE__NOM:
				return getNom();
			case GstockPackage.ACCES_VARIABLE__COLONNE:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GstockPackage.ACCES_VARIABLE__NOM:
				setNom((String)newValue);
				return;
			case GstockPackage.ACCES_VARIABLE__COLONNE:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GstockPackage.ACCES_VARIABLE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case GstockPackage.ACCES_VARIABLE__COLONNE:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GstockPackage.ACCES_VARIABLE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case GstockPackage.ACCES_VARIABLE__COLONNE:
				return colonne != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //AccesVariableImpl
