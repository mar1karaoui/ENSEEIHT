/**
 */
package gstock;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gstock.GstockFactory
 * @model kind="package"
 * @generated
 */
public interface GstockPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gstock";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gstock";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gstock";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GstockPackage eINSTANCE = gstock.impl.GstockPackageImpl.init();

	/**
	 * The meta object id for the '{@link gstock.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gstock.impl.TableImpl
	 * @see gstock.impl.GstockPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Colonnes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLONNES = 2;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gstock.impl.ColonneImpl <em>Colonne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gstock.impl.ColonneImpl
	 * @see gstock.impl.GstockPackageImpl#getColonne()
	 * @generated
	 */
	int COLONNE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__ID = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Colonne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gstock.impl.Colonne_deriveeImpl <em>Colonne derivee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gstock.impl.Colonne_deriveeImpl
	 * @see gstock.impl.GstockPackageImpl#getColonne_derivee()
	 * @generated
	 */
	int COLONNE_DERIVEE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE__ID = COLONNE__ID;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE__NOM = COLONNE__NOM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE__TYPE = COLONNE__TYPE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE__EXPRESSION = COLONNE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Colonne derivee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE_FEATURE_COUNT = COLONNE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Colonne derivee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_DERIVEE_OPERATION_COUNT = COLONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gstock.impl.Colonne_referenceeImpl <em>Colonne referencee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gstock.impl.Colonne_referenceeImpl
	 * @see gstock.impl.GstockPackageImpl#getColonne_referencee()
	 * @generated
	 */
	int COLONNE_REFERENCEE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_REFERENCEE__ID = COLONNE__ID;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_REFERENCEE__NOM = COLONNE__NOM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_REFERENCEE__TYPE = COLONNE__TYPE;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_REFERENCEE__TABLE = COLONNE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Colonne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_REFERENCEE__COLONNE = COLONNE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Colonne referencee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_REFERENCEE_FEATURE_COUNT = COLONNE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Colonne referencee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNE_REFERENCEE_OPERATION_COUNT = COLONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gstock.impl.ColonnesimpleImpl <em>Colonnesimple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gstock.impl.ColonnesimpleImpl
	 * @see gstock.impl.GstockPackageImpl#getColonnesimple()
	 * @generated
	 */
	int COLONNESIMPLE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNESIMPLE__ID = COLONNE__ID;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNESIMPLE__NOM = COLONNE__NOM;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNESIMPLE__TYPE = COLONNE__TYPE;

	/**
	 * The number of structural features of the '<em>Colonnesimple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNESIMPLE_FEATURE_COUNT = COLONNE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Colonnesimple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLONNESIMPLE_OPERATION_COUNT = COLONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gstock.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gstock.impl.ApplicationImpl
	 * @see gstock.impl.GstockPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 5;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__TABLES = 0;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gstock.Expression <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gstock.Expression
	 * @see gstock.impl.GstockPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NOM = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gstock.impl.ExpressionBinaireImpl <em>Expression Binaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gstock.impl.ExpressionBinaireImpl
	 * @see gstock.impl.GstockPackageImpl#getExpressionBinaire()
	 * @generated
	 */
	int EXPRESSION_BINAIRE = 6;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BINAIRE__NOM = EXPRESSION__NOM;

	/**
	 * The feature id for the '<em><b>Operande G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BINAIRE__OPERANDE_G = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operateur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BINAIRE__OPERATEUR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operande D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BINAIRE__OPERANDE_D = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Expression Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BINAIRE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Expression Binaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_BINAIRE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gstock.impl.OperateurImpl <em>Operateur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gstock.impl.OperateurImpl
	 * @see gstock.impl.GstockPackageImpl#getOperateur()
	 * @generated
	 */
	int OPERATEUR = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Operateur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operateur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATEUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gstock.impl.AccesVariableImpl <em>Acces Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gstock.impl.AccesVariableImpl
	 * @see gstock.impl.GstockPackageImpl#getAccesVariable()
	 * @generated
	 */
	int ACCES_VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCES_VARIABLE__NOM = EXPRESSION__NOM;

	/**
	 * The feature id for the '<em><b>Colonne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCES_VARIABLE__COLONNE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Acces Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCES_VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Acces Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCES_VARIABLE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gstock.Operations <em>Operations</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gstock.Operations
	 * @see gstock.impl.GstockPackageImpl#getOperations()
	 * @generated
	 */
	int OPERATIONS = 10;


	/**
	 * Returns the meta object for class '{@link gstock.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see gstock.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link gstock.Table#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gstock.Table#getId()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Id();

	/**
	 * Returns the meta object for the attribute '{@link gstock.Table#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see gstock.Table#getNom()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link gstock.Table#getColonnes <em>Colonnes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colonnes</em>'.
	 * @see gstock.Table#getColonnes()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Colonnes();

	/**
	 * Returns the meta object for class '{@link gstock.Colonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne</em>'.
	 * @see gstock.Colonne
	 * @generated
	 */
	EClass getColonne();

	/**
	 * Returns the meta object for the attribute '{@link gstock.Colonne#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see gstock.Colonne#getId()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_Id();

	/**
	 * Returns the meta object for the attribute '{@link gstock.Colonne#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see gstock.Colonne#getNom()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_Nom();

	/**
	 * Returns the meta object for the attribute '{@link gstock.Colonne#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gstock.Colonne#getType()
	 * @see #getColonne()
	 * @generated
	 */
	EAttribute getColonne_Type();

	/**
	 * Returns the meta object for class '{@link gstock.Colonne_derivee <em>Colonne derivee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne derivee</em>'.
	 * @see gstock.Colonne_derivee
	 * @generated
	 */
	EClass getColonne_derivee();

	/**
	 * Returns the meta object for the containment reference '{@link gstock.Colonne_derivee#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see gstock.Colonne_derivee#getExpression()
	 * @see #getColonne_derivee()
	 * @generated
	 */
	EReference getColonne_derivee_Expression();

	/**
	 * Returns the meta object for class '{@link gstock.Colonne_referencee <em>Colonne referencee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonne referencee</em>'.
	 * @see gstock.Colonne_referencee
	 * @generated
	 */
	EClass getColonne_referencee();

	/**
	 * Returns the meta object for the reference '{@link gstock.Colonne_referencee#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see gstock.Colonne_referencee#getTable()
	 * @see #getColonne_referencee()
	 * @generated
	 */
	EReference getColonne_referencee_Table();

	/**
	 * Returns the meta object for the reference '{@link gstock.Colonne_referencee#getColonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Colonne</em>'.
	 * @see gstock.Colonne_referencee#getColonne()
	 * @see #getColonne_referencee()
	 * @generated
	 */
	EReference getColonne_referencee_Colonne();

	/**
	 * Returns the meta object for class '{@link gstock.Colonnesimple <em>Colonnesimple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colonnesimple</em>'.
	 * @see gstock.Colonnesimple
	 * @generated
	 */
	EClass getColonnesimple();

	/**
	 * Returns the meta object for class '{@link gstock.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see gstock.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link gstock.Application#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see gstock.Application#getTables()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Tables();

	/**
	 * Returns the meta object for class '{@link gstock.ExpressionBinaire <em>Expression Binaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Binaire</em>'.
	 * @see gstock.ExpressionBinaire
	 * @generated
	 */
	EClass getExpressionBinaire();

	/**
	 * Returns the meta object for the containment reference '{@link gstock.ExpressionBinaire#getOperandeG <em>Operande G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operande G</em>'.
	 * @see gstock.ExpressionBinaire#getOperandeG()
	 * @see #getExpressionBinaire()
	 * @generated
	 */
	EReference getExpressionBinaire_OperandeG();

	/**
	 * Returns the meta object for the containment reference '{@link gstock.ExpressionBinaire#getOperateur <em>Operateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operateur</em>'.
	 * @see gstock.ExpressionBinaire#getOperateur()
	 * @see #getExpressionBinaire()
	 * @generated
	 */
	EReference getExpressionBinaire_Operateur();

	/**
	 * Returns the meta object for the containment reference '{@link gstock.ExpressionBinaire#getOperandeD <em>Operande D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operande D</em>'.
	 * @see gstock.ExpressionBinaire#getOperandeD()
	 * @see #getExpressionBinaire()
	 * @generated
	 */
	EReference getExpressionBinaire_OperandeD();

	/**
	 * Returns the meta object for class '{@link gstock.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see gstock.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link gstock.Expression#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see gstock.Expression#getNom()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Nom();

	/**
	 * Returns the meta object for class '{@link gstock.Operateur <em>Operateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operateur</em>'.
	 * @see gstock.Operateur
	 * @generated
	 */
	EClass getOperateur();

	/**
	 * Returns the meta object for the attribute '{@link gstock.Operateur#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see gstock.Operateur#getType()
	 * @see #getOperateur()
	 * @generated
	 */
	EAttribute getOperateur_Type();

	/**
	 * Returns the meta object for class '{@link gstock.AccesVariable <em>Acces Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acces Variable</em>'.
	 * @see gstock.AccesVariable
	 * @generated
	 */
	EClass getAccesVariable();

	/**
	 * Returns the meta object for the reference '{@link gstock.AccesVariable#getColonne <em>Colonne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Colonne</em>'.
	 * @see gstock.AccesVariable#getColonne()
	 * @see #getAccesVariable()
	 * @generated
	 */
	EReference getAccesVariable_Colonne();

	/**
	 * Returns the meta object for enum '{@link gstock.Operations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operations</em>'.
	 * @see gstock.Operations
	 * @generated
	 */
	EEnum getOperations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GstockFactory getGstockFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gstock.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gstock.impl.TableImpl
		 * @see gstock.impl.GstockPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__ID = eINSTANCE.getTable_Id();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NOM = eINSTANCE.getTable_Nom();

		/**
		 * The meta object literal for the '<em><b>Colonnes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLONNES = eINSTANCE.getTable_Colonnes();

		/**
		 * The meta object literal for the '{@link gstock.impl.ColonneImpl <em>Colonne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gstock.impl.ColonneImpl
		 * @see gstock.impl.GstockPackageImpl#getColonne()
		 * @generated
		 */
		EClass COLONNE = eINSTANCE.getColonne();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__ID = eINSTANCE.getColonne_Id();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__NOM = eINSTANCE.getColonne_Nom();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLONNE__TYPE = eINSTANCE.getColonne_Type();

		/**
		 * The meta object literal for the '{@link gstock.impl.Colonne_deriveeImpl <em>Colonne derivee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gstock.impl.Colonne_deriveeImpl
		 * @see gstock.impl.GstockPackageImpl#getColonne_derivee()
		 * @generated
		 */
		EClass COLONNE_DERIVEE = eINSTANCE.getColonne_derivee();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE_DERIVEE__EXPRESSION = eINSTANCE.getColonne_derivee_Expression();

		/**
		 * The meta object literal for the '{@link gstock.impl.Colonne_referenceeImpl <em>Colonne referencee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gstock.impl.Colonne_referenceeImpl
		 * @see gstock.impl.GstockPackageImpl#getColonne_referencee()
		 * @generated
		 */
		EClass COLONNE_REFERENCEE = eINSTANCE.getColonne_referencee();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE_REFERENCEE__TABLE = eINSTANCE.getColonne_referencee_Table();

		/**
		 * The meta object literal for the '<em><b>Colonne</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLONNE_REFERENCEE__COLONNE = eINSTANCE.getColonne_referencee_Colonne();

		/**
		 * The meta object literal for the '{@link gstock.impl.ColonnesimpleImpl <em>Colonnesimple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gstock.impl.ColonnesimpleImpl
		 * @see gstock.impl.GstockPackageImpl#getColonnesimple()
		 * @generated
		 */
		EClass COLONNESIMPLE = eINSTANCE.getColonnesimple();

		/**
		 * The meta object literal for the '{@link gstock.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gstock.impl.ApplicationImpl
		 * @see gstock.impl.GstockPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__TABLES = eINSTANCE.getApplication_Tables();

		/**
		 * The meta object literal for the '{@link gstock.impl.ExpressionBinaireImpl <em>Expression Binaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gstock.impl.ExpressionBinaireImpl
		 * @see gstock.impl.GstockPackageImpl#getExpressionBinaire()
		 * @generated
		 */
		EClass EXPRESSION_BINAIRE = eINSTANCE.getExpressionBinaire();

		/**
		 * The meta object literal for the '<em><b>Operande G</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_BINAIRE__OPERANDE_G = eINSTANCE.getExpressionBinaire_OperandeG();

		/**
		 * The meta object literal for the '<em><b>Operateur</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_BINAIRE__OPERATEUR = eINSTANCE.getExpressionBinaire_Operateur();

		/**
		 * The meta object literal for the '<em><b>Operande D</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_BINAIRE__OPERANDE_D = eINSTANCE.getExpressionBinaire_OperandeD();

		/**
		 * The meta object literal for the '{@link gstock.Expression <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gstock.Expression
		 * @see gstock.impl.GstockPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__NOM = eINSTANCE.getExpression_Nom();

		/**
		 * The meta object literal for the '{@link gstock.impl.OperateurImpl <em>Operateur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gstock.impl.OperateurImpl
		 * @see gstock.impl.GstockPackageImpl#getOperateur()
		 * @generated
		 */
		EClass OPERATEUR = eINSTANCE.getOperateur();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATEUR__TYPE = eINSTANCE.getOperateur_Type();

		/**
		 * The meta object literal for the '{@link gstock.impl.AccesVariableImpl <em>Acces Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gstock.impl.AccesVariableImpl
		 * @see gstock.impl.GstockPackageImpl#getAccesVariable()
		 * @generated
		 */
		EClass ACCES_VARIABLE = eINSTANCE.getAccesVariable();

		/**
		 * The meta object literal for the '<em><b>Colonne</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCES_VARIABLE__COLONNE = eINSTANCE.getAccesVariable_Colonne();

		/**
		 * The meta object literal for the '{@link gstock.Operations <em>Operations</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gstock.Operations
		 * @see gstock.impl.GstockPackageImpl#getOperations()
		 * @generated
		 */
		EEnum OPERATIONS = eINSTANCE.getOperations();

	}

} //GstockPackage
