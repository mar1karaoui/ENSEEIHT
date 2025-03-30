/**
 */
package gstock.impl;

import gstock.Colonne;
import gstock.Colonne_referencee;
import gstock.GstockPackage;
import gstock.Table;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colonne referencee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gstock.impl.Colonne_referenceeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link gstock.impl.Colonne_referenceeImpl#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Colonne_referenceeImpl extends ColonneImpl implements Colonne_referencee {
	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected Table table;

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
	protected Colonne_referenceeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GstockPackage.Literals.COLONNE_REFERENCEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table getTable() {
		if (table != null && table.eIsProxy()) {
			InternalEObject oldTable = (InternalEObject)table;
			table = (Table)eResolveProxy(oldTable);
			if (table != oldTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GstockPackage.COLONNE_REFERENCEE__TABLE, oldTable, table));
			}
		}
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTable(Table newTable) {
		Table oldTable = table;
		table = newTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GstockPackage.COLONNE_REFERENCEE__TABLE, oldTable, table));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GstockPackage.COLONNE_REFERENCEE__COLONNE, oldColonne, colonne));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GstockPackage.COLONNE_REFERENCEE__COLONNE, oldColonne, colonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GstockPackage.COLONNE_REFERENCEE__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
			case GstockPackage.COLONNE_REFERENCEE__COLONNE:
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
			case GstockPackage.COLONNE_REFERENCEE__TABLE:
				setTable((Table)newValue);
				return;
			case GstockPackage.COLONNE_REFERENCEE__COLONNE:
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
			case GstockPackage.COLONNE_REFERENCEE__TABLE:
				setTable((Table)null);
				return;
			case GstockPackage.COLONNE_REFERENCEE__COLONNE:
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
			case GstockPackage.COLONNE_REFERENCEE__TABLE:
				return table != null;
			case GstockPackage.COLONNE_REFERENCEE__COLONNE:
				return colonne != null;
		}
		return super.eIsSet(featureID);
	}

} //Colonne_referenceeImpl
