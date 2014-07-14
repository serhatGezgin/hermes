/*
* generated by Xtext
*/
grammar InternalHermes;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.yazgel.hermes.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.yazgel.hermes.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.yazgel.hermes.xtext.services.HermesGrammarAccess;

}

@parser::members {

 	private HermesGrammarAccess grammarAccess;
 	
    public InternalHermesParser(TokenStream input, HermesGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Module";	
   	}
   	
   	@Override
   	protected HermesGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModule
entryRuleModule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModuleRule()); }
	 iv_ruleModule=ruleModule 
	 { $current=$iv_ruleModule.current; } 
	 EOF 
;

// Rule Module
ruleModule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getModuleAccess().getModuleAction_0(),
            $current);
    }
)	otherlv_1='module' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleQUALIFIED_NAME		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"QUALIFIED_NAME");
	        afterParserOrEnumRuleCall();
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_3_0_0()); 
	    }
		lv_packages_3_0=rulePackage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		add(
       			$current, 
       			"packages",
        		lv_packages_3_0, 
        		"Package");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_3_1_0()); 
	    }
		lv_packages_4_0=rulePackage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		add(
       			$current, 
       			"packages",
        		lv_packages_4_0, 
        		"Package");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?)
;





// Entry rule entryRulePackage
entryRulePackage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPackageRule()); }
	 iv_rulePackage=rulePackage 
	 { $current=$iv_rulePackage.current; } 
	 EOF 
;

// Rule Package
rulePackage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPackageAccess().getPackageAction_0(),
            $current);
    }
)	otherlv_1='package' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
	    }
		lv_name_2_0=ruleQUALIFIED_NAME		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"QUALIFIED_NAME");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_0_0()); 
	    }
		lv_entities_4_0=ruleEntity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		add(
       			$current, 
       			"entities",
        		lv_entities_4_0, 
        		"Entity");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_1_0()); 
	    }
		lv_entities_5_0=ruleEntity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		add(
       			$current, 
       			"entities",
        		lv_entities_5_0, 
        		"Entity");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	 iv_ruleFeature=ruleFeature 
	 { $current=$iv_ruleFeature.current; } 
	 EOF 
;

// Rule Feature
ruleFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_0()); 
    }
    this_Reference_0=ruleReference
    { 
        $current = $this_Reference_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); 
    }
    this_DataType_1=ruleDataType
    { 
        $current = $this_DataType_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	 iv_ruleEntity=ruleEntity 
	 { $current=$iv_ruleEntity.current; } 
	 EOF 
;

// Rule Entity
ruleEntity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getEntityAccess().getEntityAction_0(),
            $current);
    }
)((
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_0_0()); 
	    }
		lv_annotations_1_0=ruleEntityAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"annotations",
        		lv_annotations_1_0, 
        		"EntityAnnotation");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_1_0()); 
	    }
		lv_annotations_2_0=ruleEntityAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"annotations",
        		lv_annotations_2_0, 
        		"EntityAnnotation");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_3='entity' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getEntityKeyword_2());
    }
(
(
		lv_name_4_0=RULE_ID
		{
			newLeafNode(lv_name_4_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_4_0, 
        		"ID");
	    }

)
)(	otherlv_5=':' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getColonKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_4_1_0()); 
	}

)
))?	otherlv_7='{' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_0_0()); 
	    }
		lv_features_8_0=ruleFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"features",
        		lv_features_8_0, 
        		"Feature");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_1_0()); 
	    }
		lv_features_9_0=ruleFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"features",
        		lv_features_9_0, 
        		"Feature");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleReference
entryRuleReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getReferenceRule()); }
	 iv_ruleReference=ruleReference 
	 { $current=$iv_ruleReference.current; } 
	 EOF 
;

// Rule Reference
ruleReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getReferenceAccess().getReferenceAction_0(),
            $current);
    }
)((
(
		{ 
	        newCompositeNode(grammarAccess.getReferenceAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_0_0()); 
	    }
		lv_annotations_1_0=ruleFetureAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getReferenceRule());
	        }
       		add(
       			$current, 
       			"annotations",
        		lv_annotations_1_0, 
        		"FetureAnnotation");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getReferenceAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_1_0()); 
	    }
		lv_annotations_2_0=ruleFetureAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getReferenceRule());
	        }
       		add(
       			$current, 
       			"annotations",
        		lv_annotations_2_0, 
        		"FetureAnnotation");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_3='var' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getVarKeyword_2());
    }
(
(
		lv_name_4_0=RULE_ID
		{
			newLeafNode(lv_name_4_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getReferenceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_4_0, 
        		"ID");
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getReferenceRule());
	        }
        }
	otherlv_5=RULE_ID
	{
		newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getReferenceEntityCrossReference_4_0()); 
	}

)
)(
(
		lv_many_6_0=	'[]' 
    {
        newLeafNode(lv_many_6_0, grammarAccess.getReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getReferenceRule());
	        }
       		setWithLastConsumed($current, "many", true, "[]");
	    }

)
)?)
;





// Entry rule entryRuleDataType
entryRuleDataType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDataTypeRule()); }
	 iv_ruleDataType=ruleDataType 
	 { $current=$iv_ruleDataType.current; } 
	 EOF 
;

// Rule DataType
ruleDataType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDataTypeAccess().getDataTypeAction_0(),
            $current);
    }
)((
(
		{ 
	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_0_0()); 
	    }
		lv_annotations_1_0=ruleFetureAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataTypeRule());
	        }
       		add(
       			$current, 
       			"annotations",
        		lv_annotations_1_0, 
        		"FetureAnnotation");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_1_0()); 
	    }
		lv_annotations_2_0=ruleFetureAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataTypeRule());
	        }
       		add(
       			$current, 
       			"annotations",
        		lv_annotations_2_0, 
        		"FetureAnnotation");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_3='var' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDataTypeAccess().getVarKeyword_2());
    }
(
(
		lv_name_4_0=RULE_ID
		{
			newLeafNode(lv_name_4_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDataTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_4_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_4_0()); 
	    }
		lv_type_5_0=ruleDataTypes		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataTypeRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_5_0, 
        		"DataTypes");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_many_6_0=	'[]' 
    {
        newLeafNode(lv_many_6_0, grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDataTypeRule());
	        }
       		setWithLastConsumed($current, "many", true, "[]");
	    }

)
)?)
;





// Entry rule entryRuleQUALIFIED_NAME
entryRuleQUALIFIED_NAME returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQUALIFIED_NAMERule()); } 
	 iv_ruleQUALIFIED_NAME=ruleQUALIFIED_NAME 
	 { $current=$iv_ruleQUALIFIED_NAME.current.getText(); }  
	 EOF 
;

// Rule QUALIFIED_NAME
ruleQUALIFIED_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQUALIFIED_NAMEAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Rule EntityAnnotation
ruleEntityAnnotation returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
(	enumLiteral_0='@Cache' 
	{
        $current = grammarAccess.getEntityAnnotationAccess().getCacheEnumLiteralDeclaration().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getEntityAnnotationAccess().getCacheEnumLiteralDeclaration()); 
    }
);



// Rule FetureAnnotation
ruleFetureAnnotation returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='@Index' 
	{
        $current = grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='@Id' 
	{
        $current = grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='@Load' 
	{
        $current = grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='@Ignore' 
	{
        $current = grammarAccess.getFetureAnnotationAccess().getIgnoreEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getFetureAnnotationAccess().getIgnoreEnumLiteralDeclaration_3()); 
    }
));



// Rule DataTypes
ruleDataTypes returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='string' 
	{
        $current = grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='integer' 
	{
        $current = grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='boolean' 
	{
        $current = grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='long' 
	{
        $current = grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='double' 
	{
        $current = grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='object' 
	{
        $current = grammarAccess.getDataTypesAccess().getObjectEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getDataTypesAccess().getObjectEnumLiteralDeclaration_5()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


