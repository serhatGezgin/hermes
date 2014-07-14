package org.yazgel.hermes.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.yazgel.hermes.DataType;
import org.yazgel.hermes.Entity;
import org.yazgel.hermes.HermesPackage;
import org.yazgel.hermes.Module;
import org.yazgel.hermes.Ref;
import org.yazgel.hermes.xtext.services.HermesGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractHermesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private HermesGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == HermesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case HermesPackage.DATA_TYPE:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getFeatureRule()) {
					sequence_DataType(context, (DataType) semanticObject); 
					return; 
				}
				else break;
			case HermesPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case HermesPackage.MODULE:
				if(context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case HermesPackage.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (org.yazgel.hermes.Package) semanticObject); 
					return; 
				}
				else break;
			case HermesPackage.REF:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getRefRule()) {
					sequence_Ref(context, (Ref) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((annotations+=FetureAnnotation annotations+=FetureAnnotation*)? name=ID type=DataTypes many?='[]'?)
	 */
	protected void sequence_DataType(EObject context, DataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (annotations+=EntityAnnotation annotations+=EntityAnnotation*)? 
	 *         name=ID 
	 *         superEntity=[Entity|ID]? 
	 *         (ownedFeature+=Feature ownedFeature+=Feature*)?
	 *     )
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (packages+=Package packages+=Package*)?)
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (ownedEntity+=Entity ownedEntity+=Entity*)?)
	 */
	protected void sequence_Package(EObject context, org.yazgel.hermes.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((annotations+=FetureAnnotation annotations+=FetureAnnotation*)? name=ID refTo=[Entity|ID] many?='[]'?)
	 */
	protected void sequence_Ref(EObject context, Ref semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
