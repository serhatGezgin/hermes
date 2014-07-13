/*
* generated by Xtext
*/
package org.yazgel.hermes.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.yazgel.hermes.xtext.services.HermesGrammarAccess;

public class HermesParser extends AbstractContentAssistParser {
	
	@Inject
	private HermesGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.yazgel.hermes.xtext.ui.contentassist.antlr.internal.InternalHermesParser createParser() {
		org.yazgel.hermes.xtext.ui.contentassist.antlr.internal.InternalHermesParser result = new org.yazgel.hermes.xtext.ui.contentassist.antlr.internal.InternalHermesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFeatureAccess().getAlternatives(), "rule__Feature__Alternatives");
					put(grammarAccess.getFetureAnnotationAccess().getAlternatives(), "rule__FetureAnnotation__Alternatives");
					put(grammarAccess.getDataTypesAccess().getAlternatives(), "rule__DataTypes__Alternatives");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getPackageAccess().getGroup_4(), "rule__Package__Group_4__0");
					put(grammarAccess.getPackageAccess().getGroup_5(), "rule__Package__Group_5__0");
					put(grammarAccess.getPackageAccess().getGroup_6(), "rule__Package__Group_6__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_3(), "rule__Entity__Group_3__0");
					put(grammarAccess.getEntityAccess().getGroup_5(), "rule__Entity__Group_5__0");
					put(grammarAccess.getEntityAccess().getGroup_6(), "rule__Entity__Group_6__0");
					put(grammarAccess.getEntityAccess().getGroup_7(), "rule__Entity__Group_7__0");
					put(grammarAccess.getRefAccess().getGroup(), "rule__Ref__Group__0");
					put(grammarAccess.getRefAccess().getGroup_5(), "rule__Ref__Group_5__0");
					put(grammarAccess.getRefAccess().getGroup_6(), "rule__Ref__Group_6__0");
					put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
					put(grammarAccess.getDataTypeAccess().getGroup_5(), "rule__DataType__Group_5__0");
					put(grammarAccess.getDataTypeAccess().getGroup_6(), "rule__DataType__Group_6__0");
					put(grammarAccess.getPackageAccess().getNameAssignment_2(), "rule__Package__NameAssignment_2");
					put(grammarAccess.getPackageAccess().getDescriptionAssignment_4_1(), "rule__Package__DescriptionAssignment_4_1");
					put(grammarAccess.getPackageAccess().getOwnedEntityAssignment_5_0(), "rule__Package__OwnedEntityAssignment_5_0");
					put(grammarAccess.getPackageAccess().getOwnedEntityAssignment_5_1(), "rule__Package__OwnedEntityAssignment_5_1");
					put(grammarAccess.getPackageAccess().getSubPackageAssignment_6_0(), "rule__Package__SubPackageAssignment_6_0");
					put(grammarAccess.getPackageAccess().getSubPackageAssignment_6_1(), "rule__Package__SubPackageAssignment_6_1");
					put(grammarAccess.getEntityAccess().getNameAssignment_2(), "rule__Entity__NameAssignment_2");
					put(grammarAccess.getEntityAccess().getSuperEntityAssignment_3_1(), "rule__Entity__SuperEntityAssignment_3_1");
					put(grammarAccess.getEntityAccess().getDescriptionAssignment_5_2(), "rule__Entity__DescriptionAssignment_5_2");
					put(grammarAccess.getEntityAccess().getAnnotationsAssignment_6_0(), "rule__Entity__AnnotationsAssignment_6_0");
					put(grammarAccess.getEntityAccess().getAnnotationsAssignment_6_1(), "rule__Entity__AnnotationsAssignment_6_1");
					put(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_7_0(), "rule__Entity__OwnedFeatureAssignment_7_0");
					put(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_7_1(), "rule__Entity__OwnedFeatureAssignment_7_1");
					put(grammarAccess.getRefAccess().getNameAssignment_1(), "rule__Ref__NameAssignment_1");
					put(grammarAccess.getRefAccess().getRefToAssignment_2(), "rule__Ref__RefToAssignment_2");
					put(grammarAccess.getRefAccess().getManyAssignment_3(), "rule__Ref__ManyAssignment_3");
					put(grammarAccess.getRefAccess().getDescriptionAssignment_5_1(), "rule__Ref__DescriptionAssignment_5_1");
					put(grammarAccess.getRefAccess().getAnnotationsAssignment_6_0(), "rule__Ref__AnnotationsAssignment_6_0");
					put(grammarAccess.getRefAccess().getAnnotationsAssignment_6_1(), "rule__Ref__AnnotationsAssignment_6_1");
					put(grammarAccess.getDataTypeAccess().getNameAssignment_1(), "rule__DataType__NameAssignment_1");
					put(grammarAccess.getDataTypeAccess().getTypeAssignment_2(), "rule__DataType__TypeAssignment_2");
					put(grammarAccess.getDataTypeAccess().getManyAssignment_3(), "rule__DataType__ManyAssignment_3");
					put(grammarAccess.getDataTypeAccess().getDescriptionAssignment_5_1(), "rule__DataType__DescriptionAssignment_5_1");
					put(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_6_0(), "rule__DataType__AnnotationsAssignment_6_0");
					put(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_6_1(), "rule__DataType__AnnotationsAssignment_6_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.yazgel.hermes.xtext.ui.contentassist.antlr.internal.InternalHermesParser typedParser = (org.yazgel.hermes.xtext.ui.contentassist.antlr.internal.InternalHermesParser) parser;
			typedParser.entryRulePackage();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public HermesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(HermesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
