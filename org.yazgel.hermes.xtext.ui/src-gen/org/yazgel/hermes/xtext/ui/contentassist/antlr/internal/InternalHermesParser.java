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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cache'", "'Index'", "'Id'", "'Load'", "'Ignore'", "'String'", "'Integer'", "'Boolean'", "'Long'", "'Double'", "'Object'", "'Package'", "'{'", "'}'", "'description'", "'Entity'", "':'", "'='", "'Ref'", "'DataType'", "'[]'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=6;
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

            if ( (LA1_0==29) ) {
                alt1=1;
            }
            else if ( (LA1_0==30) ) {
                alt1=2;
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

            if ( (LA5_0==26) ) {
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:552:1: rule__Package__Group__6 : rule__Package__Group__6__Impl rule__Package__Group__7 ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:556:1: ( rule__Package__Group__6__Impl rule__Package__Group__7 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:557:2: rule__Package__Group__6__Impl rule__Package__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61135);
            rule__Package__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__7_in_rule__Package__Group__61138);
            rule__Package__Group__7();

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:564:1: rule__Package__Group__6__Impl : ( ( rule__Package__Group_6__0 )? ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:568:1: ( ( ( rule__Package__Group_6__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:569:1: ( ( rule__Package__Group_6__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:569:1: ( ( rule__Package__Group_6__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:570:1: ( rule__Package__Group_6__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_6()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:571:1: ( rule__Package__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:571:2: rule__Package__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__0_in_rule__Package__Group__6__Impl1165);
                    rule__Package__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_6()); 

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


    // $ANTLR start "rule__Package__Group__7"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:581:1: rule__Package__Group__7 : rule__Package__Group__7__Impl ;
    public final void rule__Package__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:585:1: ( rule__Package__Group__7__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:586:2: rule__Package__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group__7__Impl_in_rule__Package__Group__71196);
            rule__Package__Group__7__Impl();

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
    // $ANTLR end "rule__Package__Group__7"


    // $ANTLR start "rule__Package__Group__7__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:592:1: rule__Package__Group__7__Impl : ( '}' ) ;
    public final void rule__Package__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:596:1: ( ( '}' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:597:1: ( '}' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:597:1: ( '}' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:598:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Package__Group__7__Impl1224); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Package__Group__7__Impl"


    // $ANTLR start "rule__Package__Group_4__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:627:1: rule__Package__Group_4__0 : rule__Package__Group_4__0__Impl rule__Package__Group_4__1 ;
    public final void rule__Package__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:631:1: ( rule__Package__Group_4__0__Impl rule__Package__Group_4__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:632:2: rule__Package__Group_4__0__Impl rule__Package__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01271);
            rule__Package__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01274);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:639:1: rule__Package__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Package__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:643:1: ( ( 'description' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:644:1: ( 'description' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:644:1: ( 'description' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:645:1: 'description'
            {
             before(grammarAccess.getPackageAccess().getDescriptionKeyword_4_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Package__Group_4__0__Impl1302); 
             after(grammarAccess.getPackageAccess().getDescriptionKeyword_4_0()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:658:1: rule__Package__Group_4__1 : rule__Package__Group_4__1__Impl ;
    public final void rule__Package__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:662:1: ( rule__Package__Group_4__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:663:2: rule__Package__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__11333);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:669:1: rule__Package__Group_4__1__Impl : ( ( rule__Package__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Package__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:673:1: ( ( ( rule__Package__DescriptionAssignment_4_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:674:1: ( ( rule__Package__DescriptionAssignment_4_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:674:1: ( ( rule__Package__DescriptionAssignment_4_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:675:1: ( rule__Package__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getPackageAccess().getDescriptionAssignment_4_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:676:1: ( rule__Package__DescriptionAssignment_4_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:676:2: rule__Package__DescriptionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__DescriptionAssignment_4_1_in_rule__Package__Group_4__1__Impl1360);
            rule__Package__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getDescriptionAssignment_4_1()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:690:1: rule__Package__Group_5__0 : rule__Package__Group_5__0__Impl rule__Package__Group_5__1 ;
    public final void rule__Package__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:694:1: ( rule__Package__Group_5__0__Impl rule__Package__Group_5__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:695:2: rule__Package__Group_5__0__Impl rule__Package__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__01394);
            rule__Package__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__01397);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:702:1: rule__Package__Group_5__0__Impl : ( ( rule__Package__OwnedEntityAssignment_5_0 ) ) ;
    public final void rule__Package__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:706:1: ( ( ( rule__Package__OwnedEntityAssignment_5_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:707:1: ( ( rule__Package__OwnedEntityAssignment_5_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:707:1: ( ( rule__Package__OwnedEntityAssignment_5_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:708:1: ( rule__Package__OwnedEntityAssignment_5_0 )
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityAssignment_5_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:709:1: ( rule__Package__OwnedEntityAssignment_5_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:709:2: rule__Package__OwnedEntityAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__OwnedEntityAssignment_5_0_in_rule__Package__Group_5__0__Impl1424);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:719:1: rule__Package__Group_5__1 : rule__Package__Group_5__1__Impl ;
    public final void rule__Package__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:723:1: ( rule__Package__Group_5__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:724:2: rule__Package__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__11454);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:730:1: rule__Package__Group_5__1__Impl : ( ( rule__Package__OwnedEntityAssignment_5_1 )* ) ;
    public final void rule__Package__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:734:1: ( ( ( rule__Package__OwnedEntityAssignment_5_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:735:1: ( ( rule__Package__OwnedEntityAssignment_5_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:735:1: ( ( rule__Package__OwnedEntityAssignment_5_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:736:1: ( rule__Package__OwnedEntityAssignment_5_1 )*
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityAssignment_5_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:737:1: ( rule__Package__OwnedEntityAssignment_5_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:737:2: rule__Package__OwnedEntityAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__OwnedEntityAssignment_5_1_in_rule__Package__Group_5__1__Impl1481);
            	    rule__Package__OwnedEntityAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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


    // $ANTLR start "rule__Package__Group_6__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:751:1: rule__Package__Group_6__0 : rule__Package__Group_6__0__Impl rule__Package__Group_6__1 ;
    public final void rule__Package__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:755:1: ( rule__Package__Group_6__0__Impl rule__Package__Group_6__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:756:2: rule__Package__Group_6__0__Impl rule__Package__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__0__Impl_in_rule__Package__Group_6__01516);
            rule__Package__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__1_in_rule__Package__Group_6__01519);
            rule__Package__Group_6__1();

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
    // $ANTLR end "rule__Package__Group_6__0"


    // $ANTLR start "rule__Package__Group_6__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:763:1: rule__Package__Group_6__0__Impl : ( ( rule__Package__SubPackageAssignment_6_0 ) ) ;
    public final void rule__Package__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:767:1: ( ( ( rule__Package__SubPackageAssignment_6_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:768:1: ( ( rule__Package__SubPackageAssignment_6_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:768:1: ( ( rule__Package__SubPackageAssignment_6_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:769:1: ( rule__Package__SubPackageAssignment_6_0 )
            {
             before(grammarAccess.getPackageAccess().getSubPackageAssignment_6_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:770:1: ( rule__Package__SubPackageAssignment_6_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:770:2: rule__Package__SubPackageAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__SubPackageAssignment_6_0_in_rule__Package__Group_6__0__Impl1546);
            rule__Package__SubPackageAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getSubPackageAssignment_6_0()); 

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
    // $ANTLR end "rule__Package__Group_6__0__Impl"


    // $ANTLR start "rule__Package__Group_6__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:780:1: rule__Package__Group_6__1 : rule__Package__Group_6__1__Impl ;
    public final void rule__Package__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:784:1: ( rule__Package__Group_6__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:785:2: rule__Package__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Package__Group_6__1__Impl_in_rule__Package__Group_6__11576);
            rule__Package__Group_6__1__Impl();

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
    // $ANTLR end "rule__Package__Group_6__1"


    // $ANTLR start "rule__Package__Group_6__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:791:1: rule__Package__Group_6__1__Impl : ( ( rule__Package__SubPackageAssignment_6_1 )* ) ;
    public final void rule__Package__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:795:1: ( ( ( rule__Package__SubPackageAssignment_6_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:796:1: ( ( rule__Package__SubPackageAssignment_6_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:796:1: ( ( rule__Package__SubPackageAssignment_6_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:797:1: ( rule__Package__SubPackageAssignment_6_1 )*
            {
             before(grammarAccess.getPackageAccess().getSubPackageAssignment_6_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:798:1: ( rule__Package__SubPackageAssignment_6_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:798:2: rule__Package__SubPackageAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Package__SubPackageAssignment_6_1_in_rule__Package__Group_6__1__Impl1603);
            	    rule__Package__SubPackageAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getSubPackageAssignment_6_1()); 

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
    // $ANTLR end "rule__Package__Group_6__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:812:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:816:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:817:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01638);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01641);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:824:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:828:1: ( ( () ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:829:1: ( () )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:829:1: ( () )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:830:1: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:831:1: ()
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:833:1: 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:843:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:847:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:848:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11699);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11702);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:855:1: rule__Entity__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:859:1: ( ( 'Entity' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:860:1: ( 'Entity' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:860:1: ( 'Entity' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:861:1: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Entity__Group__1__Impl1730); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:874:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:878:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:879:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21761);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21764);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:886:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:890:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:891:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:891:1: ( ( rule__Entity__NameAssignment_2 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:892:1: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:893:1: ( rule__Entity__NameAssignment_2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:893:2: rule__Entity__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl1791);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:903:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:907:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:908:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31821);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31824);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:915:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__Group_3__0 )? ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:919:1: ( ( ( rule__Entity__Group_3__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:920:1: ( ( rule__Entity__Group_3__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:920:1: ( ( rule__Entity__Group_3__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:921:1: ( rule__Entity__Group_3__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_3()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:922:1: ( rule__Entity__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:922:2: rule__Entity__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl1851);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:932:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:936:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:937:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41882);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41885);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:944:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:948:1: ( ( '{' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:949:1: ( '{' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:949:1: ( '{' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:950:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Entity__Group__4__Impl1913); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:963:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:967:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:968:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51944);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51947);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:975:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__Group_5__0 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:979:1: ( ( ( rule__Entity__Group_5__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:980:1: ( ( rule__Entity__Group_5__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:980:1: ( ( rule__Entity__Group_5__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:981:1: ( rule__Entity__Group_5__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_5()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:982:1: ( rule__Entity__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:982:2: rule__Entity__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl1974);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:992:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:996:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:997:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62005);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__62008);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1004:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__Group_6__0 )? ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1008:1: ( ( ( rule__Entity__Group_6__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1009:1: ( ( rule__Entity__Group_6__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1009:1: ( ( rule__Entity__Group_6__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1010:1: ( rule__Entity__Group_6__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_6()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1011:1: ( rule__Entity__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==11) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1011:2: rule__Entity__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__0_in_rule__Entity__Group__6__Impl2035);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1021:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1025:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1026:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__72066);
            rule__Entity__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__72069);
            rule__Entity__Group__8();

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1033:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__Group_7__0 )? ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1037:1: ( ( ( rule__Entity__Group_7__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1038:1: ( ( rule__Entity__Group_7__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1038:1: ( ( rule__Entity__Group_7__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1039:1: ( rule__Entity__Group_7__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_7()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1040:1: ( rule__Entity__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=29 && LA12_0<=30)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1040:2: rule__Entity__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__0_in_rule__Entity__Group__7__Impl2096);
                    rule__Entity__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_7()); 

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


    // $ANTLR start "rule__Entity__Group__8"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1050:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1054:1: ( rule__Entity__Group__8__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1055:2: rule__Entity__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__82127);
            rule__Entity__Group__8__Impl();

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
    // $ANTLR end "rule__Entity__Group__8"


    // $ANTLR start "rule__Entity__Group__8__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1061:1: rule__Entity__Group__8__Impl : ( '}' ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1065:1: ( ( '}' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1066:1: ( '}' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1066:1: ( '}' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1067:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Entity__Group__8__Impl2155); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Entity__Group__8__Impl"


    // $ANTLR start "rule__Entity__Group_3__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1098:1: rule__Entity__Group_3__0 : rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 ;
    public final void rule__Entity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1102:1: ( rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1103:2: rule__Entity__Group_3__0__Impl rule__Entity__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__02204);
            rule__Entity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__02207);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1110:1: rule__Entity__Group_3__0__Impl : ( ':' ) ;
    public final void rule__Entity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1114:1: ( ( ':' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1115:1: ( ':' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1115:1: ( ':' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1116:1: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_3_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Entity__Group_3__0__Impl2235); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1129:1: rule__Entity__Group_3__1 : rule__Entity__Group_3__1__Impl ;
    public final void rule__Entity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1133:1: ( rule__Entity__Group_3__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1134:2: rule__Entity__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12266);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1140:1: rule__Entity__Group_3__1__Impl : ( ( rule__Entity__SuperEntityAssignment_3_1 ) ) ;
    public final void rule__Entity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1144:1: ( ( ( rule__Entity__SuperEntityAssignment_3_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1145:1: ( ( rule__Entity__SuperEntityAssignment_3_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1145:1: ( ( rule__Entity__SuperEntityAssignment_3_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1146:1: ( rule__Entity__SuperEntityAssignment_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityAssignment_3_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1147:1: ( rule__Entity__SuperEntityAssignment_3_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1147:2: rule__Entity__SuperEntityAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__SuperEntityAssignment_3_1_in_rule__Entity__Group_3__1__Impl2293);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1161:1: rule__Entity__Group_5__0 : rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 ;
    public final void rule__Entity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1165:1: ( rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1166:2: rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02327);
            rule__Entity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02330);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1173:1: rule__Entity__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__Entity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1177:1: ( ( 'description' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1178:1: ( 'description' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1178:1: ( 'description' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1179:1: 'description'
            {
             before(grammarAccess.getEntityAccess().getDescriptionKeyword_5_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Entity__Group_5__0__Impl2358); 
             after(grammarAccess.getEntityAccess().getDescriptionKeyword_5_0()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1192:1: rule__Entity__Group_5__1 : rule__Entity__Group_5__1__Impl rule__Entity__Group_5__2 ;
    public final void rule__Entity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1196:1: ( rule__Entity__Group_5__1__Impl rule__Entity__Group_5__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1197:2: rule__Entity__Group_5__1__Impl rule__Entity__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12389);
            rule__Entity__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_5__2_in_rule__Entity__Group_5__12392);
            rule__Entity__Group_5__2();

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1204:1: rule__Entity__Group_5__1__Impl : ( '=' ) ;
    public final void rule__Entity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1208:1: ( ( '=' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1209:1: ( '=' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1209:1: ( '=' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1210:1: '='
            {
             before(grammarAccess.getEntityAccess().getEqualsSignKeyword_5_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Entity__Group_5__1__Impl2420); 
             after(grammarAccess.getEntityAccess().getEqualsSignKeyword_5_1()); 

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


    // $ANTLR start "rule__Entity__Group_5__2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1223:1: rule__Entity__Group_5__2 : rule__Entity__Group_5__2__Impl ;
    public final void rule__Entity__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1227:1: ( rule__Entity__Group_5__2__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1228:2: rule__Entity__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_5__2__Impl_in_rule__Entity__Group_5__22451);
            rule__Entity__Group_5__2__Impl();

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
    // $ANTLR end "rule__Entity__Group_5__2"


    // $ANTLR start "rule__Entity__Group_5__2__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1234:1: rule__Entity__Group_5__2__Impl : ( ( rule__Entity__DescriptionAssignment_5_2 ) ) ;
    public final void rule__Entity__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1238:1: ( ( ( rule__Entity__DescriptionAssignment_5_2 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1239:1: ( ( rule__Entity__DescriptionAssignment_5_2 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1239:1: ( ( rule__Entity__DescriptionAssignment_5_2 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1240:1: ( rule__Entity__DescriptionAssignment_5_2 )
            {
             before(grammarAccess.getEntityAccess().getDescriptionAssignment_5_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1241:1: ( rule__Entity__DescriptionAssignment_5_2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1241:2: rule__Entity__DescriptionAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__DescriptionAssignment_5_2_in_rule__Entity__Group_5__2__Impl2478);
            rule__Entity__DescriptionAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getDescriptionAssignment_5_2()); 

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
    // $ANTLR end "rule__Entity__Group_5__2__Impl"


    // $ANTLR start "rule__Entity__Group_6__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1257:1: rule__Entity__Group_6__0 : rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 ;
    public final void rule__Entity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1261:1: ( rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1262:2: rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__0__Impl_in_rule__Entity__Group_6__02514);
            rule__Entity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__1_in_rule__Entity__Group_6__02517);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1269:1: rule__Entity__Group_6__0__Impl : ( ( rule__Entity__AnnotationsAssignment_6_0 ) ) ;
    public final void rule__Entity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1273:1: ( ( ( rule__Entity__AnnotationsAssignment_6_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1274:1: ( ( rule__Entity__AnnotationsAssignment_6_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1274:1: ( ( rule__Entity__AnnotationsAssignment_6_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1275:1: ( rule__Entity__AnnotationsAssignment_6_0 )
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_6_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1276:1: ( rule__Entity__AnnotationsAssignment_6_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1276:2: rule__Entity__AnnotationsAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__AnnotationsAssignment_6_0_in_rule__Entity__Group_6__0__Impl2544);
            rule__Entity__AnnotationsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAnnotationsAssignment_6_0()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1286:1: rule__Entity__Group_6__1 : rule__Entity__Group_6__1__Impl ;
    public final void rule__Entity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1290:1: ( rule__Entity__Group_6__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1291:2: rule__Entity__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__1__Impl_in_rule__Entity__Group_6__12574);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1297:1: rule__Entity__Group_6__1__Impl : ( ( rule__Entity__AnnotationsAssignment_6_1 )* ) ;
    public final void rule__Entity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1301:1: ( ( ( rule__Entity__AnnotationsAssignment_6_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1302:1: ( ( rule__Entity__AnnotationsAssignment_6_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1302:1: ( ( rule__Entity__AnnotationsAssignment_6_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1303:1: ( rule__Entity__AnnotationsAssignment_6_1 )*
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_6_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1304:1: ( rule__Entity__AnnotationsAssignment_6_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==11) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1304:2: rule__Entity__AnnotationsAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__AnnotationsAssignment_6_1_in_rule__Entity__Group_6__1__Impl2601);
            	    rule__Entity__AnnotationsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAnnotationsAssignment_6_1()); 

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


    // $ANTLR start "rule__Entity__Group_7__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1318:1: rule__Entity__Group_7__0 : rule__Entity__Group_7__0__Impl rule__Entity__Group_7__1 ;
    public final void rule__Entity__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1322:1: ( rule__Entity__Group_7__0__Impl rule__Entity__Group_7__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1323:2: rule__Entity__Group_7__0__Impl rule__Entity__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__0__Impl_in_rule__Entity__Group_7__02636);
            rule__Entity__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__1_in_rule__Entity__Group_7__02639);
            rule__Entity__Group_7__1();

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
    // $ANTLR end "rule__Entity__Group_7__0"


    // $ANTLR start "rule__Entity__Group_7__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1330:1: rule__Entity__Group_7__0__Impl : ( ( rule__Entity__OwnedFeatureAssignment_7_0 ) ) ;
    public final void rule__Entity__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1334:1: ( ( ( rule__Entity__OwnedFeatureAssignment_7_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1335:1: ( ( rule__Entity__OwnedFeatureAssignment_7_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1335:1: ( ( rule__Entity__OwnedFeatureAssignment_7_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1336:1: ( rule__Entity__OwnedFeatureAssignment_7_0 )
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_7_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1337:1: ( rule__Entity__OwnedFeatureAssignment_7_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1337:2: rule__Entity__OwnedFeatureAssignment_7_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__OwnedFeatureAssignment_7_0_in_rule__Entity__Group_7__0__Impl2666);
            rule__Entity__OwnedFeatureAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_7_0()); 

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
    // $ANTLR end "rule__Entity__Group_7__0__Impl"


    // $ANTLR start "rule__Entity__Group_7__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1347:1: rule__Entity__Group_7__1 : rule__Entity__Group_7__1__Impl ;
    public final void rule__Entity__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1351:1: ( rule__Entity__Group_7__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1352:2: rule__Entity__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__1__Impl_in_rule__Entity__Group_7__12696);
            rule__Entity__Group_7__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_7__1"


    // $ANTLR start "rule__Entity__Group_7__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1358:1: rule__Entity__Group_7__1__Impl : ( ( rule__Entity__OwnedFeatureAssignment_7_1 )* ) ;
    public final void rule__Entity__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1362:1: ( ( ( rule__Entity__OwnedFeatureAssignment_7_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1363:1: ( ( rule__Entity__OwnedFeatureAssignment_7_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1363:1: ( ( rule__Entity__OwnedFeatureAssignment_7_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1364:1: ( rule__Entity__OwnedFeatureAssignment_7_1 )*
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_7_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1365:1: ( rule__Entity__OwnedFeatureAssignment_7_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=29 && LA14_0<=30)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1365:2: rule__Entity__OwnedFeatureAssignment_7_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__OwnedFeatureAssignment_7_1_in_rule__Entity__Group_7__1__Impl2723);
            	    rule__Entity__OwnedFeatureAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_7_1()); 

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
    // $ANTLR end "rule__Entity__Group_7__1__Impl"


    // $ANTLR start "rule__Ref__Group__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1379:1: rule__Ref__Group__0 : rule__Ref__Group__0__Impl rule__Ref__Group__1 ;
    public final void rule__Ref__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1383:1: ( rule__Ref__Group__0__Impl rule__Ref__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1384:2: rule__Ref__Group__0__Impl rule__Ref__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__02758);
            rule__Ref__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__02761);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1391:1: rule__Ref__Group__0__Impl : ( 'Ref' ) ;
    public final void rule__Ref__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1395:1: ( ( 'Ref' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1396:1: ( 'Ref' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1396:1: ( 'Ref' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1397:1: 'Ref'
            {
             before(grammarAccess.getRefAccess().getRefKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Ref__Group__0__Impl2789); 
             after(grammarAccess.getRefAccess().getRefKeyword_0()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1410:1: rule__Ref__Group__1 : rule__Ref__Group__1__Impl rule__Ref__Group__2 ;
    public final void rule__Ref__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1414:1: ( rule__Ref__Group__1__Impl rule__Ref__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1415:2: rule__Ref__Group__1__Impl rule__Ref__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__12820);
            rule__Ref__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__12823);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1422:1: rule__Ref__Group__1__Impl : ( ( rule__Ref__NameAssignment_1 ) ) ;
    public final void rule__Ref__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1426:1: ( ( ( rule__Ref__NameAssignment_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1427:1: ( ( rule__Ref__NameAssignment_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1427:1: ( ( rule__Ref__NameAssignment_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1428:1: ( rule__Ref__NameAssignment_1 )
            {
             before(grammarAccess.getRefAccess().getNameAssignment_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1429:1: ( rule__Ref__NameAssignment_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1429:2: rule__Ref__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__NameAssignment_1_in_rule__Ref__Group__1__Impl2850);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1439:1: rule__Ref__Group__2 : rule__Ref__Group__2__Impl rule__Ref__Group__3 ;
    public final void rule__Ref__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1443:1: ( rule__Ref__Group__2__Impl rule__Ref__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1444:2: rule__Ref__Group__2__Impl rule__Ref__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__22880);
            rule__Ref__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__22883);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1451:1: rule__Ref__Group__2__Impl : ( ( rule__Ref__RefToAssignment_2 ) ) ;
    public final void rule__Ref__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1455:1: ( ( ( rule__Ref__RefToAssignment_2 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1456:1: ( ( rule__Ref__RefToAssignment_2 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1456:1: ( ( rule__Ref__RefToAssignment_2 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1457:1: ( rule__Ref__RefToAssignment_2 )
            {
             before(grammarAccess.getRefAccess().getRefToAssignment_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1458:1: ( rule__Ref__RefToAssignment_2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1458:2: rule__Ref__RefToAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__RefToAssignment_2_in_rule__Ref__Group__2__Impl2910);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1468:1: rule__Ref__Group__3 : rule__Ref__Group__3__Impl rule__Ref__Group__4 ;
    public final void rule__Ref__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1472:1: ( rule__Ref__Group__3__Impl rule__Ref__Group__4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1473:2: rule__Ref__Group__3__Impl rule__Ref__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__32940);
            rule__Ref__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__32943);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1480:1: rule__Ref__Group__3__Impl : ( ( rule__Ref__ManyAssignment_3 )? ) ;
    public final void rule__Ref__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1484:1: ( ( ( rule__Ref__ManyAssignment_3 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1485:1: ( ( rule__Ref__ManyAssignment_3 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1485:1: ( ( rule__Ref__ManyAssignment_3 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1486:1: ( rule__Ref__ManyAssignment_3 )?
            {
             before(grammarAccess.getRefAccess().getManyAssignment_3()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1487:1: ( rule__Ref__ManyAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1487:2: rule__Ref__ManyAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ref__ManyAssignment_3_in_rule__Ref__Group__3__Impl2970);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1497:1: rule__Ref__Group__4 : rule__Ref__Group__4__Impl rule__Ref__Group__5 ;
    public final void rule__Ref__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1501:1: ( rule__Ref__Group__4__Impl rule__Ref__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1502:2: rule__Ref__Group__4__Impl rule__Ref__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__43001);
            rule__Ref__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__43004);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1509:1: rule__Ref__Group__4__Impl : ( '{' ) ;
    public final void rule__Ref__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1513:1: ( ( '{' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1514:1: ( '{' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1514:1: ( '{' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1515:1: '{'
            {
             before(grammarAccess.getRefAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Ref__Group__4__Impl3032); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1528:1: rule__Ref__Group__5 : rule__Ref__Group__5__Impl rule__Ref__Group__6 ;
    public final void rule__Ref__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1532:1: ( rule__Ref__Group__5__Impl rule__Ref__Group__6 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1533:2: rule__Ref__Group__5__Impl rule__Ref__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__53063);
            rule__Ref__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__6_in_rule__Ref__Group__53066);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1540:1: rule__Ref__Group__5__Impl : ( ( rule__Ref__Group_5__0 )? ) ;
    public final void rule__Ref__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1544:1: ( ( ( rule__Ref__Group_5__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1545:1: ( ( rule__Ref__Group_5__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1545:1: ( ( rule__Ref__Group_5__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1546:1: ( rule__Ref__Group_5__0 )?
            {
             before(grammarAccess.getRefAccess().getGroup_5()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1547:1: ( rule__Ref__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1547:2: rule__Ref__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_5__0_in_rule__Ref__Group__5__Impl3093);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1557:1: rule__Ref__Group__6 : rule__Ref__Group__6__Impl rule__Ref__Group__7 ;
    public final void rule__Ref__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1561:1: ( rule__Ref__Group__6__Impl rule__Ref__Group__7 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1562:2: rule__Ref__Group__6__Impl rule__Ref__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__6__Impl_in_rule__Ref__Group__63124);
            rule__Ref__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__7_in_rule__Ref__Group__63127);
            rule__Ref__Group__7();

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1569:1: rule__Ref__Group__6__Impl : ( ( rule__Ref__Group_6__0 )? ) ;
    public final void rule__Ref__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1573:1: ( ( ( rule__Ref__Group_6__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1574:1: ( ( rule__Ref__Group_6__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1574:1: ( ( rule__Ref__Group_6__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1575:1: ( rule__Ref__Group_6__0 )?
            {
             before(grammarAccess.getRefAccess().getGroup_6()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1576:1: ( rule__Ref__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=12 && LA17_0<=15)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1576:2: rule__Ref__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_6__0_in_rule__Ref__Group__6__Impl3154);
                    rule__Ref__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRefAccess().getGroup_6()); 

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


    // $ANTLR start "rule__Ref__Group__7"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1586:1: rule__Ref__Group__7 : rule__Ref__Group__7__Impl ;
    public final void rule__Ref__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1590:1: ( rule__Ref__Group__7__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1591:2: rule__Ref__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__7__Impl_in_rule__Ref__Group__73185);
            rule__Ref__Group__7__Impl();

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
    // $ANTLR end "rule__Ref__Group__7"


    // $ANTLR start "rule__Ref__Group__7__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1597:1: rule__Ref__Group__7__Impl : ( '}' ) ;
    public final void rule__Ref__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1601:1: ( ( '}' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1602:1: ( '}' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1602:1: ( '}' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1603:1: '}'
            {
             before(grammarAccess.getRefAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Ref__Group__7__Impl3213); 
             after(grammarAccess.getRefAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Ref__Group__7__Impl"


    // $ANTLR start "rule__Ref__Group_5__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1632:1: rule__Ref__Group_5__0 : rule__Ref__Group_5__0__Impl rule__Ref__Group_5__1 ;
    public final void rule__Ref__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1636:1: ( rule__Ref__Group_5__0__Impl rule__Ref__Group_5__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1637:2: rule__Ref__Group_5__0__Impl rule__Ref__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_5__0__Impl_in_rule__Ref__Group_5__03260);
            rule__Ref__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_5__1_in_rule__Ref__Group_5__03263);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1644:1: rule__Ref__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__Ref__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1648:1: ( ( 'description' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1649:1: ( 'description' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1649:1: ( 'description' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1650:1: 'description'
            {
             before(grammarAccess.getRefAccess().getDescriptionKeyword_5_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Ref__Group_5__0__Impl3291); 
             after(grammarAccess.getRefAccess().getDescriptionKeyword_5_0()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1663:1: rule__Ref__Group_5__1 : rule__Ref__Group_5__1__Impl ;
    public final void rule__Ref__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1667:1: ( rule__Ref__Group_5__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1668:2: rule__Ref__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_5__1__Impl_in_rule__Ref__Group_5__13322);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1674:1: rule__Ref__Group_5__1__Impl : ( ( rule__Ref__DescriptionAssignment_5_1 ) ) ;
    public final void rule__Ref__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1678:1: ( ( ( rule__Ref__DescriptionAssignment_5_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1679:1: ( ( rule__Ref__DescriptionAssignment_5_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1679:1: ( ( rule__Ref__DescriptionAssignment_5_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1680:1: ( rule__Ref__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getRefAccess().getDescriptionAssignment_5_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1681:1: ( rule__Ref__DescriptionAssignment_5_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1681:2: rule__Ref__DescriptionAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__DescriptionAssignment_5_1_in_rule__Ref__Group_5__1__Impl3349);
            rule__Ref__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getDescriptionAssignment_5_1()); 

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


    // $ANTLR start "rule__Ref__Group_6__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1695:1: rule__Ref__Group_6__0 : rule__Ref__Group_6__0__Impl rule__Ref__Group_6__1 ;
    public final void rule__Ref__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1699:1: ( rule__Ref__Group_6__0__Impl rule__Ref__Group_6__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1700:2: rule__Ref__Group_6__0__Impl rule__Ref__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_6__0__Impl_in_rule__Ref__Group_6__03383);
            rule__Ref__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_6__1_in_rule__Ref__Group_6__03386);
            rule__Ref__Group_6__1();

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
    // $ANTLR end "rule__Ref__Group_6__0"


    // $ANTLR start "rule__Ref__Group_6__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1707:1: rule__Ref__Group_6__0__Impl : ( ( rule__Ref__AnnotationsAssignment_6_0 ) ) ;
    public final void rule__Ref__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1711:1: ( ( ( rule__Ref__AnnotationsAssignment_6_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1712:1: ( ( rule__Ref__AnnotationsAssignment_6_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1712:1: ( ( rule__Ref__AnnotationsAssignment_6_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1713:1: ( rule__Ref__AnnotationsAssignment_6_0 )
            {
             before(grammarAccess.getRefAccess().getAnnotationsAssignment_6_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1714:1: ( rule__Ref__AnnotationsAssignment_6_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1714:2: rule__Ref__AnnotationsAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__AnnotationsAssignment_6_0_in_rule__Ref__Group_6__0__Impl3413);
            rule__Ref__AnnotationsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getAnnotationsAssignment_6_0()); 

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
    // $ANTLR end "rule__Ref__Group_6__0__Impl"


    // $ANTLR start "rule__Ref__Group_6__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1724:1: rule__Ref__Group_6__1 : rule__Ref__Group_6__1__Impl ;
    public final void rule__Ref__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1728:1: ( rule__Ref__Group_6__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1729:2: rule__Ref__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_6__1__Impl_in_rule__Ref__Group_6__13443);
            rule__Ref__Group_6__1__Impl();

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
    // $ANTLR end "rule__Ref__Group_6__1"


    // $ANTLR start "rule__Ref__Group_6__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1735:1: rule__Ref__Group_6__1__Impl : ( ( rule__Ref__AnnotationsAssignment_6_1 )* ) ;
    public final void rule__Ref__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1739:1: ( ( ( rule__Ref__AnnotationsAssignment_6_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1740:1: ( ( rule__Ref__AnnotationsAssignment_6_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1740:1: ( ( rule__Ref__AnnotationsAssignment_6_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1741:1: ( rule__Ref__AnnotationsAssignment_6_1 )*
            {
             before(grammarAccess.getRefAccess().getAnnotationsAssignment_6_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1742:1: ( rule__Ref__AnnotationsAssignment_6_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=12 && LA18_0<=15)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1742:2: rule__Ref__AnnotationsAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ref__AnnotationsAssignment_6_1_in_rule__Ref__Group_6__1__Impl3470);
            	    rule__Ref__AnnotationsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getRefAccess().getAnnotationsAssignment_6_1()); 

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
    // $ANTLR end "rule__Ref__Group_6__1__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1756:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1760:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1761:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03505);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03508);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1768:1: rule__DataType__Group__0__Impl : ( 'DataType' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1772:1: ( ( 'DataType' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1773:1: ( 'DataType' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1773:1: ( 'DataType' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1774:1: 'DataType'
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeKeyword_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__DataType__Group__0__Impl3536); 
             after(grammarAccess.getDataTypeAccess().getDataTypeKeyword_0()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1787:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1791:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1792:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13567);
            rule__DataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__13570);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1799:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1803:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1804:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1804:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1805:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1806:1: ( rule__DataType__NameAssignment_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1806:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl3597);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1816:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl rule__DataType__Group__3 ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1820:1: ( rule__DataType__Group__2__Impl rule__DataType__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1821:2: rule__DataType__Group__2__Impl rule__DataType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__23627);
            rule__DataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__23630);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1828:1: rule__DataType__Group__2__Impl : ( ( rule__DataType__TypeAssignment_2 ) ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1832:1: ( ( ( rule__DataType__TypeAssignment_2 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1833:1: ( ( rule__DataType__TypeAssignment_2 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1833:1: ( ( rule__DataType__TypeAssignment_2 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1834:1: ( rule__DataType__TypeAssignment_2 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1835:1: ( rule__DataType__TypeAssignment_2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1835:2: rule__DataType__TypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__TypeAssignment_2_in_rule__DataType__Group__2__Impl3657);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1845:1: rule__DataType__Group__3 : rule__DataType__Group__3__Impl rule__DataType__Group__4 ;
    public final void rule__DataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1849:1: ( rule__DataType__Group__3__Impl rule__DataType__Group__4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1850:2: rule__DataType__Group__3__Impl rule__DataType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__33687);
            rule__DataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__33690);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1857:1: rule__DataType__Group__3__Impl : ( ( rule__DataType__ManyAssignment_3 )? ) ;
    public final void rule__DataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1861:1: ( ( ( rule__DataType__ManyAssignment_3 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1862:1: ( ( rule__DataType__ManyAssignment_3 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1862:1: ( ( rule__DataType__ManyAssignment_3 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1863:1: ( rule__DataType__ManyAssignment_3 )?
            {
             before(grammarAccess.getDataTypeAccess().getManyAssignment_3()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1864:1: ( rule__DataType__ManyAssignment_3 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1864:2: rule__DataType__ManyAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataType__ManyAssignment_3_in_rule__DataType__Group__3__Impl3717);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1874:1: rule__DataType__Group__4 : rule__DataType__Group__4__Impl rule__DataType__Group__5 ;
    public final void rule__DataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1878:1: ( rule__DataType__Group__4__Impl rule__DataType__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1879:2: rule__DataType__Group__4__Impl rule__DataType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__43748);
            rule__DataType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__5_in_rule__DataType__Group__43751);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1886:1: rule__DataType__Group__4__Impl : ( '{' ) ;
    public final void rule__DataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1890:1: ( ( '{' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1891:1: ( '{' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1891:1: ( '{' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1892:1: '{'
            {
             before(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__DataType__Group__4__Impl3779); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1905:1: rule__DataType__Group__5 : rule__DataType__Group__5__Impl rule__DataType__Group__6 ;
    public final void rule__DataType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1909:1: ( rule__DataType__Group__5__Impl rule__DataType__Group__6 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1910:2: rule__DataType__Group__5__Impl rule__DataType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__5__Impl_in_rule__DataType__Group__53810);
            rule__DataType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__6_in_rule__DataType__Group__53813);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1917:1: rule__DataType__Group__5__Impl : ( ( rule__DataType__Group_5__0 )? ) ;
    public final void rule__DataType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1921:1: ( ( ( rule__DataType__Group_5__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1922:1: ( ( rule__DataType__Group_5__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1922:1: ( ( rule__DataType__Group_5__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1923:1: ( rule__DataType__Group_5__0 )?
            {
             before(grammarAccess.getDataTypeAccess().getGroup_5()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1924:1: ( rule__DataType__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1924:2: rule__DataType__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_5__0_in_rule__DataType__Group__5__Impl3840);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1934:1: rule__DataType__Group__6 : rule__DataType__Group__6__Impl rule__DataType__Group__7 ;
    public final void rule__DataType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1938:1: ( rule__DataType__Group__6__Impl rule__DataType__Group__7 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1939:2: rule__DataType__Group__6__Impl rule__DataType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__6__Impl_in_rule__DataType__Group__63871);
            rule__DataType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__7_in_rule__DataType__Group__63874);
            rule__DataType__Group__7();

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1946:1: rule__DataType__Group__6__Impl : ( ( rule__DataType__Group_6__0 )? ) ;
    public final void rule__DataType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1950:1: ( ( ( rule__DataType__Group_6__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1951:1: ( ( rule__DataType__Group_6__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1951:1: ( ( rule__DataType__Group_6__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1952:1: ( rule__DataType__Group_6__0 )?
            {
             before(grammarAccess.getDataTypeAccess().getGroup_6()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1953:1: ( rule__DataType__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=12 && LA21_0<=15)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1953:2: rule__DataType__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_6__0_in_rule__DataType__Group__6__Impl3901);
                    rule__DataType__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getGroup_6()); 

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


    // $ANTLR start "rule__DataType__Group__7"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1963:1: rule__DataType__Group__7 : rule__DataType__Group__7__Impl ;
    public final void rule__DataType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1967:1: ( rule__DataType__Group__7__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1968:2: rule__DataType__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__7__Impl_in_rule__DataType__Group__73932);
            rule__DataType__Group__7__Impl();

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
    // $ANTLR end "rule__DataType__Group__7"


    // $ANTLR start "rule__DataType__Group__7__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1974:1: rule__DataType__Group__7__Impl : ( '}' ) ;
    public final void rule__DataType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1978:1: ( ( '}' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1979:1: ( '}' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1979:1: ( '}' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1980:1: '}'
            {
             before(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__DataType__Group__7__Impl3960); 
             after(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__DataType__Group__7__Impl"


    // $ANTLR start "rule__DataType__Group_5__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2009:1: rule__DataType__Group_5__0 : rule__DataType__Group_5__0__Impl rule__DataType__Group_5__1 ;
    public final void rule__DataType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2013:1: ( rule__DataType__Group_5__0__Impl rule__DataType__Group_5__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2014:2: rule__DataType__Group_5__0__Impl rule__DataType__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_5__0__Impl_in_rule__DataType__Group_5__04007);
            rule__DataType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_5__1_in_rule__DataType__Group_5__04010);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2021:1: rule__DataType__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__DataType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2025:1: ( ( 'description' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2026:1: ( 'description' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2026:1: ( 'description' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2027:1: 'description'
            {
             before(grammarAccess.getDataTypeAccess().getDescriptionKeyword_5_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__DataType__Group_5__0__Impl4038); 
             after(grammarAccess.getDataTypeAccess().getDescriptionKeyword_5_0()); 

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2040:1: rule__DataType__Group_5__1 : rule__DataType__Group_5__1__Impl ;
    public final void rule__DataType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2044:1: ( rule__DataType__Group_5__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2045:2: rule__DataType__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_5__1__Impl_in_rule__DataType__Group_5__14069);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2051:1: rule__DataType__Group_5__1__Impl : ( ( rule__DataType__DescriptionAssignment_5_1 ) ) ;
    public final void rule__DataType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2055:1: ( ( ( rule__DataType__DescriptionAssignment_5_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2056:1: ( ( rule__DataType__DescriptionAssignment_5_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2056:1: ( ( rule__DataType__DescriptionAssignment_5_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2057:1: ( rule__DataType__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getDataTypeAccess().getDescriptionAssignment_5_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2058:1: ( rule__DataType__DescriptionAssignment_5_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2058:2: rule__DataType__DescriptionAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__DescriptionAssignment_5_1_in_rule__DataType__Group_5__1__Impl4096);
            rule__DataType__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getDescriptionAssignment_5_1()); 

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


    // $ANTLR start "rule__DataType__Group_6__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2072:1: rule__DataType__Group_6__0 : rule__DataType__Group_6__0__Impl rule__DataType__Group_6__1 ;
    public final void rule__DataType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2076:1: ( rule__DataType__Group_6__0__Impl rule__DataType__Group_6__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2077:2: rule__DataType__Group_6__0__Impl rule__DataType__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_6__0__Impl_in_rule__DataType__Group_6__04130);
            rule__DataType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_6__1_in_rule__DataType__Group_6__04133);
            rule__DataType__Group_6__1();

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
    // $ANTLR end "rule__DataType__Group_6__0"


    // $ANTLR start "rule__DataType__Group_6__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2084:1: rule__DataType__Group_6__0__Impl : ( ( rule__DataType__AnnotationsAssignment_6_0 ) ) ;
    public final void rule__DataType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2088:1: ( ( ( rule__DataType__AnnotationsAssignment_6_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2089:1: ( ( rule__DataType__AnnotationsAssignment_6_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2089:1: ( ( rule__DataType__AnnotationsAssignment_6_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2090:1: ( rule__DataType__AnnotationsAssignment_6_0 )
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_6_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2091:1: ( rule__DataType__AnnotationsAssignment_6_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2091:2: rule__DataType__AnnotationsAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__AnnotationsAssignment_6_0_in_rule__DataType__Group_6__0__Impl4160);
            rule__DataType__AnnotationsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_6_0()); 

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
    // $ANTLR end "rule__DataType__Group_6__0__Impl"


    // $ANTLR start "rule__DataType__Group_6__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2101:1: rule__DataType__Group_6__1 : rule__DataType__Group_6__1__Impl ;
    public final void rule__DataType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2105:1: ( rule__DataType__Group_6__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2106:2: rule__DataType__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_6__1__Impl_in_rule__DataType__Group_6__14190);
            rule__DataType__Group_6__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_6__1"


    // $ANTLR start "rule__DataType__Group_6__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2112:1: rule__DataType__Group_6__1__Impl : ( ( rule__DataType__AnnotationsAssignment_6_1 )* ) ;
    public final void rule__DataType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2116:1: ( ( ( rule__DataType__AnnotationsAssignment_6_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2117:1: ( ( rule__DataType__AnnotationsAssignment_6_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2117:1: ( ( rule__DataType__AnnotationsAssignment_6_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2118:1: ( rule__DataType__AnnotationsAssignment_6_1 )*
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_6_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2119:1: ( rule__DataType__AnnotationsAssignment_6_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=12 && LA22_0<=15)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2119:2: rule__DataType__AnnotationsAssignment_6_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DataType__AnnotationsAssignment_6_1_in_rule__DataType__Group_6__1__Impl4217);
            	    rule__DataType__AnnotationsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_6_1()); 

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
    // $ANTLR end "rule__DataType__Group_6__1__Impl"


    // $ANTLR start "rule__Package__NameAssignment_2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2134:1: rule__Package__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2138:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2139:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2139:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2140:1: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Package__NameAssignment_24257); 
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


    // $ANTLR start "rule__Package__DescriptionAssignment_4_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2149:1: rule__Package__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Package__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2153:1: ( ( RULE_STRING ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2154:1: ( RULE_STRING )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2154:1: ( RULE_STRING )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2155:1: RULE_STRING
            {
             before(grammarAccess.getPackageAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Package__DescriptionAssignment_4_14288); 
             after(grammarAccess.getPackageAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Package__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Package__OwnedEntityAssignment_5_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2164:1: rule__Package__OwnedEntityAssignment_5_0 : ( ruleEntity ) ;
    public final void rule__Package__OwnedEntityAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2168:1: ( ( ruleEntity ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2169:1: ( ruleEntity )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2169:1: ( ruleEntity )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2170:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_5_04319);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2179:1: rule__Package__OwnedEntityAssignment_5_1 : ( ruleEntity ) ;
    public final void rule__Package__OwnedEntityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2183:1: ( ( ruleEntity ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2184:1: ( ruleEntity )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2184:1: ( ruleEntity )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2185:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_5_14350);
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


    // $ANTLR start "rule__Package__SubPackageAssignment_6_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2194:1: rule__Package__SubPackageAssignment_6_0 : ( rulePackage ) ;
    public final void rule__Package__SubPackageAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2198:1: ( ( rulePackage ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2199:1: ( rulePackage )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2199:1: ( rulePackage )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2200:1: rulePackage
            {
             before(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_6_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_6_04381);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__Package__SubPackageAssignment_6_0"


    // $ANTLR start "rule__Package__SubPackageAssignment_6_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2209:1: rule__Package__SubPackageAssignment_6_1 : ( rulePackage ) ;
    public final void rule__Package__SubPackageAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2213:1: ( ( rulePackage ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2214:1: ( rulePackage )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2214:1: ( rulePackage )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2215:1: rulePackage
            {
             before(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_6_14412);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Package__SubPackageAssignment_6_1"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2224:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2228:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2229:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2229:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2230:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_24443); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2239:1: rule__Entity__SuperEntityAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperEntityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2243:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2244:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2244:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2245:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2246:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2247:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_3_14478); 
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


    // $ANTLR start "rule__Entity__DescriptionAssignment_5_2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2258:1: rule__Entity__DescriptionAssignment_5_2 : ( RULE_STRING ) ;
    public final void rule__Entity__DescriptionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2262:1: ( ( RULE_STRING ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2263:1: ( RULE_STRING )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2263:1: ( RULE_STRING )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2264:1: RULE_STRING
            {
             before(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_5_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_5_24513); 
             after(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Entity__DescriptionAssignment_5_2"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_6_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2273:1: rule__Entity__AnnotationsAssignment_6_0 : ( ruleEntityAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2277:1: ( ( ruleEntityAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2278:1: ( ruleEntityAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2278:1: ( ruleEntityAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2279:1: ruleEntityAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_6_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_6_04544);
            ruleEntityAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__Entity__AnnotationsAssignment_6_0"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_6_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2288:1: rule__Entity__AnnotationsAssignment_6_1 : ( ruleEntityAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2292:1: ( ( ruleEntityAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2293:1: ( ruleEntityAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2293:1: ( ruleEntityAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2294:1: ruleEntityAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_6_14575);
            ruleEntityAnnotation();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Entity__AnnotationsAssignment_6_1"


    // $ANTLR start "rule__Entity__OwnedFeatureAssignment_7_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2303:1: rule__Entity__OwnedFeatureAssignment_7_0 : ( ruleFeature ) ;
    public final void rule__Entity__OwnedFeatureAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2307:1: ( ( ruleFeature ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2308:1: ( ruleFeature )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2308:1: ( ruleFeature )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2309:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_7_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_7_04606);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_7_0_0()); 

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
    // $ANTLR end "rule__Entity__OwnedFeatureAssignment_7_0"


    // $ANTLR start "rule__Entity__OwnedFeatureAssignment_7_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2318:1: rule__Entity__OwnedFeatureAssignment_7_1 : ( ruleFeature ) ;
    public final void rule__Entity__OwnedFeatureAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2322:1: ( ( ruleFeature ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2323:1: ( ruleFeature )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2323:1: ( ruleFeature )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2324:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_7_14637);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Entity__OwnedFeatureAssignment_7_1"


    // $ANTLR start "rule__Ref__NameAssignment_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2333:1: rule__Ref__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ref__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2337:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2338:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2338:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2339:1: RULE_ID
            {
             before(grammarAccess.getRefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Ref__NameAssignment_14668); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2348:1: rule__Ref__RefToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Ref__RefToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2352:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2353:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2353:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2354:1: ( RULE_ID )
            {
             before(grammarAccess.getRefAccess().getRefToEntityCrossReference_2_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2355:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2356:1: RULE_ID
            {
             before(grammarAccess.getRefAccess().getRefToEntityIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Ref__RefToAssignment_24703); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2367:1: rule__Ref__ManyAssignment_3 : ( ( '[]' ) ) ;
    public final void rule__Ref__ManyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2371:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2372:1: ( ( '[]' ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2372:1: ( ( '[]' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2373:1: ( '[]' )
            {
             before(grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2374:1: ( '[]' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2375:1: '[]'
            {
             before(grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Ref__ManyAssignment_34743); 
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


    // $ANTLR start "rule__Ref__DescriptionAssignment_5_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2390:1: rule__Ref__DescriptionAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Ref__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2394:1: ( ( RULE_STRING ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2395:1: ( RULE_STRING )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2395:1: ( RULE_STRING )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2396:1: RULE_STRING
            {
             before(grammarAccess.getRefAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Ref__DescriptionAssignment_5_14782); 
             after(grammarAccess.getRefAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Ref__DescriptionAssignment_5_1"


    // $ANTLR start "rule__Ref__AnnotationsAssignment_6_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2405:1: rule__Ref__AnnotationsAssignment_6_0 : ( ruleFetureAnnotation ) ;
    public final void rule__Ref__AnnotationsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2409:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2410:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2410:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2411:1: ruleFetureAnnotation
            {
             before(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_6_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_6_04813);
            ruleFetureAnnotation();

            state._fsp--;

             after(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__Ref__AnnotationsAssignment_6_0"


    // $ANTLR start "rule__Ref__AnnotationsAssignment_6_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2420:1: rule__Ref__AnnotationsAssignment_6_1 : ( ruleFetureAnnotation ) ;
    public final void rule__Ref__AnnotationsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2424:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2425:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2425:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2426:1: ruleFetureAnnotation
            {
             before(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_6_14844);
            ruleFetureAnnotation();

            state._fsp--;

             after(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Ref__AnnotationsAssignment_6_1"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2435:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2439:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2440:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2440:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2441:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_14875); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2450:1: rule__DataType__TypeAssignment_2 : ( ruleDataTypes ) ;
    public final void rule__DataType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2454:1: ( ( ruleDataTypes ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2455:1: ( ruleDataTypes )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2455:1: ( ruleDataTypes )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2456:1: ruleDataTypes
            {
             before(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataTypes_in_rule__DataType__TypeAssignment_24906);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2465:1: rule__DataType__ManyAssignment_3 : ( ( '[]' ) ) ;
    public final void rule__DataType__ManyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2469:1: ( ( ( '[]' ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2470:1: ( ( '[]' ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2470:1: ( ( '[]' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2471:1: ( '[]' )
            {
             before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2472:1: ( '[]' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2473:1: '[]'
            {
             before(grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__DataType__ManyAssignment_34942); 
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


    // $ANTLR start "rule__DataType__DescriptionAssignment_5_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2488:1: rule__DataType__DescriptionAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__DataType__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2492:1: ( ( RULE_STRING ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2493:1: ( RULE_STRING )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2493:1: ( RULE_STRING )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2494:1: RULE_STRING
            {
             before(grammarAccess.getDataTypeAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__DataType__DescriptionAssignment_5_14981); 
             after(grammarAccess.getDataTypeAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__DataType__DescriptionAssignment_5_1"


    // $ANTLR start "rule__DataType__AnnotationsAssignment_6_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2503:1: rule__DataType__AnnotationsAssignment_6_0 : ( ruleFetureAnnotation ) ;
    public final void rule__DataType__AnnotationsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2507:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2508:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2508:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2509:1: ruleFetureAnnotation
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_6_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_6_05012);
            ruleFetureAnnotation();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__DataType__AnnotationsAssignment_6_0"


    // $ANTLR start "rule__DataType__AnnotationsAssignment_6_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2518:1: rule__DataType__AnnotationsAssignment_6_1 : ( ruleFetureAnnotation ) ;
    public final void rule__DataType__AnnotationsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2522:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2523:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2523:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2524:1: ruleFetureAnnotation
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_6_15043);
            ruleFetureAnnotation();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__DataType__AnnotationsAssignment_6_1"

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
        public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__3951 = new BitSet(new long[]{0x0000000007400000L});
        public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__3954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Package__Group__3__Impl982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41013 = new BitSet(new long[]{0x0000000007400000L});
        public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0_in_rule__Package__Group__4__Impl1043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51074 = new BitSet(new long[]{0x0000000007400000L});
        public static final BitSet FOLLOW_rule__Package__Group__6_in_rule__Package__Group__51077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__0_in_rule__Package__Group__5__Impl1104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61135 = new BitSet(new long[]{0x0000000007400000L});
        public static final BitSet FOLLOW_rule__Package__Group__7_in_rule__Package__Group__61138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__0_in_rule__Package__Group__6__Impl1165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group__7__Impl_in_rule__Package__Group__71196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Package__Group__7__Impl1224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__0__Impl_in_rule__Package__Group_4__01271 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1_in_rule__Package__Group_4__01274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Package__Group_4__0__Impl1302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_4__1__Impl_in_rule__Package__Group_4__11333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__DescriptionAssignment_4_1_in_rule__Package__Group_4__1__Impl1360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__0__Impl_in_rule__Package__Group_5__01394 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Package__Group_5__1_in_rule__Package__Group_5__01397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__OwnedEntityAssignment_5_0_in_rule__Package__Group_5__0__Impl1424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_5__1__Impl_in_rule__Package__Group_5__11454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__OwnedEntityAssignment_5_1_in_rule__Package__Group_5__1__Impl1481 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__0__Impl_in_rule__Package__Group_6__01516 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Package__Group_6__1_in_rule__Package__Group_6__01519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__SubPackageAssignment_6_0_in_rule__Package__Group_6__0__Impl1546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__Group_6__1__Impl_in_rule__Package__Group_6__11576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Package__SubPackageAssignment_6_1_in_rule__Package__Group_6__1__Impl1603 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01638 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11699 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Entity__Group__1__Impl1730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21761 = new BitSet(new long[]{0x0000000008800000L});
        public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl1791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31821 = new BitSet(new long[]{0x0000000008800000L});
        public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_3__0_in_rule__Entity__Group__3__Impl1851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41882 = new BitSet(new long[]{0x0000000063000800L});
        public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Entity__Group__4__Impl1913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51944 = new BitSet(new long[]{0x0000000063000800L});
        public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62005 = new BitSet(new long[]{0x0000000063000800L});
        public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__62008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__0_in_rule__Entity__Group__6__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__72066 = new BitSet(new long[]{0x0000000063000800L});
        public static final BitSet FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__72069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__0_in_rule__Entity__Group__7__Impl2096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__82127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Entity__Group__8__Impl2155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_3__0__Impl_in_rule__Entity__Group_3__02204 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Entity__Group_3__1_in_rule__Entity__Group_3__02207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Entity__Group_3__0__Impl2235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_3__1__Impl_in_rule__Entity__Group_3__12266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__SuperEntityAssignment_3_1_in_rule__Entity__Group_3__1__Impl2293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02327 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Entity__Group_5__0__Impl2358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12389 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__2_in_rule__Entity__Group_5__12392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Entity__Group_5__1__Impl2420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__2__Impl_in_rule__Entity__Group_5__22451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__DescriptionAssignment_5_2_in_rule__Entity__Group_5__2__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__0__Impl_in_rule__Entity__Group_6__02514 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__1_in_rule__Entity__Group_6__02517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_6_0_in_rule__Entity__Group_6__0__Impl2544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__1__Impl_in_rule__Entity__Group_6__12574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_6_1_in_rule__Entity__Group_6__1__Impl2601 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__0__Impl_in_rule__Entity__Group_7__02636 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__1_in_rule__Entity__Group_7__02639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__OwnedFeatureAssignment_7_0_in_rule__Entity__Group_7__0__Impl2666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__1__Impl_in_rule__Entity__Group_7__12696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__OwnedFeatureAssignment_7_1_in_rule__Entity__Group_7__1__Impl2723 = new BitSet(new long[]{0x0000000060000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__02758 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__02761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Ref__Group__0__Impl2789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__12820 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__12823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__NameAssignment_1_in_rule__Ref__Group__1__Impl2850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__22880 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__22883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__RefToAssignment_2_in_rule__Ref__Group__2__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__32940 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__32943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__ManyAssignment_3_in_rule__Ref__Group__3__Impl2970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__43001 = new BitSet(new long[]{0x000000000300F000L});
        public static final BitSet FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__43004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Ref__Group__4__Impl3032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__53063 = new BitSet(new long[]{0x000000000300F000L});
        public static final BitSet FOLLOW_rule__Ref__Group__6_in_rule__Ref__Group__53066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_5__0_in_rule__Ref__Group__5__Impl3093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__6__Impl_in_rule__Ref__Group__63124 = new BitSet(new long[]{0x000000000300F000L});
        public static final BitSet FOLLOW_rule__Ref__Group__7_in_rule__Ref__Group__63127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_6__0_in_rule__Ref__Group__6__Impl3154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__7__Impl_in_rule__Ref__Group__73185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Ref__Group__7__Impl3213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_5__0__Impl_in_rule__Ref__Group_5__03260 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Ref__Group_5__1_in_rule__Ref__Group_5__03263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Ref__Group_5__0__Impl3291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_5__1__Impl_in_rule__Ref__Group_5__13322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__DescriptionAssignment_5_1_in_rule__Ref__Group_5__1__Impl3349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_6__0__Impl_in_rule__Ref__Group_6__03383 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__Ref__Group_6__1_in_rule__Ref__Group_6__03386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__AnnotationsAssignment_6_0_in_rule__Ref__Group_6__0__Impl3413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_6__1__Impl_in_rule__Ref__Group_6__13443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__AnnotationsAssignment_6_1_in_rule__Ref__Group_6__1__Impl3470 = new BitSet(new long[]{0x000000000000F002L});
        public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03505 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__DataType__Group__0__Impl3536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13567 = new BitSet(new long[]{0x00000000003F0000L});
        public static final BitSet FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__13570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl3597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__23627 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__23630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__TypeAssignment_2_in_rule__DataType__Group__2__Impl3657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__33687 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__33690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__ManyAssignment_3_in_rule__DataType__Group__3__Impl3717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__43748 = new BitSet(new long[]{0x000000000300F000L});
        public static final BitSet FOLLOW_rule__DataType__Group__5_in_rule__DataType__Group__43751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__DataType__Group__4__Impl3779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__5__Impl_in_rule__DataType__Group__53810 = new BitSet(new long[]{0x000000000300F000L});
        public static final BitSet FOLLOW_rule__DataType__Group__6_in_rule__DataType__Group__53813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_5__0_in_rule__DataType__Group__5__Impl3840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__6__Impl_in_rule__DataType__Group__63871 = new BitSet(new long[]{0x000000000300F000L});
        public static final BitSet FOLLOW_rule__DataType__Group__7_in_rule__DataType__Group__63874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_6__0_in_rule__DataType__Group__6__Impl3901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__7__Impl_in_rule__DataType__Group__73932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__DataType__Group__7__Impl3960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_5__0__Impl_in_rule__DataType__Group_5__04007 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__DataType__Group_5__1_in_rule__DataType__Group_5__04010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__DataType__Group_5__0__Impl4038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_5__1__Impl_in_rule__DataType__Group_5__14069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__DescriptionAssignment_5_1_in_rule__DataType__Group_5__1__Impl4096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_6__0__Impl_in_rule__DataType__Group_6__04130 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__DataType__Group_6__1_in_rule__DataType__Group_6__04133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__AnnotationsAssignment_6_0_in_rule__DataType__Group_6__0__Impl4160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_6__1__Impl_in_rule__DataType__Group_6__14190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__AnnotationsAssignment_6_1_in_rule__DataType__Group_6__1__Impl4217 = new BitSet(new long[]{0x000000000000F002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_24257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Package__DescriptionAssignment_4_14288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_5_04319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_5_14350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_6_04381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_6_14412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_24443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_3_14478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_5_24513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_6_04544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_6_14575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_7_04606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_7_14637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Ref__NameAssignment_14668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Ref__RefToAssignment_24703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Ref__ManyAssignment_34743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Ref__DescriptionAssignment_5_14782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_6_04813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_6_14844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_14875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataTypes_in_rule__DataType__TypeAssignment_24906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__DataType__ManyAssignment_34942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__DataType__DescriptionAssignment_5_14981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_6_05012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_6_15043 = new BitSet(new long[]{0x0000000000000002L});
    }


}