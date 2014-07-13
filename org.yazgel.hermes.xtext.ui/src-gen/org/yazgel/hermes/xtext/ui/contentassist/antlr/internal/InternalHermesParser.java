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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cache'", "'Index'", "'Id'", "'Load'", "'Ignore'", "'String'", "'Integer'", "'Boolean'", "'Long'", "'Double'", "'Object'", "'Package'", "'{'", "'}'", "'Entity'", "':'", "'var'", "'[]'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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




    // $ANTLR start "entryRulePackage"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:60:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:61:1: ( rulePackage EOF )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:62:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_entryRulePackage61);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackage68); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:69:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:73:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:74:1: ( ( rule__Package__Group__0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:74:1: ( ( rule__Package__Group__0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:75:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:76:1: ( rule__Package__Group__0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:76:2: rule__Package__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__0_in_rulePackage94);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:88:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:89:1: ( ruleFeature EOF )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:90:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature121);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature128); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:97:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:101:2: ( ( ( rule__Feature__Alternatives ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:102:1: ( ( rule__Feature__Alternatives ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:102:1: ( ( rule__Feature__Alternatives ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:103:1: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:104:1: ( rule__Feature__Alternatives )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:104:2: rule__Feature__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Alternatives_in_ruleFeature154);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:116:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:117:1: ( ruleEntity EOF )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:118:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity181);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity188); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:125:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:129:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:130:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:130:1: ( ( rule__Entity__Group__0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:131:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:132:1: ( rule__Entity__Group__0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:132:2: rule__Entity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0_in_ruleEntity214);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:144:1: entryRuleRef : ruleRef EOF ;
    public final void entryRuleRef() throws RecognitionException {
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:145:1: ( ruleRef EOF )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:146:1: ruleRef EOF
            {
             before(grammarAccess.getRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRef_in_entryRuleRef241);
            ruleRef();

            state._fsp--;

             after(grammarAccess.getRefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRef248); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:153:1: ruleRef : ( ( rule__Ref__Group__0 ) ) ;
    public final void ruleRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:157:2: ( ( ( rule__Ref__Group__0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:158:1: ( ( rule__Ref__Group__0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:158:1: ( ( rule__Ref__Group__0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:159:1: ( rule__Ref__Group__0 )
            {
             before(grammarAccess.getRefAccess().getGroup()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:160:1: ( rule__Ref__Group__0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:160:2: rule__Ref__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__0_in_ruleRef274);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:172:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:173:1: ( ruleDataType EOF )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:174:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataType_in_entryRuleDataType301);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataType308); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:181:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:185:2: ( ( ( rule__DataType__Group__0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:186:1: ( ( rule__DataType__Group__0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:186:1: ( ( rule__DataType__Group__0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:187:1: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:188:1: ( rule__DataType__Group__0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:188:2: rule__DataType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__0_in_ruleDataType334);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:201:1: ruleEntityAnnotation : ( ( 'Cache' ) ) ;
    public final void ruleEntityAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:205:1: ( ( ( 'Cache' ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:206:1: ( ( 'Cache' ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:206:1: ( ( 'Cache' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:207:1: ( 'Cache' )
            {
             before(grammarAccess.getEntityAnnotationAccess().getCacheEnumLiteralDeclaration()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:208:1: ( 'Cache' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:208:3: 'Cache'
            {
            match(input,11,FollowSets000.FOLLOW_11_in_ruleEntityAnnotation372); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:221:1: ruleFetureAnnotation : ( ( rule__FetureAnnotation__Alternatives ) ) ;
    public final void ruleFetureAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:225:1: ( ( ( rule__FetureAnnotation__Alternatives ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:226:1: ( ( rule__FetureAnnotation__Alternatives ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:226:1: ( ( rule__FetureAnnotation__Alternatives ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:227:1: ( rule__FetureAnnotation__Alternatives )
            {
             before(grammarAccess.getFetureAnnotationAccess().getAlternatives()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:228:1: ( rule__FetureAnnotation__Alternatives )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:228:2: rule__FetureAnnotation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__FetureAnnotation__Alternatives_in_ruleFetureAnnotation410);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:240:1: ruleDataTypes : ( ( rule__DataTypes__Alternatives ) ) ;
    public final void ruleDataTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:244:1: ( ( ( rule__DataTypes__Alternatives ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:245:1: ( ( rule__DataTypes__Alternatives ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:245:1: ( ( rule__DataTypes__Alternatives ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:246:1: ( rule__DataTypes__Alternatives )
            {
             before(grammarAccess.getDataTypesAccess().getAlternatives()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:247:1: ( rule__DataTypes__Alternatives )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:247:2: rule__DataTypes__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataTypes__Alternatives_in_ruleDataTypes446);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:258:1: rule__Feature__Alternatives : ( ( ruleRef ) | ( ruleDataType ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:262:1: ( ( ruleRef ) | ( ruleDataType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    int LA1_2 = input.LA(3);

                    if ( ((LA1_2>=16 && LA1_2<=21)) ) {
                        alt1=2;
                    }
                    else if ( (LA1_2==RULE_ID) ) {
                        alt1=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:263:1: ( ruleRef )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:263:1: ( ruleRef )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:264:1: ruleRef
                    {
                     before(grammarAccess.getFeatureAccess().getRefParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRef_in_rule__Feature__Alternatives481);
                    ruleRef();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getRefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:269:6: ( ruleDataType )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:269:6: ( ruleDataType )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:270:1: ruleDataType
                    {
                     before(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDataType_in_rule__Feature__Alternatives498);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:280:1: rule__FetureAnnotation__Alternatives : ( ( ( 'Index' ) ) | ( ( 'Id' ) ) | ( ( 'Load' ) ) | ( ( 'Ignore' ) ) );
    public final void rule__FetureAnnotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:284:1: ( ( ( 'Index' ) ) | ( ( 'Id' ) ) | ( ( 'Load' ) ) | ( ( 'Ignore' ) ) )
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
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:285:1: ( ( 'Index' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:285:1: ( ( 'Index' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:286:1: ( 'Index' )
                    {
                     before(grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:287:1: ( 'Index' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:287:3: 'Index'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__FetureAnnotation__Alternatives531); 

                    }

                     after(grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:292:6: ( ( 'Id' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:292:6: ( ( 'Id' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:293:1: ( 'Id' )
                    {
                     before(grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:294:1: ( 'Id' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:294:3: 'Id'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__FetureAnnotation__Alternatives552); 

                    }

                     after(grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:299:6: ( ( 'Load' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:299:6: ( ( 'Load' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:300:1: ( 'Load' )
                    {
                     before(grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:301:1: ( 'Load' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:301:3: 'Load'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__FetureAnnotation__Alternatives573); 

                    }

                     after(grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:306:6: ( ( 'Ignore' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:306:6: ( ( 'Ignore' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:307:1: ( 'Ignore' )
                    {
                     before(grammarAccess.getFetureAnnotationAccess().getIgnoreEnumLiteralDeclaration_3()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:308:1: ( 'Ignore' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:308:3: 'Ignore'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__FetureAnnotation__Alternatives594); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:318:1: rule__DataTypes__Alternatives : ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) | ( ( 'Long' ) ) | ( ( 'Double' ) ) | ( ( 'Object' ) ) );
    public final void rule__DataTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:322:1: ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Boolean' ) ) | ( ( 'Long' ) ) | ( ( 'Double' ) ) | ( ( 'Object' ) ) )
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
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:323:1: ( ( 'String' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:323:1: ( ( 'String' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:324:1: ( 'String' )
                    {
                     before(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:325:1: ( 'String' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:325:3: 'String'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__DataTypes__Alternatives630); 

                    }

                     after(grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:330:6: ( ( 'Integer' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:330:6: ( ( 'Integer' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:331:1: ( 'Integer' )
                    {
                     before(grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:332:1: ( 'Integer' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:332:3: 'Integer'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__DataTypes__Alternatives651); 

                    }

                     after(grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:337:6: ( ( 'Boolean' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:337:6: ( ( 'Boolean' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:338:1: ( 'Boolean' )
                    {
                     before(grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:339:1: ( 'Boolean' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:339:3: 'Boolean'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__DataTypes__Alternatives672); 

                    }

                     after(grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:344:6: ( ( 'Long' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:344:6: ( ( 'Long' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:345:1: ( 'Long' )
                    {
                     before(grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:346:1: ( 'Long' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:346:3: 'Long'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__DataTypes__Alternatives693); 

                    }

                     after(grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:351:6: ( ( 'Double' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:351:6: ( ( 'Double' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:352:1: ( 'Double' )
                    {
                     before(grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:353:1: ( 'Double' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:353:3: 'Double'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__DataTypes__Alternatives714); 

                    }

                     after(grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:358:6: ( ( 'Object' ) )
                    {
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:358:6: ( ( 'Object' ) )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:359:1: ( 'Object' )
                    {
                     before(grammarAccess.getDataTypesAccess().getObjectEnumLiteralDeclaration_5()); 
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:360:1: ( 'Object' )
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:360:3: 'Object'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__DataTypes__Alternatives735); 

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


    // $ANTLR start "rule__Package__Group__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:372:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:376:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:377:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0768);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0771);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:384:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:388:1: ( ( () ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:389:1: ( () )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:389:1: ( () )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:390:1: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:391:1: ()
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:393:1: 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:403:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:407:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:408:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1829);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1832);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:415:1: rule__Package__Group__1__Impl : ( 'Package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:419:1: ( ( 'Package' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:420:1: ( 'Package' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:420:1: ( 'Package' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:421:1: 'Package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Package__Group__1__Impl860); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:434:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:438:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:439:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2891);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2894);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:446:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:450:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:451:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:451:1: ( ( rule__Package__NameAssignment_2 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:452:1: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:453:1: ( rule__Package__NameAssignment_2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:453:2: rule__Package__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl921);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:463:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:467:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:468:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__3951);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4_in_rule__Package__Group__3954);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:475:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:479:1: ( ( '{' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:480:1: ( '{' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:480:1: ( '{' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:481:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Package__Group__3__Impl982); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:494:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:498:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:499:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41013);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41016);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:506:1: rule__Package__Group__4__Impl : ( ( rule__Package__Group_4__0 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:510:1: ( ( ( rule__Package__Group_4__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:511:1: ( ( rule__Package__Group_4__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:511:1: ( ( rule__Package__Group_4__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:512:1: ( rule__Package__Group_4__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_4()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:513:1: ( rule__Package__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:513:2: rule__Package__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1043);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:523:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:527:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:528:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51074);
            rule__Package__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__6_in_rule__Package__Group__51077);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:535:1: rule__Package__Group__5__Impl : ( ( rule__Package__Group_5__0 )? ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:539:1: ( ( ( rule__Package__Group_5__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:540:1: ( ( rule__Package__Group_5__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:540:1: ( ( rule__Package__Group_5__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:541:1: ( rule__Package__Group_5__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_5()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:542:1: ( rule__Package__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:542:2: rule__Package__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl1104);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:552:1: rule__Package__Group__6 : rule__Package__Group__6__Impl ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:556:1: ( rule__Package__Group__6__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:557:2: rule__Package__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61135);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:563:1: rule__Package__Group__6__Impl : ( '}' ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:567:1: ( ( '}' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:568:1: ( '}' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:568:1: ( '}' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:569:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Package__Group__6__Impl1163); 
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


    // $ANTLR start "rule__Package__Group_4__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:596:1: rule__Package__Group_4__0 : rule__Package__Group_4__0__Impl rule__Package__Group_4__1 ;
    public final void rule__Package__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:600:1: ( rule__Package__Group_4__0__Impl rule__Package__Group_4__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:601:2: rule__Package__Group_4__0__Impl rule__Package__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01208);
            rule__Package__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01211);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:608:1: rule__Package__Group_4__0__Impl : ( ( rule__Package__OwnedEntityAssignment_4_0 ) ) ;
    public final void rule__Package__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:612:1: ( ( ( rule__Package__OwnedEntityAssignment_4_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:613:1: ( ( rule__Package__OwnedEntityAssignment_4_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:613:1: ( ( rule__Package__OwnedEntityAssignment_4_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:614:1: ( rule__Package__OwnedEntityAssignment_4_0 )
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityAssignment_4_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:615:1: ( rule__Package__OwnedEntityAssignment_4_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:615:2: rule__Package__OwnedEntityAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__OwnedEntityAssignment_4_0_in_rule__Package__Group_4__0__Impl1238);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:625:1: rule__Package__Group_4__1 : rule__Package__Group_4__1__Impl ;
    public final void rule__Package__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:629:1: ( rule__Package__Group_4__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:630:2: rule__Package__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__11268);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:636:1: rule__Package__Group_4__1__Impl : ( ( rule__Package__OwnedEntityAssignment_4_1 )* ) ;
    public final void rule__Package__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:640:1: ( ( ( rule__Package__OwnedEntityAssignment_4_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:641:1: ( ( rule__Package__OwnedEntityAssignment_4_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:641:1: ( ( rule__Package__OwnedEntityAssignment_4_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:642:1: ( rule__Package__OwnedEntityAssignment_4_1 )*
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityAssignment_4_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:643:1: ( rule__Package__OwnedEntityAssignment_4_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:643:2: rule__Package__OwnedEntityAssignment_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__OwnedEntityAssignment_4_1_in_rule__Package__Group_4__1__Impl1295);
            	    rule__Package__OwnedEntityAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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


    // $ANTLR start "rule__Package__Group_5__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:657:1: rule__Package__Group_5__0 : rule__Package__Group_5__0__Impl rule__Package__Group_5__1 ;
    public final void rule__Package__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:661:1: ( rule__Package__Group_5__0__Impl rule__Package__Group_5__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:662:2: rule__Package__Group_5__0__Impl rule__Package__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__01330);
            rule__Package__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__01333);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:669:1: rule__Package__Group_5__0__Impl : ( ( rule__Package__SubPackageAssignment_5_0 ) ) ;
    public final void rule__Package__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:673:1: ( ( ( rule__Package__SubPackageAssignment_5_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:674:1: ( ( rule__Package__SubPackageAssignment_5_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:674:1: ( ( rule__Package__SubPackageAssignment_5_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:675:1: ( rule__Package__SubPackageAssignment_5_0 )
            {
             before(grammarAccess.getPackageAccess().getSubPackageAssignment_5_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:676:1: ( rule__Package__SubPackageAssignment_5_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:676:2: rule__Package__SubPackageAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__SubPackageAssignment_5_0_in_rule__Package__Group_5__0__Impl1360);
            rule__Package__SubPackageAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getSubPackageAssignment_5_0()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:686:1: rule__Package__Group_5__1 : rule__Package__Group_5__1__Impl ;
    public final void rule__Package__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:690:1: ( rule__Package__Group_5__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:691:2: rule__Package__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__11390);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:697:1: rule__Package__Group_5__1__Impl : ( ( rule__Package__SubPackageAssignment_5_1 )* ) ;
    public final void rule__Package__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:701:1: ( ( ( rule__Package__SubPackageAssignment_5_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:702:1: ( ( rule__Package__SubPackageAssignment_5_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:702:1: ( ( rule__Package__SubPackageAssignment_5_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:703:1: ( rule__Package__SubPackageAssignment_5_1 )*
            {
             before(grammarAccess.getPackageAccess().getSubPackageAssignment_5_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:704:1: ( rule__Package__SubPackageAssignment_5_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:704:2: rule__Package__SubPackageAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__SubPackageAssignment_5_1_in_rule__Package__Group_5__1__Impl1417);
            	    rule__Package__SubPackageAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getSubPackageAssignment_5_1()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:718:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:722:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:723:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01452);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01455);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:730:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:734:1: ( ( () ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:735:1: ( () )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:735:1: ( () )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:736:1: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:737:1: ()
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:739:1: 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:749:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:753:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:754:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11513);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11516);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:761:1: rule__Entity__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:765:1: ( ( 'Entity' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:766:1: ( 'Entity' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:766:1: ( 'Entity' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:767:1: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Entity__Group__1__Impl1544); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:780:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:784:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:785:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21575);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21578);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:792:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:796:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:797:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:797:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:798:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:799:1: ( rule__Entity__NameAssignment_2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:799:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl1605);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:809:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:813:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:814:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31635);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31638);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:821:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:825:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:826:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:826:1: ( ( rule__Entity__Group_3__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:827:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:828:1: ( rule__Entity__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:828:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl1665);
                    rule__Entity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_3()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:838:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:842:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:843:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41696);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41699);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:850:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:854:1: ( ( '{' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:855:1: ( '{' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:855:1: ( '{' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:856:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Entity__Group__4__Impl1727); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:869:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:873:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:874:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51758);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51761);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:881:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__Group_5__0 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:885:1: ( ( ( rule__Entity__Group_5__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:886:1: ( ( rule__Entity__Group_5__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:886:1: ( ( rule__Entity__Group_5__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:887:1: ( rule__Entity__Group_5__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_5()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:888:1: ( rule__Entity__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:888:2: rule__Entity__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl1788);
                    rule__Entity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_5()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:898:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:902:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:903:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61819);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61822);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:910:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__Group_6__0 )? ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:914:1: ( ( ( rule__Entity__Group_6__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:915:1: ( ( rule__Entity__Group_6__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:915:1: ( ( rule__Entity__Group_6__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:916:1: ( rule__Entity__Group_6__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_6()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:917:1: ( rule__Entity__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:917:2: rule__Entity__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__0_in_rule__Entity__Group__6__Impl1849);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:927:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:931:1: ( rule__Entity__Group__7__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:932:2: rule__Entity__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71880);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:938:1: rule__Entity__Group__7__Impl : ( '}' ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:942:1: ( ( '}' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:943:1: ( '}' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:943:1: ( '}' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:944:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Entity__Group__7__Impl1908); 
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


    // $ANTLR start "rule__Entity__Group_3__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:973:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:977:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:978:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__01955);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__01958);
            rule__Entity__Group_3__1();

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
    // $ANTLR end "rule__Entity__Group_3__0"


    // $ANTLR start "rule__Entity__Group_3__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:985:1: rule__Entity__Group_3__0__Impl : ( ':' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:989:1: ( ( ':' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:990:1: ( ':' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:990:1: ( ':' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:991:1: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_3_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Entity__Group_3__0__Impl1986); 
             after(grammarAccess.getEntityAccess().getColonKeyword_3_0()); 

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
    // $ANTLR end "rule__Entity__Group_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_3__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1004:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1008:1: ( rule__Entity__Group_3__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1009:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12017);
            rule__Entity__Group_3__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_3__1"


    // $ANTLR start "rule__Entity__Group_3__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1015:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperEntityAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1019:1: ( ( ( rule__Entity__SuperEntityAssignment_3_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1020:1: ( ( rule__Entity__SuperEntityAssignment_3_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1020:1: ( ( rule__Entity__SuperEntityAssignment_3_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1021:1: ( rule__Entity__SuperEntityAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityAssignment_3_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1022:1: ( rule__Entity__SuperEntityAssignment_3_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1022:2: rule__Entity__SuperEntityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__SuperEntityAssignment_3_1_in_rule__Entity__Group_3__1__Impl2044);
            rule__Entity__SuperEntityAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperEntityAssignment_3_1()); 

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
    // $ANTLR end "rule__Entity__Group_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_5__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1036:1: rule__Entity__Group_5__0 : rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 ;
    public final void rule__Entity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1040:1: ( rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1041:2: rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02078);
            rule__Entity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02081);
            rule__Entity__Group_5__1();

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
    // $ANTLR end "rule__Entity__Group_5__0"


    // $ANTLR start "rule__Entity__Group_5__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1048:1: rule__Entity__Group_5__0__Impl : ( ( rule__Entity__AnnotationsAssignment_5_0 ) ) ;
    public final void rule__Entity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1052:1: ( ( ( rule__Entity__AnnotationsAssignment_5_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1053:1: ( ( rule__Entity__AnnotationsAssignment_5_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1053:1: ( ( rule__Entity__AnnotationsAssignment_5_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1054:1: ( rule__Entity__AnnotationsAssignment_5_0 )
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_5_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1055:1: ( rule__Entity__AnnotationsAssignment_5_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1055:2: rule__Entity__AnnotationsAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__AnnotationsAssignment_5_0_in_rule__Entity__Group_5__0__Impl2108);
            rule__Entity__AnnotationsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAnnotationsAssignment_5_0()); 

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
    // $ANTLR end "rule__Entity__Group_5__0__Impl"


    // $ANTLR start "rule__Entity__Group_5__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1065:1: rule__Entity__Group_5__1 : rule__Entity__Group_5__1__Impl ;
    public final void rule__Entity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1069:1: ( rule__Entity__Group_5__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1070:2: rule__Entity__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12138);
            rule__Entity__Group_5__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_5__1"


    // $ANTLR start "rule__Entity__Group_5__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1076:1: rule__Entity__Group_5__1__Impl : ( ( rule__Entity__AnnotationsAssignment_5_1 )* ) ;
    public final void rule__Entity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1080:1: ( ( ( rule__Entity__AnnotationsAssignment_5_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1081:1: ( ( rule__Entity__AnnotationsAssignment_5_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1081:1: ( ( rule__Entity__AnnotationsAssignment_5_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1082:1: ( rule__Entity__AnnotationsAssignment_5_1 )*
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_5_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1083:1: ( rule__Entity__AnnotationsAssignment_5_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==11) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1083:2: rule__Entity__AnnotationsAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__AnnotationsAssignment_5_1_in_rule__Entity__Group_5__1__Impl2165);
            	    rule__Entity__AnnotationsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAnnotationsAssignment_5_1()); 

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
    // $ANTLR end "rule__Entity__Group_5__1__Impl"


    // $ANTLR start "rule__Entity__Group_6__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1097:1: rule__Entity__Group_6__0 : rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 ;
    public final void rule__Entity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1101:1: ( rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1102:2: rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__0__Impl_in_rule__Entity__Group_6__02200);
            rule__Entity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__1_in_rule__Entity__Group_6__02203);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1109:1: rule__Entity__Group_6__0__Impl : ( ( rule__Entity__OwnedFeatureAssignment_6_0 ) ) ;
    public final void rule__Entity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1113:1: ( ( ( rule__Entity__OwnedFeatureAssignment_6_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1114:1: ( ( rule__Entity__OwnedFeatureAssignment_6_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1114:1: ( ( rule__Entity__OwnedFeatureAssignment_6_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1115:1: ( rule__Entity__OwnedFeatureAssignment_6_0 )
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_6_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1116:1: ( rule__Entity__OwnedFeatureAssignment_6_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1116:2: rule__Entity__OwnedFeatureAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__OwnedFeatureAssignment_6_0_in_rule__Entity__Group_6__0__Impl2230);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1126:1: rule__Entity__Group_6__1 : rule__Entity__Group_6__1__Impl ;
    public final void rule__Entity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1130:1: ( rule__Entity__Group_6__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1131:2: rule__Entity__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__1__Impl_in_rule__Entity__Group_6__12260);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1137:1: rule__Entity__Group_6__1__Impl : ( ( rule__Entity__OwnedFeatureAssignment_6_1 )* ) ;
    public final void rule__Entity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1141:1: ( ( ( rule__Entity__OwnedFeatureAssignment_6_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1142:1: ( ( rule__Entity__OwnedFeatureAssignment_6_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1142:1: ( ( rule__Entity__OwnedFeatureAssignment_6_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1143:1: ( rule__Entity__OwnedFeatureAssignment_6_1 )*
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_6_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1144:1: ( rule__Entity__OwnedFeatureAssignment_6_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1144:2: rule__Entity__OwnedFeatureAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__OwnedFeatureAssignment_6_1_in_rule__Entity__Group_6__1__Impl2287);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1158:1: rule__Ref__Group__0 : rule__Ref__Group__0__Impl rule__Ref__Group__1 ;
    public final void rule__Ref__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1162:1: ( rule__Ref__Group__0__Impl rule__Ref__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1163:2: rule__Ref__Group__0__Impl rule__Ref__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__02322);
            rule__Ref__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__02325);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1170:1: rule__Ref__Group__0__Impl : ( 'var' ) ;
    public final void rule__Ref__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1174:1: ( ( 'var' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1175:1: ( 'var' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1175:1: ( 'var' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1176:1: 'var'
            {
             before(grammarAccess.getRefAccess().getVarKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Ref__Group__0__Impl2353); 
             after(grammarAccess.getRefAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__Ref__Group__0__Impl"


    // $ANTLR start "rule__Ref__Group__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1189:1: rule__Ref__Group__1 : rule__Ref__Group__1__Impl rule__Ref__Group__2 ;
    public final void rule__Ref__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1193:1: ( rule__Ref__Group__1__Impl rule__Ref__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1194:2: rule__Ref__Group__1__Impl rule__Ref__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__12384);
            rule__Ref__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__12387);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1201:1: rule__Ref__Group__1__Impl : ( ( rule__Ref__NameAssignment_1 ) ) ;
    public final void rule__Ref__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1205:1: ( ( ( rule__Ref__NameAssignment_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1206:1: ( ( rule__Ref__NameAssignment_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1206:1: ( ( rule__Ref__NameAssignment_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1207:1: ( rule__Ref__NameAssignment_1 )
            {
             before(grammarAccess.getRefAccess().getNameAssignment_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1208:1: ( rule__Ref__NameAssignment_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1208:2: rule__Ref__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__NameAssignment_1_in_rule__Ref__Group__1__Impl2414);
            rule__Ref__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getNameAssignment_1()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1218:1: rule__Ref__Group__2 : rule__Ref__Group__2__Impl rule__Ref__Group__3 ;
    public final void rule__Ref__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1222:1: ( rule__Ref__Group__2__Impl rule__Ref__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1223:2: rule__Ref__Group__2__Impl rule__Ref__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__22444);
            rule__Ref__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__22447);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1230:1: rule__Ref__Group__2__Impl : ( ( rule__Ref__RefToAssignment_2 ) ) ;
    public final void rule__Ref__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1234:1: ( ( ( rule__Ref__RefToAssignment_2 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1235:1: ( ( rule__Ref__RefToAssignment_2 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1235:1: ( ( rule__Ref__RefToAssignment_2 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1236:1: ( rule__Ref__RefToAssignment_2 )
            {
             before(grammarAccess.getRefAccess().getRefToAssignment_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1237:1: ( rule__Ref__RefToAssignment_2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1237:2: rule__Ref__RefToAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__RefToAssignment_2_in_rule__Ref__Group__2__Impl2474);
            rule__Ref__RefToAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getRefToAssignment_2()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1247:1: rule__Ref__Group__3 : rule__Ref__Group__3__Impl rule__Ref__Group__4 ;
    public final void rule__Ref__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1251:1: ( rule__Ref__Group__3__Impl rule__Ref__Group__4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1252:2: rule__Ref__Group__3__Impl rule__Ref__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__32504);
            rule__Ref__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__32507);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1259:1: rule__Ref__Group__3__Impl : ( ( rule__Ref__ManyAssignment_3 )? ) ;
    public final void rule__Ref__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1263:1: ( ( ( rule__Ref__ManyAssignment_3 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1264:1: ( ( rule__Ref__ManyAssignment_3 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1264:1: ( ( rule__Ref__ManyAssignment_3 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1265:1: ( rule__Ref__ManyAssignment_3 )?
            {
             before(grammarAccess.getRefAccess().getManyAssignment_3()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1266:1: ( rule__Ref__ManyAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1266:2: rule__Ref__ManyAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ref__ManyAssignment_3_in_rule__Ref__Group__3__Impl2534);
                    rule__Ref__ManyAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRefAccess().getManyAssignment_3()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1276:1: rule__Ref__Group__4 : rule__Ref__Group__4__Impl rule__Ref__Group__5 ;
    public final void rule__Ref__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1280:1: ( rule__Ref__Group__4__Impl rule__Ref__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1281:2: rule__Ref__Group__4__Impl rule__Ref__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__42565);
            rule__Ref__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__42568);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1288:1: rule__Ref__Group__4__Impl : ( '{' ) ;
    public final void rule__Ref__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1292:1: ( ( '{' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1293:1: ( '{' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1293:1: ( '{' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1294:1: '{'
            {
             before(grammarAccess.getRefAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Ref__Group__4__Impl2596); 
             after(grammarAccess.getRefAccess().getLeftCurlyBracketKeyword_4()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1307:1: rule__Ref__Group__5 : rule__Ref__Group__5__Impl rule__Ref__Group__6 ;
    public final void rule__Ref__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1311:1: ( rule__Ref__Group__5__Impl rule__Ref__Group__6 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1312:2: rule__Ref__Group__5__Impl rule__Ref__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__52627);
            rule__Ref__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__6_in_rule__Ref__Group__52630);
            rule__Ref__Group__6();

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1319:1: rule__Ref__Group__5__Impl : ( ( rule__Ref__Group_5__0 )? ) ;
    public final void rule__Ref__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1323:1: ( ( ( rule__Ref__Group_5__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1324:1: ( ( rule__Ref__Group_5__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1324:1: ( ( rule__Ref__Group_5__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1325:1: ( rule__Ref__Group_5__0 )?
            {
             before(grammarAccess.getRefAccess().getGroup_5()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1326:1: ( rule__Ref__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=12 && LA14_0<=15)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1326:2: rule__Ref__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_5__0_in_rule__Ref__Group__5__Impl2657);
                    rule__Ref__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRefAccess().getGroup_5()); 

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


    // $ANTLR start "rule__Ref__Group__6"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1336:1: rule__Ref__Group__6 : rule__Ref__Group__6__Impl ;
    public final void rule__Ref__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1340:1: ( rule__Ref__Group__6__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1341:2: rule__Ref__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__6__Impl_in_rule__Ref__Group__62688);
            rule__Ref__Group__6__Impl();

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
    // $ANTLR end "rule__Ref__Group__6"


    // $ANTLR start "rule__Ref__Group__6__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1347:1: rule__Ref__Group__6__Impl : ( '}' ) ;
    public final void rule__Ref__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1351:1: ( ( '}' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1352:1: ( '}' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1352:1: ( '}' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1353:1: '}'
            {
             before(grammarAccess.getRefAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Ref__Group__6__Impl2716); 
             after(grammarAccess.getRefAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Ref__Group__6__Impl"


    // $ANTLR start "rule__Ref__Group_5__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1380:1: rule__Ref__Group_5__0 : rule__Ref__Group_5__0__Impl rule__Ref__Group_5__1 ;
    public final void rule__Ref__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1384:1: ( rule__Ref__Group_5__0__Impl rule__Ref__Group_5__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1385:2: rule__Ref__Group_5__0__Impl rule__Ref__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_5__0__Impl_in_rule__Ref__Group_5__02761);
            rule__Ref__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_5__1_in_rule__Ref__Group_5__02764);
            rule__Ref__Group_5__1();

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
    // $ANTLR end "rule__Ref__Group_5__0"


    // $ANTLR start "rule__Ref__Group_5__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1392:1: rule__Ref__Group_5__0__Impl : ( ( rule__Ref__AnnotationsAssignment_5_0 ) ) ;
    public final void rule__Ref__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1396:1: ( ( ( rule__Ref__AnnotationsAssignment_5_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1397:1: ( ( rule__Ref__AnnotationsAssignment_5_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1397:1: ( ( rule__Ref__AnnotationsAssignment_5_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1398:1: ( rule__Ref__AnnotationsAssignment_5_0 )
            {
             before(grammarAccess.getRefAccess().getAnnotationsAssignment_5_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1399:1: ( rule__Ref__AnnotationsAssignment_5_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1399:2: rule__Ref__AnnotationsAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__AnnotationsAssignment_5_0_in_rule__Ref__Group_5__0__Impl2791);
            rule__Ref__AnnotationsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getAnnotationsAssignment_5_0()); 

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
    // $ANTLR end "rule__Ref__Group_5__0__Impl"


    // $ANTLR start "rule__Ref__Group_5__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1409:1: rule__Ref__Group_5__1 : rule__Ref__Group_5__1__Impl ;
    public final void rule__Ref__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1413:1: ( rule__Ref__Group_5__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1414:2: rule__Ref__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_5__1__Impl_in_rule__Ref__Group_5__12821);
            rule__Ref__Group_5__1__Impl();

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
    // $ANTLR end "rule__Ref__Group_5__1"


    // $ANTLR start "rule__Ref__Group_5__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1420:1: rule__Ref__Group_5__1__Impl : ( ( rule__Ref__AnnotationsAssignment_5_1 )* ) ;
    public final void rule__Ref__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1424:1: ( ( ( rule__Ref__AnnotationsAssignment_5_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1425:1: ( ( rule__Ref__AnnotationsAssignment_5_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1425:1: ( ( rule__Ref__AnnotationsAssignment_5_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1426:1: ( rule__Ref__AnnotationsAssignment_5_1 )*
            {
             before(grammarAccess.getRefAccess().getAnnotationsAssignment_5_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1427:1: ( rule__Ref__AnnotationsAssignment_5_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=12 && LA15_0<=15)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1427:2: rule__Ref__AnnotationsAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ref__AnnotationsAssignment_5_1_in_rule__Ref__Group_5__1__Impl2848);
            	    rule__Ref__AnnotationsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRefAccess().getAnnotationsAssignment_5_1()); 

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
    // $ANTLR end "rule__Ref__Group_5__1__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1441:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1445:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1446:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__02883);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__02886);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1453:1: rule__DataType__Group__0__Impl : ( 'var' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1457:1: ( ( 'var' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1458:1: ( 'var' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1458:1: ( 'var' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1459:1: 'var'
            {
             before(grammarAccess.getDataTypeAccess().getVarKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__DataType__Group__0__Impl2914); 
             after(grammarAccess.getDataTypeAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1472:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1476:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1477:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12945);
            rule__DataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__12948);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1484:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1488:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1489:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1489:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1490:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1491:1: ( rule__DataType__NameAssignment_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1491:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl2975);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1501:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl rule__DataType__Group__3 ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1505:1: ( rule__DataType__Group__2__Impl rule__DataType__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1506:2: rule__DataType__Group__2__Impl rule__DataType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__23005);
            rule__DataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__23008);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1513:1: rule__DataType__Group__2__Impl : ( ( rule__DataType__TypeAssignment_2 ) ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1517:1: ( ( ( rule__DataType__TypeAssignment_2 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1518:1: ( ( rule__DataType__TypeAssignment_2 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1518:1: ( ( rule__DataType__TypeAssignment_2 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1519:1: ( rule__DataType__TypeAssignment_2 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1520:1: ( rule__DataType__TypeAssignment_2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1520:2: rule__DataType__TypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__TypeAssignment_2_in_rule__DataType__Group__2__Impl3035);
            rule__DataType__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getTypeAssignment_2()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1530:1: rule__DataType__Group__3 : rule__DataType__Group__3__Impl rule__DataType__Group__4 ;
    public final void rule__DataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1534:1: ( rule__DataType__Group__3__Impl rule__DataType__Group__4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1535:2: rule__DataType__Group__3__Impl rule__DataType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__33065);
            rule__DataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__33068);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1542:1: rule__DataType__Group__3__Impl : ( ( rule__DataType__ManyAssignment_3 )? ) ;
    public final void rule__DataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1546:1: ( ( ( rule__DataType__ManyAssignment_3 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1547:1: ( ( rule__DataType__ManyAssignment_3 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1547:1: ( ( rule__DataType__ManyAssignment_3 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1548:1: ( rule__DataType__ManyAssignment_3 )?
            {
             before(grammarAccess.getDataTypeAccess().getManyAssignment_3()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1549:1: ( rule__DataType__ManyAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1549:2: rule__DataType__ManyAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataType__ManyAssignment_3_in_rule__DataType__Group__3__Impl3095);
                    rule__DataType__ManyAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getManyAssignment_3()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1559:1: rule__DataType__Group__4 : rule__DataType__Group__4__Impl rule__DataType__Group__5 ;
    public final void rule__DataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1563:1: ( rule__DataType__Group__4__Impl rule__DataType__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1564:2: rule__DataType__Group__4__Impl rule__DataType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__43126);
            rule__DataType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__5_in_rule__DataType__Group__43129);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1571:1: rule__DataType__Group__4__Impl : ( '{' ) ;
    public final void rule__DataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1575:1: ( ( '{' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1576:1: ( '{' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1576:1: ( '{' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1577:1: '{'
            {
             before(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__DataType__Group__4__Impl3157); 
             after(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_4()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1590:1: rule__DataType__Group__5 : rule__DataType__Group__5__Impl rule__DataType__Group__6 ;
    public final void rule__DataType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1594:1: ( rule__DataType__Group__5__Impl rule__DataType__Group__6 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1595:2: rule__DataType__Group__5__Impl rule__DataType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__5__Impl_in_rule__DataType__Group__53188);
            rule__DataType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__6_in_rule__DataType__Group__53191);
            rule__DataType__Group__6();

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1602:1: rule__DataType__Group__5__Impl : ( ( rule__DataType__Group_5__0 )? ) ;
    public final void rule__DataType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1606:1: ( ( ( rule__DataType__Group_5__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1607:1: ( ( rule__DataType__Group_5__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1607:1: ( ( rule__DataType__Group_5__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1608:1: ( rule__DataType__Group_5__0 )?
            {
             before(grammarAccess.getDataTypeAccess().getGroup_5()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1609:1: ( rule__DataType__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=12 && LA17_0<=15)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1609:2: rule__DataType__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_5__0_in_rule__DataType__Group__5__Impl3218);
                    rule__DataType__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getGroup_5()); 

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


    // $ANTLR start "rule__DataType__Group__6"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1619:1: rule__DataType__Group__6 : rule__DataType__Group__6__Impl ;
    public final void rule__DataType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1623:1: ( rule__DataType__Group__6__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1624:2: rule__DataType__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__6__Impl_in_rule__DataType__Group__63249);
            rule__DataType__Group__6__Impl();

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
    // $ANTLR end "rule__DataType__Group__6"


    // $ANTLR start "rule__DataType__Group__6__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1630:1: rule__DataType__Group__6__Impl : ( '}' ) ;
    public final void rule__DataType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1634:1: ( ( '}' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1635:1: ( '}' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1635:1: ( '}' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1636:1: '}'
            {
             before(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__DataType__Group__6__Impl3277); 
             after(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__DataType__Group__6__Impl"


    // $ANTLR start "rule__DataType__Group_5__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1663:1: rule__DataType__Group_5__0 : rule__DataType__Group_5__0__Impl rule__DataType__Group_5__1 ;
    public final void rule__DataType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1667:1: ( rule__DataType__Group_5__0__Impl rule__DataType__Group_5__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1668:2: rule__DataType__Group_5__0__Impl rule__DataType__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_5__0__Impl_in_rule__DataType__Group_5__03322);
            rule__DataType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_5__1_in_rule__DataType__Group_5__03325);
            rule__DataType__Group_5__1();

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
    // $ANTLR end "rule__DataType__Group_5__0"


    // $ANTLR start "rule__DataType__Group_5__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1675:1: rule__DataType__Group_5__0__Impl : ( ( rule__DataType__AnnotationsAssignment_5_0 ) ) ;
    public final void rule__DataType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1679:1: ( ( ( rule__DataType__AnnotationsAssignment_5_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1680:1: ( ( rule__DataType__AnnotationsAssignment_5_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1680:1: ( ( rule__DataType__AnnotationsAssignment_5_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1681:1: ( rule__DataType__AnnotationsAssignment_5_0 )
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_5_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1682:1: ( rule__DataType__AnnotationsAssignment_5_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1682:2: rule__DataType__AnnotationsAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__AnnotationsAssignment_5_0_in_rule__DataType__Group_5__0__Impl3352);
            rule__DataType__AnnotationsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_5_0()); 

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
    // $ANTLR end "rule__DataType__Group_5__0__Impl"


    // $ANTLR start "rule__DataType__Group_5__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1692:1: rule__DataType__Group_5__1 : rule__DataType__Group_5__1__Impl ;
    public final void rule__DataType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1696:1: ( rule__DataType__Group_5__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1697:2: rule__DataType__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_5__1__Impl_in_rule__DataType__Group_5__13382);
            rule__DataType__Group_5__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_5__1"


    // $ANTLR start "rule__DataType__Group_5__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1703:1: rule__DataType__Group_5__1__Impl : ( ( rule__DataType__AnnotationsAssignment_5_1 )* ) ;
    public final void rule__DataType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1707:1: ( ( ( rule__DataType__AnnotationsAssignment_5_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1708:1: ( ( rule__DataType__AnnotationsAssignment_5_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1708:1: ( ( rule__DataType__AnnotationsAssignment_5_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1709:1: ( rule__DataType__AnnotationsAssignment_5_1 )*
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_5_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1710:1: ( rule__DataType__AnnotationsAssignment_5_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=12 && LA18_0<=15)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1710:2: rule__DataType__AnnotationsAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DataType__AnnotationsAssignment_5_1_in_rule__DataType__Group_5__1__Impl3409);
            	    rule__DataType__AnnotationsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_5_1()); 

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
    // $ANTLR end "rule__DataType__Group_5__1__Impl"


    // $ANTLR start "rule__Package__NameAssignment_2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1725:1: rule__Package__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1729:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1730:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1730:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1731:1: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Package__NameAssignment_23449); 
             after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1740:1: rule__Package__OwnedEntityAssignment_4_0 : ( ruleEntity ) ;
    public final void rule__Package__OwnedEntityAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1744:1: ( ( ruleEntity ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1745:1: ( ruleEntity )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1745:1: ( ruleEntity )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1746:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_4_03480);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1755:1: rule__Package__OwnedEntityAssignment_4_1 : ( ruleEntity ) ;
    public final void rule__Package__OwnedEntityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1759:1: ( ( ruleEntity ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1760:1: ( ruleEntity )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1760:1: ( ruleEntity )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1761:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_4_13511);
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


    // $ANTLR start "rule__Package__SubPackageAssignment_5_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1770:1: rule__Package__SubPackageAssignment_5_0 : ( rulePackage ) ;
    public final void rule__Package__SubPackageAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1774:1: ( ( rulePackage ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1775:1: ( rulePackage )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1775:1: ( rulePackage )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1776:1: rulePackage
            {
             before(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_5_03542);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Package__SubPackageAssignment_5_0"


    // $ANTLR start "rule__Package__SubPackageAssignment_5_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1785:1: rule__Package__SubPackageAssignment_5_1 : ( rulePackage ) ;
    public final void rule__Package__SubPackageAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1789:1: ( ( rulePackage ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1790:1: ( rulePackage )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1790:1: ( rulePackage )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1791:1: rulePackage
            {
             before(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_5_13573);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Package__SubPackageAssignment_5_1"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1800:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1804:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1805:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1805:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1806:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_23604); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__SuperEntityAssignment_3_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1815:1: rule__Entity__SuperEntityAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperEntityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1819:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1820:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1820:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1821:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1822:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1823:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_3_13639); 
             after(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Entity__SuperEntityAssignment_3_1"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_5_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1834:1: rule__Entity__AnnotationsAssignment_5_0 : ( ruleEntityAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1838:1: ( ( ruleEntityAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1839:1: ( ruleEntityAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1839:1: ( ruleEntityAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1840:1: ruleEntityAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_5_03674);
            ruleEntityAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Entity__AnnotationsAssignment_5_0"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_5_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1849:1: rule__Entity__AnnotationsAssignment_5_1 : ( ruleEntityAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1853:1: ( ( ruleEntityAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1854:1: ( ruleEntityAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1854:1: ( ruleEntityAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1855:1: ruleEntityAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_5_13705);
            ruleEntityAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Entity__AnnotationsAssignment_5_1"


    // $ANTLR start "rule__Entity__OwnedFeatureAssignment_6_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1864:1: rule__Entity__OwnedFeatureAssignment_6_0 : ( ruleFeature ) ;
    public final void rule__Entity__OwnedFeatureAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1868:1: ( ( ruleFeature ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1869:1: ( ruleFeature )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1869:1: ( ruleFeature )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1870:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_6_03736);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1879:1: rule__Entity__OwnedFeatureAssignment_6_1 : ( ruleFeature ) ;
    public final void rule__Entity__OwnedFeatureAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1883:1: ( ( ruleFeature ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1884:1: ( ruleFeature )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1884:1: ( ruleFeature )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1885:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_6_13767);
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


    // $ANTLR start "rule__Ref__NameAssignment_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1894:1: rule__Ref__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ref__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1898:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1899:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1899:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1900:1: RULE_ID
            {
             before(grammarAccess.getRefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Ref__NameAssignment_13798); 
             after(grammarAccess.getRefAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Ref__NameAssignment_1"


    // $ANTLR start "rule__Ref__RefToAssignment_2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1909:1: rule__Ref__RefToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Ref__RefToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1913:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1914:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1914:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1915:1: ( RULE_ID )
            {
             before(grammarAccess.getRefAccess().getRefToEntityCrossReference_2_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1916:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1917:1: RULE_ID
            {
             before(grammarAccess.getRefAccess().getRefToEntityIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Ref__RefToAssignment_23833); 
             after(grammarAccess.getRefAccess().getRefToEntityIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRefAccess().getRefToEntityCrossReference_2_0()); 

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
    // $ANTLR end "rule__Ref__RefToAssignment_2"


    // $ANTLR start "rule__Ref__ManyAssignment_3"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1928:1: rule__Ref__ManyAssignment_3 : ( ( '[]' ) ) ;
    public final void rule__Ref__ManyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1932:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1933:1: ( ( '[]' ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1933:1: ( ( '[]' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1934:1: ( '[]' )
            {
             before(grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1935:1: ( '[]' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1936:1: '[]'
            {
             before(grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Ref__ManyAssignment_33873); 
             after(grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_3_0()); 

            }

             after(grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_3_0()); 

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
    // $ANTLR end "rule__Ref__ManyAssignment_3"


    // $ANTLR start "rule__Ref__AnnotationsAssignment_5_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1951:1: rule__Ref__AnnotationsAssignment_5_0 : ( ruleFetureAnnotation ) ;
    public final void rule__Ref__AnnotationsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1955:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1956:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1956:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1957:1: ruleFetureAnnotation
            {
             before(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_5_03912);
            ruleFetureAnnotation();

            state._fsp--;

             after(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Ref__AnnotationsAssignment_5_0"


    // $ANTLR start "rule__Ref__AnnotationsAssignment_5_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1966:1: rule__Ref__AnnotationsAssignment_5_1 : ( ruleFetureAnnotation ) ;
    public final void rule__Ref__AnnotationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1970:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1971:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1971:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1972:1: ruleFetureAnnotation
            {
             before(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_5_13943);
            ruleFetureAnnotation();

            state._fsp--;

             after(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Ref__AnnotationsAssignment_5_1"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1981:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1985:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1986:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1986:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1987:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_13974); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__DataType__TypeAssignment_2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1996:1: rule__DataType__TypeAssignment_2 : ( ruleDataTypes ) ;
    public final void rule__DataType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2000:1: ( ( ruleDataTypes ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2001:1: ( ruleDataTypes )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2001:1: ( ruleDataTypes )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2002:1: ruleDataTypes
            {
             before(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataTypes_in_rule__DataType__TypeAssignment_24005);
            ruleDataTypes();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__DataType__TypeAssignment_2"


    // $ANTLR start "rule__DataType__ManyAssignment_3"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2011:1: rule__DataType__ManyAssignment_3 : ( ( '[]' ) ) ;
    public final void rule__DataType__ManyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2015:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2016:1: ( ( '[]' ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2016:1: ( ( '[]' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2017:1: ( '[]' )
            {
             before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2018:1: ( '[]' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2019:1: '[]'
            {
             before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__DataType__ManyAssignment_34041); 
             after(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_3_0()); 

            }

             after(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_3_0()); 

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
    // $ANTLR end "rule__DataType__ManyAssignment_3"


    // $ANTLR start "rule__DataType__AnnotationsAssignment_5_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2034:1: rule__DataType__AnnotationsAssignment_5_0 : ( ruleFetureAnnotation ) ;
    public final void rule__DataType__AnnotationsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2038:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2039:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2039:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2040:1: ruleFetureAnnotation
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_5_04080);
            ruleFetureAnnotation();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__DataType__AnnotationsAssignment_5_0"


    // $ANTLR start "rule__DataType__AnnotationsAssignment_5_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2049:1: rule__DataType__AnnotationsAssignment_5_1 : ( ruleFetureAnnotation ) ;
    public final void rule__DataType__AnnotationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2053:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2054:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2054:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2055:1: ruleFetureAnnotation
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_5_14111);
            ruleFetureAnnotation();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__DataType__AnnotationsAssignment_5_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulePackage_in_entryRulePackage61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRef_in_entryRuleRef241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRef248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__0_in_ruleRef274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataType308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__0_in_ruleDataType334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleEntityAnnotation372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FetureAnnotation__Alternatives_in_ruleFetureAnnotation410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataTypes__Alternatives_in_ruleDataTypes446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRef_in_rule__Feature__Alternatives481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_rule__Feature__Alternatives498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__FetureAnnotation__Alternatives531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__FetureAnnotation__Alternatives552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FetureAnnotation__Alternatives573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__FetureAnnotation__Alternatives594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__DataTypes__Alternatives630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__DataTypes__Alternatives651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__DataTypes__Alternatives672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__DataTypes__Alternatives693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__DataTypes__Alternatives714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__DataTypes__Alternatives735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0768 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1829 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Package__Group__1__Impl860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2891 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__NameAssignment_2_in_rule__Package__Group__2__Impl921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__3951 = new BitSet(new long[]{0x0000000003400000L});
        public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__3954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Package__Group__3__Impl982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41013 = new BitSet(new long[]{0x0000000003400000L});
        public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51074 = new BitSet(new long[]{0x0000000003400000L});
        public static final BitSet FOLLOW_rule__Package__Group__6_in_rule__Package__Group__51077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl1104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Package__Group__6__Impl1163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01208 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__OwnedEntityAssignment_4_0_in_rule__Package__Group_4__0__Impl1238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__11268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__OwnedEntityAssignment_4_1_in_rule__Package__Group_4__1__Impl1295 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__01330 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__01333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__SubPackageAssignment_5_0_in_rule__Package__Group_5__0__Impl1360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__11390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__SubPackageAssignment_5_1_in_rule__Package__Group_5__1__Impl1417 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01452 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11513 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Entity__Group__1__Impl1544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21575 = new BitSet(new long[]{0x0000000004800000L});
        public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl1605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31635 = new BitSet(new long[]{0x0000000004800000L});
        public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl1665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41696 = new BitSet(new long[]{0x0000000009000800L});
        public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Entity__Group__4__Impl1727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51758 = new BitSet(new long[]{0x0000000009000800L});
        public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl1788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61819 = new BitSet(new long[]{0x0000000009000800L});
        public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__0_in_rule__Entity__Group__6__Impl1849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Entity__Group__7__Impl1908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__01955 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__01958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Entity__Group_3__0__Impl1986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__SuperEntityAssignment_3_1_in_rule__Entity__Group_3__1__Impl2044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02078 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_5_0_in_rule__Entity__Group_5__0__Impl2108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_5_1_in_rule__Entity__Group_5__1__Impl2165 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__0__Impl_in_rule__Entity__Group_6__02200 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__1_in_rule__Entity__Group_6__02203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__OwnedFeatureAssignment_6_0_in_rule__Entity__Group_6__0__Impl2230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__1__Impl_in_rule__Entity__Group_6__12260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__OwnedFeatureAssignment_6_1_in_rule__Entity__Group_6__1__Impl2287 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__02322 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__02325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Ref__Group__0__Impl2353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__12384 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__12387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__NameAssignment_1_in_rule__Ref__Group__1__Impl2414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__22444 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__22447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__RefToAssignment_2_in_rule__Ref__Group__2__Impl2474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__32504 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__32507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__ManyAssignment_3_in_rule__Ref__Group__3__Impl2534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__42565 = new BitSet(new long[]{0x000000000100F000L});
        public static final BitSet FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__42568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Ref__Group__4__Impl2596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__52627 = new BitSet(new long[]{0x000000000100F000L});
        public static final BitSet FOLLOW_rule__Ref__Group__6_in_rule__Ref__Group__52630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_5__0_in_rule__Ref__Group__5__Impl2657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__6__Impl_in_rule__Ref__Group__62688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Ref__Group__6__Impl2716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_5__0__Impl_in_rule__Ref__Group_5__02761 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__Ref__Group_5__1_in_rule__Ref__Group_5__02764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__AnnotationsAssignment_5_0_in_rule__Ref__Group_5__0__Impl2791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_5__1__Impl_in_rule__Ref__Group_5__12821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__AnnotationsAssignment_5_1_in_rule__Ref__Group_5__1__Impl2848 = new BitSet(new long[]{0x000000000000F002L});
        public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__02883 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__02886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__DataType__Group__0__Impl2914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__12945 = new BitSet(new long[]{0x00000000003F0000L});
        public static final BitSet FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__12948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl2975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__23005 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__23008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__TypeAssignment_2_in_rule__DataType__Group__2__Impl3035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__33065 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__33068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__ManyAssignment_3_in_rule__DataType__Group__3__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__43126 = new BitSet(new long[]{0x000000000100F000L});
        public static final BitSet FOLLOW_rule__DataType__Group__5_in_rule__DataType__Group__43129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__DataType__Group__4__Impl3157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__5__Impl_in_rule__DataType__Group__53188 = new BitSet(new long[]{0x000000000100F000L});
        public static final BitSet FOLLOW_rule__DataType__Group__6_in_rule__DataType__Group__53191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_5__0_in_rule__DataType__Group__5__Impl3218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__6__Impl_in_rule__DataType__Group__63249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__DataType__Group__6__Impl3277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_5__0__Impl_in_rule__DataType__Group_5__03322 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__DataType__Group_5__1_in_rule__DataType__Group_5__03325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__AnnotationsAssignment_5_0_in_rule__DataType__Group_5__0__Impl3352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_5__1__Impl_in_rule__DataType__Group_5__13382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__AnnotationsAssignment_5_1_in_rule__DataType__Group_5__1__Impl3409 = new BitSet(new long[]{0x000000000000F002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_23449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_4_03480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_4_13511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_5_03542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_5_13573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_23604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_3_13639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_5_03674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_5_13705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_6_03736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_6_13767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Ref__NameAssignment_13798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Ref__RefToAssignment_23833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Ref__ManyAssignment_33873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_5_03912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_5_13943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_13974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataTypes_in_rule__DataType__TypeAssignment_24005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__DataType__ManyAssignment_34041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_5_04080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_5_14111 = new BitSet(new long[]{0x0000000000000002L});
    }


}