/**
 */
package gstock.impl;

import gstock.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GstockFactoryImpl extends EFactoryImpl implements GstockFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GstockFactory init() {
		try {
			GstockFactory theGstockFactory = (GstockFactory)EPackage.Registry.INSTANCE.getEFactory(GstockPackage.eNS_URI);
			if (theGstockFactory != null) {
				return theGstockFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GstockFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GstockFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GstockPackage.TABLE: return createTable();
			case GstockPackage.COLONNE_DERIVEE: return createColonne_derivee();
			case GstockPackage.COLONNE_REFERENCEE: return createColonne_referencee();
			case GstockPackage.COLONNESIMPLE: return createColonnesimple();
			case GstockPackage.APPLICATION: return createApplication();
			case GstockPackage.EXPRESSION_BINAIRE: return createExpressionBinaire();
			case GstockPackage.OPERATEUR: return createOperateur();
			case GstockPackage.ACCES_VARIABLE: return createAccesVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GstockPackage.OPERATIONS:
				return createOperationsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GstockPackage.OPERATIONS:
				return convertOperationsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colonne_derivee createColonne_derivee() {
		Colonne_deriveeImpl colonne_derivee = new Colonne_deriveeImpl();
		return colonne_derivee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colonne_referencee createColonne_referencee() {
		Colonne_referenceeImpl colonne_referencee = new Colonne_referenceeImpl();
		return colonne_referencee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Colonnesimple createColonnesimple() {
		ColonnesimpleImpl colonnesimple = new ColonnesimpleImpl();
		return colonnesimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionBinaire createExpressionBinaire() {
		ExpressionBinaireImpl expressionBinaire = new ExpressionBinaireImpl();
		return expressionBinaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operateur createOperateur() {
		OperateurImpl operateur = new OperateurImpl();
		return operateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccesVariable createAccesVariable() {
		AccesVariableImpl accesVariable = new AccesVariableImpl();
		return accesVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operations createOperationsFromString(EDataType eDataType, String initialValue) {
		Operations result = Operations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GstockPackage getGstockPackage() {
		return (GstockPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GstockPackage getPackage() {
		return GstockPackage.eINSTANCE;
	}

} //GstockFactoryImpl
