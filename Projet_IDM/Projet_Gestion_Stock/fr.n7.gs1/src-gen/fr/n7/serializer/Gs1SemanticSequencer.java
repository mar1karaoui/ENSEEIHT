/*
 * generated by Xtext 2.32.0
 */
package fr.n7.serializer;

import com.google.inject.Inject;
import fr.n7.gs1.AccesVariable;
import fr.n7.gs1.Application;
import fr.n7.gs1.Colonne_derivee;
import fr.n7.gs1.Colonne_referencee;
import fr.n7.gs1.Colonnesimple;
import fr.n7.gs1.ExpressionBinaire;
import fr.n7.gs1.Gs1Package;
import fr.n7.gs1.Model;
import fr.n7.gs1.Operateur;
import fr.n7.gs1.Table;
import fr.n7.services.Gs1GrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class Gs1SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Gs1GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Gs1Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Gs1Package.ACCES_VARIABLE:
				sequence_AccesVariable(context, (AccesVariable) semanticObject); 
				return; 
			case Gs1Package.APPLICATION:
				sequence_Application(context, (Application) semanticObject); 
				return; 
			case Gs1Package.COLONNE_DERIVEE:
				sequence_Colonne_derivee(context, (Colonne_derivee) semanticObject); 
				return; 
			case Gs1Package.COLONNE_REFERENCEE:
				sequence_Colonne_referencee(context, (Colonne_referencee) semanticObject); 
				return; 
			case Gs1Package.COLONNESIMPLE:
				sequence_Colonnesimple(context, (Colonnesimple) semanticObject); 
				return; 
			case Gs1Package.EXPRESSION_BINAIRE:
				sequence_ExpressionBinaire(context, (ExpressionBinaire) semanticObject); 
				return; 
			case Gs1Package.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case Gs1Package.OPERATEUR:
				sequence_Operateur(context, (Operateur) semanticObject); 
				return; 
			case Gs1Package.TABLE:
				sequence_Table(context, (Table) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns AccesVariable
	 *     AccesVariable returns AccesVariable
	 *
	 * Constraint:
	 *     (name=ID colonne=[Colonne|ID])
	 * </pre>
	 */
	protected void sequence_AccesVariable(ISerializationContext context, AccesVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.EXPRESSION__NAME));
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.ACCES_VARIABLE__COLONNE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.ACCES_VARIABLE__COLONNE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAccesVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAccesVariableAccess().getColonneColonneIDTerminalRuleCall_5_0_1(), semanticObject.eGet(Gs1Package.Literals.ACCES_VARIABLE__COLONNE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Application returns Application
	 *
	 * Constraint:
	 *     tables+=Table+
	 * </pre>
	 */
	protected void sequence_Application(ISerializationContext context, Application semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Colonne returns Colonne_derivee
	 *     Colonne_derivee returns Colonne_derivee
	 *
	 * Constraint:
	 *     (name=ID id=INT Nom=STRING expression=Expression)
	 * </pre>
	 */
	protected void sequence_Colonne_derivee(ISerializationContext context, Colonne_derivee semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.COLONNE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.COLONNE__NAME));
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.COLONNE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.COLONNE__ID));
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.COLONNE__NOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.COLONNE__NOM));
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.COLONNE_DERIVEE__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.COLONNE_DERIVEE__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColonne_deriveeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getColonne_deriveeAccess().getIdINTTerminalRuleCall_5_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getColonne_deriveeAccess().getNomSTRINGTerminalRuleCall_8_0(), semanticObject.getNom());
		feeder.accept(grammarAccess.getColonne_deriveeAccess().getExpressionExpressionParserRuleCall_11_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Colonne returns Colonne_referencee
	 *     Colonne_referencee returns Colonne_referencee
	 *
	 * Constraint:
	 *     (name=ID id=INT Nom=STRING table=[Table|ID] colonne=[Colonne|ID])
	 * </pre>
	 */
	protected void sequence_Colonne_referencee(ISerializationContext context, Colonne_referencee semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.COLONNE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.COLONNE__NAME));
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.COLONNE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.COLONNE__ID));
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.COLONNE__NOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.COLONNE__NOM));
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.COLONNE_REFERENCEE__TABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.COLONNE_REFERENCEE__TABLE));
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.COLONNE_REFERENCEE__COLONNE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.COLONNE_REFERENCEE__COLONNE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColonne_referenceeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getColonne_referenceeAccess().getIdINTTerminalRuleCall_5_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getColonne_referenceeAccess().getNomSTRINGTerminalRuleCall_8_0(), semanticObject.getNom());
		feeder.accept(grammarAccess.getColonne_referenceeAccess().getTableTableIDTerminalRuleCall_11_0_1(), semanticObject.eGet(Gs1Package.Literals.COLONNE_REFERENCEE__TABLE, false));
		feeder.accept(grammarAccess.getColonne_referenceeAccess().getColonneColonneIDTerminalRuleCall_14_0_1(), semanticObject.eGet(Gs1Package.Literals.COLONNE_REFERENCEE__COLONNE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Colonne returns Colonnesimple
	 *     Colonnesimple returns Colonnesimple
	 *
	 * Constraint:
	 *     (name=ID id=INT Nom=STRING)
	 * </pre>
	 */
	protected void sequence_Colonnesimple(ISerializationContext context, Colonnesimple semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.COLONNE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.COLONNE__NAME));
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.COLONNE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.COLONNE__ID));
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.COLONNE__NOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.COLONNE__NOM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getColonnesimpleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getColonnesimpleAccess().getIdINTTerminalRuleCall_5_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getColonnesimpleAccess().getNomSTRINGTerminalRuleCall_8_0(), semanticObject.getNom());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns ExpressionBinaire
	 *     ExpressionBinaire returns ExpressionBinaire
	 *
	 * Constraint:
	 *     (name=ID operandeG=Expression operateur=Operateur operandeD=Expression)
	 * </pre>
	 */
	protected void sequence_ExpressionBinaire(ISerializationContext context, ExpressionBinaire semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.EXPRESSION__NAME));
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.EXPRESSION_BINAIRE__OPERANDE_G) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.EXPRESSION_BINAIRE__OPERANDE_G));
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.EXPRESSION_BINAIRE__OPERATEUR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.EXPRESSION_BINAIRE__OPERATEUR));
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.EXPRESSION_BINAIRE__OPERANDE_D) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.EXPRESSION_BINAIRE__OPERANDE_D));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpressionBinaireAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getExpressionBinaireAccess().getOperandeGExpressionParserRuleCall_5_0(), semanticObject.getOperandeG());
		feeder.accept(grammarAccess.getExpressionBinaireAccess().getOperateurOperateurParserRuleCall_8_0(), semanticObject.getOperateur());
		feeder.accept(grammarAccess.getExpressionBinaireAccess().getOperandeDExpressionParserRuleCall_11_0(), semanticObject.getOperandeD());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     applications+=Application+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Operateur returns Operateur
	 *
	 * Constraint:
	 *     type=Operations
	 * </pre>
	 */
	protected void sequence_Operateur(ISerializationContext context, Operateur semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Gs1Package.Literals.OPERATEUR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Gs1Package.Literals.OPERATEUR__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperateurAccess().getTypeOperationsEnumRuleCall_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Table returns Table
	 *
	 * Constraint:
	 *     (name=ID id=INT Nom=STRING colonnes+=Colonne*)
	 * </pre>
	 */
	protected void sequence_Table(ISerializationContext context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
