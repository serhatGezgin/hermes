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
    	return "Package";	
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
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPackageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='description' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getDescriptionKeyword_4_0());
    }
(
(
		lv_description_5_0=RULE_STRING
		{
			newLeafNode(lv_description_5_0, grammarAccess.getPackageAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPackageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_5_0, 
        		"STRING");
	    }

)
))?((
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_5_0_0()); 
	    }
		lv_ownedEntity_6_0=ruleEntity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		add(
       			$current, 
       			"ownedEntity",
        		lv_ownedEntity_6_0, 
        		"Entity");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_5_1_0()); 
	    }
		lv_ownedEntity_7_0=ruleEntity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		add(
       			$current, 
       			"ownedEntity",
        		lv_ownedEntity_7_0, 
        		"Entity");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?((
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_6_0_0()); 
	    }
		lv_subPackage_8_0=rulePackage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		add(
       			$current, 
       			"subPackage",
        		lv_subPackage_8_0, 
        		"Package");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_6_1_0()); 
	    }
		lv_subPackage_9_0=rulePackage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		add(
       			$current, 
       			"subPackage",
        		lv_subPackage_9_0, 
        		"Package");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7());
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
)	otherlv_1='Entity' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='{' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
    }
(	otherlv_4='description' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getDescriptionKeyword_4_0());
    }
	otherlv_5='=' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getEqualsSignKeyword_4_1());
    }
(
(
		lv_description_6_0=RULE_STRING
		{
			newLeafNode(lv_description_6_0, grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_4_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_6_0, 
        		"STRING");
	    }

)
))?((
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_5_0_0()); 
	    }
		lv_annotations_7_0=ruleEntityAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"annotations",
        		lv_annotations_7_0, 
        		"EntityAnnotation");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_5_1_0()); 
	    }
		lv_annotations_8_0=ruleEntityAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"annotations",
        		lv_annotations_8_0, 
        		"EntityAnnotation");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?(	otherlv_9='superEntity' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getSuperEntityKeyword_6_0());
    }
	otherlv_10=':' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getColonKeyword_6_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityRule());
	        }
        }
	otherlv_11=RULE_ID
	{
		newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_6_2_0()); 
	}

)
))?((
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_7_0_0()); 
	    }
		lv_ownedFeature_12_0=ruleFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"ownedFeature",
        		lv_ownedFeature_12_0, 
        		"Feature");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_7_1_0()); 
	    }
		lv_ownedFeature_13_0=ruleFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEntityRule());
	        }
       		add(
       			$current, 
       			"ownedFeature",
        		lv_ownedFeature_13_0, 
        		"Feature");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_14='}' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8());
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
(	otherlv_0='Ref' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRefAccess().getRefKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getRefAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRefRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRefAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		lv_many_3_0=	'many' 
    {
        newLeafNode(lv_many_3_0, grammarAccess.getRefAccess().getManyManyKeyword_3_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRefRule());
	        }
       		setWithLastConsumed($current, "many", true, "many");
	    }

)
)?(	otherlv_4='description' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRefAccess().getDescriptionKeyword_4_0());
    }
(
(
		lv_description_5_0=RULE_STRING
		{
			newLeafNode(lv_description_5_0, grammarAccess.getRefAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRefRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_5_0, 
        		"STRING");
	    }

)
))?((
(
		{ 
	        newCompositeNode(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_0_0()); 
	    }
		lv_annotations_6_0=ruleFetureAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRefRule());
	        }
       		add(
       			$current, 
       			"annotations",
        		lv_annotations_6_0, 
        		"FetureAnnotation");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_1_0()); 
	    }
		lv_annotations_7_0=ruleFetureAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRefRule());
	        }
       		add(
       			$current, 
       			"annotations",
        		lv_annotations_7_0, 
        		"FetureAnnotation");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_8='source' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getRefAccess().getSourceKeyword_6());
    }
	otherlv_9='=' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getRefAccess().getEqualsSignKeyword_7());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRefRule());
	        }
        }
	otherlv_10=RULE_ID
	{
		newLeafNode(otherlv_10, grammarAccess.getRefAccess().getSourceEntityCrossReference_8_0()); 
	}

)
)	otherlv_11='refTo' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getRefAccess().getRefToKeyword_9());
    }
	otherlv_12='=' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getRefAccess().getEqualsSignKeyword_10());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRefRule());
	        }
        }
	otherlv_13=RULE_ID
	{
		newLeafNode(otherlv_13, grammarAccess.getRefAccess().getRefToEntityCrossReference_11_0()); 
	}

)
)	otherlv_14='}' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getRefAccess().getRightCurlyBracketKeyword_12());
    }
)
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
(	otherlv_0='DataType' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDataTypeKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDataTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		lv_many_3_0=	'many' 
    {
        newLeafNode(lv_many_3_0, grammarAccess.getDataTypeAccess().getManyManyKeyword_3_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDataTypeRule());
	        }
       		setWithLastConsumed($current, "many", true, "many");
	    }

)
)?(	otherlv_4='description' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getDescriptionKeyword_4_0());
    }
(
(
		lv_description_5_0=RULE_STRING
		{
			newLeafNode(lv_description_5_0, grammarAccess.getDataTypeAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDataTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_5_0, 
        		"STRING");
	    }

)
))?((
(
		{ 
	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_0_0()); 
	    }
		lv_annotations_6_0=ruleFetureAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataTypeRule());
	        }
       		add(
       			$current, 
       			"annotations",
        		lv_annotations_6_0, 
        		"FetureAnnotation");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_1_0()); 
	    }
		lv_annotations_7_0=ruleFetureAnnotation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataTypeRule());
	        }
       		add(
       			$current, 
       			"annotations",
        		lv_annotations_7_0, 
        		"FetureAnnotation");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_8='type' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getDataTypeAccess().getTypeKeyword_6());
    }
	otherlv_9='=' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getDataTypeAccess().getEqualsSignKeyword_7());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_8_0()); 
	    }
		lv_type_10_0=ruleDataTypes		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataTypeRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_10_0, 
        		"DataTypes");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11='}' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_9());
    }
)
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


