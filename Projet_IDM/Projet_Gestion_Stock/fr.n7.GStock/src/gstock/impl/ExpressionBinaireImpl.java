/**
 */
package gstock.impl;

import gstock.Expression;
import gstock.ExpressionBinaire;
import gstock.GstockPackage;
import gstock.Operateur;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Binaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gstock.impl.ExpressionBinaireImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link gstock.impl.ExpressionBinaireImpl#getOperandeG <em>Operande G</em>}</li>
 *   <li>{@link gstock.impl.ExpressionBinaireImpl#getOperateur <em>Operateur</em>}</li>
 *   <li>{@link gstock.impl.ExpressionBinaireImpl#getOperandeD <em>Operande D</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionBinaireImpl extends MinimalEObjectImpl.Container implements ExpressionBinaire {
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
	 * The cached value of the '{@link #getOperandeG() <em>Operande G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandeG()
	 * @generated
	 * @ordered
	 */
	protected Expression operandeG;

	/**
	 * The cached value of the '{@link #getOperateur() <em>Operateur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperateur()
	 * @generated
	 * @ordered
	 */
	protected Operateur operateur;

	/**
	 * The cached value of the '{@link #getOperandeD() <em>Operande D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandeD()
	 * @generated
	 * @ordered
	 */
	protected Expression operandeD;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionBinaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GstockPackage.Literals.EXPRESSION_BINAIRE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GstockPackage.EXPRESSION_BINAIRE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getOperandeG() {
		return operandeG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperandeG(Expression newOperandeG, NotificationChain msgs) {
		Expression oldOperandeG = operandeG;
		operandeG = newOperandeG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GstockPackage.EXPRESSION_BINAIRE__OPERANDE_G, oldOperandeG, newOperandeG);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperandeG(Expression newOperandeG) {
		if (newOperandeG != operandeG) {
			NotificationChain msgs = null;
			if (operandeG != null)
				msgs = ((InternalEObject)operandeG).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GstockPackage.EXPRESSION_BINAIRE__OPERANDE_G, null, msgs);
			if (newOperandeG != null)
				msgs = ((InternalEObject)newOperandeG).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GstockPackage.EXPRESSION_BINAIRE__OPERANDE_G, null, msgs);
			msgs = basicSetOperandeG(newOperandeG, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GstockPackage.EXPRESSION_BINAIRE__OPERANDE_G, newOperandeG, newOperandeG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operateur getOperateur() {
		return operateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperateur(Operateur newOperateur, NotificationChain msgs) {
		Operateur oldOperateur = operateur;
		operateur = newOperateur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GstockPackage.EXPRESSION_BINAIRE__OPERATEUR, oldOperateur, newOperateur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperateur(Operateur newOperateur) {
		if (newOperateur != operateur) {
			NotificationChain msgs = null;
			if (operateur != null)
				msgs = ((InternalEObject)operateur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GstockPackage.EXPRESSION_BINAIRE__OPERATEUR, null, msgs);
			if (newOperateur != null)
				msgs = ((InternalEObject)newOperateur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GstockPackage.EXPRESSION_BINAIRE__OPERATEUR, null, msgs);
			msgs = basicSetOperateur(newOperateur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GstockPackage.EXPRESSION_BINAIRE__OPERATEUR, newOperateur, newOperateur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getOperandeD() {
		return operandeD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperandeD(Expression newOperandeD, NotificationChain msgs) {
		Expression oldOperandeD = operandeD;
		operandeD = newOperandeD;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GstockPackage.EXPRESSION_BINAIRE__OPERANDE_D, oldOperandeD, newOperandeD);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperandeD(Expression newOperandeD) {
		if (newOperandeD != operandeD) {
			NotificationChain msgs = null;
			if (operandeD != null)
				msgs = ((InternalEObject)operandeD).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GstockPackage.EXPRESSION_BINAIRE__OPERANDE_D, null, msgs);
			if (newOperandeD != null)
				msgs = ((InternalEObject)newOperandeD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GstockPackage.EXPRESSION_BINAIRE__OPERANDE_D, null, msgs);
			msgs = basicSetOperandeD(newOperandeD, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GstockPackage.EXPRESSION_BINAIRE__OPERANDE_D, newOperandeD, newOperandeD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GstockPackage.EXPRESSION_BINAIRE__OPERANDE_G:
				return basicSetOperandeG(null, msgs);
			case GstockPackage.EXPRESSION_BINAIRE__OPERATEUR:
				return basicSetOperateur(null, msgs);
			case GstockPackage.EXPRESSION_BINAIRE__OPERANDE_D:
				return basicSetOperandeD(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GstockPackage.EXPRESSION_BINAIRE__NOM:
				return getNom();
			case GstockPackage.EXPRESSION_BINAIRE__OPERANDE_G:
				return getOperandeG();
			case GstockPackage.EXPRESSION_BINAIRE__OPERATEUR:
				return getOperateur();
			case GstockPackage.EXPRESSION_BINAIRE__OPERANDE_D:
				return getOperandeD();
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
			case GstockPackage.EXPRESSION_BINAIRE__NOM:
				setNom((String)newValue);
				return;
			case GstockPackage.EXPRESSION_BINAIRE__OPERANDE_G:
				setOperandeG((Expression)newValue);
				return;
			case GstockPackage.EXPRESSION_BINAIRE__OPERATEUR:
				setOperateur((Operateur)newValue);
				return;
			case GstockPackage.EXPRESSION_BINAIRE__OPERANDE_D:
				setOperandeD((Expression)newValue);
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
			case GstockPackage.EXPRESSION_BINAIRE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case GstockPackage.EXPRESSION_BINAIRE__OPERANDE_G:
				setOperandeG((Expression)null);
				return;
			case GstockPackage.EXPRESSION_BINAIRE__OPERATEUR:
				setOperateur((Operateur)null);
				return;
			case GstockPackage.EXPRESSION_BINAIRE__OPERANDE_D:
				setOperandeD((Expression)null);
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
			case GstockPackage.EXPRESSION_BINAIRE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case GstockPackage.EXPRESSION_BINAIRE__OPERANDE_G:
				return operandeG != null;
			case GstockPackage.EXPRESSION_BINAIRE__OPERATEUR:
				return operateur != null;
			case GstockPackage.EXPRESSION_BINAIRE__OPERANDE_D:
				return operandeD != null;
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

} //ExpressionBinaireImpl
