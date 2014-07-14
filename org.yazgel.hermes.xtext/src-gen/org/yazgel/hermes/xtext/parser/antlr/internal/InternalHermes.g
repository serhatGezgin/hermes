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
)	otherlv_1='Module' 
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
)	otherlv_1='Package' 
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
	        newCompositeNode(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_4_0_0()); 
	    }
		lv_ownedEntity_4_0=ruleEntity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		add(
       			$current, 
       			"ownedEntity",
        		lv_ownedEntity_4_0, 
        		"Entity");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_4_1_0()); 
	    }
		lv_ownedEntity_5_0=ruleEntity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		add(
       			$current, 
       			"ownedEntity",
        		lv_ownedEntity_5_0, 
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
        newCompositeNode(grammarAccess.getFeatureAccess().getRefParserRuleCall_0()); 
    }
    this_Ref_0=ruleRef
    { 
        $current = $this_Ref_0.current; 
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
)(	otherlv_1='@' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getCommercialAtKeyword_1_0());
    }
(
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
)(	otherlv_3='@' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getCommercialAtKeyword_1_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_2_1_0()); 
	    }
		lv_annotations_4_0=ruleEntityAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"annotations",
        		lv_annotations_4_0, 
        		"EntityAnnotation");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_5='Entity' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getEntityKeyword_2());
    }
(
(
		lv_name_6_0=RULE_ID
		{
			newLeafNode(lv_name_6_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_6_0, 
        		"ID");
	    }

)
)(	otherlv_7=':' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getColonKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
        }
	otherlv_8=RULE_ID
	{
		newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_4_1_0()); 
	}

)
))?	otherlv_9='{' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_0_0()); 
	    }
		lv_ownedFeature_10_0=ruleFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"ownedFeature",
        		lv_ownedFeature_10_0, 
        		"Feature");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_1_0()); 
	    }
		lv_ownedFeature_11_0=ruleFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"ownedFeature",
        		lv_ownedFeature_11_0, 
        		"Feature");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_12='}' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleRef
entryRuleRef returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRefRule()); }
	 iv_ruleRef=ruleRef 
	 { $current=$iv_ruleRef.current; } 
	 EOF 
;

// Rule Ref
ruleRef returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getRefAccess().getRefAction_0(),
            $current);
    }
)(	otherlv_1='@' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getRefAccess().getCommercialAtKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_1_0()); 
	    }
		lv_annotations_2_0=ruleFetureAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRefRule());
	        }
       		add(
       			$current, 
       			"annotations",
        		lv_annotations_2_0, 
        		"FetureAnnotation");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3='@' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getRefAccess().getCommercialAtKeyword_1_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_2_1_0()); 
	    }
		lv_annotations_4_0=ruleFetureAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRefRule());
	        }
       		add(
       			$current, 
       			"annotations",
        		lv_annotations_4_0, 
        		"FetureAnnotation");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_5='var' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getRefAccess().getVarKeyword_2());
    }
(
(
		lv_name_6_0=RULE_ID
		{
			newLeafNode(lv_name_6_0, grammarAccess.getRefAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRefRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_6_0, 
        		"ID");
	    }

)
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRefRule());
	        }
        }
	otherlv_7=RULE_ID
	{
		newLeafNode(otherlv_7, grammarAccess.getRefAccess().getRefToEntityCrossReference_4_0()); 
	}

)
)(
(
		lv_many_8_0=	'[]' 
    {
        newLeafNode(lv_many_8_0, grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRefRule());
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
)(	otherlv_1='@' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getCommercialAtKeyword_1_0());
    }
(
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
)(	otherlv_3='@' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDataTypeAccess().getCommercialAtKeyword_1_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_2_1_0()); 
	    }
		lv_annotations_4_0=ruleFetureAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataTypeRule());
	        }
       		add(
       			$current, 
       			"annotations",
        		lv_annotations_4_0, 
        		"FetureAnnotation");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_5='var' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getDataTypeAccess().getVarKeyword_2());
    }
(
(
		lv_name_6_0=RULE_ID
		{
			newLeafNode(lv_name_6_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDataTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_6_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_4_0()); 
	    }
		lv_type_7_0=ruleDataTypes		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataTypeRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_7_0, 
        		"DataTypes");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_many_8_0=	'[]' 
    {
        newLeafNode(lv_many_8_0, grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0());
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
(	enumLiteral_0='Cache' 
	{
        $current = grammarAccess.getEntityAnnotationAccess().getCacheEnumLiteralDeclaration().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getEntityAnnotationAccess().getCacheEnumLiteralDeclaration()); 
    }
);



// Rule FetureAnnotation
ruleFetureAnnotation returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='Index' 
	{
        $current = grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='Id' 
	{
        $current = grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='Load' 
	{
        $current = grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='Ignore' 
	{
        $current = grammarAccess.getFetureAnnotationAccess().getIgnoreEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getFetureAnnotationAccess().getIgnoreEnumLiteralDeclaration_3()); 
    }
));



// Rule DataTypes
ruleDataTypes returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='String' 
	{
        $current = grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='Integer' 
	{
        $current = grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='Boolean' 
	{
        $current = grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='Long' 
	{
        $current = grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='Double' 
	{
        $current = grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='Object' 
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


