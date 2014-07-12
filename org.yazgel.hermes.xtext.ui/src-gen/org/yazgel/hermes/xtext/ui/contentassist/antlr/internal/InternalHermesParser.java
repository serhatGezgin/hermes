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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cache'", "'Index'", "'Id'", "'Load'", "'Ignore'", "'String'", "'Integer'", "'Boolean'", "'Long'", "'Double'", "'Object'", "'Package'", "'{'", "'}'", "'description'", "'Entity'", "'='", "'superEntity'", "':'", "'Ref'", "'source'", "'refTo'", "'DataType'", "'type'", "'many'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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

            if ( (LA1_0==30) ) {
                alt1=1;
            }
            else if ( (LA1_0==33) ) {
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:915:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:919:1: ( ( '{' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:920:1: ( '{' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:920:1: ( '{' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:921:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Entity__Group__3__Impl1852); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:934:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:938:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:939:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41883);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41886);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:946:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:950:1: ( ( ( rule__Entity__Group_4__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:951:1: ( ( rule__Entity__Group_4__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:951:1: ( ( rule__Entity__Group_4__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:952:1: ( rule__Entity__Group_4__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_4()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:953:1: ( rule__Entity__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:953:2: rule__Entity__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__0_in_rule__Entity__Group__4__Impl1913);
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

            if ( (LA10_0==11) ) {
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

            if ( (LA11_0==28) ) {
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

            if ( (LA12_0==30||LA12_0==33) ) {
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


    // $ANTLR start "rule__Entity__Group_4__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1098:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1102:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1103:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__0__Impl_in_rule__Entity__Group_4__02204);
            rule__Entity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__1_in_rule__Entity__Group_4__02207);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1110:1: rule__Entity__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1114:1: ( ( 'description' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1115:1: ( 'description' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1115:1: ( 'description' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1116:1: 'description'
            {
             before(grammarAccess.getEntityAccess().getDescriptionKeyword_4_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Entity__Group_4__0__Impl2235); 
             after(grammarAccess.getEntityAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1129:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1133:1: ( rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1134:2: rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__1__Impl_in_rule__Entity__Group_4__12266);
            rule__Entity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__2_in_rule__Entity__Group_4__12269);
            rule__Entity__Group_4__2();

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1141:1: rule__Entity__Group_4__1__Impl : ( '=' ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1145:1: ( ( '=' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1146:1: ( '=' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1146:1: ( '=' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1147:1: '='
            {
             before(grammarAccess.getEntityAccess().getEqualsSignKeyword_4_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Entity__Group_4__1__Impl2297); 
             after(grammarAccess.getEntityAccess().getEqualsSignKeyword_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Entity__Group_4__2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1160:1: rule__Entity__Group_4__2 : rule__Entity__Group_4__2__Impl ;
    public final void rule__Entity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1164:1: ( rule__Entity__Group_4__2__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1165:2: rule__Entity__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__2__Impl_in_rule__Entity__Group_4__22328);
            rule__Entity__Group_4__2__Impl();

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
    // $ANTLR end "rule__Entity__Group_4__2"


    // $ANTLR start "rule__Entity__Group_4__2__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1171:1: rule__Entity__Group_4__2__Impl : ( ( rule__Entity__DescriptionAssignment_4_2 ) ) ;
    public final void rule__Entity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1175:1: ( ( ( rule__Entity__DescriptionAssignment_4_2 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1176:1: ( ( rule__Entity__DescriptionAssignment_4_2 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1176:1: ( ( rule__Entity__DescriptionAssignment_4_2 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1177:1: ( rule__Entity__DescriptionAssignment_4_2 )
            {
             before(grammarAccess.getEntityAccess().getDescriptionAssignment_4_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1178:1: ( rule__Entity__DescriptionAssignment_4_2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1178:2: rule__Entity__DescriptionAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__DescriptionAssignment_4_2_in_rule__Entity__Group_4__2__Impl2355);
            rule__Entity__DescriptionAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getDescriptionAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_4__2__Impl"


    // $ANTLR start "rule__Entity__Group_5__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1194:1: rule__Entity__Group_5__0 : rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 ;
    public final void rule__Entity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1198:1: ( rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1199:2: rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02391);
            rule__Entity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02394);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1206:1: rule__Entity__Group_5__0__Impl : ( ( rule__Entity__AnnotationsAssignment_5_0 ) ) ;
    public final void rule__Entity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1210:1: ( ( ( rule__Entity__AnnotationsAssignment_5_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1211:1: ( ( rule__Entity__AnnotationsAssignment_5_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1211:1: ( ( rule__Entity__AnnotationsAssignment_5_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1212:1: ( rule__Entity__AnnotationsAssignment_5_0 )
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_5_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1213:1: ( rule__Entity__AnnotationsAssignment_5_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1213:2: rule__Entity__AnnotationsAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__AnnotationsAssignment_5_0_in_rule__Entity__Group_5__0__Impl2421);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1223:1: rule__Entity__Group_5__1 : rule__Entity__Group_5__1__Impl ;
    public final void rule__Entity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1227:1: ( rule__Entity__Group_5__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1228:2: rule__Entity__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12451);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1234:1: rule__Entity__Group_5__1__Impl : ( ( rule__Entity__AnnotationsAssignment_5_1 )* ) ;
    public final void rule__Entity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1238:1: ( ( ( rule__Entity__AnnotationsAssignment_5_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1239:1: ( ( rule__Entity__AnnotationsAssignment_5_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1239:1: ( ( rule__Entity__AnnotationsAssignment_5_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1240:1: ( rule__Entity__AnnotationsAssignment_5_1 )*
            {
             before(grammarAccess.getEntityAccess().getAnnotationsAssignment_5_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1241:1: ( rule__Entity__AnnotationsAssignment_5_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==11) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1241:2: rule__Entity__AnnotationsAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__AnnotationsAssignment_5_1_in_rule__Entity__Group_5__1__Impl2478);
            	    rule__Entity__AnnotationsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1255:1: rule__Entity__Group_6__0 : rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 ;
    public final void rule__Entity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1259:1: ( rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1260:2: rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__0__Impl_in_rule__Entity__Group_6__02513);
            rule__Entity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__1_in_rule__Entity__Group_6__02516);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1267:1: rule__Entity__Group_6__0__Impl : ( 'superEntity' ) ;
    public final void rule__Entity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1271:1: ( ( 'superEntity' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1272:1: ( 'superEntity' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1272:1: ( 'superEntity' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1273:1: 'superEntity'
            {
             before(grammarAccess.getEntityAccess().getSuperEntityKeyword_6_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Entity__Group_6__0__Impl2544); 
             after(grammarAccess.getEntityAccess().getSuperEntityKeyword_6_0()); 

            }


            }

        }
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1286:1: rule__Entity__Group_6__1 : rule__Entity__Group_6__1__Impl rule__Entity__Group_6__2 ;
    public final void rule__Entity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1290:1: ( rule__Entity__Group_6__1__Impl rule__Entity__Group_6__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1291:2: rule__Entity__Group_6__1__Impl rule__Entity__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__1__Impl_in_rule__Entity__Group_6__12575);
            rule__Entity__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__2_in_rule__Entity__Group_6__12578);
            rule__Entity__Group_6__2();

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1298:1: rule__Entity__Group_6__1__Impl : ( ':' ) ;
    public final void rule__Entity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1302:1: ( ( ':' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1303:1: ( ':' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1303:1: ( ':' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1304:1: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_6_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Entity__Group_6__1__Impl2606); 
             after(grammarAccess.getEntityAccess().getColonKeyword_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Entity__Group_6__2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1317:1: rule__Entity__Group_6__2 : rule__Entity__Group_6__2__Impl ;
    public final void rule__Entity__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1321:1: ( rule__Entity__Group_6__2__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1322:2: rule__Entity__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_6__2__Impl_in_rule__Entity__Group_6__22637);
            rule__Entity__Group_6__2__Impl();

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
    // $ANTLR end "rule__Entity__Group_6__2"


    // $ANTLR start "rule__Entity__Group_6__2__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1328:1: rule__Entity__Group_6__2__Impl : ( ( rule__Entity__SuperEntityAssignment_6_2 ) ) ;
    public final void rule__Entity__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1332:1: ( ( ( rule__Entity__SuperEntityAssignment_6_2 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1333:1: ( ( rule__Entity__SuperEntityAssignment_6_2 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1333:1: ( ( rule__Entity__SuperEntityAssignment_6_2 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1334:1: ( rule__Entity__SuperEntityAssignment_6_2 )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityAssignment_6_2()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1335:1: ( rule__Entity__SuperEntityAssignment_6_2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1335:2: rule__Entity__SuperEntityAssignment_6_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__SuperEntityAssignment_6_2_in_rule__Entity__Group_6__2__Impl2664);
            rule__Entity__SuperEntityAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperEntityAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_6__2__Impl"


    // $ANTLR start "rule__Entity__Group_7__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1351:1: rule__Entity__Group_7__0 : rule__Entity__Group_7__0__Impl rule__Entity__Group_7__1 ;
    public final void rule__Entity__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1355:1: ( rule__Entity__Group_7__0__Impl rule__Entity__Group_7__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1356:2: rule__Entity__Group_7__0__Impl rule__Entity__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__0__Impl_in_rule__Entity__Group_7__02700);
            rule__Entity__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__1_in_rule__Entity__Group_7__02703);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1363:1: rule__Entity__Group_7__0__Impl : ( ( rule__Entity__OwnedFeatureAssignment_7_0 ) ) ;
    public final void rule__Entity__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1367:1: ( ( ( rule__Entity__OwnedFeatureAssignment_7_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1368:1: ( ( rule__Entity__OwnedFeatureAssignment_7_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1368:1: ( ( rule__Entity__OwnedFeatureAssignment_7_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1369:1: ( rule__Entity__OwnedFeatureAssignment_7_0 )
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_7_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1370:1: ( rule__Entity__OwnedFeatureAssignment_7_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1370:2: rule__Entity__OwnedFeatureAssignment_7_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__OwnedFeatureAssignment_7_0_in_rule__Entity__Group_7__0__Impl2730);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1380:1: rule__Entity__Group_7__1 : rule__Entity__Group_7__1__Impl ;
    public final void rule__Entity__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1384:1: ( rule__Entity__Group_7__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1385:2: rule__Entity__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__1__Impl_in_rule__Entity__Group_7__12760);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1391:1: rule__Entity__Group_7__1__Impl : ( ( rule__Entity__OwnedFeatureAssignment_7_1 )* ) ;
    public final void rule__Entity__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1395:1: ( ( ( rule__Entity__OwnedFeatureAssignment_7_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1396:1: ( ( rule__Entity__OwnedFeatureAssignment_7_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1396:1: ( ( rule__Entity__OwnedFeatureAssignment_7_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1397:1: ( rule__Entity__OwnedFeatureAssignment_7_1 )*
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureAssignment_7_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1398:1: ( rule__Entity__OwnedFeatureAssignment_7_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30||LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1398:2: rule__Entity__OwnedFeatureAssignment_7_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__OwnedFeatureAssignment_7_1_in_rule__Entity__Group_7__1__Impl2787);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1412:1: rule__Ref__Group__0 : rule__Ref__Group__0__Impl rule__Ref__Group__1 ;
    public final void rule__Ref__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1416:1: ( rule__Ref__Group__0__Impl rule__Ref__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1417:2: rule__Ref__Group__0__Impl rule__Ref__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__02822);
            rule__Ref__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__02825);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1424:1: rule__Ref__Group__0__Impl : ( 'Ref' ) ;
    public final void rule__Ref__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1428:1: ( ( 'Ref' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1429:1: ( 'Ref' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1429:1: ( 'Ref' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1430:1: 'Ref'
            {
             before(grammarAccess.getRefAccess().getRefKeyword_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Ref__Group__0__Impl2853); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1443:1: rule__Ref__Group__1 : rule__Ref__Group__1__Impl rule__Ref__Group__2 ;
    public final void rule__Ref__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1447:1: ( rule__Ref__Group__1__Impl rule__Ref__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1448:2: rule__Ref__Group__1__Impl rule__Ref__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__12884);
            rule__Ref__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__12887);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1455:1: rule__Ref__Group__1__Impl : ( ( rule__Ref__NameAssignment_1 ) ) ;
    public final void rule__Ref__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1459:1: ( ( ( rule__Ref__NameAssignment_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1460:1: ( ( rule__Ref__NameAssignment_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1460:1: ( ( rule__Ref__NameAssignment_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1461:1: ( rule__Ref__NameAssignment_1 )
            {
             before(grammarAccess.getRefAccess().getNameAssignment_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1462:1: ( rule__Ref__NameAssignment_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1462:2: rule__Ref__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__NameAssignment_1_in_rule__Ref__Group__1__Impl2914);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1472:1: rule__Ref__Group__2 : rule__Ref__Group__2__Impl rule__Ref__Group__3 ;
    public final void rule__Ref__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1476:1: ( rule__Ref__Group__2__Impl rule__Ref__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1477:2: rule__Ref__Group__2__Impl rule__Ref__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__22944);
            rule__Ref__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__22947);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1484:1: rule__Ref__Group__2__Impl : ( '{' ) ;
    public final void rule__Ref__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1488:1: ( ( '{' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1489:1: ( '{' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1489:1: ( '{' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1490:1: '{'
            {
             before(grammarAccess.getRefAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Ref__Group__2__Impl2975); 
             after(grammarAccess.getRefAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1503:1: rule__Ref__Group__3 : rule__Ref__Group__3__Impl rule__Ref__Group__4 ;
    public final void rule__Ref__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1507:1: ( rule__Ref__Group__3__Impl rule__Ref__Group__4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1508:2: rule__Ref__Group__3__Impl rule__Ref__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__33006);
            rule__Ref__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__33009);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1515:1: rule__Ref__Group__3__Impl : ( ( rule__Ref__ManyAssignment_3 )? ) ;
    public final void rule__Ref__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1519:1: ( ( ( rule__Ref__ManyAssignment_3 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1520:1: ( ( rule__Ref__ManyAssignment_3 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1520:1: ( ( rule__Ref__ManyAssignment_3 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1521:1: ( rule__Ref__ManyAssignment_3 )?
            {
             before(grammarAccess.getRefAccess().getManyAssignment_3()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1522:1: ( rule__Ref__ManyAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1522:2: rule__Ref__ManyAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ref__ManyAssignment_3_in_rule__Ref__Group__3__Impl3036);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1532:1: rule__Ref__Group__4 : rule__Ref__Group__4__Impl rule__Ref__Group__5 ;
    public final void rule__Ref__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1536:1: ( rule__Ref__Group__4__Impl rule__Ref__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1537:2: rule__Ref__Group__4__Impl rule__Ref__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__43067);
            rule__Ref__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__43070);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1544:1: rule__Ref__Group__4__Impl : ( ( rule__Ref__Group_4__0 )? ) ;
    public final void rule__Ref__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1548:1: ( ( ( rule__Ref__Group_4__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1549:1: ( ( rule__Ref__Group_4__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1549:1: ( ( rule__Ref__Group_4__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1550:1: ( rule__Ref__Group_4__0 )?
            {
             before(grammarAccess.getRefAccess().getGroup_4()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1551:1: ( rule__Ref__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1551:2: rule__Ref__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_4__0_in_rule__Ref__Group__4__Impl3097);
                    rule__Ref__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRefAccess().getGroup_4()); 

            }


            }

        }
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1561:1: rule__Ref__Group__5 : rule__Ref__Group__5__Impl rule__Ref__Group__6 ;
    public final void rule__Ref__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1565:1: ( rule__Ref__Group__5__Impl rule__Ref__Group__6 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1566:2: rule__Ref__Group__5__Impl rule__Ref__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__53128);
            rule__Ref__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__6_in_rule__Ref__Group__53131);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1573:1: rule__Ref__Group__5__Impl : ( ( rule__Ref__Group_5__0 )? ) ;
    public final void rule__Ref__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1577:1: ( ( ( rule__Ref__Group_5__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1578:1: ( ( rule__Ref__Group_5__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1578:1: ( ( rule__Ref__Group_5__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1579:1: ( rule__Ref__Group_5__0 )?
            {
             before(grammarAccess.getRefAccess().getGroup_5()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1580:1: ( rule__Ref__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=12 && LA17_0<=15)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1580:2: rule__Ref__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_5__0_in_rule__Ref__Group__5__Impl3158);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1590:1: rule__Ref__Group__6 : rule__Ref__Group__6__Impl rule__Ref__Group__7 ;
    public final void rule__Ref__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1594:1: ( rule__Ref__Group__6__Impl rule__Ref__Group__7 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1595:2: rule__Ref__Group__6__Impl rule__Ref__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__6__Impl_in_rule__Ref__Group__63189);
            rule__Ref__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__7_in_rule__Ref__Group__63192);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1602:1: rule__Ref__Group__6__Impl : ( 'source' ) ;
    public final void rule__Ref__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1606:1: ( ( 'source' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1607:1: ( 'source' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1607:1: ( 'source' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1608:1: 'source'
            {
             before(grammarAccess.getRefAccess().getSourceKeyword_6()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Ref__Group__6__Impl3220); 
             after(grammarAccess.getRefAccess().getSourceKeyword_6()); 

            }


            }

        }
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1621:1: rule__Ref__Group__7 : rule__Ref__Group__7__Impl rule__Ref__Group__8 ;
    public final void rule__Ref__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1625:1: ( rule__Ref__Group__7__Impl rule__Ref__Group__8 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1626:2: rule__Ref__Group__7__Impl rule__Ref__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__7__Impl_in_rule__Ref__Group__73251);
            rule__Ref__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__8_in_rule__Ref__Group__73254);
            rule__Ref__Group__8();

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1633:1: rule__Ref__Group__7__Impl : ( '=' ) ;
    public final void rule__Ref__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1637:1: ( ( '=' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1638:1: ( '=' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1638:1: ( '=' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1639:1: '='
            {
             before(grammarAccess.getRefAccess().getEqualsSignKeyword_7()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Ref__Group__7__Impl3282); 
             after(grammarAccess.getRefAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Ref__Group__8"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1652:1: rule__Ref__Group__8 : rule__Ref__Group__8__Impl rule__Ref__Group__9 ;
    public final void rule__Ref__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1656:1: ( rule__Ref__Group__8__Impl rule__Ref__Group__9 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1657:2: rule__Ref__Group__8__Impl rule__Ref__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__8__Impl_in_rule__Ref__Group__83313);
            rule__Ref__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__9_in_rule__Ref__Group__83316);
            rule__Ref__Group__9();

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
    // $ANTLR end "rule__Ref__Group__8"


    // $ANTLR start "rule__Ref__Group__8__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1664:1: rule__Ref__Group__8__Impl : ( ( rule__Ref__SourceAssignment_8 ) ) ;
    public final void rule__Ref__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1668:1: ( ( ( rule__Ref__SourceAssignment_8 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1669:1: ( ( rule__Ref__SourceAssignment_8 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1669:1: ( ( rule__Ref__SourceAssignment_8 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1670:1: ( rule__Ref__SourceAssignment_8 )
            {
             before(grammarAccess.getRefAccess().getSourceAssignment_8()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1671:1: ( rule__Ref__SourceAssignment_8 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1671:2: rule__Ref__SourceAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__SourceAssignment_8_in_rule__Ref__Group__8__Impl3343);
            rule__Ref__SourceAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getSourceAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__8__Impl"


    // $ANTLR start "rule__Ref__Group__9"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1681:1: rule__Ref__Group__9 : rule__Ref__Group__9__Impl rule__Ref__Group__10 ;
    public final void rule__Ref__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1685:1: ( rule__Ref__Group__9__Impl rule__Ref__Group__10 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1686:2: rule__Ref__Group__9__Impl rule__Ref__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__9__Impl_in_rule__Ref__Group__93373);
            rule__Ref__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__10_in_rule__Ref__Group__93376);
            rule__Ref__Group__10();

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
    // $ANTLR end "rule__Ref__Group__9"


    // $ANTLR start "rule__Ref__Group__9__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1693:1: rule__Ref__Group__9__Impl : ( 'refTo' ) ;
    public final void rule__Ref__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1697:1: ( ( 'refTo' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1698:1: ( 'refTo' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1698:1: ( 'refTo' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1699:1: 'refTo'
            {
             before(grammarAccess.getRefAccess().getRefToKeyword_9()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Ref__Group__9__Impl3404); 
             after(grammarAccess.getRefAccess().getRefToKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__9__Impl"


    // $ANTLR start "rule__Ref__Group__10"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1712:1: rule__Ref__Group__10 : rule__Ref__Group__10__Impl rule__Ref__Group__11 ;
    public final void rule__Ref__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1716:1: ( rule__Ref__Group__10__Impl rule__Ref__Group__11 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1717:2: rule__Ref__Group__10__Impl rule__Ref__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__10__Impl_in_rule__Ref__Group__103435);
            rule__Ref__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__11_in_rule__Ref__Group__103438);
            rule__Ref__Group__11();

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
    // $ANTLR end "rule__Ref__Group__10"


    // $ANTLR start "rule__Ref__Group__10__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1724:1: rule__Ref__Group__10__Impl : ( '=' ) ;
    public final void rule__Ref__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1728:1: ( ( '=' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1729:1: ( '=' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1729:1: ( '=' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1730:1: '='
            {
             before(grammarAccess.getRefAccess().getEqualsSignKeyword_10()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Ref__Group__10__Impl3466); 
             after(grammarAccess.getRefAccess().getEqualsSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__10__Impl"


    // $ANTLR start "rule__Ref__Group__11"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1743:1: rule__Ref__Group__11 : rule__Ref__Group__11__Impl rule__Ref__Group__12 ;
    public final void rule__Ref__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1747:1: ( rule__Ref__Group__11__Impl rule__Ref__Group__12 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1748:2: rule__Ref__Group__11__Impl rule__Ref__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__11__Impl_in_rule__Ref__Group__113497);
            rule__Ref__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__12_in_rule__Ref__Group__113500);
            rule__Ref__Group__12();

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
    // $ANTLR end "rule__Ref__Group__11"


    // $ANTLR start "rule__Ref__Group__11__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1755:1: rule__Ref__Group__11__Impl : ( ( rule__Ref__RefToAssignment_11 ) ) ;
    public final void rule__Ref__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1759:1: ( ( ( rule__Ref__RefToAssignment_11 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1760:1: ( ( rule__Ref__RefToAssignment_11 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1760:1: ( ( rule__Ref__RefToAssignment_11 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1761:1: ( rule__Ref__RefToAssignment_11 )
            {
             before(grammarAccess.getRefAccess().getRefToAssignment_11()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1762:1: ( rule__Ref__RefToAssignment_11 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1762:2: rule__Ref__RefToAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__RefToAssignment_11_in_rule__Ref__Group__11__Impl3527);
            rule__Ref__RefToAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getRefToAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__11__Impl"


    // $ANTLR start "rule__Ref__Group__12"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1772:1: rule__Ref__Group__12 : rule__Ref__Group__12__Impl ;
    public final void rule__Ref__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1776:1: ( rule__Ref__Group__12__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1777:2: rule__Ref__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group__12__Impl_in_rule__Ref__Group__123557);
            rule__Ref__Group__12__Impl();

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
    // $ANTLR end "rule__Ref__Group__12"


    // $ANTLR start "rule__Ref__Group__12__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1783:1: rule__Ref__Group__12__Impl : ( '}' ) ;
    public final void rule__Ref__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1787:1: ( ( '}' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1788:1: ( '}' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1788:1: ( '}' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1789:1: '}'
            {
             before(grammarAccess.getRefAccess().getRightCurlyBracketKeyword_12()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Ref__Group__12__Impl3585); 
             after(grammarAccess.getRefAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group__12__Impl"


    // $ANTLR start "rule__Ref__Group_4__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1828:1: rule__Ref__Group_4__0 : rule__Ref__Group_4__0__Impl rule__Ref__Group_4__1 ;
    public final void rule__Ref__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1832:1: ( rule__Ref__Group_4__0__Impl rule__Ref__Group_4__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1833:2: rule__Ref__Group_4__0__Impl rule__Ref__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_4__0__Impl_in_rule__Ref__Group_4__03642);
            rule__Ref__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_4__1_in_rule__Ref__Group_4__03645);
            rule__Ref__Group_4__1();

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
    // $ANTLR end "rule__Ref__Group_4__0"


    // $ANTLR start "rule__Ref__Group_4__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1840:1: rule__Ref__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Ref__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1844:1: ( ( 'description' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1845:1: ( 'description' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1845:1: ( 'description' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1846:1: 'description'
            {
             before(grammarAccess.getRefAccess().getDescriptionKeyword_4_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Ref__Group_4__0__Impl3673); 
             after(grammarAccess.getRefAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_4__0__Impl"


    // $ANTLR start "rule__Ref__Group_4__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1859:1: rule__Ref__Group_4__1 : rule__Ref__Group_4__1__Impl ;
    public final void rule__Ref__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1863:1: ( rule__Ref__Group_4__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1864:2: rule__Ref__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_4__1__Impl_in_rule__Ref__Group_4__13704);
            rule__Ref__Group_4__1__Impl();

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
    // $ANTLR end "rule__Ref__Group_4__1"


    // $ANTLR start "rule__Ref__Group_4__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1870:1: rule__Ref__Group_4__1__Impl : ( ( rule__Ref__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Ref__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1874:1: ( ( ( rule__Ref__DescriptionAssignment_4_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1875:1: ( ( rule__Ref__DescriptionAssignment_4_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1875:1: ( ( rule__Ref__DescriptionAssignment_4_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1876:1: ( rule__Ref__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getRefAccess().getDescriptionAssignment_4_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1877:1: ( rule__Ref__DescriptionAssignment_4_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1877:2: rule__Ref__DescriptionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__DescriptionAssignment_4_1_in_rule__Ref__Group_4__1__Impl3731);
            rule__Ref__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRefAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__Group_4__1__Impl"


    // $ANTLR start "rule__Ref__Group_5__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1891:1: rule__Ref__Group_5__0 : rule__Ref__Group_5__0__Impl rule__Ref__Group_5__1 ;
    public final void rule__Ref__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1895:1: ( rule__Ref__Group_5__0__Impl rule__Ref__Group_5__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1896:2: rule__Ref__Group_5__0__Impl rule__Ref__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_5__0__Impl_in_rule__Ref__Group_5__03765);
            rule__Ref__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_5__1_in_rule__Ref__Group_5__03768);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1903:1: rule__Ref__Group_5__0__Impl : ( ( rule__Ref__AnnotationsAssignment_5_0 ) ) ;
    public final void rule__Ref__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1907:1: ( ( ( rule__Ref__AnnotationsAssignment_5_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1908:1: ( ( rule__Ref__AnnotationsAssignment_5_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1908:1: ( ( rule__Ref__AnnotationsAssignment_5_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1909:1: ( rule__Ref__AnnotationsAssignment_5_0 )
            {
             before(grammarAccess.getRefAccess().getAnnotationsAssignment_5_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1910:1: ( rule__Ref__AnnotationsAssignment_5_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1910:2: rule__Ref__AnnotationsAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__AnnotationsAssignment_5_0_in_rule__Ref__Group_5__0__Impl3795);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1920:1: rule__Ref__Group_5__1 : rule__Ref__Group_5__1__Impl ;
    public final void rule__Ref__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1924:1: ( rule__Ref__Group_5__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1925:2: rule__Ref__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ref__Group_5__1__Impl_in_rule__Ref__Group_5__13825);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1931:1: rule__Ref__Group_5__1__Impl : ( ( rule__Ref__AnnotationsAssignment_5_1 )* ) ;
    public final void rule__Ref__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1935:1: ( ( ( rule__Ref__AnnotationsAssignment_5_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1936:1: ( ( rule__Ref__AnnotationsAssignment_5_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1936:1: ( ( rule__Ref__AnnotationsAssignment_5_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1937:1: ( rule__Ref__AnnotationsAssignment_5_1 )*
            {
             before(grammarAccess.getRefAccess().getAnnotationsAssignment_5_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1938:1: ( rule__Ref__AnnotationsAssignment_5_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=12 && LA18_0<=15)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1938:2: rule__Ref__AnnotationsAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Ref__AnnotationsAssignment_5_1_in_rule__Ref__Group_5__1__Impl3852);
            	    rule__Ref__AnnotationsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1952:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1956:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1957:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03887);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03890);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1964:1: rule__DataType__Group__0__Impl : ( 'DataType' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1968:1: ( ( 'DataType' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1969:1: ( 'DataType' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1969:1: ( 'DataType' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1970:1: 'DataType'
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeKeyword_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__DataType__Group__0__Impl3918); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1983:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1987:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1988:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13949);
            rule__DataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__13952);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1995:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:1999:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2000:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2000:1: ( ( rule__DataType__NameAssignment_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2001:1: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2002:1: ( rule__DataType__NameAssignment_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2002:2: rule__DataType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl3979);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2012:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl rule__DataType__Group__3 ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2016:1: ( rule__DataType__Group__2__Impl rule__DataType__Group__3 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2017:2: rule__DataType__Group__2__Impl rule__DataType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__24009);
            rule__DataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__24012);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2024:1: rule__DataType__Group__2__Impl : ( '{' ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2028:1: ( ( '{' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2029:1: ( '{' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2029:1: ( '{' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2030:1: '{'
            {
             before(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__DataType__Group__2__Impl4040); 
             after(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2043:1: rule__DataType__Group__3 : rule__DataType__Group__3__Impl rule__DataType__Group__4 ;
    public final void rule__DataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2047:1: ( rule__DataType__Group__3__Impl rule__DataType__Group__4 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2048:2: rule__DataType__Group__3__Impl rule__DataType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__34071);
            rule__DataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__34074);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2055:1: rule__DataType__Group__3__Impl : ( ( rule__DataType__ManyAssignment_3 )? ) ;
    public final void rule__DataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2059:1: ( ( ( rule__DataType__ManyAssignment_3 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2060:1: ( ( rule__DataType__ManyAssignment_3 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2060:1: ( ( rule__DataType__ManyAssignment_3 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2061:1: ( rule__DataType__ManyAssignment_3 )?
            {
             before(grammarAccess.getDataTypeAccess().getManyAssignment_3()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2062:1: ( rule__DataType__ManyAssignment_3 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2062:2: rule__DataType__ManyAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataType__ManyAssignment_3_in_rule__DataType__Group__3__Impl4101);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2072:1: rule__DataType__Group__4 : rule__DataType__Group__4__Impl rule__DataType__Group__5 ;
    public final void rule__DataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2076:1: ( rule__DataType__Group__4__Impl rule__DataType__Group__5 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2077:2: rule__DataType__Group__4__Impl rule__DataType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__44132);
            rule__DataType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__5_in_rule__DataType__Group__44135);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2084:1: rule__DataType__Group__4__Impl : ( ( rule__DataType__Group_4__0 )? ) ;
    public final void rule__DataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2088:1: ( ( ( rule__DataType__Group_4__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2089:1: ( ( rule__DataType__Group_4__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2089:1: ( ( rule__DataType__Group_4__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2090:1: ( rule__DataType__Group_4__0 )?
            {
             before(grammarAccess.getDataTypeAccess().getGroup_4()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2091:1: ( rule__DataType__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2091:2: rule__DataType__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_4__0_in_rule__DataType__Group__4__Impl4162);
                    rule__DataType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getGroup_4()); 

            }


            }

        }
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2101:1: rule__DataType__Group__5 : rule__DataType__Group__5__Impl rule__DataType__Group__6 ;
    public final void rule__DataType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2105:1: ( rule__DataType__Group__5__Impl rule__DataType__Group__6 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2106:2: rule__DataType__Group__5__Impl rule__DataType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__5__Impl_in_rule__DataType__Group__54193);
            rule__DataType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__6_in_rule__DataType__Group__54196);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2113:1: rule__DataType__Group__5__Impl : ( ( rule__DataType__Group_5__0 )? ) ;
    public final void rule__DataType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2117:1: ( ( ( rule__DataType__Group_5__0 )? ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2118:1: ( ( rule__DataType__Group_5__0 )? )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2118:1: ( ( rule__DataType__Group_5__0 )? )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2119:1: ( rule__DataType__Group_5__0 )?
            {
             before(grammarAccess.getDataTypeAccess().getGroup_5()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2120:1: ( rule__DataType__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=12 && LA21_0<=15)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2120:2: rule__DataType__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_5__0_in_rule__DataType__Group__5__Impl4223);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2130:1: rule__DataType__Group__6 : rule__DataType__Group__6__Impl rule__DataType__Group__7 ;
    public final void rule__DataType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2134:1: ( rule__DataType__Group__6__Impl rule__DataType__Group__7 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2135:2: rule__DataType__Group__6__Impl rule__DataType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__6__Impl_in_rule__DataType__Group__64254);
            rule__DataType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__7_in_rule__DataType__Group__64257);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2142:1: rule__DataType__Group__6__Impl : ( 'type' ) ;
    public final void rule__DataType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2146:1: ( ( 'type' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2147:1: ( 'type' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2147:1: ( 'type' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2148:1: 'type'
            {
             before(grammarAccess.getDataTypeAccess().getTypeKeyword_6()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__DataType__Group__6__Impl4285); 
             after(grammarAccess.getDataTypeAccess().getTypeKeyword_6()); 

            }


            }

        }
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2161:1: rule__DataType__Group__7 : rule__DataType__Group__7__Impl rule__DataType__Group__8 ;
    public final void rule__DataType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2165:1: ( rule__DataType__Group__7__Impl rule__DataType__Group__8 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2166:2: rule__DataType__Group__7__Impl rule__DataType__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__7__Impl_in_rule__DataType__Group__74316);
            rule__DataType__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__8_in_rule__DataType__Group__74319);
            rule__DataType__Group__8();

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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2173:1: rule__DataType__Group__7__Impl : ( '=' ) ;
    public final void rule__DataType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2177:1: ( ( '=' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2178:1: ( '=' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2178:1: ( '=' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2179:1: '='
            {
             before(grammarAccess.getDataTypeAccess().getEqualsSignKeyword_7()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__DataType__Group__7__Impl4347); 
             after(grammarAccess.getDataTypeAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataType__Group__8"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2192:1: rule__DataType__Group__8 : rule__DataType__Group__8__Impl rule__DataType__Group__9 ;
    public final void rule__DataType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2196:1: ( rule__DataType__Group__8__Impl rule__DataType__Group__9 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2197:2: rule__DataType__Group__8__Impl rule__DataType__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__8__Impl_in_rule__DataType__Group__84378);
            rule__DataType__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__9_in_rule__DataType__Group__84381);
            rule__DataType__Group__9();

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
    // $ANTLR end "rule__DataType__Group__8"


    // $ANTLR start "rule__DataType__Group__8__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2204:1: rule__DataType__Group__8__Impl : ( ( rule__DataType__TypeAssignment_8 ) ) ;
    public final void rule__DataType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2208:1: ( ( ( rule__DataType__TypeAssignment_8 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2209:1: ( ( rule__DataType__TypeAssignment_8 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2209:1: ( ( rule__DataType__TypeAssignment_8 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2210:1: ( rule__DataType__TypeAssignment_8 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment_8()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2211:1: ( rule__DataType__TypeAssignment_8 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2211:2: rule__DataType__TypeAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__TypeAssignment_8_in_rule__DataType__Group__8__Impl4408);
            rule__DataType__TypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getTypeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__8__Impl"


    // $ANTLR start "rule__DataType__Group__9"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2221:1: rule__DataType__Group__9 : rule__DataType__Group__9__Impl ;
    public final void rule__DataType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2225:1: ( rule__DataType__Group__9__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2226:2: rule__DataType__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group__9__Impl_in_rule__DataType__Group__94438);
            rule__DataType__Group__9__Impl();

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
    // $ANTLR end "rule__DataType__Group__9"


    // $ANTLR start "rule__DataType__Group__9__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2232:1: rule__DataType__Group__9__Impl : ( '}' ) ;
    public final void rule__DataType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2236:1: ( ( '}' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2237:1: ( '}' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2237:1: ( '}' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2238:1: '}'
            {
             before(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_9()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__DataType__Group__9__Impl4466); 
             after(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__9__Impl"


    // $ANTLR start "rule__DataType__Group_4__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2271:1: rule__DataType__Group_4__0 : rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1 ;
    public final void rule__DataType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2275:1: ( rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2276:2: rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_4__0__Impl_in_rule__DataType__Group_4__04517);
            rule__DataType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_4__1_in_rule__DataType__Group_4__04520);
            rule__DataType__Group_4__1();

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
    // $ANTLR end "rule__DataType__Group_4__0"


    // $ANTLR start "rule__DataType__Group_4__0__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2283:1: rule__DataType__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__DataType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2287:1: ( ( 'description' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2288:1: ( 'description' )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2288:1: ( 'description' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2289:1: 'description'
            {
             before(grammarAccess.getDataTypeAccess().getDescriptionKeyword_4_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__DataType__Group_4__0__Impl4548); 
             after(grammarAccess.getDataTypeAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_4__0__Impl"


    // $ANTLR start "rule__DataType__Group_4__1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2302:1: rule__DataType__Group_4__1 : rule__DataType__Group_4__1__Impl ;
    public final void rule__DataType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2306:1: ( rule__DataType__Group_4__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2307:2: rule__DataType__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_4__1__Impl_in_rule__DataType__Group_4__14579);
            rule__DataType__Group_4__1__Impl();

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
    // $ANTLR end "rule__DataType__Group_4__1"


    // $ANTLR start "rule__DataType__Group_4__1__Impl"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2313:1: rule__DataType__Group_4__1__Impl : ( ( rule__DataType__DescriptionAssignment_4_1 ) ) ;
    public final void rule__DataType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2317:1: ( ( ( rule__DataType__DescriptionAssignment_4_1 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2318:1: ( ( rule__DataType__DescriptionAssignment_4_1 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2318:1: ( ( rule__DataType__DescriptionAssignment_4_1 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2319:1: ( rule__DataType__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getDataTypeAccess().getDescriptionAssignment_4_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2320:1: ( rule__DataType__DescriptionAssignment_4_1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2320:2: rule__DataType__DescriptionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__DescriptionAssignment_4_1_in_rule__DataType__Group_4__1__Impl4606);
            rule__DataType__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_4__1__Impl"


    // $ANTLR start "rule__DataType__Group_5__0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2334:1: rule__DataType__Group_5__0 : rule__DataType__Group_5__0__Impl rule__DataType__Group_5__1 ;
    public final void rule__DataType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2338:1: ( rule__DataType__Group_5__0__Impl rule__DataType__Group_5__1 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2339:2: rule__DataType__Group_5__0__Impl rule__DataType__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_5__0__Impl_in_rule__DataType__Group_5__04640);
            rule__DataType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_5__1_in_rule__DataType__Group_5__04643);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2346:1: rule__DataType__Group_5__0__Impl : ( ( rule__DataType__AnnotationsAssignment_5_0 ) ) ;
    public final void rule__DataType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2350:1: ( ( ( rule__DataType__AnnotationsAssignment_5_0 ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2351:1: ( ( rule__DataType__AnnotationsAssignment_5_0 ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2351:1: ( ( rule__DataType__AnnotationsAssignment_5_0 ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2352:1: ( rule__DataType__AnnotationsAssignment_5_0 )
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_5_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2353:1: ( rule__DataType__AnnotationsAssignment_5_0 )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2353:2: rule__DataType__AnnotationsAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__AnnotationsAssignment_5_0_in_rule__DataType__Group_5__0__Impl4670);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2363:1: rule__DataType__Group_5__1 : rule__DataType__Group_5__1__Impl ;
    public final void rule__DataType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2367:1: ( rule__DataType__Group_5__1__Impl )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2368:2: rule__DataType__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DataType__Group_5__1__Impl_in_rule__DataType__Group_5__14700);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2374:1: rule__DataType__Group_5__1__Impl : ( ( rule__DataType__AnnotationsAssignment_5_1 )* ) ;
    public final void rule__DataType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2378:1: ( ( ( rule__DataType__AnnotationsAssignment_5_1 )* ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2379:1: ( ( rule__DataType__AnnotationsAssignment_5_1 )* )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2379:1: ( ( rule__DataType__AnnotationsAssignment_5_1 )* )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2380:1: ( rule__DataType__AnnotationsAssignment_5_1 )*
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsAssignment_5_1()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2381:1: ( rule__DataType__AnnotationsAssignment_5_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=12 && LA22_0<=15)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2381:2: rule__DataType__AnnotationsAssignment_5_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DataType__AnnotationsAssignment_5_1_in_rule__DataType__Group_5__1__Impl4727);
            	    rule__DataType__AnnotationsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2396:1: rule__Package__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2400:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2401:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2401:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2402:1: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Package__NameAssignment_24767); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2411:1: rule__Package__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Package__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2415:1: ( ( RULE_STRING ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2416:1: ( RULE_STRING )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2416:1: ( RULE_STRING )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2417:1: RULE_STRING
            {
             before(grammarAccess.getPackageAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Package__DescriptionAssignment_4_14798); 
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2426:1: rule__Package__OwnedEntityAssignment_5_0 : ( ruleEntity ) ;
    public final void rule__Package__OwnedEntityAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2430:1: ( ( ruleEntity ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2431:1: ( ruleEntity )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2431:1: ( ruleEntity )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2432:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_5_04829);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2441:1: rule__Package__OwnedEntityAssignment_5_1 : ( ruleEntity ) ;
    public final void rule__Package__OwnedEntityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2445:1: ( ( ruleEntity ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2446:1: ( ruleEntity )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2446:1: ( ruleEntity )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2447:1: ruleEntity
            {
             before(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_5_14860);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2456:1: rule__Package__SubPackageAssignment_6_0 : ( rulePackage ) ;
    public final void rule__Package__SubPackageAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2460:1: ( ( rulePackage ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2461:1: ( rulePackage )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2461:1: ( rulePackage )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2462:1: rulePackage
            {
             before(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_6_0_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_6_04891);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2471:1: rule__Package__SubPackageAssignment_6_1 : ( rulePackage ) ;
    public final void rule__Package__SubPackageAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2475:1: ( ( rulePackage ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2476:1: ( rulePackage )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2476:1: ( rulePackage )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2477:1: rulePackage
            {
             before(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_6_14922);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2486:1: rule__Entity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2490:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2491:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2491:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2492:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_24953); 
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


    // $ANTLR start "rule__Entity__DescriptionAssignment_4_2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2501:1: rule__Entity__DescriptionAssignment_4_2 : ( RULE_STRING ) ;
    public final void rule__Entity__DescriptionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2505:1: ( ( RULE_STRING ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2506:1: ( RULE_STRING )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2506:1: ( RULE_STRING )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2507:1: RULE_STRING
            {
             before(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_4_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_4_24984); 
             after(grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__DescriptionAssignment_4_2"


    // $ANTLR start "rule__Entity__AnnotationsAssignment_5_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2516:1: rule__Entity__AnnotationsAssignment_5_0 : ( ruleEntityAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2520:1: ( ( ruleEntityAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2521:1: ( ruleEntityAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2521:1: ( ruleEntityAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2522:1: ruleEntityAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_5_05015);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2531:1: rule__Entity__AnnotationsAssignment_5_1 : ( ruleEntityAnnotation ) ;
    public final void rule__Entity__AnnotationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2535:1: ( ( ruleEntityAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2536:1: ( ruleEntityAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2536:1: ( ruleEntityAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2537:1: ruleEntityAnnotation
            {
             before(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_5_15046);
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


    // $ANTLR start "rule__Entity__SuperEntityAssignment_6_2"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2546:1: rule__Entity__SuperEntityAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperEntityAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2550:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2551:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2551:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2552:1: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_6_2_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2553:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2554:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_6_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_6_25081); 
             after(grammarAccess.getEntityAccess().getSuperEntityEntityIDTerminalRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperEntityAssignment_6_2"


    // $ANTLR start "rule__Entity__OwnedFeatureAssignment_7_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2565:1: rule__Entity__OwnedFeatureAssignment_7_0 : ( ruleFeature ) ;
    public final void rule__Entity__OwnedFeatureAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2569:1: ( ( ruleFeature ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2570:1: ( ruleFeature )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2570:1: ( ruleFeature )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2571:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_7_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_7_05116);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2580:1: rule__Entity__OwnedFeatureAssignment_7_1 : ( ruleFeature ) ;
    public final void rule__Entity__OwnedFeatureAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2584:1: ( ( ruleFeature ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2585:1: ( ruleFeature )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2585:1: ( ruleFeature )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2586:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_7_15147);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2595:1: rule__Ref__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ref__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2599:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2600:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2600:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2601:1: RULE_ID
            {
             before(grammarAccess.getRefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Ref__NameAssignment_15178); 
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


    // $ANTLR start "rule__Ref__ManyAssignment_3"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2610:1: rule__Ref__ManyAssignment_3 : ( ( 'many' ) ) ;
    public final void rule__Ref__ManyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2614:1: ( ( ( 'many' ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2615:1: ( ( 'many' ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2615:1: ( ( 'many' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2616:1: ( 'many' )
            {
             before(grammarAccess.getRefAccess().getManyManyKeyword_3_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2617:1: ( 'many' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2618:1: 'many'
            {
             before(grammarAccess.getRefAccess().getManyManyKeyword_3_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Ref__ManyAssignment_35214); 
             after(grammarAccess.getRefAccess().getManyManyKeyword_3_0()); 

            }

             after(grammarAccess.getRefAccess().getManyManyKeyword_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Ref__DescriptionAssignment_4_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2633:1: rule__Ref__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Ref__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2637:1: ( ( RULE_STRING ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2638:1: ( RULE_STRING )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2638:1: ( RULE_STRING )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2639:1: RULE_STRING
            {
             before(grammarAccess.getRefAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Ref__DescriptionAssignment_4_15253); 
             after(grammarAccess.getRefAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Ref__AnnotationsAssignment_5_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2648:1: rule__Ref__AnnotationsAssignment_5_0 : ( ruleFetureAnnotation ) ;
    public final void rule__Ref__AnnotationsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2652:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2653:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2653:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2654:1: ruleFetureAnnotation
            {
             before(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_5_05284);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2663:1: rule__Ref__AnnotationsAssignment_5_1 : ( ruleFetureAnnotation ) ;
    public final void rule__Ref__AnnotationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2667:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2668:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2668:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2669:1: ruleFetureAnnotation
            {
             before(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_5_15315);
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


    // $ANTLR start "rule__Ref__SourceAssignment_8"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2678:1: rule__Ref__SourceAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Ref__SourceAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2682:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2683:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2683:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2684:1: ( RULE_ID )
            {
             before(grammarAccess.getRefAccess().getSourceEntityCrossReference_8_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2685:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2686:1: RULE_ID
            {
             before(grammarAccess.getRefAccess().getSourceEntityIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Ref__SourceAssignment_85350); 
             after(grammarAccess.getRefAccess().getSourceEntityIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRefAccess().getSourceEntityCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__SourceAssignment_8"


    // $ANTLR start "rule__Ref__RefToAssignment_11"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2697:1: rule__Ref__RefToAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__Ref__RefToAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2701:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2702:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2702:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2703:1: ( RULE_ID )
            {
             before(grammarAccess.getRefAccess().getRefToEntityCrossReference_11_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2704:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2705:1: RULE_ID
            {
             before(grammarAccess.getRefAccess().getRefToEntityIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Ref__RefToAssignment_115389); 
             after(grammarAccess.getRefAccess().getRefToEntityIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getRefAccess().getRefToEntityCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ref__RefToAssignment_11"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2716:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2720:1: ( ( RULE_ID ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2721:1: ( RULE_ID )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2721:1: ( RULE_ID )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2722:1: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_15424); 
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


    // $ANTLR start "rule__DataType__ManyAssignment_3"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2731:1: rule__DataType__ManyAssignment_3 : ( ( 'many' ) ) ;
    public final void rule__DataType__ManyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2735:1: ( ( ( 'many' ) ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2736:1: ( ( 'many' ) )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2736:1: ( ( 'many' ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2737:1: ( 'many' )
            {
             before(grammarAccess.getDataTypeAccess().getManyManyKeyword_3_0()); 
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2738:1: ( 'many' )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2739:1: 'many'
            {
             before(grammarAccess.getDataTypeAccess().getManyManyKeyword_3_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__DataType__ManyAssignment_35460); 
             after(grammarAccess.getDataTypeAccess().getManyManyKeyword_3_0()); 

            }

             after(grammarAccess.getDataTypeAccess().getManyManyKeyword_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataType__DescriptionAssignment_4_1"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2754:1: rule__DataType__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__DataType__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2758:1: ( ( RULE_STRING ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2759:1: ( RULE_STRING )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2759:1: ( RULE_STRING )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2760:1: RULE_STRING
            {
             before(grammarAccess.getDataTypeAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__DataType__DescriptionAssignment_4_15499); 
             after(grammarAccess.getDataTypeAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__DescriptionAssignment_4_1"


    // $ANTLR start "rule__DataType__AnnotationsAssignment_5_0"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2769:1: rule__DataType__AnnotationsAssignment_5_0 : ( ruleFetureAnnotation ) ;
    public final void rule__DataType__AnnotationsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2773:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2774:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2774:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2775:1: ruleFetureAnnotation
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_5_05530);
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
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2784:1: rule__DataType__AnnotationsAssignment_5_1 : ( ruleFetureAnnotation ) ;
    public final void rule__DataType__AnnotationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2788:1: ( ( ruleFetureAnnotation ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2789:1: ( ruleFetureAnnotation )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2789:1: ( ruleFetureAnnotation )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2790:1: ruleFetureAnnotation
            {
             before(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_5_15561);
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


    // $ANTLR start "rule__DataType__TypeAssignment_8"
    // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2799:1: rule__DataType__TypeAssignment_8 : ( ruleDataTypes ) ;
    public final void rule__DataType__TypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2803:1: ( ( ruleDataTypes ) )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2804:1: ( ruleDataTypes )
            {
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2804:1: ( ruleDataTypes )
            // ../org.yazgel.hermes.xtext.ui/src-gen/org/yazgel/hermes/xtext/ui/contentassist/antlr/internal/InternalHermes.g:2805:1: ruleDataTypes
            {
             before(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataTypes_in_rule__DataType__TypeAssignment_85592);
            ruleDataTypes();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__TypeAssignment_8"

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
        public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21761 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__NameAssignment_2_in_rule__Entity__Group__2__Impl1791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31821 = new BitSet(new long[]{0x0000000253000800L});
        public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Entity__Group__3__Impl1852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41883 = new BitSet(new long[]{0x0000000253000800L});
        public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__0_in_rule__Entity__Group__4__Impl1913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51944 = new BitSet(new long[]{0x0000000253000800L});
        public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl1974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__62005 = new BitSet(new long[]{0x0000000253000800L});
        public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__62008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__0_in_rule__Entity__Group__6__Impl2035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__72066 = new BitSet(new long[]{0x0000000253000800L});
        public static final BitSet FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__72069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__0_in_rule__Entity__Group__7__Impl2096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__82127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Entity__Group__8__Impl2155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__0__Impl_in_rule__Entity__Group_4__02204 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__1_in_rule__Entity__Group_4__02207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Entity__Group_4__0__Impl2235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__1__Impl_in_rule__Entity__Group_4__12266 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__2_in_rule__Entity__Group_4__12269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Entity__Group_4__1__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__2__Impl_in_rule__Entity__Group_4__22328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__DescriptionAssignment_4_2_in_rule__Entity__Group_4__2__Impl2355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__02391 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__02394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_5_0_in_rule__Entity__Group_5__0__Impl2421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__12451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__AnnotationsAssignment_5_1_in_rule__Entity__Group_5__1__Impl2478 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__0__Impl_in_rule__Entity__Group_6__02513 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__1_in_rule__Entity__Group_6__02516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Entity__Group_6__0__Impl2544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__1__Impl_in_rule__Entity__Group_6__12575 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__2_in_rule__Entity__Group_6__12578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Entity__Group_6__1__Impl2606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_6__2__Impl_in_rule__Entity__Group_6__22637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__SuperEntityAssignment_6_2_in_rule__Entity__Group_6__2__Impl2664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__0__Impl_in_rule__Entity__Group_7__02700 = new BitSet(new long[]{0x0000000240000000L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__1_in_rule__Entity__Group_7__02703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__OwnedFeatureAssignment_7_0_in_rule__Entity__Group_7__0__Impl2730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__1__Impl_in_rule__Entity__Group_7__12760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__OwnedFeatureAssignment_7_1_in_rule__Entity__Group_7__1__Impl2787 = new BitSet(new long[]{0x0000000240000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__0__Impl_in_rule__Ref__Group__02822 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Ref__Group__1_in_rule__Ref__Group__02825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Ref__Group__0__Impl2853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__1__Impl_in_rule__Ref__Group__12884 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Ref__Group__2_in_rule__Ref__Group__12887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__NameAssignment_1_in_rule__Ref__Group__1__Impl2914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__2__Impl_in_rule__Ref__Group__22944 = new BitSet(new long[]{0x000000088200F000L});
        public static final BitSet FOLLOW_rule__Ref__Group__3_in_rule__Ref__Group__22947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Ref__Group__2__Impl2975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__3__Impl_in_rule__Ref__Group__33006 = new BitSet(new long[]{0x000000088200F000L});
        public static final BitSet FOLLOW_rule__Ref__Group__4_in_rule__Ref__Group__33009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__ManyAssignment_3_in_rule__Ref__Group__3__Impl3036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__4__Impl_in_rule__Ref__Group__43067 = new BitSet(new long[]{0x000000088200F000L});
        public static final BitSet FOLLOW_rule__Ref__Group__5_in_rule__Ref__Group__43070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_4__0_in_rule__Ref__Group__4__Impl3097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__5__Impl_in_rule__Ref__Group__53128 = new BitSet(new long[]{0x000000088200F000L});
        public static final BitSet FOLLOW_rule__Ref__Group__6_in_rule__Ref__Group__53131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_5__0_in_rule__Ref__Group__5__Impl3158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__6__Impl_in_rule__Ref__Group__63189 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Ref__Group__7_in_rule__Ref__Group__63192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Ref__Group__6__Impl3220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__7__Impl_in_rule__Ref__Group__73251 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Ref__Group__8_in_rule__Ref__Group__73254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Ref__Group__7__Impl3282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__8__Impl_in_rule__Ref__Group__83313 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Ref__Group__9_in_rule__Ref__Group__83316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__SourceAssignment_8_in_rule__Ref__Group__8__Impl3343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__9__Impl_in_rule__Ref__Group__93373 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Ref__Group__10_in_rule__Ref__Group__93376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Ref__Group__9__Impl3404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__10__Impl_in_rule__Ref__Group__103435 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Ref__Group__11_in_rule__Ref__Group__103438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Ref__Group__10__Impl3466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__11__Impl_in_rule__Ref__Group__113497 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Ref__Group__12_in_rule__Ref__Group__113500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__RefToAssignment_11_in_rule__Ref__Group__11__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group__12__Impl_in_rule__Ref__Group__123557 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Ref__Group__12__Impl3585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_4__0__Impl_in_rule__Ref__Group_4__03642 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Ref__Group_4__1_in_rule__Ref__Group_4__03645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Ref__Group_4__0__Impl3673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_4__1__Impl_in_rule__Ref__Group_4__13704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__DescriptionAssignment_4_1_in_rule__Ref__Group_4__1__Impl3731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_5__0__Impl_in_rule__Ref__Group_5__03765 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__Ref__Group_5__1_in_rule__Ref__Group_5__03768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__AnnotationsAssignment_5_0_in_rule__Ref__Group_5__0__Impl3795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__Group_5__1__Impl_in_rule__Ref__Group_5__13825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ref__AnnotationsAssignment_5_1_in_rule__Ref__Group_5__1__Impl3852 = new BitSet(new long[]{0x000000000000F002L});
        public static final BitSet FOLLOW_rule__DataType__Group__0__Impl_in_rule__DataType__Group__03887 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__DataType__Group__1_in_rule__DataType__Group__03890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__DataType__Group__0__Impl3918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__1__Impl_in_rule__DataType__Group__13949 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__DataType__Group__2_in_rule__DataType__Group__13952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__NameAssignment_1_in_rule__DataType__Group__1__Impl3979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__2__Impl_in_rule__DataType__Group__24009 = new BitSet(new long[]{0x0000000C0200F000L});
        public static final BitSet FOLLOW_rule__DataType__Group__3_in_rule__DataType__Group__24012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__DataType__Group__2__Impl4040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__3__Impl_in_rule__DataType__Group__34071 = new BitSet(new long[]{0x0000000C0200F000L});
        public static final BitSet FOLLOW_rule__DataType__Group__4_in_rule__DataType__Group__34074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__ManyAssignment_3_in_rule__DataType__Group__3__Impl4101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__4__Impl_in_rule__DataType__Group__44132 = new BitSet(new long[]{0x0000000C0200F000L});
        public static final BitSet FOLLOW_rule__DataType__Group__5_in_rule__DataType__Group__44135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_4__0_in_rule__DataType__Group__4__Impl4162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__5__Impl_in_rule__DataType__Group__54193 = new BitSet(new long[]{0x0000000C0200F000L});
        public static final BitSet FOLLOW_rule__DataType__Group__6_in_rule__DataType__Group__54196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_5__0_in_rule__DataType__Group__5__Impl4223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__6__Impl_in_rule__DataType__Group__64254 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__DataType__Group__7_in_rule__DataType__Group__64257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__DataType__Group__6__Impl4285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__7__Impl_in_rule__DataType__Group__74316 = new BitSet(new long[]{0x00000000003F0000L});
        public static final BitSet FOLLOW_rule__DataType__Group__8_in_rule__DataType__Group__74319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__DataType__Group__7__Impl4347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__8__Impl_in_rule__DataType__Group__84378 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__DataType__Group__9_in_rule__DataType__Group__84381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__TypeAssignment_8_in_rule__DataType__Group__8__Impl4408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group__9__Impl_in_rule__DataType__Group__94438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__DataType__Group__9__Impl4466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_4__0__Impl_in_rule__DataType__Group_4__04517 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__DataType__Group_4__1_in_rule__DataType__Group_4__04520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__DataType__Group_4__0__Impl4548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_4__1__Impl_in_rule__DataType__Group_4__14579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__DescriptionAssignment_4_1_in_rule__DataType__Group_4__1__Impl4606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_5__0__Impl_in_rule__DataType__Group_5__04640 = new BitSet(new long[]{0x000000000000F000L});
        public static final BitSet FOLLOW_rule__DataType__Group_5__1_in_rule__DataType__Group_5__04643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__AnnotationsAssignment_5_0_in_rule__DataType__Group_5__0__Impl4670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__Group_5__1__Impl_in_rule__DataType__Group_5__14700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DataType__AnnotationsAssignment_5_1_in_rule__DataType__Group_5__1__Impl4727 = new BitSet(new long[]{0x000000000000F002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_24767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Package__DescriptionAssignment_4_14798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_5_04829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__Package__OwnedEntityAssignment_5_14860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_6_04891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePackage_in_rule__Package__SubPackageAssignment_6_14922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_24953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Entity__DescriptionAssignment_4_24984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_5_05015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_rule__Entity__AnnotationsAssignment_5_15046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperEntityAssignment_6_25081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_7_05116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__OwnedFeatureAssignment_7_15147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Ref__NameAssignment_15178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Ref__ManyAssignment_35214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Ref__DescriptionAssignment_4_15253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_5_05284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__Ref__AnnotationsAssignment_5_15315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Ref__SourceAssignment_85350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Ref__RefToAssignment_115389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__DataType__NameAssignment_15424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__DataType__ManyAssignment_35460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__DataType__DescriptionAssignment_4_15499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_5_05530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_rule__DataType__AnnotationsAssignment_5_15561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataTypes_in_rule__DataType__TypeAssignment_85592 = new BitSet(new long[]{0x0000000000000002L});
    }


}