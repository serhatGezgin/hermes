/*
* generated by Xtext
*/
grammar InternalHermes;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.yazgel.hermes.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.yazgel.hermes.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.yazgel.hermes.xtext.services.HermesGrammarAccess;

}

@parser::members {
 
 	private HermesGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(HermesGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRulePackage
entryRulePackage 
:
{ before(grammarAccess.getPackageRule()); }
	 rulePackage
{ after(grammarAccess.getPackageRule()); } 
	 EOF 
;

// Rule Package
rulePackage
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPackageAccess().getGroup()); }
(rule__Package__Group__0)
{ after(grammarAccess.getPackageAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFeature
entryRuleFeature 
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFeatureAccess().getAlternatives()); }
(rule__Feature__Alternatives)
{ after(grammarAccess.getFeatureAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEntity
entryRuleEntity 
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEntityAccess().getGroup()); }
(rule__Entity__Group__0)
{ after(grammarAccess.getEntityAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRef
entryRuleRef 
:
{ before(grammarAccess.getRefRule()); }
	 ruleRef
{ after(grammarAccess.getRefRule()); } 
	 EOF 
;

// Rule Ref
ruleRef
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRefAccess().getGroup()); }
(rule__Ref__Group__0)
{ after(grammarAccess.getRefAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDataType
entryRuleDataType 
:
{ before(grammarAccess.getDataTypeRule()); }
	 ruleDataType
{ after(grammarAccess.getDataTypeRule()); } 
	 EOF 
;

// Rule DataType
ruleDataType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDataTypeAccess().getGroup()); }
(rule__DataType__Group__0)
{ after(grammarAccess.getDataTypeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule EntityAnnotation
ruleEntityAnnotation
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAnnotationAccess().getCacheEnumLiteralDeclaration()); }
(	'Cache' 
)
{ after(grammarAccess.getEntityAnnotationAccess().getCacheEnumLiteralDeclaration()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule FetureAnnotation
ruleFetureAnnotation
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFetureAnnotationAccess().getAlternatives()); }
(rule__FetureAnnotation__Alternatives)
{ after(grammarAccess.getFetureAnnotationAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule DataTypes
ruleDataTypes
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypesAccess().getAlternatives()); }
(rule__DataTypes__Alternatives)
{ after(grammarAccess.getDataTypesAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Feature__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getRefParserRuleCall_0()); }
	ruleRef
{ after(grammarAccess.getFeatureAccess().getRefParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); }
	ruleDataType
{ after(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__FetureAnnotation__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0()); }
(	'Index' 
)
{ after(grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1()); }
(	'Id' 
)
{ after(grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2()); }
(	'Load' 
)
{ after(grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getFetureAnnotationAccess().getIgnoreEnumLiteralDeclaration_3()); }
(	'Ignore' 
)
{ after(grammarAccess.getFetureAnnotationAccess().getIgnoreEnumLiteralDeclaration_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataTypes__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); }
(	'String' 
)
{ after(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); }
(	'Integer' 
)
{ after(grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); }
(	'Boolean' 
)
{ after(grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); }
)

    |(
{ before(grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); }
(	'Long' 
)
{ after(grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); }
)

    |(
{ before(grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); }
(	'Double' 
)
{ after(grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); }
)

    |(
{ before(grammarAccess.getDataTypesAccess().getObjectEnumLiteralDeclaration_5()); }
(	'Object' 
)
{ after(grammarAccess.getDataTypesAccess().getObjectEnumLiteralDeclaration_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Package__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__0__Impl
	rule__Package__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getPackageAction_0()); }
(

)
{ after(grammarAccess.getPackageAccess().getPackageAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__1__Impl
	rule__Package__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getPackageKeyword_1()); }

	'Package' 

{ after(grammarAccess.getPackageAccess().getPackageKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__2__Impl
	rule__Package__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getNameAssignment_2()); }
(rule__Package__NameAssignment_2)
{ after(grammarAccess.getPackageAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__3__Impl
	rule__Package__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__4__Impl
	rule__Package__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getGroup_4()); }
(rule__Package__Group_4__0)?
{ after(grammarAccess.getPackageAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__5__Impl
	rule__Package__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getGroup_5()); }
(rule__Package__Group_5__0)?
{ after(grammarAccess.getPackageAccess().getGroup_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Package__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group_4__0__Impl
	rule__Package__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getOwnedEntityAssignment_4_0()); }
(rule__Package__OwnedEntityAssignment_4_0)
{ after(grammarAccess.getPackageAccess().getOwnedEntityAssignment_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getOwnedEntityAssignment_4_1()); }
(rule__Package__OwnedEntityAssignment_4_1)*
{ after(grammarAccess.getPackageAccess().getOwnedEntityAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Package__Group_5__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group_5__0__Impl
	rule__Package__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group_5__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getSubPackageAssignment_5_0()); }
(rule__Package__SubPackageAssignment_5_0)
{ after(grammarAccess.getPackageAccess().getSubPackageAssignment_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group_5__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group_5__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getSubPackageAssignment_5_1()); }
(rule__Package__SubPackageAssignment_5_1)*
{ after(grammarAccess.getPackageAccess().getSubPackageAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Entity__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getEntityAction_0()); }
(

)
{ after(grammarAccess.getEntityAccess().getEntityAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getGroup_1()); }
(rule__Entity__Group_1__0)?
{ after(grammarAccess.getEntityAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__2__Impl
	rule__Entity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getEntityKeyword_2()); }

	'Entity' 

{ after(grammarAccess.getEntityAccess().getEntityKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__3__Impl
	rule__Entity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getNameAssignment_3()); }
(rule__Entity__NameAssignment_3)
{ after(grammarAccess.getEntityAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__4__Impl
	rule__Entity__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getGroup_4()); }
(rule__Entity__Group_4__0)?
{ after(grammarAccess.getEntityAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__5__Impl
	rule__Entity__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__6__Impl
	rule__Entity__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getGroup_6()); }
(rule__Entity__Group_6__0)?
{ after(grammarAccess.getEntityAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__Entity__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_1__0__Impl
	rule__Entity__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getCommercialAtKeyword_1_0()); }

	'@' 

{ after(grammarAccess.getEntityAccess().getCommercialAtKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_1__1__Impl
	rule__Entity__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getAnnotationsAssignment_1_1()); }
(rule__Entity__AnnotationsAssignment_1_1)
{ after(grammarAccess.getEntityAccess().getAnnotationsAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getGroup_1_2()); }
(rule__Entity__Group_1_2__0)*
{ after(grammarAccess.getEntityAccess().getGroup_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Entity__Group_1_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_1_2__0__Impl
	rule__Entity__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_1_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getCommercialAtKeyword_1_2_0()); }

	'@' 

{ after(grammarAccess.getEntityAccess().getCommercialAtKeyword_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_1_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_1_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getAnnotationsAssignment_1_2_1()); }
(rule__Entity__AnnotationsAssignment_1_2_1)
{ after(grammarAccess.getEntityAccess().getAnnotationsAssignment_1_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Entity__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_4__0__Impl
	rule__Entity__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getColonKeyword_4_0()); }

	':' 

{ after(grammarAccess.getEntityAccess().getColonKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getSuperEntityAssignment_4_1()); }
(rule__Entity__SuperEntityAssignment_4_1)
{ after(grammarAccess.getEntityAccess().getSuperEntityAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Entity__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_6__0__Impl
	rule__Entity__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_6_0()); }
(rule__Entity__OwnedFeatureAssignment_6_0)
{ after(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Entity__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_6_1()); }
(rule__Entity__OwnedFeatureAssignment_6_1)*
{ after(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Ref__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Ref__Group__0__Impl
	rule__Ref__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Ref__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRefAccess().getRefAction_0()); }
(

)
{ after(grammarAccess.getRefAccess().getRefAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Ref__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Ref__Group__1__Impl
	rule__Ref__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Ref__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRefAccess().getGroup_1()); }
(rule__Ref__Group_1__0)?
{ after(grammarAccess.getRefAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Ref__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Ref__Group__2__Impl
	rule__Ref__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Ref__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRefAccess().getVarKeyword_2()); }

	'var' 

{ after(grammarAccess.getRefAccess().getVarKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Ref__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Ref__Group__3__Impl
	rule__Ref__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Ref__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRefAccess().getNameAssignment_3()); }
(rule__Ref__NameAssignment_3)
{ after(grammarAccess.getRefAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Ref__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Ref__Group__4__Impl
	rule__Ref__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Ref__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRefAccess().getRefToAssignment_4()); }
(rule__Ref__RefToAssignment_4)
{ after(grammarAccess.getRefAccess().getRefToAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Ref__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Ref__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Ref__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRefAccess().getManyAssignment_5()); }
(rule__Ref__ManyAssignment_5)?
{ after(grammarAccess.getRefAccess().getManyAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__Ref__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Ref__Group_1__0__Impl
	rule__Ref__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Ref__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRefAccess().getCommercialAtKeyword_1_0()); }

	'@' 

{ after(grammarAccess.getRefAccess().getCommercialAtKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Ref__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Ref__Group_1__1__Impl
	rule__Ref__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Ref__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRefAccess().getAnnotationsAssignment_1_1()); }
(rule__Ref__AnnotationsAssignment_1_1)
{ after(grammarAccess.getRefAccess().getAnnotationsAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Ref__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Ref__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Ref__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRefAccess().getGroup_1_2()); }
(rule__Ref__Group_1_2__0)*
{ after(grammarAccess.getRefAccess().getGroup_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Ref__Group_1_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Ref__Group_1_2__0__Impl
	rule__Ref__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Ref__Group_1_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRefAccess().getCommercialAtKeyword_1_2_0()); }

	'@' 

{ after(grammarAccess.getRefAccess().getCommercialAtKeyword_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Ref__Group_1_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Ref__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Ref__Group_1_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRefAccess().getAnnotationsAssignment_1_2_1()); }
(rule__Ref__AnnotationsAssignment_1_2_1)
{ after(grammarAccess.getRefAccess().getAnnotationsAssignment_1_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__DataType__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group__0__Impl
	rule__DataType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); }
(

)
{ after(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataType__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group__1__Impl
	rule__DataType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getGroup_1()); }
(rule__DataType__Group_1__0)?
{ after(grammarAccess.getDataTypeAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataType__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group__2__Impl
	rule__DataType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getVarKeyword_2()); }

	'var' 

{ after(grammarAccess.getDataTypeAccess().getVarKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataType__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group__3__Impl
	rule__DataType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getNameAssignment_3()); }
(rule__DataType__NameAssignment_3)
{ after(grammarAccess.getDataTypeAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataType__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group__4__Impl
	rule__DataType__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getTypeAssignment_4()); }
(rule__DataType__TypeAssignment_4)
{ after(grammarAccess.getDataTypeAccess().getTypeAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataType__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getManyAssignment_5()); }
(rule__DataType__ManyAssignment_5)?
{ after(grammarAccess.getDataTypeAccess().getManyAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__DataType__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group_1__0__Impl
	rule__DataType__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getCommercialAtKeyword_1_0()); }

	'@' 

{ after(grammarAccess.getDataTypeAccess().getCommercialAtKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataType__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group_1__1__Impl
	rule__DataType__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_1_1()); }
(rule__DataType__AnnotationsAssignment_1_1)
{ after(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataType__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getGroup_1_2()); }
(rule__DataType__Group_1_2__0)*
{ after(grammarAccess.getDataTypeAccess().getGroup_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__DataType__Group_1_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group_1_2__0__Impl
	rule__DataType__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group_1_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getCommercialAtKeyword_1_2_0()); }

	'@' 

{ after(grammarAccess.getDataTypeAccess().getCommercialAtKeyword_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataType__Group_1_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataType__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group_1_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_1_2_1()); }
(rule__DataType__AnnotationsAssignment_1_2_1)
{ after(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_1_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Package__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Package__OwnedEntityAssignment_4_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_4_0_0()); }
	ruleEntity{ after(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_4_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Package__OwnedEntityAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_4_1_0()); }
	ruleEntity{ after(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Package__SubPackageAssignment_5_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_5_0_0()); }
	rulePackage{ after(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Package__SubPackageAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_5_1_0()); }
	rulePackage{ after(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__AnnotationsAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_1_0()); }
	ruleEntityAnnotation{ after(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__AnnotationsAssignment_1_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_2_1_0()); }
	ruleEntityAnnotation{ after(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__SuperEntityAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_4_1_0()); }
(
{ before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_4_1_0_1()); }
	RULE_ID{ after(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__OwnedFeatureAssignment_6_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_0_0()); }
	ruleFeature{ after(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__OwnedFeatureAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_1_0()); }
	ruleFeature{ after(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Ref__AnnotationsAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_1_0()); }
	ruleFetureAnnotation{ after(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Ref__AnnotationsAssignment_1_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_2_1_0()); }
	ruleFetureAnnotation{ after(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Ref__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRefAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getRefAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Ref__RefToAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRefAccess().getRefToEntityCrossReference_4_0()); }
(
{ before(grammarAccess.getRefAccess().getRefToEntityIDTerminalRuleCall_4_0_1()); }
	RULE_ID{ after(grammarAccess.getRefAccess().getRefToEntityIDTerminalRuleCall_4_0_1()); }
)
{ after(grammarAccess.getRefAccess().getRefToEntityCrossReference_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Ref__ManyAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); }
(
{ before(grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); }

	'[]' 

{ after(grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); }
)

{ after(grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__AnnotationsAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_1_0()); }
	ruleFetureAnnotation{ after(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__AnnotationsAssignment_1_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_2_1_0()); }
	ruleFetureAnnotation{ after(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__TypeAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_4_0()); }
	ruleDataTypes{ after(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__ManyAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); }
(
{ before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); }

	'[]' 

{ after(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); }
)

{ after(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


