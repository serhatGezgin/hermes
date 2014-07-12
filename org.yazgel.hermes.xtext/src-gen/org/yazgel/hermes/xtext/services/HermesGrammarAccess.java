/*
* generated by Xtext
*/
package org.yazgel.hermes.xtext.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class HermesGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class PackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Package");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPackageAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPackageKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDescriptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDescriptionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cDescriptionAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Assignment cOwnedEntityAssignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final RuleCall cOwnedEntityEntityParserRuleCall_5_0_0 = (RuleCall)cOwnedEntityAssignment_5_0.eContents().get(0);
		private final Assignment cOwnedEntityAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cOwnedEntityEntityParserRuleCall_5_1_0 = (RuleCall)cOwnedEntityAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Assignment cSubPackageAssignment_6_0 = (Assignment)cGroup_6.eContents().get(0);
		private final RuleCall cSubPackagePackageParserRuleCall_6_0_0 = (RuleCall)cSubPackageAssignment_6_0.eContents().get(0);
		private final Assignment cSubPackageAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cSubPackagePackageParserRuleCall_6_1_0 = (RuleCall)cSubPackageAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Package:
		//	{Package} "Package" name=ID "{" ("description" description=STRING)? (ownedEntity+=Entity ownedEntity+=Entity*)?
		//	(subPackage+=Package subPackage+=Package*)? "}";
		public ParserRule getRule() { return rule; }

		//{Package} "Package" name=ID "{" ("description" description=STRING)? (ownedEntity+=Entity ownedEntity+=Entity*)?
		//(subPackage+=Package subPackage+=Package*)? "}"
		public Group getGroup() { return cGroup; }

		//{Package}
		public Action getPackageAction_0() { return cPackageAction_0; }

		//"Package"
		public Keyword getPackageKeyword_1() { return cPackageKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("description" description=STRING)?
		public Group getGroup_4() { return cGroup_4; }

		//"description"
		public Keyword getDescriptionKeyword_4_0() { return cDescriptionKeyword_4_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_4_1() { return cDescriptionAssignment_4_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_4_1_0() { return cDescriptionSTRINGTerminalRuleCall_4_1_0; }

		//(ownedEntity+=Entity ownedEntity+=Entity*)?
		public Group getGroup_5() { return cGroup_5; }

		//ownedEntity+=Entity
		public Assignment getOwnedEntityAssignment_5_0() { return cOwnedEntityAssignment_5_0; }

		//Entity
		public RuleCall getOwnedEntityEntityParserRuleCall_5_0_0() { return cOwnedEntityEntityParserRuleCall_5_0_0; }

		//ownedEntity+=Entity*
		public Assignment getOwnedEntityAssignment_5_1() { return cOwnedEntityAssignment_5_1; }

		//Entity
		public RuleCall getOwnedEntityEntityParserRuleCall_5_1_0() { return cOwnedEntityEntityParserRuleCall_5_1_0; }

		//(subPackage+=Package subPackage+=Package*)?
		public Group getGroup_6() { return cGroup_6; }

		//subPackage+=Package
		public Assignment getSubPackageAssignment_6_0() { return cSubPackageAssignment_6_0; }

		//Package
		public RuleCall getSubPackagePackageParserRuleCall_6_0_0() { return cSubPackagePackageParserRuleCall_6_0_0; }

		//subPackage+=Package*
		public Assignment getSubPackageAssignment_6_1() { return cSubPackageAssignment_6_1; }

		//Package
		public RuleCall getSubPackagePackageParserRuleCall_6_1_0() { return cSubPackagePackageParserRuleCall_6_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Feature");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cRefParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDataTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Feature:
		//	Ref | DataType;
		public ParserRule getRule() { return rule; }

		//Ref | DataType
		public Alternatives getAlternatives() { return cAlternatives; }

		//Ref
		public RuleCall getRefParserRuleCall_0() { return cRefParserRuleCall_0; }

		//DataType
		public RuleCall getDataTypeParserRuleCall_1() { return cDataTypeParserRuleCall_1; }
	}

	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEntityAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEntityKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDescriptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cEqualsSignKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cDescriptionAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_4_2_0 = (RuleCall)cDescriptionAssignment_4_2.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Assignment cAnnotationsAssignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final RuleCall cAnnotationsEntityAnnotationEnumRuleCall_5_0_0 = (RuleCall)cAnnotationsAssignment_5_0.eContents().get(0);
		private final Assignment cAnnotationsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cAnnotationsEntityAnnotationEnumRuleCall_5_1_0 = (RuleCall)cAnnotationsAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cSuperEntityKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Keyword cColonKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cSuperEntityAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final CrossReference cSuperEntityEntityCrossReference_6_2_0 = (CrossReference)cSuperEntityAssignment_6_2.eContents().get(0);
		private final RuleCall cSuperEntityEntityIDTerminalRuleCall_6_2_0_1 = (RuleCall)cSuperEntityEntityCrossReference_6_2_0.eContents().get(1);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Assignment cOwnedFeatureAssignment_7_0 = (Assignment)cGroup_7.eContents().get(0);
		private final RuleCall cOwnedFeatureFeatureParserRuleCall_7_0_0 = (RuleCall)cOwnedFeatureAssignment_7_0.eContents().get(0);
		private final Assignment cOwnedFeatureAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cOwnedFeatureFeatureParserRuleCall_7_1_0 = (RuleCall)cOwnedFeatureAssignment_7_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Entity:
		//	{Entity} "Entity" name=ID "{" ("description" "=" description=STRING)? (annotations+=EntityAnnotation
		//	annotations+=EntityAnnotation*)? ("superEntity" ":" superEntity=[Entity])? (ownedFeature+=Feature
		//	ownedFeature+=Feature*)? "}";
		public ParserRule getRule() { return rule; }

		//{Entity} "Entity" name=ID "{" ("description" "=" description=STRING)? (annotations+=EntityAnnotation
		//annotations+=EntityAnnotation*)? ("superEntity" ":" superEntity=[Entity])? (ownedFeature+=Feature
		//ownedFeature+=Feature*)? "}"
		public Group getGroup() { return cGroup; }

		//{Entity}
		public Action getEntityAction_0() { return cEntityAction_0; }

		//"Entity"
		public Keyword getEntityKeyword_1() { return cEntityKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("description" "=" description=STRING)?
		public Group getGroup_4() { return cGroup_4; }

		//"description"
		public Keyword getDescriptionKeyword_4_0() { return cDescriptionKeyword_4_0; }

		//"="
		public Keyword getEqualsSignKeyword_4_1() { return cEqualsSignKeyword_4_1; }

		//description=STRING
		public Assignment getDescriptionAssignment_4_2() { return cDescriptionAssignment_4_2; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_4_2_0() { return cDescriptionSTRINGTerminalRuleCall_4_2_0; }

		//(annotations+=EntityAnnotation annotations+=EntityAnnotation*)?
		public Group getGroup_5() { return cGroup_5; }

		//annotations+=EntityAnnotation
		public Assignment getAnnotationsAssignment_5_0() { return cAnnotationsAssignment_5_0; }

		//EntityAnnotation
		public RuleCall getAnnotationsEntityAnnotationEnumRuleCall_5_0_0() { return cAnnotationsEntityAnnotationEnumRuleCall_5_0_0; }

		//annotations+=EntityAnnotation*
		public Assignment getAnnotationsAssignment_5_1() { return cAnnotationsAssignment_5_1; }

		//EntityAnnotation
		public RuleCall getAnnotationsEntityAnnotationEnumRuleCall_5_1_0() { return cAnnotationsEntityAnnotationEnumRuleCall_5_1_0; }

		//("superEntity" ":" superEntity=[Entity])?
		public Group getGroup_6() { return cGroup_6; }

		//"superEntity"
		public Keyword getSuperEntityKeyword_6_0() { return cSuperEntityKeyword_6_0; }

		//":"
		public Keyword getColonKeyword_6_1() { return cColonKeyword_6_1; }

		//superEntity=[Entity]
		public Assignment getSuperEntityAssignment_6_2() { return cSuperEntityAssignment_6_2; }

		//[Entity]
		public CrossReference getSuperEntityEntityCrossReference_6_2_0() { return cSuperEntityEntityCrossReference_6_2_0; }

		//ID
		public RuleCall getSuperEntityEntityIDTerminalRuleCall_6_2_0_1() { return cSuperEntityEntityIDTerminalRuleCall_6_2_0_1; }

		//(ownedFeature+=Feature ownedFeature+=Feature*)?
		public Group getGroup_7() { return cGroup_7; }

		//ownedFeature+=Feature
		public Assignment getOwnedFeatureAssignment_7_0() { return cOwnedFeatureAssignment_7_0; }

		//Feature
		public RuleCall getOwnedFeatureFeatureParserRuleCall_7_0_0() { return cOwnedFeatureFeatureParserRuleCall_7_0_0; }

		//ownedFeature+=Feature*
		public Assignment getOwnedFeatureAssignment_7_1() { return cOwnedFeatureAssignment_7_1; }

		//Feature
		public RuleCall getOwnedFeatureFeatureParserRuleCall_7_1_0() { return cOwnedFeatureFeatureParserRuleCall_7_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class RefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Ref");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cManyAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cManyManyKeyword_3_0 = (Keyword)cManyAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDescriptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDescriptionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cDescriptionAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Assignment cAnnotationsAssignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final RuleCall cAnnotationsFetureAnnotationEnumRuleCall_5_0_0 = (RuleCall)cAnnotationsAssignment_5_0.eContents().get(0);
		private final Assignment cAnnotationsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cAnnotationsFetureAnnotationEnumRuleCall_5_1_0 = (RuleCall)cAnnotationsAssignment_5_1.eContents().get(0);
		private final Keyword cSourceKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cSourceAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cSourceEntityCrossReference_8_0 = (CrossReference)cSourceAssignment_8.eContents().get(0);
		private final RuleCall cSourceEntityIDTerminalRuleCall_8_0_1 = (RuleCall)cSourceEntityCrossReference_8_0.eContents().get(1);
		private final Keyword cRefToKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cEqualsSignKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cRefToAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final CrossReference cRefToEntityCrossReference_11_0 = (CrossReference)cRefToAssignment_11.eContents().get(0);
		private final RuleCall cRefToEntityIDTerminalRuleCall_11_0_1 = (RuleCall)cRefToEntityCrossReference_11_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//Ref:
		//	"Ref" name=ID "{" many?="many"? ("description" description=STRING)? (annotations+=FetureAnnotation
		//	annotations+=FetureAnnotation*)? "source" "=" source=[Entity] "refTo" "=" refTo=[Entity] "}";
		public ParserRule getRule() { return rule; }

		//"Ref" name=ID "{" many?="many"? ("description" description=STRING)? (annotations+=FetureAnnotation
		//annotations+=FetureAnnotation*)? "source" "=" source=[Entity] "refTo" "=" refTo=[Entity] "}"
		public Group getGroup() { return cGroup; }

		//"Ref"
		public Keyword getRefKeyword_0() { return cRefKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//many?="many"?
		public Assignment getManyAssignment_3() { return cManyAssignment_3; }

		//"many"
		public Keyword getManyManyKeyword_3_0() { return cManyManyKeyword_3_0; }

		//("description" description=STRING)?
		public Group getGroup_4() { return cGroup_4; }

		//"description"
		public Keyword getDescriptionKeyword_4_0() { return cDescriptionKeyword_4_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_4_1() { return cDescriptionAssignment_4_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_4_1_0() { return cDescriptionSTRINGTerminalRuleCall_4_1_0; }

		//(annotations+=FetureAnnotation annotations+=FetureAnnotation*)?
		public Group getGroup_5() { return cGroup_5; }

		//annotations+=FetureAnnotation
		public Assignment getAnnotationsAssignment_5_0() { return cAnnotationsAssignment_5_0; }

		//FetureAnnotation
		public RuleCall getAnnotationsFetureAnnotationEnumRuleCall_5_0_0() { return cAnnotationsFetureAnnotationEnumRuleCall_5_0_0; }

		//annotations+=FetureAnnotation*
		public Assignment getAnnotationsAssignment_5_1() { return cAnnotationsAssignment_5_1; }

		//FetureAnnotation
		public RuleCall getAnnotationsFetureAnnotationEnumRuleCall_5_1_0() { return cAnnotationsFetureAnnotationEnumRuleCall_5_1_0; }

		//"source"
		public Keyword getSourceKeyword_6() { return cSourceKeyword_6; }

		//"="
		public Keyword getEqualsSignKeyword_7() { return cEqualsSignKeyword_7; }

		//source=[Entity]
		public Assignment getSourceAssignment_8() { return cSourceAssignment_8; }

		//[Entity]
		public CrossReference getSourceEntityCrossReference_8_0() { return cSourceEntityCrossReference_8_0; }

		//ID
		public RuleCall getSourceEntityIDTerminalRuleCall_8_0_1() { return cSourceEntityIDTerminalRuleCall_8_0_1; }

		//"refTo"
		public Keyword getRefToKeyword_9() { return cRefToKeyword_9; }

		//"="
		public Keyword getEqualsSignKeyword_10() { return cEqualsSignKeyword_10; }

		//refTo=[Entity]
		public Assignment getRefToAssignment_11() { return cRefToAssignment_11; }

		//[Entity]
		public CrossReference getRefToEntityCrossReference_11_0() { return cRefToEntityCrossReference_11_0; }

		//ID
		public RuleCall getRefToEntityIDTerminalRuleCall_11_0_1() { return cRefToEntityIDTerminalRuleCall_11_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
	}

	public class DataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DataType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDataTypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cManyAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cManyManyKeyword_3_0 = (Keyword)cManyAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDescriptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDescriptionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cDescriptionAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Assignment cAnnotationsAssignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final RuleCall cAnnotationsFetureAnnotationEnumRuleCall_5_0_0 = (RuleCall)cAnnotationsAssignment_5_0.eContents().get(0);
		private final Assignment cAnnotationsAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cAnnotationsFetureAnnotationEnumRuleCall_5_1_0 = (RuleCall)cAnnotationsAssignment_5_1.eContents().get(0);
		private final Keyword cTypeKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cEqualsSignKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cTypeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cTypeDataTypesEnumRuleCall_8_0 = (RuleCall)cTypeAssignment_8.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//DataType:
		//	"DataType" name=ID "{" many?="many"? ("description" description=STRING)? (annotations+=FetureAnnotation
		//	annotations+=FetureAnnotation*)? "type" "=" type=DataTypes "}";
		public ParserRule getRule() { return rule; }

		//"DataType" name=ID "{" many?="many"? ("description" description=STRING)? (annotations+=FetureAnnotation
		//annotations+=FetureAnnotation*)? "type" "=" type=DataTypes "}"
		public Group getGroup() { return cGroup; }

		//"DataType"
		public Keyword getDataTypeKeyword_0() { return cDataTypeKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//many?="many"?
		public Assignment getManyAssignment_3() { return cManyAssignment_3; }

		//"many"
		public Keyword getManyManyKeyword_3_0() { return cManyManyKeyword_3_0; }

		//("description" description=STRING)?
		public Group getGroup_4() { return cGroup_4; }

		//"description"
		public Keyword getDescriptionKeyword_4_0() { return cDescriptionKeyword_4_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_4_1() { return cDescriptionAssignment_4_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_4_1_0() { return cDescriptionSTRINGTerminalRuleCall_4_1_0; }

		//(annotations+=FetureAnnotation annotations+=FetureAnnotation*)?
		public Group getGroup_5() { return cGroup_5; }

		//annotations+=FetureAnnotation
		public Assignment getAnnotationsAssignment_5_0() { return cAnnotationsAssignment_5_0; }

		//FetureAnnotation
		public RuleCall getAnnotationsFetureAnnotationEnumRuleCall_5_0_0() { return cAnnotationsFetureAnnotationEnumRuleCall_5_0_0; }

		//annotations+=FetureAnnotation*
		public Assignment getAnnotationsAssignment_5_1() { return cAnnotationsAssignment_5_1; }

		//FetureAnnotation
		public RuleCall getAnnotationsFetureAnnotationEnumRuleCall_5_1_0() { return cAnnotationsFetureAnnotationEnumRuleCall_5_1_0; }

		//"type"
		public Keyword getTypeKeyword_6() { return cTypeKeyword_6; }

		//"="
		public Keyword getEqualsSignKeyword_7() { return cEqualsSignKeyword_7; }

		//type=DataTypes
		public Assignment getTypeAssignment_8() { return cTypeAssignment_8; }

		//DataTypes
		public RuleCall getTypeDataTypesEnumRuleCall_8_0() { return cTypeDataTypesEnumRuleCall_8_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	
	
	public class EntityAnnotationElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "EntityAnnotation");
		private final EnumLiteralDeclaration cCacheEnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cCacheCacheKeyword_0 = (Keyword)cCacheEnumLiteralDeclaration.eContents().get(0);
		
		//enum EntityAnnotation:
		//	Cache;
		public EnumRule getRule() { return rule; }

		//Cache
		public EnumLiteralDeclaration getCacheEnumLiteralDeclaration() { return cCacheEnumLiteralDeclaration; }

		//"Cache"
		public Keyword getCacheCacheKeyword_0() { return cCacheCacheKeyword_0; }
	}

	public class FetureAnnotationElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "FetureAnnotation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cIndexEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cIndexIndexKeyword_0_0 = (Keyword)cIndexEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cIdEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cIdIdKeyword_1_0 = (Keyword)cIdEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cLoadEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cLoadLoadKeyword_2_0 = (Keyword)cLoadEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cIgnoreEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cIgnoreIgnoreKeyword_3_0 = (Keyword)cIgnoreEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum FetureAnnotation:
		//	Index | Id | Load | Ignore;
		public EnumRule getRule() { return rule; }

		//Index | Id | Load | Ignore
		public Alternatives getAlternatives() { return cAlternatives; }

		//Index
		public EnumLiteralDeclaration getIndexEnumLiteralDeclaration_0() { return cIndexEnumLiteralDeclaration_0; }

		//"Index"
		public Keyword getIndexIndexKeyword_0_0() { return cIndexIndexKeyword_0_0; }

		//Id
		public EnumLiteralDeclaration getIdEnumLiteralDeclaration_1() { return cIdEnumLiteralDeclaration_1; }

		//"Id"
		public Keyword getIdIdKeyword_1_0() { return cIdIdKeyword_1_0; }

		//Load
		public EnumLiteralDeclaration getLoadEnumLiteralDeclaration_2() { return cLoadEnumLiteralDeclaration_2; }

		//"Load"
		public Keyword getLoadLoadKeyword_2_0() { return cLoadLoadKeyword_2_0; }

		//Ignore
		public EnumLiteralDeclaration getIgnoreEnumLiteralDeclaration_3() { return cIgnoreEnumLiteralDeclaration_3; }

		//"Ignore"
		public Keyword getIgnoreIgnoreKeyword_3_0() { return cIgnoreIgnoreKeyword_3_0; }
	}

	public class DataTypesElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "DataTypes");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cStringEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cStringStringKeyword_0_0 = (Keyword)cStringEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cIntegerEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cIntegerIntegerKeyword_1_0 = (Keyword)cIntegerEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBooleanEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBooleanBooleanKeyword_2_0 = (Keyword)cBooleanEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cLongEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cLongLongKeyword_3_0 = (Keyword)cLongEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cDoubleEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cDoubleDoubleKeyword_4_0 = (Keyword)cDoubleEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cObjectEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cObjectObjectKeyword_5_0 = (Keyword)cObjectEnumLiteralDeclaration_5.eContents().get(0);
		
		//enum DataTypes:
		//	String | Integer | Boolean | Long | Double | Object;
		public EnumRule getRule() { return rule; }

		//String | Integer | Boolean | Long | Double | Object
		public Alternatives getAlternatives() { return cAlternatives; }

		//String
		public EnumLiteralDeclaration getStringEnumLiteralDeclaration_0() { return cStringEnumLiteralDeclaration_0; }

		//"String"
		public Keyword getStringStringKeyword_0_0() { return cStringStringKeyword_0_0; }

		//Integer
		public EnumLiteralDeclaration getIntegerEnumLiteralDeclaration_1() { return cIntegerEnumLiteralDeclaration_1; }

		//"Integer"
		public Keyword getIntegerIntegerKeyword_1_0() { return cIntegerIntegerKeyword_1_0; }

		//Boolean
		public EnumLiteralDeclaration getBooleanEnumLiteralDeclaration_2() { return cBooleanEnumLiteralDeclaration_2; }

		//"Boolean"
		public Keyword getBooleanBooleanKeyword_2_0() { return cBooleanBooleanKeyword_2_0; }

		//Long
		public EnumLiteralDeclaration getLongEnumLiteralDeclaration_3() { return cLongEnumLiteralDeclaration_3; }

		//"Long"
		public Keyword getLongLongKeyword_3_0() { return cLongLongKeyword_3_0; }

		//Double
		public EnumLiteralDeclaration getDoubleEnumLiteralDeclaration_4() { return cDoubleEnumLiteralDeclaration_4; }

		//"Double"
		public Keyword getDoubleDoubleKeyword_4_0() { return cDoubleDoubleKeyword_4_0; }

		//Object
		public EnumLiteralDeclaration getObjectEnumLiteralDeclaration_5() { return cObjectEnumLiteralDeclaration_5; }

		//"Object"
		public Keyword getObjectObjectKeyword_5_0() { return cObjectObjectKeyword_5_0; }
	}
	
	private PackageElements pPackage;
	private FeatureElements pFeature;
	private EntityElements pEntity;
	private EntityAnnotationElements unknownRuleEntityAnnotation;
	private FetureAnnotationElements unknownRuleFetureAnnotation;
	private RefElements pRef;
	private DataTypeElements pDataType;
	private DataTypesElements unknownRuleDataTypes;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public HermesGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.yazgel.hermes.xtext.Hermes".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Package:
	//	{Package} "Package" name=ID "{" ("description" description=STRING)? (ownedEntity+=Entity ownedEntity+=Entity*)?
	//	(subPackage+=Package subPackage+=Package*)? "}";
	public PackageElements getPackageAccess() {
		return (pPackage != null) ? pPackage : (pPackage = new PackageElements());
	}
	
	public ParserRule getPackageRule() {
		return getPackageAccess().getRule();
	}

	//Feature:
	//	Ref | DataType;
	public FeatureElements getFeatureAccess() {
		return (pFeature != null) ? pFeature : (pFeature = new FeatureElements());
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}

	//Entity:
	//	{Entity} "Entity" name=ID "{" ("description" "=" description=STRING)? (annotations+=EntityAnnotation
	//	annotations+=EntityAnnotation*)? ("superEntity" ":" superEntity=[Entity])? (ownedFeature+=Feature
	//	ownedFeature+=Feature*)? "}";
	public EntityElements getEntityAccess() {
		return (pEntity != null) ? pEntity : (pEntity = new EntityElements());
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}

	//enum EntityAnnotation:
	//	Cache;
	public EntityAnnotationElements getEntityAnnotationAccess() {
		return (unknownRuleEntityAnnotation != null) ? unknownRuleEntityAnnotation : (unknownRuleEntityAnnotation = new EntityAnnotationElements());
	}
	
	public EnumRule getEntityAnnotationRule() {
		return getEntityAnnotationAccess().getRule();
	}

	//enum FetureAnnotation:
	//	Index | Id | Load | Ignore;
	public FetureAnnotationElements getFetureAnnotationAccess() {
		return (unknownRuleFetureAnnotation != null) ? unknownRuleFetureAnnotation : (unknownRuleFetureAnnotation = new FetureAnnotationElements());
	}
	
	public EnumRule getFetureAnnotationRule() {
		return getFetureAnnotationAccess().getRule();
	}

	//Ref:
	//	"Ref" name=ID "{" many?="many"? ("description" description=STRING)? (annotations+=FetureAnnotation
	//	annotations+=FetureAnnotation*)? "source" "=" source=[Entity] "refTo" "=" refTo=[Entity] "}";
	public RefElements getRefAccess() {
		return (pRef != null) ? pRef : (pRef = new RefElements());
	}
	
	public ParserRule getRefRule() {
		return getRefAccess().getRule();
	}

	//DataType:
	//	"DataType" name=ID "{" many?="many"? ("description" description=STRING)? (annotations+=FetureAnnotation
	//	annotations+=FetureAnnotation*)? "type" "=" type=DataTypes "}";
	public DataTypeElements getDataTypeAccess() {
		return (pDataType != null) ? pDataType : (pDataType = new DataTypeElements());
	}
	
	public ParserRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}

	//enum DataTypes:
	//	String | Integer | Boolean | Long | Double | Object;
	public DataTypesElements getDataTypesAccess() {
		return (unknownRuleDataTypes != null) ? unknownRuleDataTypes : (unknownRuleDataTypes = new DataTypesElements());
	}
	
	public EnumRule getDataTypesRule() {
		return getDataTypesAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}