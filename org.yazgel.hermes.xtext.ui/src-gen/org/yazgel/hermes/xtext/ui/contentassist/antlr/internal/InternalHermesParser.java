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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@Cache'", "'@Index'", "'@Id'", "'@Load'", "'@Ignore'", "'string'", "'integer'", "'boolean'", "'long'", "'double'", "'object'", "'module'", "'package'", "'{'", "'}'", "'entity'", "':'", "'var'", "'.'", "'[]'"
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


    // $ANTLR start "entryRuleQUALIFIED_NAME"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:228:1: entryRuleQUALIFIED_NAME : ruleQUALIFIED_NAME EOF ;
    public final void entryRuleQUALIFIED_NAME() throws RecognitionException {
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:229:1: ( ruleQUALIFIED_NAME EOF )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:230:1: ruleQUALIFIED_NAME EOF
            {
             before(grammarAccess.getQUALIFIED_NAMERule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQUALIFIED_NAME_in_entryRuleQUALIFIED_NAME421);
            ruleQUALIFIED_NAME();

            state._fsp--;

             after(grammarAccess.getQUALIFIED_NAMERule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQUALIFIED_NAME428); 

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
    // $ANTLR end "entryRuleQUALIFIED_NAME"


    // $ANTLR start "ruleQUALIFIED_NAME"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:237:1: ruleQUALIFIED_NAME : ( ( rule__QUALIFIED_NAME__Group__0 ) ) ;
    public final void ruleQUALIFIED_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:241:2: ( ( ( rule__QUALIFIED_NAME__Group__0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:242:1: ( ( rule__QUALIFIED_NAME__Group__0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:242:1: ( ( rule__QUALIFIED_NAME__Group__0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:243:1: ( rule__QUALIFIED_NAME__Group__0 )
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getGroup()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:244:1: ( rule__QUALIFIED_NAME__Group__0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:244:2: rule__QUALIFIED_NAME__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QUALIFIED_NAME__Group__0_in_ruleQUALIFIED_NAME454);
            rule__QUALIFIED_NAME__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQUALIFIED_NAMEAccess().getGroup()); 

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
    // $ANTLR end "ruleQUALIFIED_NAME"


    // $ANTLR start "ruleEntityAnnotation"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:257:1: ruleEntityAnnotation : ( ( '@Cache' ) ) ;
    public final void ruleEntityAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:261:1: ( ( ( '@Cache' ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:262:1: ( ( '@Cache' ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:262:1: ( ( '@Cache' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:263:1: ( '@Cache' )
            {
             before(grammarAccess.getEntityAnnotationAccess().getCacheEnumLiteralDeclaration()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:264:1: ( '@Cache' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:264:3: '@Cache'
            {
            match(input,11,FollowSets000.FOLLOW_11_in_ruleEntityAnnotation492); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:277:1: ruleFetureAnnotation : ( ( rule__FetureAnnotation__Alternatives ) ) ;
    public final void ruleFetureAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:281:1: ( ( ( rule__FetureAnnotation__Alternatives ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:282:1: ( ( rule__FetureAnnotation__Alternatives ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:282:1: ( ( rule__FetureAnnotation__Alternatives ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:283:1: ( rule__FetureAnnotation__Alternatives )
            {
             before(grammarAccess.getFetureAnnotationAccess().getAlternatives()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:284:1: ( rule__FetureAnnotation__Alternatives )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:284:2: rule__FetureAnnotation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__FetureAnnotation__Alternatives_in_ruleFetureAnnotation530);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:296:1: ruleDataTypes : ( ( rule__DataTypes__Alternatives ) ) ;
    public final void ruleDataTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:300:1: ( ( ( rule__DataTypes__Alternatives ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:301:1: ( ( rule__DataTypes__Alternatives ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:301:1: ( ( rule__DataTypes__Alternatives ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:302:1: ( rule__DataTypes__Alternatives )
            {
             before(grammarAccess.getDataTypesAccess().getAlternatives()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:303:1: ( rule__DataTypes__Alternatives )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:303:2: rule__DataTypes__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypes__Alternatives_in_ruleDataTypes566);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:314:1: rule__Feature__Alternatives : ( ( ruleRef ) | ( ruleDataType ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:318:1: ( ( ruleRef ) | ( ruleDataType ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:319:1: ( ruleRef )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:319:1: ( ruleRef )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:320:1: ruleRef
                    {
                     before(grammarAccess.getFeatureAccess().getRefParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRef_in_rule__Feature__Alternatives601);
                    ruleRef();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getRefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:325:6: ( ruleDataType )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:325:6: ( ruleDataType )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:326:1: ruleDataType
                    {
                     before(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDataType_in_rule__Feature__Alternatives618);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:336:1: rule__FetureAnnotation__Alternatives : ( ( ( '@Index' ) ) | ( ( '@Id' ) ) | ( ( '@Load' ) ) | ( ( '@Ignore' ) ) );
    public final void rule__FetureAnnotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:340:1: ( ( ( '@Index' ) ) | ( ( '@Id' ) ) | ( ( '@Load' ) ) | ( ( '@Ignore' ) ) )
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
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:341:1: ( ( '@Index' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:341:1: ( ( '@Index' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:342:1: ( '@Index' )
                    {
                     before(grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:343:1: ( '@Index' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:343:3: '@Index'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__FetureAnnotation__Alternatives651); 

                    }

                     after(grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:348:6: ( ( '@Id' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:348:6: ( ( '@Id' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:349:1: ( '@Id' )
                    {
                     before(grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:350:1: ( '@Id' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:350:3: '@Id'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__FetureAnnotation__Alternatives672); 

                    }

                     after(grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:355:6: ( ( '@Load' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:355:6: ( ( '@Load' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:356:1: ( '@Load' )
                    {
                     before(grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:357:1: ( '@Load' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:357:3: '@Load'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__FetureAnnotation__Alternatives693); 

                    }

                     after(grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:362:6: ( ( '@Ignore' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:362:6: ( ( '@Ignore' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:363:1: ( '@Ignore' )
                    {
                     before(grammarAccess.getFetureAnnotationAccess().getIgnoreEnumLiteralDeclaration_3()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:364:1: ( '@Ignore' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:364:3: '@Ignore'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__FetureAnnotation__Alternatives714); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:374:1: rule__DataTypes__Alternatives : ( ( ( 'string' ) ) | ( ( 'integer' ) ) | ( ( 'boolean' ) ) | ( ( 'long' ) ) | ( ( 'double' ) ) | ( ( 'object' ) ) );
    public final void rule__DataTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:378:1: ( ( ( 'string' ) ) | ( ( 'integer' ) ) | ( ( 'boolean' ) ) | ( ( 'long' ) ) | ( ( 'double' ) ) | ( ( 'object' ) ) )
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
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:379:1: ( ( 'string' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:379:1: ( ( 'string' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:380:1: ( 'string' )
                    {
                     before(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:381:1: ( 'string' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:381:3: 'string'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__DataTypes__Alternatives750); 

                    }

                     after(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:386:6: ( ( 'integer' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:386:6: ( ( 'integer' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:387:1: ( 'integer' )
                    {
                     before(grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:388:1: ( 'integer' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:388:3: 'integer'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__DataTypes__Alternatives771); 

                    }

                     after(grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:393:6: ( ( 'boolean' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:393:6: ( ( 'boolean' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:394:1: ( 'boolean' )
                    {
                     before(grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:395:1: ( 'boolean' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:395:3: 'boolean'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__DataTypes__Alternatives792); 

                    }

                     after(grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:400:6: ( ( 'long' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:400:6: ( ( 'long' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:401:1: ( 'long' )
                    {
                     before(grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:402:1: ( 'long' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:402:3: 'long'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__DataTypes__Alternatives813); 

                    }

                     after(grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:407:6: ( ( 'double' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:407:6: ( ( 'double' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:408:1: ( 'double' )
                    {
                     before(grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:409:1: ( 'double' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:409:3: 'double'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__DataTypes__Alternatives834); 

                    }

                     after(grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:414:6: ( ( 'object' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:414:6: ( ( 'object' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:415:1: ( 'object' )
                    {
                     before(grammarAccess.getDataTypesAccess().getObjectEnumLiteralDeclaration_5()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:416:1: ( 'object' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:416:3: 'object'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__DataTypes__Alternatives855); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:428:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:432:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:433:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0888);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0891);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:440:1: rule__Module__Group__0__Impl : ( () ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:444:1: ( ( () ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:445:1: ( () )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:445:1: ( () )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:446:1: ()
            {
             before(grammarAccess.getModuleAccess().getModuleAction_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:447:1: ()
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:449:1: 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:459:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:463:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:464:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1949);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__2_in_rule__Module__Group__1952);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:471:1: rule__Module__Group__1__Impl : ( 'module' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:475:1: ( ( 'module' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:476:1: ( 'module' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:476:1: ( 'module' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:477:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Module__Group__1__Impl980); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:490:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:494:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:495:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21011);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21014);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:502:1: rule__Module__Group__2__Impl : ( ( rule__Module__NameAssignment_2 ) ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:506:1: ( ( ( rule__Module__NameAssignment_2 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:507:1: ( ( rule__Module__NameAssignment_2 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:507:1: ( ( rule__Module__NameAssignment_2 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:508:1: ( rule__Module__NameAssignment_2 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:509:1: ( rule__Module__NameAssignment_2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:509:2: rule__Module__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl1041);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:519:1: rule__Module__Group__3 : rule__Module__Group__3__Impl ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:523:1: ( rule__Module__Group__3__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:524:2: rule__Module__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31071);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:530:1: rule__Module__Group__3__Impl : ( ( rule__Module__Group_3__0 )? ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:534:1: ( ( ( rule__Module__Group_3__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:535:1: ( ( rule__Module__Group_3__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:535:1: ( ( rule__Module__Group_3__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:536:1: ( rule__Module__Group_3__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_3()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:537:1: ( rule__Module__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:537:2: rule__Module__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Module__Group_3__0_in_rule__Module__Group__3__Impl1098);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:555:1: rule__Module__Group_3__0 : rule__Module__Group_3__0__Impl rule__Module__Group_3__1 ;
    public final void rule__Module__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:559:1: ( rule__Module__Group_3__0__Impl rule__Module__Group_3__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:560:2: rule__Module__Group_3__0__Impl rule__Module__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__Group_3__0__Impl_in_rule__Module__Group_3__01137);
            rule__Module__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Module__Group_3__1_in_rule__Module__Group_3__01140);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:567:1: rule__Module__Group_3__0__Impl : ( ( rule__Module__PackagesAssignment_3_0 ) ) ;
    public final void rule__Module__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:571:1: ( ( ( rule__Module__PackagesAssignment_3_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:572:1: ( ( rule__Module__PackagesAssignment_3_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:572:1: ( ( rule__Module__PackagesAssignment_3_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:573:1: ( rule__Module__PackagesAssignment_3_0 )
            {
             before(grammarAccess.getModuleAccess().getPackagesAssignment_3_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:574:1: ( rule__Module__PackagesAssignment_3_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:574:2: rule__Module__PackagesAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__PackagesAssignment_3_0_in_rule__Module__Group_3__0__Impl1167);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:584:1: rule__Module__Group_3__1 : rule__Module__Group_3__1__Impl ;
    public final void rule__Module__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:588:1: ( rule__Module__Group_3__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:589:2: rule__Module__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Module__Group_3__1__Impl_in_rule__Module__Group_3__11197);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:595:1: rule__Module__Group_3__1__Impl : ( ( rule__Module__PackagesAssignment_3_1 )* ) ;
    public final void rule__Module__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:599:1: ( ( ( rule__Module__PackagesAssignment_3_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:600:1: ( ( rule__Module__PackagesAssignment_3_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:600:1: ( ( rule__Module__PackagesAssignment_3_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:601:1: ( rule__Module__PackagesAssignment_3_1 )*
            {
             before(grammarAccess.getModuleAccess().getPackagesAssignment_3_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:602:1: ( rule__Module__PackagesAssignment_3_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:602:2: rule__Module__PackagesAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Module__PackagesAssignment_3_1_in_rule__Module__Group_3__1__Impl1224);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:616:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:620:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:621:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01259);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01262);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:628:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:632:1: ( ( () ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:633:1: ( () )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:633:1: ( () )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:634:1: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:635:1: ()
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:637:1: 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:647:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:651:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:652:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11320);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11323);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:659:1: rule__Package__Group__1__Impl : ( 'package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:663:1: ( ( 'package' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:664:1: ( 'package' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:664:1: ( 'package' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:665:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Package__Group__1__Impl1351); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:678:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:682:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:683:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21382);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21385);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:690:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:694:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:695:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:695:1: ( ( rule__Package__NameAssignment_2 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:696:1: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:697:1: ( rule__Package__NameAssignment_2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:697:2: rule__Package__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl1412);
            rule__Package__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_2()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:707:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:711:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:712:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31442);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31445);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:719:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:723:1: ( ( '{' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:724:1: ( '{' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:724:1: ( '{' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:725:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Package__Group__3__Impl1473); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:738:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:742:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:743:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41504);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41507);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:750:1: rule__Package__Group__4__Impl : ( ( rule__Package__Group_4__0 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:754:1: ( ( ( rule__Package__Group_4__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:755:1: ( ( rule__Package__Group_4__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:755:1: ( ( rule__Package__Group_4__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:756:1: ( rule__Package__Group_4__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_4()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:757:1: ( rule__Package__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11||LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:757:2: rule__Package__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1534);
                    rule__Package__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_4()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:767:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:771:1: ( rule__Package__Group__5__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:772:2: rule__Package__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51565);
            rule__Package__Group__5__Impl();

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:778:1: rule__Package__Group__5__Impl : ( '}' ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:782:1: ( ( '}' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:783:1: ( '}' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:783:1: ( '}' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:784:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Package__Group__5__Impl1593); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__Package__Group_4__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:809:1: rule__Package__Group_4__0 : rule__Package__Group_4__0__Impl rule__Package__Group_4__1 ;
    public final void rule__Package__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:813:1: ( rule__Package__Group_4__0__Impl rule__Package__Group_4__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:814:2: rule__Package__Group_4__0__Impl rule__Package__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01636);
            rule__Package__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01639);
            rule__Package__Group_4__1();

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
    // $ANTLR end "rule__Package__Group_4__0"


    // $ANTLR start "rule__Package__Group_4__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:821:1: rule__Package__Group_4__0__Impl : ( ( rule__Package__OwnedEntityAssignment_4_0 ) ) ;
    public final void rule__Package__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:825:1: ( ( ( rule__Package__OwnedEntityAssignment_4_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:826:1: ( ( rule__Package__OwnedEntityAssignment_4_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:826:1: ( ( rule__Package__OwnedEntityAssignment_4_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:827:1: ( rule__Package__OwnedEntityAssignment_4_0 )
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityAssignment_4_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:828:1: ( rule__Package__OwnedEntityAssignment_4_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:828:2: rule__Package__OwnedEntityAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__OwnedEntityAssignment_4_0_in_rule__Package__Group_4__0__Impl1666);
            rule__Package__OwnedEntityAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getOwnedEntityAssignment_4_0()); 

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
    // $ANTLR end "rule__Package__Group_4__0__Impl"


    // $ANTLR start "rule__Package__Group_4__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:838:1: rule__Package__Group_4__1 : rule__Package__Group_4__1__Impl ;
    public final void rule__Package__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:842:1: ( rule__Package__Group_4__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:843:2: rule__Package__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__11696);
            rule__Package__Group_4__1__Impl();

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
    // $ANTLR end "rule__Package__Group_4__1"


    // $ANTLR start "rule__Package__Group_4__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:849:1: rule__Package__Group_4__1__Impl : ( ( rule__Package__OwnedEntityAssignment_4_1 )* ) ;
    public final void rule__Package__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:853:1: ( ( ( rule__Package__OwnedEntityAssignment_4_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:854:1: ( ( rule__Package__OwnedEntityAssignment_4_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:854:1: ( ( rule__Package__OwnedEntityAssignment_4_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:855:1: ( rule__Package__OwnedEntityAssignment_4_1 )*
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityAssignment_4_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:856:1: ( rule__Package__OwnedEntityAssignment_4_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==11||LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:856:2: rule__Package__OwnedEntityAssignment_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__OwnedEntityAssignment_4_1_in_rule__Package__Group_4__1__Impl1723);
            	    rule__Package__OwnedEntityAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getOwnedEntityAssignment_4_1()); 

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
    // $ANTLR end "rule__Package__Group_4__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:870:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:874:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:875:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01758);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01761);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:882:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:886:1: ( ( () ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:887:1: ( () )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:887:1: ( () )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:888:1: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:889:1: ()
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:891:1: 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:901:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:905:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:906:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11819);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11822);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:913:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__Group_1__0 )? ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:917:1: ( ( ( rule__Entity__Group_1__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:918:1: ( ( rule__Entity__Group_1__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:918:1: ( ( rule__Entity__Group_1__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:919:1: ( rule__Entity__Group_1__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:920:1: ( rule__Entity__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:920:2: rule__Entity__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_1__0_in_rule__Entity__Group__1__Impl1849);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:930:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:934:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:935:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21880);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21883);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:942:1: rule__Entity__Group__2__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:946:1: ( ( 'entity' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:947:1: ( 'entity' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:947:1: ( 'entity' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:948:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Entity__Group__2__Impl1911); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:961:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:965:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:966:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31942);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31945);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:973:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__NameAssignment_3 ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:977:1: ( ( ( rule__Entity__NameAssignment_3 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:978:1: ( ( rule__Entity__NameAssignment_3 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:978:1: ( ( rule__Entity__NameAssignment_3 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:979:1: ( rule__Entity__NameAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_3()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:980:1: ( rule__Entity__NameAssignment_3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:980:2: rule__Entity__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__NameAssignment_3_in_rule__Entity__Group__3__Impl1972);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:990:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:994:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:995:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42002);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42005);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1002:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1006:1: ( ( ( rule__Entity__Group_4__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1007:1: ( ( rule__Entity__Group_4__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1007:1: ( ( rule__Entity__Group_4__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1008:1: ( rule__Entity__Group_4__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_4()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1009:1: ( rule__Entity__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1009:2: rule__Entity__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__0_in_rule__Entity__Group__4__Impl2032);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1019:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1023:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1024:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52063);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__52066);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1031:1: rule__Entity__Group__5__Impl : ( '{' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1035:1: ( ( '{' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1036:1: ( '{' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1036:1: ( '{' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1037:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Entity__Group__5__Impl2094); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1050:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1054:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1055:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62125);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__62128);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1062:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__Group_6__0 )? ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1066:1: ( ( ( rule__Entity__Group_6__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1067:1: ( ( rule__Entity__Group_6__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1067:1: ( ( rule__Entity__Group_6__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1068:1: ( rule__Entity__Group_6__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_6()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1069:1: ( rule__Entity__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=12 && LA10_0<=15)||LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1069:2: rule__Entity__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__0_in_rule__Entity__Group__6__Impl2155);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1079:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1083:1: ( rule__Entity__Group__7__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1084:2: rule__Entity__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__72186);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1090:1: rule__Entity__Group__7__Impl : ( '}' ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1094:1: ( ( '}' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1095:1: ( '}' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1095:1: ( '}' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1096:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Entity__Group__7__Impl2214); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1125:1: rule__Entity__Group_1__0 : rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 ;
    public final void rule__Entity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1129:1: ( rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1130:2: rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_1__0__Impl_in_rule__Entity__Group_1__02261);
            rule__Entity__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_1__1_in_rule__Entity__Group_1__02264);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1137:1: rule__Entity__Group_1__0__Impl : ( ( rule__Entity__AnnotationsAssignment_1_0 ) ) ;
    public final void rule__Entity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1141:1: ( ( ( rule__Entity__AnnotationsAssignment_1_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1142:1: ( ( rule__Entity__AnnotationsAssignment_1_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1142:1: ( ( rule__Entity__AnnotationsAssignment_1_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1143:1: ( rule__Entity__AnnotationsAssignment_1_0 )
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_1_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1144:1: ( rule__Entity__AnnotationsAssignment_1_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1144:2: rule__Entity__AnnotationsAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__AnnotationsAssignment_1_0_in_rule__Entity__Group_1__0__Impl2291);
            rule__Entity__AnnotationsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAnnotationsAssignment_1_0()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1154:1: rule__Entity__Group_1__1 : rule__Entity__Group_1__1__Impl ;
    public final void rule__Entity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1158:1: ( rule__Entity__Group_1__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1159:2: rule__Entity__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_1__1__Impl_in_rule__Entity__Group_1__12321);
            rule__Entity__Group_1__1__Impl();

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1165:1: rule__Entity__Group_1__1__Impl : ( ( rule__Entity__AnnotationsAssignment_1_1 )* ) ;
    public final void rule__Entity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1169:1: ( ( ( rule__Entity__AnnotationsAssignment_1_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1170:1: ( ( rule__Entity__AnnotationsAssignment_1_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1170:1: ( ( rule__Entity__AnnotationsAssignment_1_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1171:1: ( rule__Entity__AnnotationsAssignment_1_1 )*
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_1_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1172:1: ( rule__Entity__AnnotationsAssignment_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==11) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1172:2: rule__Entity__AnnotationsAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__AnnotationsAssignment_1_1_in_rule__Entity__Group_1__1__Impl2348);
            	    rule__Entity__AnnotationsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

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


    // $ANTLR start "rule__Entity__Group_4__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1186:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1190:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1191:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__0__Impl_in_rule__Entity__Group_4__02383);
            rule__Entity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__1_in_rule__Entity__Group_4__02386);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1198:1: rule__Entity__Group_4__0__Impl : ( ':' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1202:1: ( ( ':' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1203:1: ( ':' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1203:1: ( ':' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1204:1: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_4_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Entity__Group_4__0__Impl2414); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1217:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1221:1: ( rule__Entity__Group_4__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1222:2: rule__Entity__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__1__Impl_in_rule__Entity__Group_4__12445);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1228:1: rule__Entity__Group_4__1__Impl : ( ( rule__Entity__SuperEntityAssignment_4_1 ) ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1232:1: ( ( ( rule__Entity__SuperEntityAssignment_4_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1233:1: ( ( rule__Entity__SuperEntityAssignment_4_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1233:1: ( ( rule__Entity__SuperEntityAssignment_4_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1234:1: ( rule__Entity__SuperEntityAssignment_4_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityAssignment_4_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1235:1: ( rule__Entity__SuperEntityAssignment_4_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1235:2: rule__Entity__SuperEntityAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__SuperEntityAssignment_4_1_in_rule__Entity__Group_4__1__Impl2472);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1249:1: rule__Entity__Group_6__0 : rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 ;
    public final void rule__Entity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1253:1: ( rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1254:2: rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__0__Impl_in_rule__Entity__Group_6__02506);
            rule__Entity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__1_in_rule__Entity__Group_6__02509);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1261:1: rule__Entity__Group_6__0__Impl : ( ( rule__Entity__OwnedFeatureAssignment_6_0 ) ) ;
    public final void rule__Entity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1265:1: ( ( ( rule__Entity__OwnedFeatureAssignment_6_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1266:1: ( ( rule__Entity__OwnedFeatureAssignment_6_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1266:1: ( ( rule__Entity__OwnedFeatureAssignment_6_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1267:1: ( rule__Entity__OwnedFeatureAssignment_6_0 )
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_6_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1268:1: ( rule__Entity__OwnedFeatureAssignment_6_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1268:2: rule__Entity__OwnedFeatureAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__OwnedFeatureAssignment_6_0_in_rule__Entity__Group_6__0__Impl2536);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1278:1: rule__Entity__Group_6__1 : rule__Entity__Group_6__1__Impl ;
    public final void rule__Entity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1282:1: ( rule__Entity__Group_6__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1283:2: rule__Entity__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__1__Impl_in_rule__Entity__Group_6__12566);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1289:1: rule__Entity__Group_6__1__Impl : ( ( rule__Entity__OwnedFeatureAssignment_6_1 )* ) ;
    public final void rule__Entity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1293:1: ( ( ( rule__Entity__OwnedFeatureAssignment_6_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1294:1: ( ( rule__Entity__OwnedFeatureAssignment_6_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1294:1: ( ( rule__Entity__OwnedFeatureAssignment_6_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1295:1: ( rule__Entity__OwnedFeatureAssignment_6_1 )*
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_6_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1296:1: ( rule__Entity__OwnedFeatureAssignment_6_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=12 && LA12_0<=15)||LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1296:2: rule__Entity__OwnedFeatureAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__OwnedFeatureAssignment_6_1_in_rule__Entity__Group_6__1__Impl2593);
            	    rule__Entity__OwnedFeatureAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1310:1: rule__Ref__Group__0 : rule__Ref__Group__0__Impl rule__Ref__Group__1 ;
    public final void rule__Ref__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1314:1: ( rule__Ref__Group__0__Impl rule__Ref__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1315:2: rule__Ref__Group__0__Impl rule__Ref__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__02628);
            rule__Ref__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__02631);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1322:1: rule__Ref__Group__0__Impl : ( () ) ;
    public final void rule__Ref__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1326:1: ( ( () ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1327:1: ( () )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1327:1: ( () )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1328:1: ()
            {
             before(grammarAccess.getRefAccess().getRefAction_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1329:1: ()
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1331:1: 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1341:1: rule__Ref__Group__1 : rule__Ref__Group__1__Impl rule__Ref__Group__2 ;
    public final void rule__Ref__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1345:1: ( rule__Ref__Group__1__Impl rule__Ref__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1346:2: rule__Ref__Group__1__Impl rule__Ref__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__12689);
            rule__Ref__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__12692);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1353:1: rule__Ref__Group__1__Impl : ( ( rule__Ref__Group_1__0 )? ) ;
    public final void rule__Ref__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1357:1: ( ( ( rule__Ref__Group_1__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1358:1: ( ( rule__Ref__Group_1__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1358:1: ( ( rule__Ref__Group_1__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1359:1: ( rule__Ref__Group_1__0 )?
            {
             before(grammarAccess.getRefAccess().getGroup_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1360:1: ( rule__Ref__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=12 && LA13_0<=15)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1360:2: rule__Ref__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_1__0_in_rule__Ref__Group__1__Impl2719);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1370:1: rule__Ref__Group__2 : rule__Ref__Group__2__Impl rule__Ref__Group__3 ;
    public final void rule__Ref__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1374:1: ( rule__Ref__Group__2__Impl rule__Ref__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1375:2: rule__Ref__Group__2__Impl rule__Ref__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__22750);
            rule__Ref__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__22753);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1382:1: rule__Ref__Group__2__Impl : ( 'var' ) ;
    public final void rule__Ref__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1386:1: ( ( 'var' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1387:1: ( 'var' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1387:1: ( 'var' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1388:1: 'var'
            {
             before(grammarAccess.getRefAccess().getVarKeyword_2()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Ref__Group__2__Impl2781); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1401:1: rule__Ref__Group__3 : rule__Ref__Group__3__Impl rule__Ref__Group__4 ;
    public final void rule__Ref__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1405:1: ( rule__Ref__Group__3__Impl rule__Ref__Group__4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1406:2: rule__Ref__Group__3__Impl rule__Ref__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__32812);
            rule__Ref__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__32815);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1413:1: rule__Ref__Group__3__Impl : ( ( rule__Ref__NameAssignment_3 ) ) ;
    public final void rule__Ref__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1417:1: ( ( ( rule__Ref__NameAssignment_3 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1418:1: ( ( rule__Ref__NameAssignment_3 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1418:1: ( ( rule__Ref__NameAssignment_3 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1419:1: ( rule__Ref__NameAssignment_3 )
            {
             before(grammarAccess.getRefAccess().getNameAssignment_3()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1420:1: ( rule__Ref__NameAssignment_3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1420:2: rule__Ref__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__NameAssignment_3_in_rule__Ref__Group__3__Impl2842);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1430:1: rule__Ref__Group__4 : rule__Ref__Group__4__Impl rule__Ref__Group__5 ;
    public final void rule__Ref__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1434:1: ( rule__Ref__Group__4__Impl rule__Ref__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1435:2: rule__Ref__Group__4__Impl rule__Ref__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__42872);
            rule__Ref__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__42875);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1442:1: rule__Ref__Group__4__Impl : ( ( rule__Ref__RefToAssignment_4 ) ) ;
    public final void rule__Ref__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1446:1: ( ( ( rule__Ref__RefToAssignment_4 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1447:1: ( ( rule__Ref__RefToAssignment_4 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1447:1: ( ( rule__Ref__RefToAssignment_4 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1448:1: ( rule__Ref__RefToAssignment_4 )
            {
             before(grammarAccess.getRefAccess().getRefToAssignment_4()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1449:1: ( rule__Ref__RefToAssignment_4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1449:2: rule__Ref__RefToAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__RefToAssignment_4_in_rule__Ref__Group__4__Impl2902);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1459:1: rule__Ref__Group__5 : rule__Ref__Group__5__Impl ;
    public final void rule__Ref__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1463:1: ( rule__Ref__Group__5__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1464:2: rule__Ref__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__52932);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1470:1: rule__Ref__Group__5__Impl : ( ( rule__Ref__ManyAssignment_5 )? ) ;
    public final void rule__Ref__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1474:1: ( ( ( rule__Ref__ManyAssignment_5 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1475:1: ( ( rule__Ref__ManyAssignment_5 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1475:1: ( ( rule__Ref__ManyAssignment_5 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1476:1: ( rule__Ref__ManyAssignment_5 )?
            {
             before(grammarAccess.getRefAccess().getManyAssignment_5()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1477:1: ( rule__Ref__ManyAssignment_5 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1477:2: rule__Ref__ManyAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ref__ManyAssignment_5_in_rule__Ref__Group__5__Impl2959);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1499:1: rule__Ref__Group_1__0 : rule__Ref__Group_1__0__Impl rule__Ref__Group_1__1 ;
    public final void rule__Ref__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1503:1: ( rule__Ref__Group_1__0__Impl rule__Ref__Group_1__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1504:2: rule__Ref__Group_1__0__Impl rule__Ref__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_1__0__Impl_in_rule__Ref__Group_1__03002);
            rule__Ref__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_1__1_in_rule__Ref__Group_1__03005);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1511:1: rule__Ref__Group_1__0__Impl : ( ( rule__Ref__AnnotationsAssignment_1_0 ) ) ;
    public final void rule__Ref__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1515:1: ( ( ( rule__Ref__AnnotationsAssignment_1_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1516:1: ( ( rule__Ref__AnnotationsAssignment_1_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1516:1: ( ( rule__Ref__AnnotationsAssignment_1_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1517:1: ( rule__Ref__AnnotationsAssignment_1_0 )
            {
             before(grammarAccess.getRefAccess().getAnnotationsAssignment_1_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1518:1: ( rule__Ref__AnnotationsAssignment_1_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1518:2: rule__Ref__AnnotationsAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__AnnotationsAssignment_1_0_in_rule__Ref__Group_1__0__Impl3032);
            rule__Ref__AnnotationsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getAnnotationsAssignment_1_0()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1528:1: rule__Ref__Group_1__1 : rule__Ref__Group_1__1__Impl ;
    public final void rule__Ref__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1532:1: ( rule__Ref__Group_1__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1533:2: rule__Ref__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_1__1__Impl_in_rule__Ref__Group_1__13062);
            rule__Ref__Group_1__1__Impl();

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1539:1: rule__Ref__Group_1__1__Impl : ( ( rule__Ref__AnnotationsAssignment_1_1 )* ) ;
    public final void rule__Ref__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1543:1: ( ( ( rule__Ref__AnnotationsAssignment_1_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1544:1: ( ( rule__Ref__AnnotationsAssignment_1_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1544:1: ( ( rule__Ref__AnnotationsAssignment_1_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1545:1: ( rule__Ref__AnnotationsAssignment_1_1 )*
            {
             before(grammarAccess.getRefAccess().getAnnotationsAssignment_1_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1546:1: ( rule__Ref__AnnotationsAssignment_1_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=12 && LA15_0<=15)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1546:2: rule__Ref__AnnotationsAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ref__AnnotationsAssignment_1_1_in_rule__Ref__Group_1__1__Impl3089);
            	    rule__Ref__AnnotationsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

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


    // $ANTLR start "rule__DataType__Group__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1560:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1564:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1565:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03124);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03127);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1572:1: rule__DataType__Group__0__Impl : ( () ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1576:1: ( ( () ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1577:1: ( () )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1577:1: ( () )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1578:1: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1579:1: ()
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1581:1: 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1591:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1595:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1596:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13185);
            rule__DataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__13188);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1603:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__Group_1__0 )? ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1607:1: ( ( ( rule__DataType__Group_1__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1608:1: ( ( rule__DataType__Group_1__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1608:1: ( ( rule__DataType__Group_1__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1609:1: ( rule__DataType__Group_1__0 )?
            {
             before(grammarAccess.getDataTypeAccess().getGroup_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1610:1: ( rule__DataType__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=12 && LA16_0<=15)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1610:2: rule__DataType__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_1__0_in_rule__DataType__Group__1__Impl3215);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1620:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl rule__DataType__Group__3 ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1624:1: ( rule__DataType__Group__2__Impl rule__DataType__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1625:2: rule__DataType__Group__2__Impl rule__DataType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__23246);
            rule__DataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__23249);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1632:1: rule__DataType__Group__2__Impl : ( 'var' ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1636:1: ( ( 'var' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1637:1: ( 'var' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1637:1: ( 'var' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1638:1: 'var'
            {
             before(grammarAccess.getDataTypeAccess().getVarKeyword_2()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__DataType__Group__2__Impl3277); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1651:1: rule__DataType__Group__3 : rule__DataType__Group__3__Impl rule__DataType__Group__4 ;
    public final void rule__DataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1655:1: ( rule__DataType__Group__3__Impl rule__DataType__Group__4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1656:2: rule__DataType__Group__3__Impl rule__DataType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__33308);
            rule__DataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__33311);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1663:1: rule__DataType__Group__3__Impl : ( ( rule__DataType__NameAssignment_3 ) ) ;
    public final void rule__DataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1667:1: ( ( ( rule__DataType__NameAssignment_3 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1668:1: ( ( rule__DataType__NameAssignment_3 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1668:1: ( ( rule__DataType__NameAssignment_3 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1669:1: ( rule__DataType__NameAssignment_3 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_3()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1670:1: ( rule__DataType__NameAssignment_3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1670:2: rule__DataType__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__NameAssignment_3_in_rule__DataType__Group__3__Impl3338);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1680:1: rule__DataType__Group__4 : rule__DataType__Group__4__Impl rule__DataType__Group__5 ;
    public final void rule__DataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1684:1: ( rule__DataType__Group__4__Impl rule__DataType__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1685:2: rule__DataType__Group__4__Impl rule__DataType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__43368);
            rule__DataType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__5_in_rule__DataType__Group__43371);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1692:1: rule__DataType__Group__4__Impl : ( ( rule__DataType__TypeAssignment_4 ) ) ;
    public final void rule__DataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1696:1: ( ( ( rule__DataType__TypeAssignment_4 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1697:1: ( ( rule__DataType__TypeAssignment_4 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1697:1: ( ( rule__DataType__TypeAssignment_4 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1698:1: ( rule__DataType__TypeAssignment_4 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_4()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1699:1: ( rule__DataType__TypeAssignment_4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1699:2: rule__DataType__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__TypeAssignment_4_in_rule__DataType__Group__4__Impl3398);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1709:1: rule__DataType__Group__5 : rule__DataType__Group__5__Impl ;
    public final void rule__DataType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1713:1: ( rule__DataType__Group__5__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1714:2: rule__DataType__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__5__Impl_in_rule__DataType__Group__53428);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1720:1: rule__DataType__Group__5__Impl : ( ( rule__DataType__ManyAssignment_5 )? ) ;
    public final void rule__DataType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1724:1: ( ( ( rule__DataType__ManyAssignment_5 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1725:1: ( ( rule__DataType__ManyAssignment_5 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1725:1: ( ( rule__DataType__ManyAssignment_5 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1726:1: ( rule__DataType__ManyAssignment_5 )?
            {
             before(grammarAccess.getDataTypeAccess().getManyAssignment_5()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1727:1: ( rule__DataType__ManyAssignment_5 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1727:2: rule__DataType__ManyAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataType__ManyAssignment_5_in_rule__DataType__Group__5__Impl3455);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1749:1: rule__DataType__Group_1__0 : rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1 ;
    public final void rule__DataType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1753:1: ( rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1754:2: rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_1__0__Impl_in_rule__DataType__Group_1__03498);
            rule__DataType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_1__1_in_rule__DataType__Group_1__03501);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1761:1: rule__DataType__Group_1__0__Impl : ( ( rule__DataType__AnnotationsAssignment_1_0 ) ) ;
    public final void rule__DataType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1765:1: ( ( ( rule__DataType__AnnotationsAssignment_1_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1766:1: ( ( rule__DataType__AnnotationsAssignment_1_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1766:1: ( ( rule__DataType__AnnotationsAssignment_1_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1767:1: ( rule__DataType__AnnotationsAssignment_1_0 )
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_1_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1768:1: ( rule__DataType__AnnotationsAssignment_1_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1768:2: rule__DataType__AnnotationsAssignment_1_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__AnnotationsAssignment_1_0_in_rule__DataType__Group_1__0__Impl3528);
            rule__DataType__AnnotationsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_1_0()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1778:1: rule__DataType__Group_1__1 : rule__DataType__Group_1__1__Impl ;
    public final void rule__DataType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1782:1: ( rule__DataType__Group_1__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1783:2: rule__DataType__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_1__1__Impl_in_rule__DataType__Group_1__13558);
            rule__DataType__Group_1__1__Impl();

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1789:1: rule__DataType__Group_1__1__Impl : ( ( rule__DataType__AnnotationsAssignment_1_1 )* ) ;
    public final void rule__DataType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1793:1: ( ( ( rule__DataType__AnnotationsAssignment_1_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1794:1: ( ( rule__DataType__AnnotationsAssignment_1_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1794:1: ( ( rule__DataType__AnnotationsAssignment_1_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1795:1: ( rule__DataType__AnnotationsAssignment_1_1 )*
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_1_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1796:1: ( rule__DataType__AnnotationsAssignment_1_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=12 && LA18_0<=15)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1796:2: rule__DataType__AnnotationsAssignment_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DataType__AnnotationsAssignment_1_1_in_rule__DataType__Group_1__1__Impl3585);
            	    rule__DataType__AnnotationsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

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


    // $ANTLR start "rule__QUALIFIED_NAME__Group__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1810:1: rule__QUALIFIED_NAME__Group__0 : rule__QUALIFIED_NAME__Group__0__Impl rule__QUALIFIED_NAME__Group__1 ;
    public final void rule__QUALIFIED_NAME__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1814:1: ( rule__QUALIFIED_NAME__Group__0__Impl rule__QUALIFIED_NAME__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1815:2: rule__QUALIFIED_NAME__Group__0__Impl rule__QUALIFIED_NAME__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QUALIFIED_NAME__Group__0__Impl_in_rule__QUALIFIED_NAME__Group__03620);
            rule__QUALIFIED_NAME__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QUALIFIED_NAME__Group__1_in_rule__QUALIFIED_NAME__Group__03623);
            rule__QUALIFIED_NAME__Group__1();

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
    // $ANTLR end "rule__QUALIFIED_NAME__Group__0"


    // $ANTLR start "rule__QUALIFIED_NAME__Group__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1822:1: rule__QUALIFIED_NAME__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIED_NAME__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1826:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1827:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1827:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1828:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group__0__Impl3650); 
             after(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QUALIFIED_NAME__Group__0__Impl"


    // $ANTLR start "rule__QUALIFIED_NAME__Group__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1839:1: rule__QUALIFIED_NAME__Group__1 : rule__QUALIFIED_NAME__Group__1__Impl ;
    public final void rule__QUALIFIED_NAME__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1843:1: ( rule__QUALIFIED_NAME__Group__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1844:2: rule__QUALIFIED_NAME__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QUALIFIED_NAME__Group__1__Impl_in_rule__QUALIFIED_NAME__Group__13679);
            rule__QUALIFIED_NAME__Group__1__Impl();

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
    // $ANTLR end "rule__QUALIFIED_NAME__Group__1"


    // $ANTLR start "rule__QUALIFIED_NAME__Group__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1850:1: rule__QUALIFIED_NAME__Group__1__Impl : ( ( rule__QUALIFIED_NAME__Group_1__0 )* ) ;
    public final void rule__QUALIFIED_NAME__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1854:1: ( ( ( rule__QUALIFIED_NAME__Group_1__0 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1855:1: ( ( rule__QUALIFIED_NAME__Group_1__0 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1855:1: ( ( rule__QUALIFIED_NAME__Group_1__0 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1856:1: ( rule__QUALIFIED_NAME__Group_1__0 )*
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getGroup_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1857:1: ( rule__QUALIFIED_NAME__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1857:2: rule__QUALIFIED_NAME__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QUALIFIED_NAME__Group_1__0_in_rule__QUALIFIED_NAME__Group__1__Impl3706);
            	    rule__QUALIFIED_NAME__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getQUALIFIED_NAMEAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QUALIFIED_NAME__Group__1__Impl"


    // $ANTLR start "rule__QUALIFIED_NAME__Group_1__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1871:1: rule__QUALIFIED_NAME__Group_1__0 : rule__QUALIFIED_NAME__Group_1__0__Impl rule__QUALIFIED_NAME__Group_1__1 ;
    public final void rule__QUALIFIED_NAME__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1875:1: ( rule__QUALIFIED_NAME__Group_1__0__Impl rule__QUALIFIED_NAME__Group_1__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1876:2: rule__QUALIFIED_NAME__Group_1__0__Impl rule__QUALIFIED_NAME__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QUALIFIED_NAME__Group_1__0__Impl_in_rule__QUALIFIED_NAME__Group_1__03741);
            rule__QUALIFIED_NAME__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QUALIFIED_NAME__Group_1__1_in_rule__QUALIFIED_NAME__Group_1__03744);
            rule__QUALIFIED_NAME__Group_1__1();

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
    // $ANTLR end "rule__QUALIFIED_NAME__Group_1__0"


    // $ANTLR start "rule__QUALIFIED_NAME__Group_1__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1883:1: rule__QUALIFIED_NAME__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QUALIFIED_NAME__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1887:1: ( ( '.' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1888:1: ( '.' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1888:1: ( '.' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1889:1: '.'
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getFullStopKeyword_1_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__QUALIFIED_NAME__Group_1__0__Impl3772); 
             after(grammarAccess.getQUALIFIED_NAMEAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QUALIFIED_NAME__Group_1__0__Impl"


    // $ANTLR start "rule__QUALIFIED_NAME__Group_1__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1902:1: rule__QUALIFIED_NAME__Group_1__1 : rule__QUALIFIED_NAME__Group_1__1__Impl ;
    public final void rule__QUALIFIED_NAME__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1906:1: ( rule__QUALIFIED_NAME__Group_1__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1907:2: rule__QUALIFIED_NAME__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QUALIFIED_NAME__Group_1__1__Impl_in_rule__QUALIFIED_NAME__Group_1__13803);
            rule__QUALIFIED_NAME__Group_1__1__Impl();

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
    // $ANTLR end "rule__QUALIFIED_NAME__Group_1__1"


    // $ANTLR start "rule__QUALIFIED_NAME__Group_1__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1913:1: rule__QUALIFIED_NAME__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QUALIFIED_NAME__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1917:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1918:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1918:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1919:1: RULE_ID
            {
             before(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group_1__1__Impl3830); 
             after(grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QUALIFIED_NAME__Group_1__1__Impl"


    // $ANTLR start "rule__Module__NameAssignment_2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1935:1: rule__Module__NameAssignment_2 : ( ruleQUALIFIED_NAME ) ;
    public final void rule__Module__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1939:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1940:1: ( ruleQUALIFIED_NAME )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1940:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1941:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getModuleAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQUALIFIED_NAME_in_rule__Module__NameAssignment_23868);
            ruleQUALIFIED_NAME();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1950:1: rule__Module__PackagesAssignment_3_0 : ( rulePackage ) ;
    public final void rule__Module__PackagesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1954:1: ( ( rulePackage ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1955:1: ( rulePackage )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1955:1: ( rulePackage )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1956:1: rulePackage
            {
             before(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_3_03899);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1965:1: rule__Module__PackagesAssignment_3_1 : ( rulePackage ) ;
    public final void rule__Module__PackagesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1969:1: ( ( rulePackage ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1970:1: ( rulePackage )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1970:1: ( rulePackage )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1971:1: rulePackage
            {
             before(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_3_13930);
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


    // $ANTLR start "rule__Package__NameAssignment_2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1980:1: rule__Package__NameAssignment_2 : ( ruleQUALIFIED_NAME ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1984:1: ( ( ruleQUALIFIED_NAME ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1985:1: ( ruleQUALIFIED_NAME )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1985:1: ( ruleQUALIFIED_NAME )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1986:1: ruleQUALIFIED_NAME
            {
             before(grammarAccess.getPackageAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQUALIFIED_NAME_in_rule__Package__NameAssignment_23961);
            ruleQUALIFIED_NAME();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Package__NameAssignment_2"


    // $ANTLR start "rule__Package__OwnedEntityAssignment_4_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1995:1: rule__Package__OwnedEntityAssignment_4_0 : ( ruleEntity ) ;
    public final void rule__Package__OwnedEntityAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1999:1: ( ( ruleEntity ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2000:1: ( ruleEntity )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2000:1: ( ruleEntity )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2001:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_4_03992);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Package__OwnedEntityAssignment_4_0"


    // $ANTLR start "rule__Package__OwnedEntityAssignment_4_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2010:1: rule__Package__OwnedEntityAssignment_4_1 : ( ruleEntity ) ;
    public final void rule__Package__OwnedEntityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2014:1: ( ( ruleEntity ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2015:1: ( ruleEntity )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2015:1: ( ruleEntity )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2016:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_4_14023);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Package__OwnedEntityAssignment_4_1"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_1_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2025:1: rule__Entity__AnnotationsAssignment_1_0 : ( ruleEntityAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2029:1: ( ( ruleEntityAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2030:1: ( ruleEntityAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2030:1: ( ruleEntityAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2031:1: ruleEntityAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_1_04054);
            ruleEntityAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Entity__AnnotationsAssignment_1_0"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_1_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2040:1: rule__Entity__AnnotationsAssignment_1_1 : ( ruleEntityAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2044:1: ( ( ruleEntityAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2045:1: ( ruleEntityAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2045:1: ( ruleEntityAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2046:1: ruleEntityAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_1_14085);
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


    // $ANTLR start "rule__Entity__NameAssignment_3"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2055:1: rule__Entity__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2059:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2060:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2060:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2061:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_34116); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2070:1: rule__Entity__SuperEntityAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperEntityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2074:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2075:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2075:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2076:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_4_1_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2077:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2078:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_4_14151); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2089:1: rule__Entity__OwnedFeatureAssignment_6_0 : ( ruleFeature ) ;
    public final void rule__Entity__OwnedFeatureAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2093:1: ( ( ruleFeature ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2094:1: ( ruleFeature )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2094:1: ( ruleFeature )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2095:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_6_04186);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2104:1: rule__Entity__OwnedFeatureAssignment_6_1 : ( ruleFeature ) ;
    public final void rule__Entity__OwnedFeatureAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2108:1: ( ( ruleFeature ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2109:1: ( ruleFeature )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2109:1: ( ruleFeature )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2110:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_6_14217);
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


    // $ANTLR start "rule__Ref__AnnotationsAssignment_1_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2119:1: rule__Ref__AnnotationsAssignment_1_0 : ( ruleFetureAnnotation ) ;
    public final void rule__Ref__AnnotationsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2123:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2124:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2124:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2125:1: ruleFetureAnnotation
            {
             before(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_1_04248);
            ruleFetureAnnotation();

            state._fsp--;

             after(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Ref__AnnotationsAssignment_1_0"


    // $ANTLR start "rule__Ref__AnnotationsAssignment_1_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2134:1: rule__Ref__AnnotationsAssignment_1_1 : ( ruleFetureAnnotation ) ;
    public final void rule__Ref__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2138:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2139:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2139:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2140:1: ruleFetureAnnotation
            {
             before(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_1_14279);
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


    // $ANTLR start "rule__Ref__NameAssignment_3"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2149:1: rule__Ref__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Ref__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2153:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2154:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2154:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2155:1: RULE_ID
            {
             before(grammarAccess.getRefAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Ref__NameAssignment_34310); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2164:1: rule__Ref__RefToAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Ref__RefToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2168:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2169:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2169:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2170:1: ( RULE_ID )
            {
             before(grammarAccess.getRefAccess().getRefToEntityCrossReference_4_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2171:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2172:1: RULE_ID
            {
             before(grammarAccess.getRefAccess().getRefToEntityIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Ref__RefToAssignment_44345); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2183:1: rule__Ref__ManyAssignment_5 : ( ( '[]' ) ) ;
    public final void rule__Ref__ManyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2187:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2188:1: ( ( '[]' ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2188:1: ( ( '[]' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2189:1: ( '[]' )
            {
             before(grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2190:1: ( '[]' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2191:1: '[]'
            {
             before(grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Ref__ManyAssignment_54385); 
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


    // $ANTLR start "rule__DataType__AnnotationsAssignment_1_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2206:1: rule__DataType__AnnotationsAssignment_1_0 : ( ruleFetureAnnotation ) ;
    public final void rule__DataType__AnnotationsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2210:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2211:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2211:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2212:1: ruleFetureAnnotation
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_1_04424);
            ruleFetureAnnotation();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__DataType__AnnotationsAssignment_1_0"


    // $ANTLR start "rule__DataType__AnnotationsAssignment_1_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2221:1: rule__DataType__AnnotationsAssignment_1_1 : ( ruleFetureAnnotation ) ;
    public final void rule__DataType__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2225:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2226:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2226:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2227:1: ruleFetureAnnotation
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_1_14455);
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


    // $ANTLR start "rule__DataType__NameAssignment_3"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2236:1: rule__DataType__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2240:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2241:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2241:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2242:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_34486); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2251:1: rule__DataType__TypeAssignment_4 : ( ruleDataTypes ) ;
    public final void rule__DataType__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2255:1: ( ( ruleDataTypes ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2256:1: ( ruleDataTypes )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2256:1: ( ruleDataTypes )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2257:1: ruleDataTypes
            {
             before(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataTypes_in_rule__DataType__TypeAssignment_44517);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2266:1: rule__DataType__ManyAssignment_5 : ( ( '[]' ) ) ;
    public final void rule__DataType__ManyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2270:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2271:1: ( ( '[]' ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2271:1: ( ( '[]' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2272:1: ( '[]' )
            {
             before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2273:1: ( '[]' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2274:1: '[]'
            {
             before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__DataType__ManyAssignment_54553); 
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
        "\15\uffff";
    static final String DFA1_eofS =
        "\15\uffff";
    static final String DFA1_minS =
        "\5\14\1\4\4\14\1\4\2\uffff";
    static final String DFA1_maxS =
        "\5\34\1\4\4\34\1\25\2\uffff";
    static final String DFA1_acceptS =
        "\13\uffff\1\1\1\2";
    static final String DFA1_specialS =
        "\15\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\1\2\1\3\1\4\14\uffff\1\5",
            "\1\6\1\7\1\10\1\11\14\uffff\1\5",
            "\1\6\1\7\1\10\1\11\14\uffff\1\5",
            "\1\6\1\7\1\10\1\11\14\uffff\1\5",
            "\1\6\1\7\1\10\1\11\14\uffff\1\5",
            "\1\12",
            "\1\6\1\7\1\10\1\11\14\uffff\1\5",
            "\1\6\1\7\1\10\1\11\14\uffff\1\5",
            "\1\6\1\7\1\10\1\11\14\uffff\1\5",
            "\1\6\1\7\1\10\1\11\14\uffff\1\5",
            "\1\13\13\uffff\6\14",
            "",
            ""
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
            return "314:1: rule__Feature__Alternatives : ( ( ruleRef ) | ( ruleDataType ) );";
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
        public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_entryRuleQUALIFIED_NAME421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIED_NAME428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__0_in_ruleQUALIFIED_NAME454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleEntityAnnotation492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FetureAnnotation__Alternatives_in_ruleFetureAnnotation530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypes__Alternatives_in_ruleDataTypes566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRef_in_rule__Feature__Alternatives601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_rule__Feature__Alternatives618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__FetureAnnotation__Alternatives651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__FetureAnnotation__Alternatives672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FetureAnnotation__Alternatives693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__FetureAnnotation__Alternatives714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__DataTypes__Alternatives750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__DataTypes__Alternatives771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__DataTypes__Alternatives792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__DataTypes__Alternatives813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__DataTypes__Alternatives834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__DataTypes__Alternatives855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0888 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1949 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__1952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Module__Group__1__Impl980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__21011 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__21014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__NameAssignment_2_in_rule__Module__Group__2__Impl1041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group_3__0_in_rule__Module__Group__3__Impl1098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group_3__0__Impl_in_rule__Module__Group_3__01137 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Module__Group_3__1_in_rule__Module__Group_3__01140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__PackagesAssignment_3_0_in_rule__Module__Group_3__0__Impl1167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__Group_3__1__Impl_in_rule__Module__Group_3__11197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Module__PackagesAssignment_3_1_in_rule__Module__Group_3__1__Impl1224 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__01259 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__01262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__11320 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__11323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Package__Group__1__Impl1351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__21382 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__21385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl1412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31442 = new BitSet(new long[]{0x0000000006000800L});
        public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Package__Group__3__Impl1473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41504 = new BitSet(new long[]{0x0000000006000800L});
        public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Package__Group__5__Impl1593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01636 = new BitSet(new long[]{0x0000000004000800L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__OwnedEntityAssignment_4_0_in_rule__Package__Group_4__0__Impl1666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__11696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__OwnedEntityAssignment_4_1_in_rule__Package__Group_4__1__Impl1723 = new BitSet(new long[]{0x0000000004000802L});
        public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01758 = new BitSet(new long[]{0x0000000004000800L});
        public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11819 = new BitSet(new long[]{0x0000000004000800L});
        public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_1__0_in_rule__Entity__Group__1__Impl1849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21880 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Entity__Group__2__Impl1911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31942 = new BitSet(new long[]{0x0000000009000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__NameAssignment_3_in_rule__Entity__Group__3__Impl1972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__42002 = new BitSet(new long[]{0x0000000009000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__42005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__0_in_rule__Entity__Group__4__Impl2032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__52063 = new BitSet(new long[]{0x000000001200F000L});
        public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__52066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Entity__Group__5__Impl2094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62125 = new BitSet(new long[]{0x000000001200F000L});
        public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__62128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__0_in_rule__Entity__Group__6__Impl2155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__72186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Entity__Group__7__Impl2214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_1__0__Impl_in_rule__Entity__Group_1__02261 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Entity__Group_1__1_in_rule__Entity__Group_1__02264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_1_0_in_rule__Entity__Group_1__0__Impl2291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_1__1__Impl_in_rule__Entity__Group_1__12321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_1_1_in_rule__Entity__Group_1__1__Impl2348 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__0__Impl_in_rule__Entity__Group_4__02383 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__1_in_rule__Entity__Group_4__02386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Entity__Group_4__0__Impl2414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__1__Impl_in_rule__Entity__Group_4__12445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__SuperEntityAssignment_4_1_in_rule__Entity__Group_4__1__Impl2472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__0__Impl_in_rule__Entity__Group_6__02506 = new BitSet(new long[]{0x000000001000F000L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__1_in_rule__Entity__Group_6__02509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__OwnedFeatureAssignment_6_0_in_rule__Entity__Group_6__0__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__1__Impl_in_rule__Entity__Group_6__12566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__OwnedFeatureAssignment_6_1_in_rule__Entity__Group_6__1__Impl2593 = new BitSet(new long[]{0x000000001000F002L});
        public static final BitSet FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__02628 = new BitSet(new long[]{0x000000001000F000L});
        public static final BitSet FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__02631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__12689 = new BitSet(new long[]{0x000000001000F000L});
        public static final BitSet FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__12692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_1__0_in_rule__Ref__Group__1__Impl2719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__22750 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__22753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Ref__Group__2__Impl2781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__32812 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__32815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__NameAssignment_3_in_rule__Ref__Group__3__Impl2842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__42872 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__42875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__RefToAssignment_4_in_rule__Ref__Group__4__Impl2902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__52932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__ManyAssignment_5_in_rule__Ref__Group__5__Impl2959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_1__0__Impl_in_rule__Ref__Group_1__03002 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__Ref__Group_1__1_in_rule__Ref__Group_1__03005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__AnnotationsAssignment_1_0_in_rule__Ref__Group_1__0__Impl3032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_1__1__Impl_in_rule__Ref__Group_1__13062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__AnnotationsAssignment_1_1_in_rule__Ref__Group_1__1__Impl3089 = new BitSet(new long[]{0x000000000000F002L});
        public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03124 = new BitSet(new long[]{0x000000001000F000L});
        public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13185 = new BitSet(new long[]{0x000000001000F000L});
        public static final BitSet FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__13188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_1__0_in_rule__DataType__Group__1__Impl3215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__23246 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__23249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__DataType__Group__2__Impl3277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__33308 = new BitSet(new long[]{0x00000000003F0000L});
        public static final BitSet FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__33311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__NameAssignment_3_in_rule__DataType__Group__3__Impl3338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__43368 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__DataType__Group__5_in_rule__DataType__Group__43371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__TypeAssignment_4_in_rule__DataType__Group__4__Impl3398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__5__Impl_in_rule__DataType__Group__53428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__ManyAssignment_5_in_rule__DataType__Group__5__Impl3455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_1__0__Impl_in_rule__DataType__Group_1__03498 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__DataType__Group_1__1_in_rule__DataType__Group_1__03501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__AnnotationsAssignment_1_0_in_rule__DataType__Group_1__0__Impl3528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_1__1__Impl_in_rule__DataType__Group_1__13558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__AnnotationsAssignment_1_1_in_rule__DataType__Group_1__1__Impl3585 = new BitSet(new long[]{0x000000000000F002L});
        public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__0__Impl_in_rule__QUALIFIED_NAME__Group__03620 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__1_in_rule__QUALIFIED_NAME__Group__03623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group__0__Impl3650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group__1__Impl_in_rule__QUALIFIED_NAME__Group__13679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__0_in_rule__QUALIFIED_NAME__Group__1__Impl3706 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__0__Impl_in_rule__QUALIFIED_NAME__Group_1__03741 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__1_in_rule__QUALIFIED_NAME__Group_1__03744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__QUALIFIED_NAME__Group_1__0__Impl3772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QUALIFIED_NAME__Group_1__1__Impl_in_rule__QUALIFIED_NAME__Group_1__13803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QUALIFIED_NAME__Group_1__1__Impl3830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__Module__NameAssignment_23868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_3_03899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_in_rule__Module__PackagesAssignment_3_13930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rule__Package__NameAssignment_23961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_4_03992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_4_14023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_1_04054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_1_14085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_34116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_4_14151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_6_04186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_6_14217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_1_04248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_1_14279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Ref__NameAssignment_34310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Ref__RefToAssignment_44345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Ref__ManyAssignment_54385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_1_04424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_1_14455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_34486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataTypes_in_rule__DataType__TypeAssignment_44517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__DataType__ManyAssignment_54553 = new BitSet(new long[]{0x0000000000000002L});
    }


}