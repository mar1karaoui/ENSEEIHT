/**
 * generated by Xtext 2.32.0
 */
package fr.n7.gs1;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.n7.gs1.Gs1Factory
 * @model kind="package"
 * @generated
 */
public interface Gs1Package extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gs1";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.n7.fr/Gs1";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gs1";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Gs1Package eINSTANCE = fr.n7.gs1.impl.Gs1PackageImpl.init();

  /**
   * The meta object id for the '{@link fr.n7.gs1.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.gs1.impl.ModelImpl
   * @see fr.n7.gs1.impl.Gs1PackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Applications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__APPLICATIONS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.n7.gs1.impl.ApplicationImpl <em>Application</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.gs1.impl.ApplicationImpl
   * @see fr.n7.gs1.impl.Gs1PackageImpl#getApplication()
   * @generated
   */
  int APPLICATION = 1;

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
   * The meta object id for the '{@link fr.n7.gs1.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.gs1.impl.TableImpl
   * @see fr.n7.gs1.impl.Gs1PackageImpl#getTable()
   * @generated
   */
  int TABLE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__ID = 1;

  /**
   * The feature id for the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__NOM = 2;

  /**
   * The feature id for the '<em><b>Colonnes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__COLONNES = 3;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.n7.gs1.impl.ColonneImpl <em>Colonne</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.gs1.impl.ColonneImpl
   * @see fr.n7.gs1.impl.Gs1PackageImpl#getColonne()
   * @generated
   */
  int COLONNE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLONNE__NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLONNE__ID = 1;

  /**
   * The feature id for the '<em><b>Nom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLONNE__NOM = 2;

  /**
   * The number of structural features of the '<em>Colonne</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLONNE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.n7.gs1.impl.Colonne_deriveeImpl <em>Colonne derivee</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.gs1.impl.Colonne_deriveeImpl
   * @see fr.n7.gs1.impl.Gs1PackageImpl#getColonne_derivee()
   * @generated
   */
  int COLONNE_DERIVEE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLONNE_DERIVEE__NAME = COLONNE__NAME;

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
   * The meta object id for the '{@link fr.n7.gs1.impl.Colonne_referenceeImpl <em>Colonne referencee</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.gs1.impl.Colonne_referenceeImpl
   * @see fr.n7.gs1.impl.Gs1PackageImpl#getColonne_referencee()
   * @generated
   */
  int COLONNE_REFERENCEE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLONNE_REFERENCEE__NAME = COLONNE__NAME;

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
   * The meta object id for the '{@link fr.n7.gs1.impl.ColonnesimpleImpl <em>Colonnesimple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.gs1.impl.ColonnesimpleImpl
   * @see fr.n7.gs1.impl.Gs1PackageImpl#getColonnesimple()
   * @generated
   */
  int COLONNESIMPLE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLONNESIMPLE__NAME = COLONNE__NAME;

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
   * The number of structural features of the '<em>Colonnesimple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLONNESIMPLE_FEATURE_COUNT = COLONNE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.n7.gs1.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.gs1.impl.ExpressionImpl
   * @see fr.n7.gs1.impl.Gs1PackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__NAME = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.n7.gs1.impl.ExpressionBinaireImpl <em>Expression Binaire</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.gs1.impl.ExpressionBinaireImpl
   * @see fr.n7.gs1.impl.Gs1PackageImpl#getExpressionBinaire()
   * @generated
   */
  int EXPRESSION_BINAIRE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BINAIRE__NAME = EXPRESSION__NAME;

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
   * The meta object id for the '{@link fr.n7.gs1.impl.AccesVariableImpl <em>Acces Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.gs1.impl.AccesVariableImpl
   * @see fr.n7.gs1.impl.Gs1PackageImpl#getAccesVariable()
   * @generated
   */
  int ACCES_VARIABLE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCES_VARIABLE__NAME = EXPRESSION__NAME;

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
   * The meta object id for the '{@link fr.n7.gs1.impl.OperateurImpl <em>Operateur</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.gs1.impl.OperateurImpl
   * @see fr.n7.gs1.impl.Gs1PackageImpl#getOperateur()
   * @generated
   */
  int OPERATEUR = 10;

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
   * The meta object id for the '{@link fr.n7.gs1.Operations <em>Operations</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.n7.gs1.Operations
   * @see fr.n7.gs1.impl.Gs1PackageImpl#getOperations()
   * @generated
   */
  int OPERATIONS = 11;


  /**
   * Returns the meta object for class '{@link fr.n7.gs1.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see fr.n7.gs1.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link fr.n7.gs1.Model#getApplications <em>Applications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Applications</em>'.
   * @see fr.n7.gs1.Model#getApplications()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Applications();

  /**
   * Returns the meta object for class '{@link fr.n7.gs1.Application <em>Application</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application</em>'.
   * @see fr.n7.gs1.Application
   * @generated
   */
  EClass getApplication();

  /**
   * Returns the meta object for the containment reference list '{@link fr.n7.gs1.Application#getTables <em>Tables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tables</em>'.
   * @see fr.n7.gs1.Application#getTables()
   * @see #getApplication()
   * @generated
   */
  EReference getApplication_Tables();

  /**
   * Returns the meta object for class '{@link fr.n7.gs1.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see fr.n7.gs1.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.gs1.Table#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.gs1.Table#getName()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.gs1.Table#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see fr.n7.gs1.Table#getId()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Id();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.gs1.Table#getNom <em>Nom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nom</em>'.
   * @see fr.n7.gs1.Table#getNom()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Nom();

  /**
   * Returns the meta object for the containment reference list '{@link fr.n7.gs1.Table#getColonnes <em>Colonnes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Colonnes</em>'.
   * @see fr.n7.gs1.Table#getColonnes()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Colonnes();

  /**
   * Returns the meta object for class '{@link fr.n7.gs1.Colonne <em>Colonne</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Colonne</em>'.
   * @see fr.n7.gs1.Colonne
   * @generated
   */
  EClass getColonne();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.gs1.Colonne#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.gs1.Colonne#getName()
   * @see #getColonne()
   * @generated
   */
  EAttribute getColonne_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.gs1.Colonne#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see fr.n7.gs1.Colonne#getId()
   * @see #getColonne()
   * @generated
   */
  EAttribute getColonne_Id();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.gs1.Colonne#getNom <em>Nom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nom</em>'.
   * @see fr.n7.gs1.Colonne#getNom()
   * @see #getColonne()
   * @generated
   */
  EAttribute getColonne_Nom();

  /**
   * Returns the meta object for class '{@link fr.n7.gs1.Colonne_derivee <em>Colonne derivee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Colonne derivee</em>'.
   * @see fr.n7.gs1.Colonne_derivee
   * @generated
   */
  EClass getColonne_derivee();

  /**
   * Returns the meta object for the containment reference '{@link fr.n7.gs1.Colonne_derivee#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see fr.n7.gs1.Colonne_derivee#getExpression()
   * @see #getColonne_derivee()
   * @generated
   */
  EReference getColonne_derivee_Expression();

  /**
   * Returns the meta object for class '{@link fr.n7.gs1.Colonne_referencee <em>Colonne referencee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Colonne referencee</em>'.
   * @see fr.n7.gs1.Colonne_referencee
   * @generated
   */
  EClass getColonne_referencee();

  /**
   * Returns the meta object for the reference '{@link fr.n7.gs1.Colonne_referencee#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Table</em>'.
   * @see fr.n7.gs1.Colonne_referencee#getTable()
   * @see #getColonne_referencee()
   * @generated
   */
  EReference getColonne_referencee_Table();

  /**
   * Returns the meta object for the reference '{@link fr.n7.gs1.Colonne_referencee#getColonne <em>Colonne</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Colonne</em>'.
   * @see fr.n7.gs1.Colonne_referencee#getColonne()
   * @see #getColonne_referencee()
   * @generated
   */
  EReference getColonne_referencee_Colonne();

  /**
   * Returns the meta object for class '{@link fr.n7.gs1.Colonnesimple <em>Colonnesimple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Colonnesimple</em>'.
   * @see fr.n7.gs1.Colonnesimple
   * @generated
   */
  EClass getColonnesimple();

  /**
   * Returns the meta object for class '{@link fr.n7.gs1.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see fr.n7.gs1.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.gs1.Expression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.n7.gs1.Expression#getName()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Name();

  /**
   * Returns the meta object for class '{@link fr.n7.gs1.ExpressionBinaire <em>Expression Binaire</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Binaire</em>'.
   * @see fr.n7.gs1.ExpressionBinaire
   * @generated
   */
  EClass getExpressionBinaire();

  /**
   * Returns the meta object for the containment reference '{@link fr.n7.gs1.ExpressionBinaire#getOperandeG <em>Operande G</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operande G</em>'.
   * @see fr.n7.gs1.ExpressionBinaire#getOperandeG()
   * @see #getExpressionBinaire()
   * @generated
   */
  EReference getExpressionBinaire_OperandeG();

  /**
   * Returns the meta object for the containment reference '{@link fr.n7.gs1.ExpressionBinaire#getOperateur <em>Operateur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operateur</em>'.
   * @see fr.n7.gs1.ExpressionBinaire#getOperateur()
   * @see #getExpressionBinaire()
   * @generated
   */
  EReference getExpressionBinaire_Operateur();

  /**
   * Returns the meta object for the containment reference '{@link fr.n7.gs1.ExpressionBinaire#getOperandeD <em>Operande D</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operande D</em>'.
   * @see fr.n7.gs1.ExpressionBinaire#getOperandeD()
   * @see #getExpressionBinaire()
   * @generated
   */
  EReference getExpressionBinaire_OperandeD();

  /**
   * Returns the meta object for class '{@link fr.n7.gs1.AccesVariable <em>Acces Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Acces Variable</em>'.
   * @see fr.n7.gs1.AccesVariable
   * @generated
   */
  EClass getAccesVariable();

  /**
   * Returns the meta object for the reference '{@link fr.n7.gs1.AccesVariable#getColonne <em>Colonne</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Colonne</em>'.
   * @see fr.n7.gs1.AccesVariable#getColonne()
   * @see #getAccesVariable()
   * @generated
   */
  EReference getAccesVariable_Colonne();

  /**
   * Returns the meta object for class '{@link fr.n7.gs1.Operateur <em>Operateur</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operateur</em>'.
   * @see fr.n7.gs1.Operateur
   * @generated
   */
  EClass getOperateur();

  /**
   * Returns the meta object for the attribute '{@link fr.n7.gs1.Operateur#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see fr.n7.gs1.Operateur#getType()
   * @see #getOperateur()
   * @generated
   */
  EAttribute getOperateur_Type();

  /**
   * Returns the meta object for enum '{@link fr.n7.gs1.Operations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operations</em>'.
   * @see fr.n7.gs1.Operations
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
  Gs1Factory getGs1Factory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.n7.gs1.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.gs1.impl.ModelImpl
     * @see fr.n7.gs1.impl.Gs1PackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__APPLICATIONS = eINSTANCE.getModel_Applications();

    /**
     * The meta object literal for the '{@link fr.n7.gs1.impl.ApplicationImpl <em>Application</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.gs1.impl.ApplicationImpl
     * @see fr.n7.gs1.impl.Gs1PackageImpl#getApplication()
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
     * The meta object literal for the '{@link fr.n7.gs1.impl.TableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.gs1.impl.TableImpl
     * @see fr.n7.gs1.impl.Gs1PackageImpl#getTable()
     * @generated
     */
    EClass TABLE = eINSTANCE.getTable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

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
     * The meta object literal for the '{@link fr.n7.gs1.impl.ColonneImpl <em>Colonne</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.gs1.impl.ColonneImpl
     * @see fr.n7.gs1.impl.Gs1PackageImpl#getColonne()
     * @generated
     */
    EClass COLONNE = eINSTANCE.getColonne();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLONNE__NAME = eINSTANCE.getColonne_Name();

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
     * The meta object literal for the '{@link fr.n7.gs1.impl.Colonne_deriveeImpl <em>Colonne derivee</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.gs1.impl.Colonne_deriveeImpl
     * @see fr.n7.gs1.impl.Gs1PackageImpl#getColonne_derivee()
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
     * The meta object literal for the '{@link fr.n7.gs1.impl.Colonne_referenceeImpl <em>Colonne referencee</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.gs1.impl.Colonne_referenceeImpl
     * @see fr.n7.gs1.impl.Gs1PackageImpl#getColonne_referencee()
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
     * The meta object literal for the '{@link fr.n7.gs1.impl.ColonnesimpleImpl <em>Colonnesimple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.gs1.impl.ColonnesimpleImpl
     * @see fr.n7.gs1.impl.Gs1PackageImpl#getColonnesimple()
     * @generated
     */
    EClass COLONNESIMPLE = eINSTANCE.getColonnesimple();

    /**
     * The meta object literal for the '{@link fr.n7.gs1.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.gs1.impl.ExpressionImpl
     * @see fr.n7.gs1.impl.Gs1PackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__NAME = eINSTANCE.getExpression_Name();

    /**
     * The meta object literal for the '{@link fr.n7.gs1.impl.ExpressionBinaireImpl <em>Expression Binaire</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.gs1.impl.ExpressionBinaireImpl
     * @see fr.n7.gs1.impl.Gs1PackageImpl#getExpressionBinaire()
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
     * The meta object literal for the '{@link fr.n7.gs1.impl.AccesVariableImpl <em>Acces Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.gs1.impl.AccesVariableImpl
     * @see fr.n7.gs1.impl.Gs1PackageImpl#getAccesVariable()
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
     * The meta object literal for the '{@link fr.n7.gs1.impl.OperateurImpl <em>Operateur</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.gs1.impl.OperateurImpl
     * @see fr.n7.gs1.impl.Gs1PackageImpl#getOperateur()
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
     * The meta object literal for the '{@link fr.n7.gs1.Operations <em>Operations</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.n7.gs1.Operations
     * @see fr.n7.gs1.impl.Gs1PackageImpl#getOperations()
     * @generated
     */
    EEnum OPERATIONS = eINSTANCE.getOperations();

  }

} //Gs1Package
