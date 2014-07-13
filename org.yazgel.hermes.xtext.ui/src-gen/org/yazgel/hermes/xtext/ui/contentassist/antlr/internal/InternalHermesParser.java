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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHermesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cache'", "'Index'", "'Id'", "'Load'", "'Ignore'", "'String'", "'Integer'", "'Boolean'", "'Long'", "'Double'", "'Object'", "'Module'", "'Package'", "'{'", "'}'", "'.'", "'Entity'", "'@'", "':'", "'var'", "'[]'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalHermesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHermesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHermesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g"; }


     
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




    // $ANTLR start "entryRuleModule"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:60:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:61:1: ( ruleModule EOF )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:62:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModule_in_entryRuleModule61);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModule68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:69:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:73:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:74:1: ( ( rule__Module__Group__0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:74:1: ( ( rule__Module__Group__0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:75:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:76:1: ( rule__Module__Group__0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:76:2: rule__Module__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__0_in_ruleModule94);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRulePackage"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:88:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:89:1: ( rulePackage EOF )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:90:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_entryRulePackage121);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackage128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:97:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:101:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:102:1: ( ( rule__Package__Group__0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:102:1: ( ( rule__Package__Group__0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:103:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:104:1: ( rule__Package__Group__0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:104:2: rule__Package__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__0_in_rulePackage154);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleFeature"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:116:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:117:1: ( ruleFeature EOF )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:118:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature181);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:125:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:129:2: ( ( ( rule__Feature__Alternatives ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:130:1: ( ( rule__Feature__Alternatives ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:130:1: ( ( rule__Feature__Alternatives ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:131:1: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:132:1: ( rule__Feature__Alternatives )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:132:2: rule__Feature__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Alternatives_in_ruleFeature214);
            rule__Feature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleEntity"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:144:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:145:1: ( ruleEntity EOF )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:146:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity241);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:153:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:157:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:158:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:158:1: ( ( rule__Entity__Group__0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:159:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:160:1: ( rule__Entity__Group__0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:160:2: rule__Entity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0_in_ruleEntity274);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRef"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:172:1: entryRuleRef : ruleRef EOF ;
    public final void entryRuleRef() throws RecognitionException {
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:173:1: ( ruleRef EOF )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:174:1: ruleRef EOF
            {
             before(grammarAccess.getRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRef_in_entryRuleRef301);
            ruleRef();

            state._fsp--;

             after(grammarAccess.getRefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRef308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRef"


    // $ANTLR start "ruleRef"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:181:1: ruleRef : ( ( rule__Ref__Group__0 ) ) ;
    public final void ruleRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:185:2: ( ( ( rule__Ref__Group__0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:186:1: ( ( rule__Ref__Group__0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:186:1: ( ( rule__Ref__Group__0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:187:1: ( rule__Ref__Group__0 )
            {
             before(grammarAccess.getRefAccess().getGroup()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:188:1: ( rule__Ref__Group__0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:188:2: rule__Ref__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__0_in_ruleRef334);
            rule__Ref__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRef"


    // $ANTLR start "entryRuleDataType"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:200:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:201:1: ( ruleDataType EOF )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:202:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataType_in_entryRuleDataType361);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataType368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:209:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:213:2: ( ( ( rule__DataType__Group__0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:214:1: ( ( rule__DataType__Group__0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:214:1: ( ( rule__DataType__Group__0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:215:1: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:216:1: ( rule__DataType__Group__0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:216:2: rule__DataType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__0_in_ruleDataType394);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleEntityAnnotation"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:229:1: ruleEntityAnnotation : ( ( 'Cache' ) ) ;
    public final void ruleEntityAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:233:1: ( ( ( 'Cache' ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:234:1: ( ( 'Cache' ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:234:1: ( ( 'Cache' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:235:1: ( 'Cache' )
            {
             before(grammarAccess.getEntityAnnotationAccess().getCacheEnumLiteralDeclaration()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:236:1: ( 'Cache' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:236:3: 'Cache'
            {
            match(input,11,FollowSets000.FOLLOW_11_in_ruleEntityAnnotation432); 

            }

             after(grammarAccess.getEntityAnnotationAccess().getCacheEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityAnnotation"


    // $ANTLR start "ruleFetureAnnotation"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:249:1: ruleFetureAnnotation : ( ( rule__FetureAnnotation__Alternatives ) ) ;
    public final void ruleFetureAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:253:1: ( ( ( rule__FetureAnnotation__Alternatives ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:254:1: ( ( rule__FetureAnnotation__Alternatives ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:254:1: ( ( rule__FetureAnnotation__Alternatives ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:255:1: ( rule__FetureAnnotation__Alternatives )
            {
             before(grammarAccess.getFetureAnnotationAccess().getAlternatives()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:256:1: ( rule__FetureAnnotation__Alternatives )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:256:2: rule__FetureAnnotation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__FetureAnnotation__Alternatives_in_ruleFetureAnnotation470);
            rule__FetureAnnotation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFetureAnnotationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFetureAnnotation"


    // $ANTLR start "ruleDataTypes"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:268:1: ruleDataTypes : ( ( rule__DataTypes__Alternatives ) ) ;
    public final void ruleDataTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:272:1: ( ( ( rule__DataTypes__Alternatives ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:273:1: ( ( rule__DataTypes__Alternatives ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:273:1: ( ( rule__DataTypes__Alternatives ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:274:1: ( rule__DataTypes__Alternatives )
            {
             before(grammarAccess.getDataTypesAccess().getAlternatives()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:275:1: ( rule__DataTypes__Alternatives )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:275:2: rule__DataTypes__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypes__Alternatives_in_ruleDataTypes506);
            rule__DataTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataTypes"


    // $ANTLR start "rule__Feature__Alternatives"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:286:1: rule__Feature__Alternatives : ( ( ruleRef ) | ( ruleDataType ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:290:1: ( ( ruleRef ) | ( ruleDataType ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:291:1: ( ruleRef )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:291:1: ( ruleRef )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:292:1: ruleRef
                    {
                     before(grammarAccess.getFeatureAccess().getRefParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRef_in_rule__Feature__Alternatives541);
                    ruleRef();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getRefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:297:6: ( ruleDataType )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:297:6: ( ruleDataType )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:298:1: ruleDataType
                    {
                     before(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDataType_in_rule__Feature__Alternatives558);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__FetureAnnotation__Alternatives"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:308:1: rule__FetureAnnotation__Alternatives : ( ( ( 'Index' ) ) | ( ( 'Id' ) ) | ( ( 'Load' ) ) | ( ( 'Ignore' ) ) );
    public final void rule__FetureAnnotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:312:1: ( ( ( 'Index' ) ) | ( ( 'Id' ) ) | ( ( 'Load' ) ) | ( ( 'Ignore' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:313:1: ( ( 'Index' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:313:1: ( ( 'Index' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:314:1: ( 'Index' )
                    {
                     before(grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:315:1: ( 'Index' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:315:3: 'Index'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__FetureAnnotation__Alternatives591); 

                    }

                     after(grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:320:6: ( ( 'Id' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:320:6: ( ( 'Id' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:321:1: ( 'Id' )
                    {
                     before(grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:322:1: ( 'Id' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:322:3: 'Id'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__FetureAnnotation__Alternatives612); 

                    }

                     after(grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:327:6: ( ( 'Load' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:327:6: ( ( 'Load' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:328:1: ( 'Load' )
                    {
                     before(grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:329:1: ( 'Load' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:329:3: 'Load'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__FetureAnnotation__Alternatives633); 

                    }

                     after(grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:334:6: ( ( 'Ignore' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:334:6: ( ( 'Ignore' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:335:1: ( 'Ignore' )
                    {
                     before(grammarAccess.getFetureAnnotationAccess().getIgnoreEnumLiteralDeclaration_3()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:336:1: ( 'Ignore' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:336:3: 'Ignore'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__FetureAnnotation__Alternatives654); 

                    }

                     after(grammarAccess.getFetureAnnotationAccess().getIgnoreEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FetureAnnotation__Alternatives"


    // $ANTLR start "rule__DataTypes__Alternatives"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:346:1: rule__DataTypes__Alternatives : ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) | ( ( 'Long' ) ) | ( ( 'Double' ) ) | ( ( 'Object' ) ) );
    public final void rule__DataTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:350:1: ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) | ( ( 'Long' ) ) | ( ( 'Double' ) ) | ( ( 'Object' ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            case 21:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:351:1: ( ( 'String' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:351:1: ( ( 'String' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:352:1: ( 'String' )
                    {
                     before(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:353:1: ( 'String' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:353:3: 'String'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__DataTypes__Alternatives690); 

                    }

                     after(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:358:6: ( ( 'Integer' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:358:6: ( ( 'Integer' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:359:1: ( 'Integer' )
                    {
                     before(grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:360:1: ( 'Integer' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:360:3: 'Integer'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__DataTypes__Alternatives711); 

                    }

                     after(grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:365:6: ( ( 'Boolean' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:365:6: ( ( 'Boolean' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:366:1: ( 'Boolean' )
                    {
                     before(grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:367:1: ( 'Boolean' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:367:3: 'Boolean'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__DataTypes__Alternatives732); 

                    }

                     after(grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:372:6: ( ( 'Long' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:372:6: ( ( 'Long' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:373:1: ( 'Long' )
                    {
                     before(grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:374:1: ( 'Long' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:374:3: 'Long'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__DataTypes__Alternatives753); 

                    }

                     after(grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:379:6: ( ( 'Double' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:379:6: ( ( 'Double' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:380:1: ( 'Double' )
                    {
                     before(grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:381:1: ( 'Double' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:381:3: 'Double'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__DataTypes__Alternatives774); 

                    }

                     after(grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:386:6: ( ( 'Object' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:386:6: ( ( 'Object' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:387:1: ( 'Object' )
                    {
                     before(grammarAccess.getDataTypesAccess().getObjectEnumLiteralDeclaration_5()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:388:1: ( 'Object' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:388:3: 'Object'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__DataTypes__Alternatives795); 

                    }

                     after(grammarAccess.getDataTypesAccess().getObjectEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypes__Alternatives"


    // $ANTLR start "rule__Module__Group__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:400:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:404:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:405:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0828);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0831);
            rule__Module__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:412:1: rule__Module__Group__0__Impl : ( () ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:416:1: ( ( () ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:417:1: ( () )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:417:1: ( () )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:418:1: ()
            {
             before(grammarAccess.getModuleAccess().getModuleAction_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:419:1: ()
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:421:1: 
            {
            }

             after(grammarAccess.getModuleAccess().getModuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:431:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:435:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:436:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1889);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__2_in_rule__Module__Group__1892);
            rule__Module__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:443:1: rule__Module__Group__1__Impl : ( 'Module' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:447:1: ( ( 'Module' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:448:1: ( 'Module' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:448:1: ( 'Module' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:449:1: 'Module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Module__Group__1__Impl920); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:462:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:466:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:467:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__2951);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__3_in_rule__Module__Group__2954);
            rule__Module__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:474:1: rule__Module__Group__2__Impl : ( ( rule__Module__NameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:478:1: ( ( ( rule__Module__NameAssignment_2 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:479:1: ( ( rule__Module__NameAssignment_2 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:479:1: ( ( rule__Module__NameAssignment_2 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:480:1: ( rule__Module__NameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:481:1: ( rule__Module__NameAssignment_2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:481:2: rule__Module__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl981);
            rule__Module__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:491:1: rule__Module__Group__3 : rule__Module__Group__3__Impl ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:495:1: ( rule__Module__Group__3__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:496:2: rule__Module__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31011);
            rule__Module__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:502:1: rule__Module__Group__3__Impl : ( ( rule__Module__Group_3__0 )? ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:506:1: ( ( ( rule__Module__Group_3__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:507:1: ( ( rule__Module__Group_3__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:507:1: ( ( rule__Module__Group_3__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:508:1: ( rule__Module__Group_3__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_3()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:509:1: ( rule__Module__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:509:2: rule__Module__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Module__Group_3__0_in_rule__Module__Group__3__Impl1038);
                    rule__Module__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Module__Group_3__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:527:1: rule__Module__Group_3__0 : rule__Module__Group_3__0__Impl rule__Module__Group_3__1 ;
    public final void rule__Module__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:531:1: ( rule__Module__Group_3__0__Impl rule__Module__Group_3__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:532:2: rule__Module__Group_3__0__Impl rule__Module__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__Group_3__0__Impl_in_rule__Module__Group_3__01077);
            rule__Module__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Module__Group_3__1_in_rule__Module__Group_3__01080);
            rule__Module__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_3__0"


    // $ANTLR start "rule__Module__Group_3__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:539:1: rule__Module__Group_3__0__Impl : ( ( rule__Module__PackagesAssignment_3_0 ) ) ;
    public final void rule__Module__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:543:1: ( ( ( rule__Module__PackagesAssignment_3_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:544:1: ( ( rule__Module__PackagesAssignment_3_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:544:1: ( ( rule__Module__PackagesAssignment_3_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:545:1: ( rule__Module__PackagesAssignment_3_0 )
            {
             before(grammarAccess.getModuleAccess().getPackagesAssignment_3_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:546:1: ( rule__Module__PackagesAssignment_3_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:546:2: rule__Module__PackagesAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__PackagesAssignment_3_0_in_rule__Module__Group_3__0__Impl1107);
            rule__Module__PackagesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getPackagesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_3__0__Impl"


    // $ANTLR start "rule__Module__Group_3__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:556:1: rule__Module__Group_3__1 : rule__Module__Group_3__1__Impl ;
    public final void rule__Module__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:560:1: ( rule__Module__Group_3__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:561:2: rule__Module__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__Group_3__1__Impl_in_rule__Module__Group_3__11137);
            rule__Module__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_3__1"


    // $ANTLR start "rule__Module__Group_3__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:567:1: rule__Module__Group_3__1__Impl : ( ( rule__Module__PackagesAssignment_3_1 )* ) ;
    public final void rule__Module__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:571:1: ( ( ( rule__Module__PackagesAssignment_3_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:572:1: ( ( rule__Module__PackagesAssignment_3_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:572:1: ( ( rule__Module__PackagesAssignment_3_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:573:1: ( rule__Module__PackagesAssignment_3_1 )*
            {
             before(grammarAccess.getModuleAccess().getPackagesAssignment_3_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:574:1: ( rule__Module__PackagesAssignment_3_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:574:2: rule__Module__PackagesAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Module__PackagesAssignment_3_1_in_rule__Module__Group_3__1__Impl1164);
            	    rule__Module__PackagesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getPackagesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_3__1__Impl"


    // $ANTLR start "rule__Package__Group__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:588:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:592:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:593:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01199);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01202);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:600:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:604:1: ( ( () ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:605:1: ( () )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:605:1: ( () )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:606:1: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:607:1: ()
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:609:1: 
            {
            }

             after(grammarAccess.getPackageAccess().getPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:619:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:623:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:624:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11260);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11263);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:631:1: rule__Package__Group__1__Impl : ( 'Package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:635:1: ( ( 'Package' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:636:1: ( 'Package' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:636:1: ( 'Package' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:637:1: 'Package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Package__Group__1__Impl1291); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:650:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:654:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:655:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21322);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21325);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:662:1: rule__Package__Group__2__Impl : ( ( rule__Package__Group_2__0 )? ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:666:1: ( ( ( rule__Package__Group_2__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:667:1: ( ( rule__Package__Group_2__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:667:1: ( ( rule__Package__Group_2__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:668:1: ( rule__Package__Group_2__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:669:1: ( rule__Package__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==26) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:669:2: rule__Package__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_2__0_in_rule__Package__Group__2__Impl1352);
                    rule__Package__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:679:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:683:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:684:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31383);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31386);
            rule__Package__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:691:1: rule__Package__Group__3__Impl : ( ( rule__Package__NameAssignment_3 ) ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:695:1: ( ( ( rule__Package__NameAssignment_3 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:696:1: ( ( rule__Package__NameAssignment_3 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:696:1: ( ( rule__Package__NameAssignment_3 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:697:1: ( rule__Package__NameAssignment_3 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_3()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:698:1: ( rule__Package__NameAssignment_3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:698:2: rule__Package__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__NameAssignment_3_in_rule__Package__Group__3__Impl1413);
            rule__Package__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:708:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:712:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:713:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41443);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41446);
            rule__Package__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:720:1: rule__Package__Group__4__Impl : ( '{' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:724:1: ( ( '{' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:725:1: ( '{' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:725:1: ( '{' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:726:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Package__Group__4__Impl1474); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:739:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:743:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:744:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51505);
            rule__Package__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__6_in_rule__Package__Group__51508);
            rule__Package__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:751:1: rule__Package__Group__5__Impl : ( ( rule__Package__Group_5__0 )? ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:755:1: ( ( ( rule__Package__Group_5__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:756:1: ( ( rule__Package__Group_5__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:756:1: ( ( rule__Package__Group_5__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:757:1: ( rule__Package__Group_5__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_5()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:758:1: ( rule__Package__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=27 && LA7_0<=28)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:758:2: rule__Package__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl1535);
                    rule__Package__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__Package__Group__6"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:768:1: rule__Package__Group__6 : rule__Package__Group__6__Impl ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:772:1: ( rule__Package__Group__6__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:773:2: rule__Package__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61566);
            rule__Package__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__6"


    // $ANTLR start "rule__Package__Group__6__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:779:1: rule__Package__Group__6__Impl : ( '}' ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:783:1: ( ( '}' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:784:1: ( '}' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:784:1: ( '}' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:785:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Package__Group__6__Impl1594); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__6__Impl"


    // $ANTLR start "rule__Package__Group_2__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:812:1: rule__Package__Group_2__0 : rule__Package__Group_2__0__Impl rule__Package__Group_2__1 ;
    public final void rule__Package__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:816:1: ( rule__Package__Group_2__0__Impl rule__Package__Group_2__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:817:2: rule__Package__Group_2__0__Impl rule__Package__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_2__0__Impl_in_rule__Package__Group_2__01639);
            rule__Package__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_2__1_in_rule__Package__Group_2__01642);
            rule__Package__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__0"


    // $ANTLR start "rule__Package__Group_2__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:824:1: rule__Package__Group_2__0__Impl : ( ( rule__Package__SuperPackageAssignment_2_0 ) ) ;
    public final void rule__Package__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:828:1: ( ( ( rule__Package__SuperPackageAssignment_2_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:829:1: ( ( rule__Package__SuperPackageAssignment_2_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:829:1: ( ( rule__Package__SuperPackageAssignment_2_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:830:1: ( rule__Package__SuperPackageAssignment_2_0 )
            {
             before(grammarAccess.getPackageAccess().getSuperPackageAssignment_2_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:831:1: ( rule__Package__SuperPackageAssignment_2_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:831:2: rule__Package__SuperPackageAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__SuperPackageAssignment_2_0_in_rule__Package__Group_2__0__Impl1669);
            rule__Package__SuperPackageAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getSuperPackageAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__0__Impl"


    // $ANTLR start "rule__Package__Group_2__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:841:1: rule__Package__Group_2__1 : rule__Package__Group_2__1__Impl rule__Package__Group_2__2 ;
    public final void rule__Package__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:845:1: ( rule__Package__Group_2__1__Impl rule__Package__Group_2__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:846:2: rule__Package__Group_2__1__Impl rule__Package__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_2__1__Impl_in_rule__Package__Group_2__11699);
            rule__Package__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_2__2_in_rule__Package__Group_2__11702);
            rule__Package__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__1"


    // $ANTLR start "rule__Package__Group_2__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:853:1: rule__Package__Group_2__1__Impl : ( '.' ) ;
    public final void rule__Package__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:857:1: ( ( '.' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:858:1: ( '.' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:858:1: ( '.' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:859:1: '.'
            {
             before(grammarAccess.getPackageAccess().getFullStopKeyword_2_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Package__Group_2__1__Impl1730); 
             after(grammarAccess.getPackageAccess().getFullStopKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__1__Impl"


    // $ANTLR start "rule__Package__Group_2__2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:872:1: rule__Package__Group_2__2 : rule__Package__Group_2__2__Impl ;
    public final void rule__Package__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:876:1: ( rule__Package__Group_2__2__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:877:2: rule__Package__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_2__2__Impl_in_rule__Package__Group_2__21761);
            rule__Package__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__2"


    // $ANTLR start "rule__Package__Group_2__2__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:883:1: rule__Package__Group_2__2__Impl : ( ( rule__Package__Group_2_2__0 )* ) ;
    public final void rule__Package__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:887:1: ( ( ( rule__Package__Group_2_2__0 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:888:1: ( ( rule__Package__Group_2_2__0 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:888:1: ( ( rule__Package__Group_2_2__0 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:889:1: ( rule__Package__Group_2_2__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_2_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:890:1: ( rule__Package__Group_2_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==26) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:890:2: rule__Package__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_2_2__0_in_rule__Package__Group_2__2__Impl1788);
            	    rule__Package__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__2__Impl"


    // $ANTLR start "rule__Package__Group_2_2__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:906:1: rule__Package__Group_2_2__0 : rule__Package__Group_2_2__0__Impl rule__Package__Group_2_2__1 ;
    public final void rule__Package__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:910:1: ( rule__Package__Group_2_2__0__Impl rule__Package__Group_2_2__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:911:2: rule__Package__Group_2_2__0__Impl rule__Package__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_2_2__0__Impl_in_rule__Package__Group_2_2__01825);
            rule__Package__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_2_2__1_in_rule__Package__Group_2_2__01828);
            rule__Package__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2_2__0"


    // $ANTLR start "rule__Package__Group_2_2__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:918:1: rule__Package__Group_2_2__0__Impl : ( ( rule__Package__SuperPackageAssignment_2_2_0 ) ) ;
    public final void rule__Package__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:922:1: ( ( ( rule__Package__SuperPackageAssignment_2_2_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:923:1: ( ( rule__Package__SuperPackageAssignment_2_2_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:923:1: ( ( rule__Package__SuperPackageAssignment_2_2_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:924:1: ( rule__Package__SuperPackageAssignment_2_2_0 )
            {
             before(grammarAccess.getPackageAccess().getSuperPackageAssignment_2_2_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:925:1: ( rule__Package__SuperPackageAssignment_2_2_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:925:2: rule__Package__SuperPackageAssignment_2_2_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__SuperPackageAssignment_2_2_0_in_rule__Package__Group_2_2__0__Impl1855);
            rule__Package__SuperPackageAssignment_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getSuperPackageAssignment_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2_2__0__Impl"


    // $ANTLR start "rule__Package__Group_2_2__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:935:1: rule__Package__Group_2_2__1 : rule__Package__Group_2_2__1__Impl ;
    public final void rule__Package__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:939:1: ( rule__Package__Group_2_2__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:940:2: rule__Package__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_2_2__1__Impl_in_rule__Package__Group_2_2__11885);
            rule__Package__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2_2__1"


    // $ANTLR start "rule__Package__Group_2_2__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:946:1: rule__Package__Group_2_2__1__Impl : ( '.' ) ;
    public final void rule__Package__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:950:1: ( ( '.' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:951:1: ( '.' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:951:1: ( '.' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:952:1: '.'
            {
             before(grammarAccess.getPackageAccess().getFullStopKeyword_2_2_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Package__Group_2_2__1__Impl1913); 
             after(grammarAccess.getPackageAccess().getFullStopKeyword_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2_2__1__Impl"


    // $ANTLR start "rule__Package__Group_5__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:969:1: rule__Package__Group_5__0 : rule__Package__Group_5__0__Impl rule__Package__Group_5__1 ;
    public final void rule__Package__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:973:1: ( rule__Package__Group_5__0__Impl rule__Package__Group_5__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:974:2: rule__Package__Group_5__0__Impl rule__Package__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__01948);
            rule__Package__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__01951);
            rule__Package__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__0"


    // $ANTLR start "rule__Package__Group_5__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:981:1: rule__Package__Group_5__0__Impl : ( ( rule__Package__OwnedEntityAssignment_5_0 ) ) ;
    public final void rule__Package__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:985:1: ( ( ( rule__Package__OwnedEntityAssignment_5_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:986:1: ( ( rule__Package__OwnedEntityAssignment_5_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:986:1: ( ( rule__Package__OwnedEntityAssignment_5_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:987:1: ( rule__Package__OwnedEntityAssignment_5_0 )
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityAssignment_5_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:988:1: ( rule__Package__OwnedEntityAssignment_5_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:988:2: rule__Package__OwnedEntityAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__OwnedEntityAssignment_5_0_in_rule__Package__Group_5__0__Impl1978);
            rule__Package__OwnedEntityAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getOwnedEntityAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__0__Impl"


    // $ANTLR start "rule__Package__Group_5__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:998:1: rule__Package__Group_5__1 : rule__Package__Group_5__1__Impl ;
    public final void rule__Package__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1002:1: ( rule__Package__Group_5__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1003:2: rule__Package__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__12008);
            rule__Package__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__1"


    // $ANTLR start "rule__Package__Group_5__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1009:1: rule__Package__Group_5__1__Impl : ( ( rule__Package__OwnedEntityAssignment_5_1 )* ) ;
    public final void rule__Package__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1013:1: ( ( ( rule__Package__OwnedEntityAssignment_5_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1014:1: ( ( rule__Package__OwnedEntityAssignment_5_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1014:1: ( ( rule__Package__OwnedEntityAssignment_5_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1015:1: ( rule__Package__OwnedEntityAssignment_5_1 )*
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityAssignment_5_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1016:1: ( rule__Package__OwnedEntityAssignment_5_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=27 && LA9_0<=28)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1016:2: rule__Package__OwnedEntityAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__OwnedEntityAssignment_5_1_in_rule__Package__Group_5__1__Impl2035);
            	    rule__Package__OwnedEntityAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getOwnedEntityAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1030:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1034:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1035:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02070);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02073);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1042:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1046:1: ( ( () ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1047:1: ( () )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1047:1: ( () )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1048:1: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1049:1: ()
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1051:1: 
            {
            }

             after(grammarAccess.getEntityAccess().getEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1061:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1065:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1066:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12131);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12134);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1073:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__Group_1__0 )? ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1077:1: ( ( ( rule__Entity__Group_1__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1078:1: ( ( rule__Entity__Group_1__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1078:1: ( ( rule__Entity__Group_1__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1079:1: ( rule__Entity__Group_1__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1080:1: ( rule__Entity__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1080:2: rule__Entity__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_1__0_in_rule__Entity__Group__1__Impl2161);
                    rule__Entity__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1090:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1094:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1095:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__22192);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22195);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1102:1: rule__Entity__Group__2__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1106:1: ( ( 'Entity' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1107:1: ( 'Entity' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1107:1: ( 'Entity' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1108:1: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Entity__Group__2__Impl2223); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1121:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1125:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1126:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__32254);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32257);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1133:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__NameAssignment_3 ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1137:1: ( ( ( rule__Entity__NameAssignment_3 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1138:1: ( ( rule__Entity__NameAssignment_3 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1138:1: ( ( rule__Entity__NameAssignment_3 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1139:1: ( rule__Entity__NameAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_3()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1140:1: ( rule__Entity__NameAssignment_3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1140:2: rule__Entity__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__NameAssignment_3_in_rule__Entity__Group__3__Impl2284);
            rule__Entity__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1150:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1154:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1155:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42314);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42317);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1162:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1166:1: ( ( ( rule__Entity__Group_4__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1167:1: ( ( rule__Entity__Group_4__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1167:1: ( ( rule__Entity__Group_4__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1168:1: ( rule__Entity__Group_4__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_4()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1169:1: ( rule__Entity__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1169:2: rule__Entity__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__0_in_rule__Entity__Group__4__Impl2344);
                    rule__Entity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1179:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1183:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1184:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52375);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__52378);
            rule__Entity__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1191:1: rule__Entity__Group__5__Impl : ( '{' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1195:1: ( ( '{' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1196:1: ( '{' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1196:1: ( '{' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1197:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Entity__Group__5__Impl2406); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1210:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1214:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1215:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62437);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__62440);
            rule__Entity__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1222:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__Group_6__0 )? ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1226:1: ( ( ( rule__Entity__Group_6__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1227:1: ( ( rule__Entity__Group_6__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1227:1: ( ( rule__Entity__Group_6__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1228:1: ( rule__Entity__Group_6__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_6()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1229:1: ( rule__Entity__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28||LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1229:2: rule__Entity__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__0_in_rule__Entity__Group__6__Impl2467);
                    rule__Entity__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1239:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1243:1: ( rule__Entity__Group__7__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1244:2: rule__Entity__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__72498);
            rule__Entity__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1250:1: rule__Entity__Group__7__Impl : ( '}' ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1254:1: ( ( '}' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1255:1: ( '}' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1255:1: ( '}' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1256:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Entity__Group__7__Impl2526); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group_1__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1285:1: rule__Entity__Group_1__0 : rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 ;
    public final void rule__Entity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1289:1: ( rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1290:2: rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_1__0__Impl_in_rule__Entity__Group_1__02573);
            rule__Entity__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_1__1_in_rule__Entity__Group_1__02576);
            rule__Entity__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__0"


    // $ANTLR start "rule__Entity__Group_1__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1297:1: rule__Entity__Group_1__0__Impl : ( '@' ) ;
    public final void rule__Entity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1301:1: ( ( '@' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1302:1: ( '@' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1302:1: ( '@' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1303:1: '@'
            {
             before(grammarAccess.getEntityAccess().getCommercialAtKeyword_1_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Entity__Group_1__0__Impl2604); 
             after(grammarAccess.getEntityAccess().getCommercialAtKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__0__Impl"


    // $ANTLR start "rule__Entity__Group_1__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1316:1: rule__Entity__Group_1__1 : rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2 ;
    public final void rule__Entity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1320:1: ( rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1321:2: rule__Entity__Group_1__1__Impl rule__Entity__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_1__1__Impl_in_rule__Entity__Group_1__12635);
            rule__Entity__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_1__2_in_rule__Entity__Group_1__12638);
            rule__Entity__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__1"


    // $ANTLR start "rule__Entity__Group_1__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1328:1: rule__Entity__Group_1__1__Impl : ( ( rule__Entity__AnnotationsAssignment_1_1 ) ) ;
    public final void rule__Entity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1332:1: ( ( ( rule__Entity__AnnotationsAssignment_1_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1333:1: ( ( rule__Entity__AnnotationsAssignment_1_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1333:1: ( ( rule__Entity__AnnotationsAssignment_1_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1334:1: ( rule__Entity__AnnotationsAssignment_1_1 )
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_1_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1335:1: ( rule__Entity__AnnotationsAssignment_1_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1335:2: rule__Entity__AnnotationsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__AnnotationsAssignment_1_1_in_rule__Entity__Group_1__1__Impl2665);
            rule__Entity__AnnotationsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAnnotationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__1__Impl"


    // $ANTLR start "rule__Entity__Group_1__2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1345:1: rule__Entity__Group_1__2 : rule__Entity__Group_1__2__Impl ;
    public final void rule__Entity__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1349:1: ( rule__Entity__Group_1__2__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1350:2: rule__Entity__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_1__2__Impl_in_rule__Entity__Group_1__22695);
            rule__Entity__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__2"


    // $ANTLR start "rule__Entity__Group_1__2__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1356:1: rule__Entity__Group_1__2__Impl : ( ( rule__Entity__Group_1_2__0 )* ) ;
    public final void rule__Entity__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1360:1: ( ( ( rule__Entity__Group_1_2__0 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1361:1: ( ( rule__Entity__Group_1_2__0 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1361:1: ( ( rule__Entity__Group_1_2__0 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1362:1: ( rule__Entity__Group_1_2__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_1_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1363:1: ( rule__Entity__Group_1_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1363:2: rule__Entity__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_1_2__0_in_rule__Entity__Group_1__2__Impl2722);
            	    rule__Entity__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__2__Impl"


    // $ANTLR start "rule__Entity__Group_1_2__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1379:1: rule__Entity__Group_1_2__0 : rule__Entity__Group_1_2__0__Impl rule__Entity__Group_1_2__1 ;
    public final void rule__Entity__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1383:1: ( rule__Entity__Group_1_2__0__Impl rule__Entity__Group_1_2__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1384:2: rule__Entity__Group_1_2__0__Impl rule__Entity__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_1_2__0__Impl_in_rule__Entity__Group_1_2__02759);
            rule__Entity__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_1_2__1_in_rule__Entity__Group_1_2__02762);
            rule__Entity__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1_2__0"


    // $ANTLR start "rule__Entity__Group_1_2__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1391:1: rule__Entity__Group_1_2__0__Impl : ( '@' ) ;
    public final void rule__Entity__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1395:1: ( ( '@' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1396:1: ( '@' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1396:1: ( '@' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1397:1: '@'
            {
             before(grammarAccess.getEntityAccess().getCommercialAtKeyword_1_2_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Entity__Group_1_2__0__Impl2790); 
             after(grammarAccess.getEntityAccess().getCommercialAtKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_1_2__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1410:1: rule__Entity__Group_1_2__1 : rule__Entity__Group_1_2__1__Impl ;
    public final void rule__Entity__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1414:1: ( rule__Entity__Group_1_2__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1415:2: rule__Entity__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_1_2__1__Impl_in_rule__Entity__Group_1_2__12821);
            rule__Entity__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1_2__1"


    // $ANTLR start "rule__Entity__Group_1_2__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1421:1: rule__Entity__Group_1_2__1__Impl : ( ( rule__Entity__AnnotationsAssignment_1_2_1 ) ) ;
    public final void rule__Entity__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1425:1: ( ( ( rule__Entity__AnnotationsAssignment_1_2_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1426:1: ( ( rule__Entity__AnnotationsAssignment_1_2_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1426:1: ( ( rule__Entity__AnnotationsAssignment_1_2_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1427:1: ( rule__Entity__AnnotationsAssignment_1_2_1 )
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_1_2_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1428:1: ( rule__Entity__AnnotationsAssignment_1_2_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1428:2: rule__Entity__AnnotationsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__AnnotationsAssignment_1_2_1_in_rule__Entity__Group_1_2__1__Impl2848);
            rule__Entity__AnnotationsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAnnotationsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1_2__1__Impl"


    // $ANTLR start "rule__Entity__Group_4__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1442:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1446:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1447:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__0__Impl_in_rule__Entity__Group_4__02882);
            rule__Entity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__1_in_rule__Entity__Group_4__02885);
            rule__Entity__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__0"


    // $ANTLR start "rule__Entity__Group_4__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1454:1: rule__Entity__Group_4__0__Impl : ( ':' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1458:1: ( ( ':' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1459:1: ( ':' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1459:1: ( ':' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1460:1: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_4_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Entity__Group_4__0__Impl2913); 
             after(grammarAccess.getEntityAccess().getColonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__0__Impl"


    // $ANTLR start "rule__Entity__Group_4__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1473:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1477:1: ( rule__Entity__Group_4__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1478:2: rule__Entity__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__1__Impl_in_rule__Entity__Group_4__12944);
            rule__Entity__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__1"


    // $ANTLR start "rule__Entity__Group_4__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1484:1: rule__Entity__Group_4__1__Impl : ( ( rule__Entity__SuperEntityAssignment_4_1 ) ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1488:1: ( ( ( rule__Entity__SuperEntityAssignment_4_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1489:1: ( ( rule__Entity__SuperEntityAssignment_4_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1489:1: ( ( rule__Entity__SuperEntityAssignment_4_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1490:1: ( rule__Entity__SuperEntityAssignment_4_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityAssignment_4_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1491:1: ( rule__Entity__SuperEntityAssignment_4_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1491:2: rule__Entity__SuperEntityAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__SuperEntityAssignment_4_1_in_rule__Entity__Group_4__1__Impl2971);
            rule__Entity__SuperEntityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperEntityAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__1__Impl"


    // $ANTLR start "rule__Entity__Group_6__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1505:1: rule__Entity__Group_6__0 : rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 ;
    public final void rule__Entity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1509:1: ( rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1510:2: rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__0__Impl_in_rule__Entity__Group_6__03005);
            rule__Entity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__1_in_rule__Entity__Group_6__03008);
            rule__Entity__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__0"


    // $ANTLR start "rule__Entity__Group_6__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1517:1: rule__Entity__Group_6__0__Impl : ( ( rule__Entity__OwnedFeatureAssignment_6_0 ) ) ;
    public final void rule__Entity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1521:1: ( ( ( rule__Entity__OwnedFeatureAssignment_6_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1522:1: ( ( rule__Entity__OwnedFeatureAssignment_6_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1522:1: ( ( rule__Entity__OwnedFeatureAssignment_6_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1523:1: ( rule__Entity__OwnedFeatureAssignment_6_0 )
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_6_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1524:1: ( rule__Entity__OwnedFeatureAssignment_6_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1524:2: rule__Entity__OwnedFeatureAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__OwnedFeatureAssignment_6_0_in_rule__Entity__Group_6__0__Impl3035);
            rule__Entity__OwnedFeatureAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__0__Impl"


    // $ANTLR start "rule__Entity__Group_6__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1534:1: rule__Entity__Group_6__1 : rule__Entity__Group_6__1__Impl ;
    public final void rule__Entity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1538:1: ( rule__Entity__Group_6__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1539:2: rule__Entity__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__1__Impl_in_rule__Entity__Group_6__13065);
            rule__Entity__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__1"


    // $ANTLR start "rule__Entity__Group_6__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1545:1: rule__Entity__Group_6__1__Impl : ( ( rule__Entity__OwnedFeatureAssignment_6_1 )* ) ;
    public final void rule__Entity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1549:1: ( ( ( rule__Entity__OwnedFeatureAssignment_6_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1550:1: ( ( rule__Entity__OwnedFeatureAssignment_6_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1550:1: ( ( rule__Entity__OwnedFeatureAssignment_6_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1551:1: ( rule__Entity__OwnedFeatureAssignment_6_1 )*
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_6_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1552:1: ( rule__Entity__OwnedFeatureAssignment_6_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28||LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1552:2: rule__Entity__OwnedFeatureAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__OwnedFeatureAssignment_6_1_in_rule__Entity__Group_6__1__Impl3092);
            	    rule__Entity__OwnedFeatureAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__1__Impl"


    // $ANTLR start "rule__Ref__Group__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1566:1: rule__Ref__Group__0 : rule__Ref__Group__0__Impl rule__Ref__Group__1 ;
    public final void rule__Ref__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1570:1: ( rule__Ref__Group__0__Impl rule__Ref__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1571:2: rule__Ref__Group__0__Impl rule__Ref__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__03127);
            rule__Ref__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__03130);
            rule__Ref__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__0"


    // $ANTLR start "rule__Ref__Group__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1578:1: rule__Ref__Group__0__Impl : ( () ) ;
    public final void rule__Ref__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1582:1: ( ( () ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1583:1: ( () )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1583:1: ( () )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1584:1: ()
            {
             before(grammarAccess.getRefAccess().getRefAction_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1585:1: ()
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1587:1: 
            {
            }

             after(grammarAccess.getRefAccess().getRefAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__0__Impl"


    // $ANTLR start "rule__Ref__Group__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1597:1: rule__Ref__Group__1 : rule__Ref__Group__1__Impl rule__Ref__Group__2 ;
    public final void rule__Ref__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1601:1: ( rule__Ref__Group__1__Impl rule__Ref__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1602:2: rule__Ref__Group__1__Impl rule__Ref__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__13188);
            rule__Ref__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__13191);
            rule__Ref__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__1"


    // $ANTLR start "rule__Ref__Group__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1609:1: rule__Ref__Group__1__Impl : ( ( rule__Ref__Group_1__0 )? ) ;
    public final void rule__Ref__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1613:1: ( ( ( rule__Ref__Group_1__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1614:1: ( ( rule__Ref__Group_1__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1614:1: ( ( rule__Ref__Group_1__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1615:1: ( rule__Ref__Group_1__0 )?
            {
             before(grammarAccess.getRefAccess().getGroup_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1616:1: ( rule__Ref__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1616:2: rule__Ref__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_1__0_in_rule__Ref__Group__1__Impl3218);
                    rule__Ref__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRefAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__1__Impl"


    // $ANTLR start "rule__Ref__Group__2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1626:1: rule__Ref__Group__2 : rule__Ref__Group__2__Impl rule__Ref__Group__3 ;
    public final void rule__Ref__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1630:1: ( rule__Ref__Group__2__Impl rule__Ref__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1631:2: rule__Ref__Group__2__Impl rule__Ref__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__23249);
            rule__Ref__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__23252);
            rule__Ref__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__2"


    // $ANTLR start "rule__Ref__Group__2__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1638:1: rule__Ref__Group__2__Impl : ( 'var' ) ;
    public final void rule__Ref__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1642:1: ( ( 'var' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1643:1: ( 'var' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1643:1: ( 'var' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1644:1: 'var'
            {
             before(grammarAccess.getRefAccess().getVarKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Ref__Group__2__Impl3280); 
             after(grammarAccess.getRefAccess().getVarKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__2__Impl"


    // $ANTLR start "rule__Ref__Group__3"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1657:1: rule__Ref__Group__3 : rule__Ref__Group__3__Impl rule__Ref__Group__4 ;
    public final void rule__Ref__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1661:1: ( rule__Ref__Group__3__Impl rule__Ref__Group__4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1662:2: rule__Ref__Group__3__Impl rule__Ref__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__33311);
            rule__Ref__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__33314);
            rule__Ref__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__3"


    // $ANTLR start "rule__Ref__Group__3__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1669:1: rule__Ref__Group__3__Impl : ( ( rule__Ref__NameAssignment_3 ) ) ;
    public final void rule__Ref__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1673:1: ( ( ( rule__Ref__NameAssignment_3 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1674:1: ( ( rule__Ref__NameAssignment_3 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1674:1: ( ( rule__Ref__NameAssignment_3 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1675:1: ( rule__Ref__NameAssignment_3 )
            {
             before(grammarAccess.getRefAccess().getNameAssignment_3()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1676:1: ( rule__Ref__NameAssignment_3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1676:2: rule__Ref__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__NameAssignment_3_in_rule__Ref__Group__3__Impl3341);
            rule__Ref__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__3__Impl"


    // $ANTLR start "rule__Ref__Group__4"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1686:1: rule__Ref__Group__4 : rule__Ref__Group__4__Impl rule__Ref__Group__5 ;
    public final void rule__Ref__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1690:1: ( rule__Ref__Group__4__Impl rule__Ref__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1691:2: rule__Ref__Group__4__Impl rule__Ref__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__43371);
            rule__Ref__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__43374);
            rule__Ref__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__4"


    // $ANTLR start "rule__Ref__Group__4__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1698:1: rule__Ref__Group__4__Impl : ( ( rule__Ref__RefToAssignment_4 ) ) ;
    public final void rule__Ref__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1702:1: ( ( ( rule__Ref__RefToAssignment_4 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1703:1: ( ( rule__Ref__RefToAssignment_4 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1703:1: ( ( rule__Ref__RefToAssignment_4 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1704:1: ( rule__Ref__RefToAssignment_4 )
            {
             before(grammarAccess.getRefAccess().getRefToAssignment_4()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1705:1: ( rule__Ref__RefToAssignment_4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1705:2: rule__Ref__RefToAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__RefToAssignment_4_in_rule__Ref__Group__4__Impl3401);
            rule__Ref__RefToAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getRefToAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__4__Impl"


    // $ANTLR start "rule__Ref__Group__5"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1715:1: rule__Ref__Group__5 : rule__Ref__Group__5__Impl ;
    public final void rule__Ref__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1719:1: ( rule__Ref__Group__5__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1720:2: rule__Ref__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__53431);
            rule__Ref__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__5"


    // $ANTLR start "rule__Ref__Group__5__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1726:1: rule__Ref__Group__5__Impl : ( ( rule__Ref__ManyAssignment_5 )? ) ;
    public final void rule__Ref__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1730:1: ( ( ( rule__Ref__ManyAssignment_5 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1731:1: ( ( rule__Ref__ManyAssignment_5 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1731:1: ( ( rule__Ref__ManyAssignment_5 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1732:1: ( rule__Ref__ManyAssignment_5 )?
            {
             before(grammarAccess.getRefAccess().getManyAssignment_5()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1733:1: ( rule__Ref__ManyAssignment_5 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1733:2: rule__Ref__ManyAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ref__ManyAssignment_5_in_rule__Ref__Group__5__Impl3458);
                    rule__Ref__ManyAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRefAccess().getManyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__5__Impl"


    // $ANTLR start "rule__Ref__Group_1__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1755:1: rule__Ref__Group_1__0 : rule__Ref__Group_1__0__Impl rule__Ref__Group_1__1 ;
    public final void rule__Ref__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1759:1: ( rule__Ref__Group_1__0__Impl rule__Ref__Group_1__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1760:2: rule__Ref__Group_1__0__Impl rule__Ref__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_1__0__Impl_in_rule__Ref__Group_1__03501);
            rule__Ref__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_1__1_in_rule__Ref__Group_1__03504);
            rule__Ref__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1__0"


    // $ANTLR start "rule__Ref__Group_1__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1767:1: rule__Ref__Group_1__0__Impl : ( '@' ) ;
    public final void rule__Ref__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1771:1: ( ( '@' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1772:1: ( '@' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1772:1: ( '@' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1773:1: '@'
            {
             before(grammarAccess.getRefAccess().getCommercialAtKeyword_1_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Ref__Group_1__0__Impl3532); 
             after(grammarAccess.getRefAccess().getCommercialAtKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1__0__Impl"


    // $ANTLR start "rule__Ref__Group_1__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1786:1: rule__Ref__Group_1__1 : rule__Ref__Group_1__1__Impl rule__Ref__Group_1__2 ;
    public final void rule__Ref__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1790:1: ( rule__Ref__Group_1__1__Impl rule__Ref__Group_1__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1791:2: rule__Ref__Group_1__1__Impl rule__Ref__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_1__1__Impl_in_rule__Ref__Group_1__13563);
            rule__Ref__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_1__2_in_rule__Ref__Group_1__13566);
            rule__Ref__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1__1"


    // $ANTLR start "rule__Ref__Group_1__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1798:1: rule__Ref__Group_1__1__Impl : ( ( rule__Ref__AnnotationsAssignment_1_1 ) ) ;
    public final void rule__Ref__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1802:1: ( ( ( rule__Ref__AnnotationsAssignment_1_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1803:1: ( ( rule__Ref__AnnotationsAssignment_1_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1803:1: ( ( rule__Ref__AnnotationsAssignment_1_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1804:1: ( rule__Ref__AnnotationsAssignment_1_1 )
            {
             before(grammarAccess.getRefAccess().getAnnotationsAssignment_1_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1805:1: ( rule__Ref__AnnotationsAssignment_1_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1805:2: rule__Ref__AnnotationsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__AnnotationsAssignment_1_1_in_rule__Ref__Group_1__1__Impl3593);
            rule__Ref__AnnotationsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getAnnotationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1__1__Impl"


    // $ANTLR start "rule__Ref__Group_1__2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1815:1: rule__Ref__Group_1__2 : rule__Ref__Group_1__2__Impl ;
    public final void rule__Ref__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1819:1: ( rule__Ref__Group_1__2__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1820:2: rule__Ref__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_1__2__Impl_in_rule__Ref__Group_1__23623);
            rule__Ref__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1__2"


    // $ANTLR start "rule__Ref__Group_1__2__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1826:1: rule__Ref__Group_1__2__Impl : ( ( rule__Ref__Group_1_2__0 )* ) ;
    public final void rule__Ref__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1830:1: ( ( ( rule__Ref__Group_1_2__0 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1831:1: ( ( rule__Ref__Group_1_2__0 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1831:1: ( ( rule__Ref__Group_1_2__0 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1832:1: ( rule__Ref__Group_1_2__0 )*
            {
             before(grammarAccess.getRefAccess().getGroup_1_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1833:1: ( rule__Ref__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1833:2: rule__Ref__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_1_2__0_in_rule__Ref__Group_1__2__Impl3650);
            	    rule__Ref__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getRefAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1__2__Impl"


    // $ANTLR start "rule__Ref__Group_1_2__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1849:1: rule__Ref__Group_1_2__0 : rule__Ref__Group_1_2__0__Impl rule__Ref__Group_1_2__1 ;
    public final void rule__Ref__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1853:1: ( rule__Ref__Group_1_2__0__Impl rule__Ref__Group_1_2__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1854:2: rule__Ref__Group_1_2__0__Impl rule__Ref__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_1_2__0__Impl_in_rule__Ref__Group_1_2__03687);
            rule__Ref__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_1_2__1_in_rule__Ref__Group_1_2__03690);
            rule__Ref__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_2__0"


    // $ANTLR start "rule__Ref__Group_1_2__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1861:1: rule__Ref__Group_1_2__0__Impl : ( '@' ) ;
    public final void rule__Ref__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1865:1: ( ( '@' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1866:1: ( '@' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1866:1: ( '@' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1867:1: '@'
            {
             before(grammarAccess.getRefAccess().getCommercialAtKeyword_1_2_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Ref__Group_1_2__0__Impl3718); 
             after(grammarAccess.getRefAccess().getCommercialAtKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_2__0__Impl"


    // $ANTLR start "rule__Ref__Group_1_2__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1880:1: rule__Ref__Group_1_2__1 : rule__Ref__Group_1_2__1__Impl ;
    public final void rule__Ref__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1884:1: ( rule__Ref__Group_1_2__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1885:2: rule__Ref__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_1_2__1__Impl_in_rule__Ref__Group_1_2__13749);
            rule__Ref__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_2__1"


    // $ANTLR start "rule__Ref__Group_1_2__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1891:1: rule__Ref__Group_1_2__1__Impl : ( ( rule__Ref__AnnotationsAssignment_1_2_1 ) ) ;
    public final void rule__Ref__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1895:1: ( ( ( rule__Ref__AnnotationsAssignment_1_2_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1896:1: ( ( rule__Ref__AnnotationsAssignment_1_2_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1896:1: ( ( rule__Ref__AnnotationsAssignment_1_2_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1897:1: ( rule__Ref__AnnotationsAssignment_1_2_1 )
            {
             before(grammarAccess.getRefAccess().getAnnotationsAssignment_1_2_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1898:1: ( rule__Ref__AnnotationsAssignment_1_2_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1898:2: rule__Ref__AnnotationsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__AnnotationsAssignment_1_2_1_in_rule__Ref__Group_1_2__1__Impl3776);
            rule__Ref__AnnotationsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getAnnotationsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_1_2__1__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1912:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1916:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1917:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03810);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03813);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1924:1: rule__DataType__Group__0__Impl : ( () ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1928:1: ( ( () ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1929:1: ( () )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1929:1: ( () )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1930:1: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1931:1: ()
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1933:1: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1943:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1947:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1948:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13871);
            rule__DataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__13874);
            rule__DataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1955:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__Group_1__0 )? ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1959:1: ( ( ( rule__DataType__Group_1__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1960:1: ( ( rule__DataType__Group_1__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1960:1: ( ( rule__DataType__Group_1__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1961:1: ( rule__DataType__Group_1__0 )?
            {
             before(grammarAccess.getDataTypeAccess().getGroup_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1962:1: ( rule__DataType__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1962:2: rule__DataType__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_1__0_in_rule__DataType__Group__1__Impl3901);
                    rule__DataType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group__2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1972:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl rule__DataType__Group__3 ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1976:1: ( rule__DataType__Group__2__Impl rule__DataType__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1977:2: rule__DataType__Group__2__Impl rule__DataType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__23932);
            rule__DataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__23935);
            rule__DataType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__2"


    // $ANTLR start "rule__DataType__Group__2__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1984:1: rule__DataType__Group__2__Impl : ( 'var' ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1988:1: ( ( 'var' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1989:1: ( 'var' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1989:1: ( 'var' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1990:1: 'var'
            {
             before(grammarAccess.getDataTypeAccess().getVarKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__DataType__Group__2__Impl3963); 
             after(grammarAccess.getDataTypeAccess().getVarKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__2__Impl"


    // $ANTLR start "rule__DataType__Group__3"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2003:1: rule__DataType__Group__3 : rule__DataType__Group__3__Impl rule__DataType__Group__4 ;
    public final void rule__DataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2007:1: ( rule__DataType__Group__3__Impl rule__DataType__Group__4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2008:2: rule__DataType__Group__3__Impl rule__DataType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__33994);
            rule__DataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__33997);
            rule__DataType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__3"


    // $ANTLR start "rule__DataType__Group__3__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2015:1: rule__DataType__Group__3__Impl : ( ( rule__DataType__NameAssignment_3 ) ) ;
    public final void rule__DataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2019:1: ( ( ( rule__DataType__NameAssignment_3 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2020:1: ( ( rule__DataType__NameAssignment_3 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2020:1: ( ( rule__DataType__NameAssignment_3 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2021:1: ( rule__DataType__NameAssignment_3 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_3()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2022:1: ( rule__DataType__NameAssignment_3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2022:2: rule__DataType__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__NameAssignment_3_in_rule__DataType__Group__3__Impl4024);
            rule__DataType__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__3__Impl"


    // $ANTLR start "rule__DataType__Group__4"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2032:1: rule__DataType__Group__4 : rule__DataType__Group__4__Impl rule__DataType__Group__5 ;
    public final void rule__DataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2036:1: ( rule__DataType__Group__4__Impl rule__DataType__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2037:2: rule__DataType__Group__4__Impl rule__DataType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__44054);
            rule__DataType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__5_in_rule__DataType__Group__44057);
            rule__DataType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__4"


    // $ANTLR start "rule__DataType__Group__4__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2044:1: rule__DataType__Group__4__Impl : ( ( rule__DataType__TypeAssignment_4 ) ) ;
    public final void rule__DataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2048:1: ( ( ( rule__DataType__TypeAssignment_4 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2049:1: ( ( rule__DataType__TypeAssignment_4 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2049:1: ( ( rule__DataType__TypeAssignment_4 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2050:1: ( rule__DataType__TypeAssignment_4 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_4()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2051:1: ( rule__DataType__TypeAssignment_4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2051:2: rule__DataType__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__TypeAssignment_4_in_rule__DataType__Group__4__Impl4084);
            rule__DataType__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__4__Impl"


    // $ANTLR start "rule__DataType__Group__5"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2061:1: rule__DataType__Group__5 : rule__DataType__Group__5__Impl ;
    public final void rule__DataType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2065:1: ( rule__DataType__Group__5__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2066:2: rule__DataType__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__5__Impl_in_rule__DataType__Group__54114);
            rule__DataType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__5"


    // $ANTLR start "rule__DataType__Group__5__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2072:1: rule__DataType__Group__5__Impl : ( ( rule__DataType__ManyAssignment_5 )? ) ;
    public final void rule__DataType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2076:1: ( ( ( rule__DataType__ManyAssignment_5 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2077:1: ( ( rule__DataType__ManyAssignment_5 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2077:1: ( ( rule__DataType__ManyAssignment_5 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2078:1: ( rule__DataType__ManyAssignment_5 )?
            {
             before(grammarAccess.getDataTypeAccess().getManyAssignment_5()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2079:1: ( rule__DataType__ManyAssignment_5 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2079:2: rule__DataType__ManyAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataType__ManyAssignment_5_in_rule__DataType__Group__5__Impl4141);
                    rule__DataType__ManyAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getManyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__5__Impl"


    // $ANTLR start "rule__DataType__Group_1__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2101:1: rule__DataType__Group_1__0 : rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1 ;
    public final void rule__DataType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2105:1: ( rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2106:2: rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_1__0__Impl_in_rule__DataType__Group_1__04184);
            rule__DataType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_1__1_in_rule__DataType__Group_1__04187);
            rule__DataType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__0"


    // $ANTLR start "rule__DataType__Group_1__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2113:1: rule__DataType__Group_1__0__Impl : ( '@' ) ;
    public final void rule__DataType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2117:1: ( ( '@' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2118:1: ( '@' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2118:1: ( '@' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2119:1: '@'
            {
             before(grammarAccess.getDataTypeAccess().getCommercialAtKeyword_1_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__DataType__Group_1__0__Impl4215); 
             after(grammarAccess.getDataTypeAccess().getCommercialAtKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__0__Impl"


    // $ANTLR start "rule__DataType__Group_1__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2132:1: rule__DataType__Group_1__1 : rule__DataType__Group_1__1__Impl rule__DataType__Group_1__2 ;
    public final void rule__DataType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2136:1: ( rule__DataType__Group_1__1__Impl rule__DataType__Group_1__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2137:2: rule__DataType__Group_1__1__Impl rule__DataType__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_1__1__Impl_in_rule__DataType__Group_1__14246);
            rule__DataType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_1__2_in_rule__DataType__Group_1__14249);
            rule__DataType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__1"


    // $ANTLR start "rule__DataType__Group_1__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2144:1: rule__DataType__Group_1__1__Impl : ( ( rule__DataType__AnnotationsAssignment_1_1 ) ) ;
    public final void rule__DataType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2148:1: ( ( ( rule__DataType__AnnotationsAssignment_1_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2149:1: ( ( rule__DataType__AnnotationsAssignment_1_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2149:1: ( ( rule__DataType__AnnotationsAssignment_1_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2150:1: ( rule__DataType__AnnotationsAssignment_1_1 )
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_1_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2151:1: ( rule__DataType__AnnotationsAssignment_1_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2151:2: rule__DataType__AnnotationsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__AnnotationsAssignment_1_1_in_rule__DataType__Group_1__1__Impl4276);
            rule__DataType__AnnotationsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__1__Impl"


    // $ANTLR start "rule__DataType__Group_1__2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2161:1: rule__DataType__Group_1__2 : rule__DataType__Group_1__2__Impl ;
    public final void rule__DataType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2165:1: ( rule__DataType__Group_1__2__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2166:2: rule__DataType__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_1__2__Impl_in_rule__DataType__Group_1__24306);
            rule__DataType__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__2"


    // $ANTLR start "rule__DataType__Group_1__2__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2172:1: rule__DataType__Group_1__2__Impl : ( ( rule__DataType__Group_1_2__0 )* ) ;
    public final void rule__DataType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2176:1: ( ( ( rule__DataType__Group_1_2__0 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2177:1: ( ( rule__DataType__Group_1_2__0 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2177:1: ( ( rule__DataType__Group_1_2__0 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2178:1: ( rule__DataType__Group_1_2__0 )*
            {
             before(grammarAccess.getDataTypeAccess().getGroup_1_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2179:1: ( rule__DataType__Group_1_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2179:2: rule__DataType__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_1_2__0_in_rule__DataType__Group_1__2__Impl4333);
            	    rule__DataType__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getDataTypeAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__2__Impl"


    // $ANTLR start "rule__DataType__Group_1_2__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2195:1: rule__DataType__Group_1_2__0 : rule__DataType__Group_1_2__0__Impl rule__DataType__Group_1_2__1 ;
    public final void rule__DataType__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2199:1: ( rule__DataType__Group_1_2__0__Impl rule__DataType__Group_1_2__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2200:2: rule__DataType__Group_1_2__0__Impl rule__DataType__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_1_2__0__Impl_in_rule__DataType__Group_1_2__04370);
            rule__DataType__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_1_2__1_in_rule__DataType__Group_1_2__04373);
            rule__DataType__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1_2__0"


    // $ANTLR start "rule__DataType__Group_1_2__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2207:1: rule__DataType__Group_1_2__0__Impl : ( '@' ) ;
    public final void rule__DataType__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2211:1: ( ( '@' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2212:1: ( '@' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2212:1: ( '@' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2213:1: '@'
            {
             before(grammarAccess.getDataTypeAccess().getCommercialAtKeyword_1_2_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__DataType__Group_1_2__0__Impl4401); 
             after(grammarAccess.getDataTypeAccess().getCommercialAtKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1_2__0__Impl"


    // $ANTLR start "rule__DataType__Group_1_2__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2226:1: rule__DataType__Group_1_2__1 : rule__DataType__Group_1_2__1__Impl ;
    public final void rule__DataType__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2230:1: ( rule__DataType__Group_1_2__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2231:2: rule__DataType__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_1_2__1__Impl_in_rule__DataType__Group_1_2__14432);
            rule__DataType__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1_2__1"


    // $ANTLR start "rule__DataType__Group_1_2__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2237:1: rule__DataType__Group_1_2__1__Impl : ( ( rule__DataType__AnnotationsAssignment_1_2_1 ) ) ;
    public final void rule__DataType__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2241:1: ( ( ( rule__DataType__AnnotationsAssignment_1_2_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2242:1: ( ( rule__DataType__AnnotationsAssignment_1_2_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2242:1: ( ( rule__DataType__AnnotationsAssignment_1_2_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2243:1: ( rule__DataType__AnnotationsAssignment_1_2_1 )
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_1_2_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2244:1: ( rule__DataType__AnnotationsAssignment_1_2_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2244:2: rule__DataType__AnnotationsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__AnnotationsAssignment_1_2_1_in_rule__DataType__Group_1_2__1__Impl4459);
            rule__DataType__AnnotationsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1_2__1__Impl"


    // $ANTLR start "rule__Module__NameAssignment_2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2259:1: rule__Module__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2263:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2264:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2264:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2265:1: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Module__NameAssignment_24498); 
             after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__NameAssignment_2"


    // $ANTLR start "rule__Module__PackagesAssignment_3_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2274:1: rule__Module__PackagesAssignment_3_0 : ( rulePackage ) ;
    public final void rule__Module__PackagesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2278:1: ( ( rulePackage ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2279:1: ( rulePackage )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2279:1: ( rulePackage )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2280:1: rulePackage
            {
             before(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_3_04529);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__PackagesAssignment_3_0"


    // $ANTLR start "rule__Module__PackagesAssignment_3_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2289:1: rule__Module__PackagesAssignment_3_1 : ( rulePackage ) ;
    public final void rule__Module__PackagesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2293:1: ( ( rulePackage ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2294:1: ( rulePackage )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2294:1: ( rulePackage )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2295:1: rulePackage
            {
             before(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_3_14560);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__PackagesAssignment_3_1"


    // $ANTLR start "rule__Package__SuperPackageAssignment_2_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2304:1: rule__Package__SuperPackageAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Package__SuperPackageAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2308:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2309:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2309:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2310:1: ( RULE_ID )
            {
             before(grammarAccess.getPackageAccess().getSuperPackagePackageCrossReference_2_0_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2311:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2312:1: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getSuperPackagePackageIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Package__SuperPackageAssignment_2_04595); 
             after(grammarAccess.getPackageAccess().getSuperPackagePackageIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getPackageAccess().getSuperPackagePackageCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__SuperPackageAssignment_2_0"


    // $ANTLR start "rule__Package__SuperPackageAssignment_2_2_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2323:1: rule__Package__SuperPackageAssignment_2_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Package__SuperPackageAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2327:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2328:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2328:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2329:1: ( RULE_ID )
            {
             before(grammarAccess.getPackageAccess().getSuperPackagePackageCrossReference_2_2_0_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2330:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2331:1: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getSuperPackagePackageIDTerminalRuleCall_2_2_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Package__SuperPackageAssignment_2_2_04634); 
             after(grammarAccess.getPackageAccess().getSuperPackagePackageIDTerminalRuleCall_2_2_0_0_1()); 

            }

             after(grammarAccess.getPackageAccess().getSuperPackagePackageCrossReference_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__SuperPackageAssignment_2_2_0"


    // $ANTLR start "rule__Package__NameAssignment_3"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2342:1: rule__Package__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2346:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2347:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2347:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2348:1: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Package__NameAssignment_34669); 
             after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_3"


    // $ANTLR start "rule__Package__OwnedEntityAssignment_5_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2357:1: rule__Package__OwnedEntityAssignment_5_0 : ( ruleEntity ) ;
    public final void rule__Package__OwnedEntityAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2361:1: ( ( ruleEntity ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2362:1: ( ruleEntity )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2362:1: ( ruleEntity )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2363:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_5_04700);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__OwnedEntityAssignment_5_0"


    // $ANTLR start "rule__Package__OwnedEntityAssignment_5_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2372:1: rule__Package__OwnedEntityAssignment_5_1 : ( ruleEntity ) ;
    public final void rule__Package__OwnedEntityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2376:1: ( ( ruleEntity ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2377:1: ( ruleEntity )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2377:1: ( ruleEntity )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2378:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_5_14731);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__OwnedEntityAssignment_5_1"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_1_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2387:1: rule__Entity__AnnotationsAssignment_1_1 : ( ruleEntityAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2391:1: ( ( ruleEntityAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2392:1: ( ruleEntityAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2392:1: ( ruleEntityAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2393:1: ruleEntityAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_1_14762);
            ruleEntityAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AnnotationsAssignment_1_1"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_1_2_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2402:1: rule__Entity__AnnotationsAssignment_1_2_1 : ( ruleEntityAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2406:1: ( ( ruleEntityAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2407:1: ( ruleEntityAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2407:1: ( ruleEntityAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2408:1: ruleEntityAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_1_2_14793);
            ruleEntityAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AnnotationsAssignment_1_2_1"


    // $ANTLR start "rule__Entity__NameAssignment_3"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2417:1: rule__Entity__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2421:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2422:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2422:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2423:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_34824); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_3"


    // $ANTLR start "rule__Entity__SuperEntityAssignment_4_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2432:1: rule__Entity__SuperEntityAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperEntityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2436:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2437:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2437:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2438:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_4_1_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2439:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2440:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_4_14859); 
             after(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperEntityAssignment_4_1"


    // $ANTLR start "rule__Entity__OwnedFeatureAssignment_6_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2451:1: rule__Entity__OwnedFeatureAssignment_6_0 : ( ruleFeature ) ;
    public final void rule__Entity__OwnedFeatureAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2455:1: ( ( ruleFeature ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2456:1: ( ruleFeature )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2456:1: ( ruleFeature )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2457:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_6_04894);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__OwnedFeatureAssignment_6_0"


    // $ANTLR start "rule__Entity__OwnedFeatureAssignment_6_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2466:1: rule__Entity__OwnedFeatureAssignment_6_1 : ( ruleFeature ) ;
    public final void rule__Entity__OwnedFeatureAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2470:1: ( ( ruleFeature ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2471:1: ( ruleFeature )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2471:1: ( ruleFeature )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2472:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_6_14925);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__OwnedFeatureAssignment_6_1"


    // $ANTLR start "rule__Ref__AnnotationsAssignment_1_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2481:1: rule__Ref__AnnotationsAssignment_1_1 : ( ruleFetureAnnotation ) ;
    public final void rule__Ref__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2485:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2486:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2486:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2487:1: ruleFetureAnnotation
            {
             before(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_1_14956);
            ruleFetureAnnotation();

            state._fsp--;

             after(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__AnnotationsAssignment_1_1"


    // $ANTLR start "rule__Ref__AnnotationsAssignment_1_2_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2496:1: rule__Ref__AnnotationsAssignment_1_2_1 : ( ruleFetureAnnotation ) ;
    public final void rule__Ref__AnnotationsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2500:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2501:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2501:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2502:1: ruleFetureAnnotation
            {
             before(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_1_2_14987);
            ruleFetureAnnotation();

            state._fsp--;

             after(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__AnnotationsAssignment_1_2_1"


    // $ANTLR start "rule__Ref__NameAssignment_3"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2511:1: rule__Ref__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Ref__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2515:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2516:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2516:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2517:1: RULE_ID
            {
             before(grammarAccess.getRefAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Ref__NameAssignment_35018); 
             after(grammarAccess.getRefAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__NameAssignment_3"


    // $ANTLR start "rule__Ref__RefToAssignment_4"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2526:1: rule__Ref__RefToAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Ref__RefToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2530:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2531:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2531:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2532:1: ( RULE_ID )
            {
             before(grammarAccess.getRefAccess().getRefToEntityCrossReference_4_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2533:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2534:1: RULE_ID
            {
             before(grammarAccess.getRefAccess().getRefToEntityIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Ref__RefToAssignment_45053); 
             after(grammarAccess.getRefAccess().getRefToEntityIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRefAccess().getRefToEntityCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__RefToAssignment_4"


    // $ANTLR start "rule__Ref__ManyAssignment_5"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2545:1: rule__Ref__ManyAssignment_5 : ( ( '[]' ) ) ;
    public final void rule__Ref__ManyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2549:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2550:1: ( ( '[]' ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2550:1: ( ( '[]' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2551:1: ( '[]' )
            {
             before(grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2552:1: ( '[]' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2553:1: '[]'
            {
             before(grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Ref__ManyAssignment_55093); 
             after(grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 

            }

             after(grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__ManyAssignment_5"


    // $ANTLR start "rule__DataType__AnnotationsAssignment_1_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2568:1: rule__DataType__AnnotationsAssignment_1_1 : ( ruleFetureAnnotation ) ;
    public final void rule__DataType__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2572:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2573:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2573:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2574:1: ruleFetureAnnotation
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_1_15132);
            ruleFetureAnnotation();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__AnnotationsAssignment_1_1"


    // $ANTLR start "rule__DataType__AnnotationsAssignment_1_2_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2583:1: rule__DataType__AnnotationsAssignment_1_2_1 : ( ruleFetureAnnotation ) ;
    public final void rule__DataType__AnnotationsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2587:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2588:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2588:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2589:1: ruleFetureAnnotation
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_1_2_15163);
            ruleFetureAnnotation();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__AnnotationsAssignment_1_2_1"


    // $ANTLR start "rule__DataType__NameAssignment_3"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2598:1: rule__DataType__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2602:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2603:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2603:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2604:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_35194); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_3"


    // $ANTLR start "rule__DataType__TypeAssignment_4"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2613:1: rule__DataType__TypeAssignment_4 : ( ruleDataTypes ) ;
    public final void rule__DataType__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2617:1: ( ( ruleDataTypes ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2618:1: ( ruleDataTypes )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2618:1: ( ruleDataTypes )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2619:1: ruleDataTypes
            {
             before(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataTypes_in_rule__DataType__TypeAssignment_45225);
            ruleDataTypes();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__TypeAssignment_4"


    // $ANTLR start "rule__DataType__ManyAssignment_5"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2628:1: rule__DataType__ManyAssignment_5 : ( ( '[]' ) ) ;
    public final void rule__DataType__ManyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2632:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2633:1: ( ( '[]' ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2633:1: ( ( '[]' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2634:1: ( '[]' )
            {
             before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2635:1: ( '[]' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2636:1: '[]'
            {
             before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__DataType__ManyAssignment_55261); 
             after(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 

            }

             after(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__ManyAssignment_5"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\17\uffff";
    static final String DFA1_eofS =
        "\17\uffff";
    static final String DFA1_minS =
        "\1\34\1\14\1\4\4\34\1\4\1\14\2\uffff\4\34";
    static final String DFA1_maxS =
        "\1\36\1\17\1\4\4\36\1\25\1\17\2\uffff\4\36";
    static final String DFA1_acceptS =
        "\11\uffff\1\2\1\1\4\uffff";
    static final String DFA1_specialS =
        "\17\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\1\uffff\1\2",
            "\1\3\1\4\1\5\1\6",
            "\1\7",
            "\1\10\1\uffff\1\2",
            "\1\10\1\uffff\1\2",
            "\1\10\1\uffff\1\2",
            "\1\10\1\uffff\1\2",
            "\1\12\13\uffff\6\11",
            "\1\13\1\14\1\15\1\16",
            "",
            "",
            "\1\10\1\uffff\1\2",
            "\1\10\1\uffff\1\2",
            "\1\10\1\uffff\1\2",
            "\1\10\1\uffff\1\2"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "286:1: rule__Feature__Alternatives : ( ( ruleRef ) | ( ruleDataType ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModule_in_entryRuleModule61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModule68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_in_entryRulePackage121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRef_in_entryRuleRef301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRef308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__0_in_ruleRef334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataType368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__0_in_ruleDataType394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleEntityAnnotation432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FetureAnnotation__Alternatives_in_ruleFetureAnnotation470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypes__Alternatives_in_ruleDataTypes506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRef_in_rule__Feature__Alternatives541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_rule__Feature__Alternatives558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__FetureAnnotation__Alternatives591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__FetureAnnotation__Alternatives612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FetureAnnotation__Alternatives633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__FetureAnnotation__Alternatives654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__DataTypes__Alternatives690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__DataTypes__Alternatives711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__DataTypes__Alternatives732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__DataTypes__Alternatives753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__DataTypes__Alternatives774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__DataTypes__Alternatives795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0828 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1889 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__1892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Module__Group__1__Impl920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__2951 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__2954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group_3__0_in_rule__Module__Group__3__Impl1038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group_3__0__Impl_in_rule__Module__Group_3__01077 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Module__Group_3__1_in_rule__Module__Group_3__01080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__PackagesAssignment_3_0_in_rule__Module__Group_3__0__Impl1107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group_3__1__Impl_in_rule__Module__Group_3__11137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__PackagesAssignment_3_1_in_rule__Module__Group_3__1__Impl1164 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01199 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11260 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Package__Group__1__Impl1291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21322 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_2__0_in_rule__Package__Group__2__Impl1352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31383 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__NameAssignment_3_in_rule__Package__Group__3__Impl1413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41443 = new BitSet(new long[]{0x000000001A000000L});
        public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Package__Group__4__Impl1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51505 = new BitSet(new long[]{0x000000001A000000L});
        public static final BitSet FOLLOW_rule__Package__Group__6_in_rule__Package__Group__51508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl1535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Package__Group__6__Impl1594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_2__0__Impl_in_rule__Package__Group_2__01639 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Package__Group_2__1_in_rule__Package__Group_2__01642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__SuperPackageAssignment_2_0_in_rule__Package__Group_2__0__Impl1669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_2__1__Impl_in_rule__Package__Group_2__11699 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Package__Group_2__2_in_rule__Package__Group_2__11702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Package__Group_2__1__Impl1730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_2__2__Impl_in_rule__Package__Group_2__21761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_2_2__0_in_rule__Package__Group_2__2__Impl1788 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Package__Group_2_2__0__Impl_in_rule__Package__Group_2_2__01825 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Package__Group_2_2__1_in_rule__Package__Group_2_2__01828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__SuperPackageAssignment_2_2_0_in_rule__Package__Group_2_2__0__Impl1855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_2_2__1__Impl_in_rule__Package__Group_2_2__11885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Package__Group_2_2__1__Impl1913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__01948 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__01951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__OwnedEntityAssignment_5_0_in_rule__Package__Group_5__0__Impl1978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__12008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__OwnedEntityAssignment_5_1_in_rule__Package__Group_5__1__Impl2035 = new BitSet(new long[]{0x0000000018000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__02070 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__02073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__12131 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__12134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_1__0_in_rule__Entity__Group__1__Impl2161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__22192 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__22195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Entity__Group__2__Impl2223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__32254 = new BitSet(new long[]{0x0000000021000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__32257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__NameAssignment_3_in_rule__Entity__Group__3__Impl2284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42314 = new BitSet(new long[]{0x0000000021000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__0_in_rule__Entity__Group__4__Impl2344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52375 = new BitSet(new long[]{0x0000000052000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__52378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Entity__Group__5__Impl2406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62437 = new BitSet(new long[]{0x0000000052000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__62440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__0_in_rule__Entity__Group__6__Impl2467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__72498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Entity__Group__7__Impl2526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_1__0__Impl_in_rule__Entity__Group_1__02573 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Entity__Group_1__1_in_rule__Entity__Group_1__02576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Entity__Group_1__0__Impl2604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_1__1__Impl_in_rule__Entity__Group_1__12635 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Entity__Group_1__2_in_rule__Entity__Group_1__12638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_1_1_in_rule__Entity__Group_1__1__Impl2665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_1__2__Impl_in_rule__Entity__Group_1__22695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_1_2__0_in_rule__Entity__Group_1__2__Impl2722 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_1_2__0__Impl_in_rule__Entity__Group_1_2__02759 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Entity__Group_1_2__1_in_rule__Entity__Group_1_2__02762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Entity__Group_1_2__0__Impl2790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_1_2__1__Impl_in_rule__Entity__Group_1_2__12821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_1_2_1_in_rule__Entity__Group_1_2__1__Impl2848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__0__Impl_in_rule__Entity__Group_4__02882 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__1_in_rule__Entity__Group_4__02885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Entity__Group_4__0__Impl2913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__1__Impl_in_rule__Entity__Group_4__12944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__SuperEntityAssignment_4_1_in_rule__Entity__Group_4__1__Impl2971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__0__Impl_in_rule__Entity__Group_6__03005 = new BitSet(new long[]{0x0000000050000000L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__1_in_rule__Entity__Group_6__03008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__OwnedFeatureAssignment_6_0_in_rule__Entity__Group_6__0__Impl3035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__1__Impl_in_rule__Entity__Group_6__13065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__OwnedFeatureAssignment_6_1_in_rule__Entity__Group_6__1__Impl3092 = new BitSet(new long[]{0x0000000050000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__03127 = new BitSet(new long[]{0x0000000050000000L});
        public static final BitSet FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__03130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__13188 = new BitSet(new long[]{0x0000000050000000L});
        public static final BitSet FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__13191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_1__0_in_rule__Ref__Group__1__Impl3218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__23249 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__23252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Ref__Group__2__Impl3280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__33311 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__33314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__NameAssignment_3_in_rule__Ref__Group__3__Impl3341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__43371 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__43374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__RefToAssignment_4_in_rule__Ref__Group__4__Impl3401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__53431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__ManyAssignment_5_in_rule__Ref__Group__5__Impl3458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_1__0__Impl_in_rule__Ref__Group_1__03501 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__Ref__Group_1__1_in_rule__Ref__Group_1__03504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Ref__Group_1__0__Impl3532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_1__1__Impl_in_rule__Ref__Group_1__13563 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Ref__Group_1__2_in_rule__Ref__Group_1__13566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__AnnotationsAssignment_1_1_in_rule__Ref__Group_1__1__Impl3593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_1__2__Impl_in_rule__Ref__Group_1__23623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_1_2__0_in_rule__Ref__Group_1__2__Impl3650 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_1_2__0__Impl_in_rule__Ref__Group_1_2__03687 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__Ref__Group_1_2__1_in_rule__Ref__Group_1_2__03690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Ref__Group_1_2__0__Impl3718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_1_2__1__Impl_in_rule__Ref__Group_1_2__13749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__AnnotationsAssignment_1_2_1_in_rule__Ref__Group_1_2__1__Impl3776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03810 = new BitSet(new long[]{0x0000000050000000L});
        public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13871 = new BitSet(new long[]{0x0000000050000000L});
        public static final BitSet FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__13874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_1__0_in_rule__DataType__Group__1__Impl3901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__23932 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__23935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__DataType__Group__2__Impl3963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__33994 = new BitSet(new long[]{0x00000000003F0000L});
        public static final BitSet FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__33997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__NameAssignment_3_in_rule__DataType__Group__3__Impl4024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__44054 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__DataType__Group__5_in_rule__DataType__Group__44057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__TypeAssignment_4_in_rule__DataType__Group__4__Impl4084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__5__Impl_in_rule__DataType__Group__54114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__ManyAssignment_5_in_rule__DataType__Group__5__Impl4141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_1__0__Impl_in_rule__DataType__Group_1__04184 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__DataType__Group_1__1_in_rule__DataType__Group_1__04187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__DataType__Group_1__0__Impl4215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_1__1__Impl_in_rule__DataType__Group_1__14246 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__DataType__Group_1__2_in_rule__DataType__Group_1__14249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__AnnotationsAssignment_1_1_in_rule__DataType__Group_1__1__Impl4276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_1__2__Impl_in_rule__DataType__Group_1__24306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_1_2__0_in_rule__DataType__Group_1__2__Impl4333 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_1_2__0__Impl_in_rule__DataType__Group_1_2__04370 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__DataType__Group_1_2__1_in_rule__DataType__Group_1_2__04373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__DataType__Group_1_2__0__Impl4401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_1_2__1__Impl_in_rule__DataType__Group_1_2__14432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__AnnotationsAssignment_1_2_1_in_rule__DataType__Group_1_2__1__Impl4459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Module__NameAssignment_24498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_3_04529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_3_14560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Package__SuperPackageAssignment_2_04595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Package__SuperPackageAssignment_2_2_04634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_34669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_5_04700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_5_14731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_1_14762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_1_2_14793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_34824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_4_14859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_6_04894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_6_14925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_1_14956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_1_2_14987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Ref__NameAssignment_35018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Ref__RefToAssignment_45053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Ref__ManyAssignment_55093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_1_15132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_1_2_15163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_35194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataTypes_in_rule__DataType__TypeAssignment_45225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__DataType__ManyAssignment_55261 = new BitSet(new long[]{0x0000000000000002L});
    }


}