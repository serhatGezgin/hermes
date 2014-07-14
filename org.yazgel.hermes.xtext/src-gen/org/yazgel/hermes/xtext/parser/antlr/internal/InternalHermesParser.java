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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHermesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'package'", "'{'", "'}'", "'entity'", "':'", "'var'", "'[]'", "'.'", "'@Cache'", "'@Index'", "'@Id'", "'@Load'", "'@Ignore'", "'string'", "'integer'", "'boolean'", "'long'", "'double'", "'object'"
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
    public String getGrammarFileName() { return "../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g"; }



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



    // $ANTLR start "entryRuleModule"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:68:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:69:2: (iv_ruleModule= ruleModule EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:70:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModule_in_entryRuleModule75);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModule85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:77:1: ruleModule returns [EObject current=null] : ( () otherlv_1= 'module' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) ( ( (lv_packages_3_0= rulePackage ) ) ( (lv_packages_4_0= rulePackage ) )* )? ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_packages_3_0 = null;

        EObject lv_packages_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:80:28: ( ( () otherlv_1= 'module' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) ( ( (lv_packages_3_0= rulePackage ) ) ( (lv_packages_4_0= rulePackage ) )* )? ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:81:1: ( () otherlv_1= 'module' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) ( ( (lv_packages_3_0= rulePackage ) ) ( (lv_packages_4_0= rulePackage ) )* )? )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:81:1: ( () otherlv_1= 'module' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) ( ( (lv_packages_3_0= rulePackage ) ) ( (lv_packages_4_0= rulePackage ) )* )? )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:81:2: () otherlv_1= 'module' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) ( ( (lv_packages_3_0= rulePackage ) ) ( (lv_packages_4_0= rulePackage ) )* )?
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:81:2: ()
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModuleAccess().getModuleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModule131); 

                	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:91:1: ( (lv_name_2_0= ruleQUALIFIED_NAME ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:92:1: (lv_name_2_0= ruleQUALIFIED_NAME )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:92:1: (lv_name_2_0= ruleQUALIFIED_NAME )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:93:3: lv_name_2_0= ruleQUALIFIED_NAME
            {
             
            	        newCompositeNode(grammarAccess.getModuleAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQUALIFIED_NAME_in_ruleModule152);
            lv_name_2_0=ruleQUALIFIED_NAME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModuleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"QUALIFIED_NAME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:109:2: ( ( (lv_packages_3_0= rulePackage ) ) ( (lv_packages_4_0= rulePackage ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:109:3: ( (lv_packages_3_0= rulePackage ) ) ( (lv_packages_4_0= rulePackage ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:109:3: ( (lv_packages_3_0= rulePackage ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:110:1: (lv_packages_3_0= rulePackage )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:110:1: (lv_packages_3_0= rulePackage )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:111:3: lv_packages_3_0= rulePackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePackage_in_ruleModule174);
                    lv_packages_3_0=rulePackage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		add(
                           			current, 
                           			"packages",
                            		lv_packages_3_0, 
                            		"Package");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:127:2: ( (lv_packages_4_0= rulePackage ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:128:1: (lv_packages_4_0= rulePackage )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:128:1: (lv_packages_4_0= rulePackage )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:129:3: lv_packages_4_0= rulePackage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModuleAccess().getPackagesPackageParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePackage_in_ruleModule195);
                    	    lv_packages_4_0=rulePackage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"packages",
                    	            		lv_packages_4_0, 
                    	            		"Package");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRulePackage"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:153:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:154:2: (iv_rulePackage= rulePackage EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:155:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_entryRulePackage234);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackage244); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:162:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )* )? otherlv_6= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_entities_4_0 = null;

        EObject lv_entities_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:165:28: ( ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )* )? otherlv_6= '}' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:166:1: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )* )? otherlv_6= '}' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:166:1: ( () otherlv_1= 'package' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )* )? otherlv_6= '}' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:166:2: () otherlv_1= 'package' ( (lv_name_2_0= ruleQUALIFIED_NAME ) ) otherlv_3= '{' ( ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )* )? otherlv_6= '}'
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:166:2: ()
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:167:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPackageAccess().getPackageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePackage290); 

                	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:176:1: ( (lv_name_2_0= ruleQUALIFIED_NAME ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:177:1: (lv_name_2_0= ruleQUALIFIED_NAME )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:177:1: (lv_name_2_0= ruleQUALIFIED_NAME )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:178:3: lv_name_2_0= ruleQUALIFIED_NAME
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getNameQUALIFIED_NAMEParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQUALIFIED_NAME_in_rulePackage311);
            lv_name_2_0=ruleQUALIFIED_NAME();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"QUALIFIED_NAME");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePackage323); 

                	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:198:1: ( ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15||LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:198:2: ( (lv_entities_4_0= ruleEntity ) ) ( (lv_entities_5_0= ruleEntity ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:198:2: ( (lv_entities_4_0= ruleEntity ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:199:1: (lv_entities_4_0= ruleEntity )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:199:1: (lv_entities_4_0= ruleEntity )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:200:3: lv_entities_4_0= ruleEntity
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rulePackage345);
                    lv_entities_4_0=ruleEntity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"entities",
                            		lv_entities_4_0, 
                            		"Entity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:216:2: ( (lv_entities_5_0= ruleEntity ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15||LA3_0==20) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:217:1: (lv_entities_5_0= ruleEntity )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:217:1: (lv_entities_5_0= ruleEntity )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:218:3: lv_entities_5_0= ruleEntity
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPackageAccess().getEntitiesEntityParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rulePackage366);
                    	    lv_entities_5_0=ruleEntity();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"entities",
                    	            		lv_entities_5_0, 
                    	            		"Entity");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePackage381); 

                	newLeafNode(otherlv_6, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleFeature"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:246:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:247:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:248:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature417);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature427); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:255:1: ruleFeature returns [EObject current=null] : (this_Reference_0= ruleReference | this_DataType_1= ruleDataType ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_DataType_1 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:258:28: ( (this_Reference_0= ruleReference | this_DataType_1= ruleDataType ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:259:1: (this_Reference_0= ruleReference | this_DataType_1= ruleDataType )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:259:1: (this_Reference_0= ruleReference | this_DataType_1= ruleDataType )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:260:5: this_Reference_0= ruleReference
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getReferenceParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReference_in_ruleFeature474);
                    this_Reference_0=ruleReference();

                    state._fsp--;

                     
                            current = this_Reference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:270:5: this_DataType_1= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDataType_in_ruleFeature501);
                    this_DataType_1=ruleDataType();

                    state._fsp--;

                     
                            current = this_DataType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleEntity"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:286:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:287:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:288:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity536);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity546); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:295:1: ruleEntity returns [EObject current=null] : ( () ( ( (lv_annotations_1_0= ruleEntityAnnotation ) ) ( (lv_annotations_2_0= ruleEntityAnnotation ) )* )? otherlv_3= 'entity' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( ( (lv_features_8_0= ruleFeature ) ) ( (lv_features_9_0= ruleFeature ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Enumerator lv_annotations_1_0 = null;

        Enumerator lv_annotations_2_0 = null;

        EObject lv_features_8_0 = null;

        EObject lv_features_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:298:28: ( ( () ( ( (lv_annotations_1_0= ruleEntityAnnotation ) ) ( (lv_annotations_2_0= ruleEntityAnnotation ) )* )? otherlv_3= 'entity' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( ( (lv_features_8_0= ruleFeature ) ) ( (lv_features_9_0= ruleFeature ) )* )? otherlv_10= '}' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:299:1: ( () ( ( (lv_annotations_1_0= ruleEntityAnnotation ) ) ( (lv_annotations_2_0= ruleEntityAnnotation ) )* )? otherlv_3= 'entity' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( ( (lv_features_8_0= ruleFeature ) ) ( (lv_features_9_0= ruleFeature ) )* )? otherlv_10= '}' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:299:1: ( () ( ( (lv_annotations_1_0= ruleEntityAnnotation ) ) ( (lv_annotations_2_0= ruleEntityAnnotation ) )* )? otherlv_3= 'entity' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( ( (lv_features_8_0= ruleFeature ) ) ( (lv_features_9_0= ruleFeature ) )* )? otherlv_10= '}' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:299:2: () ( ( (lv_annotations_1_0= ruleEntityAnnotation ) ) ( (lv_annotations_2_0= ruleEntityAnnotation ) )* )? otherlv_3= 'entity' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( ( (lv_features_8_0= ruleFeature ) ) ( (lv_features_9_0= ruleFeature ) )* )? otherlv_10= '}'
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:299:2: ()
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:300:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityAccess().getEntityAction_0(),
                        current);
                

            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:305:2: ( ( (lv_annotations_1_0= ruleEntityAnnotation ) ) ( (lv_annotations_2_0= ruleEntityAnnotation ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:305:3: ( (lv_annotations_1_0= ruleEntityAnnotation ) ) ( (lv_annotations_2_0= ruleEntityAnnotation ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:305:3: ( (lv_annotations_1_0= ruleEntityAnnotation ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:306:1: (lv_annotations_1_0= ruleEntityAnnotation )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:306:1: (lv_annotations_1_0= ruleEntityAnnotation )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:307:3: lv_annotations_1_0= ruleEntityAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_ruleEntity602);
                    lv_annotations_1_0=ruleEntityAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_1_0, 
                            		"EntityAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:323:2: ( (lv_annotations_2_0= ruleEntityAnnotation ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==20) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:324:1: (lv_annotations_2_0= ruleEntityAnnotation )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:324:1: (lv_annotations_2_0= ruleEntityAnnotation )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:325:3: lv_annotations_2_0= ruleEntityAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_ruleEntity623);
                    	    lv_annotations_2_0=ruleEntityAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_2_0, 
                    	            		"EntityAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEntity638); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getEntityKeyword_2());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:345:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:346:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:346:1: (lv_name_4_0= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:347:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEntity655); 

            			newLeafNode(lv_name_4_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:363:2: (otherlv_5= ':' ( (otherlv_6= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:363:4: otherlv_5= ':' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEntity673); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getColonKeyword_4_0());
                        
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:367:1: ( (otherlv_6= RULE_ID ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:368:1: (otherlv_6= RULE_ID )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:368:1: (otherlv_6= RULE_ID )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:369:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEntity693); 

                    		newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEntity707); 

                	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:384:1: ( ( (lv_features_8_0= ruleFeature ) ) ( (lv_features_9_0= ruleFeature ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17||(LA10_0>=21 && LA10_0<=24)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:384:2: ( (lv_features_8_0= ruleFeature ) ) ( (lv_features_9_0= ruleFeature ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:384:2: ( (lv_features_8_0= ruleFeature ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:385:1: (lv_features_8_0= ruleFeature )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:385:1: (lv_features_8_0= ruleFeature )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:386:3: lv_features_8_0= ruleFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleEntity729);
                    lv_features_8_0=ruleFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		add(
                           			current, 
                           			"features",
                            		lv_features_8_0, 
                            		"Feature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:402:2: ( (lv_features_9_0= ruleFeature ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==17||(LA9_0>=21 && LA9_0<=24)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:403:1: (lv_features_9_0= ruleFeature )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:403:1: (lv_features_9_0= ruleFeature )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:404:3: lv_features_9_0= ruleFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleEntity750);
                    	    lv_features_9_0=ruleFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"features",
                    	            		lv_features_9_0, 
                    	            		"Feature");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEntity765); 

                	newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleReference"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:432:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:433:2: (iv_ruleReference= ruleReference EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:434:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReference_in_entryRuleReference801);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReference811); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:441:1: ruleReference returns [EObject current=null] : ( () ( ( (lv_annotations_1_0= ruleFetureAnnotation ) ) ( (lv_annotations_2_0= ruleFetureAnnotation ) )* )? otherlv_3= 'var' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) ( (lv_many_6_0= '[]' ) )? ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_many_6_0=null;
        Enumerator lv_annotations_1_0 = null;

        Enumerator lv_annotations_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:444:28: ( ( () ( ( (lv_annotations_1_0= ruleFetureAnnotation ) ) ( (lv_annotations_2_0= ruleFetureAnnotation ) )* )? otherlv_3= 'var' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) ( (lv_many_6_0= '[]' ) )? ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:445:1: ( () ( ( (lv_annotations_1_0= ruleFetureAnnotation ) ) ( (lv_annotations_2_0= ruleFetureAnnotation ) )* )? otherlv_3= 'var' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) ( (lv_many_6_0= '[]' ) )? )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:445:1: ( () ( ( (lv_annotations_1_0= ruleFetureAnnotation ) ) ( (lv_annotations_2_0= ruleFetureAnnotation ) )* )? otherlv_3= 'var' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) ( (lv_many_6_0= '[]' ) )? )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:445:2: () ( ( (lv_annotations_1_0= ruleFetureAnnotation ) ) ( (lv_annotations_2_0= ruleFetureAnnotation ) )* )? otherlv_3= 'var' ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= RULE_ID ) ) ( (lv_many_6_0= '[]' ) )?
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:445:2: ()
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:446:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getReferenceAccess().getReferenceAction_0(),
                        current);
                

            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:451:2: ( ( (lv_annotations_1_0= ruleFetureAnnotation ) ) ( (lv_annotations_2_0= ruleFetureAnnotation ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=21 && LA12_0<=24)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:451:3: ( (lv_annotations_1_0= ruleFetureAnnotation ) ) ( (lv_annotations_2_0= ruleFetureAnnotation ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:451:3: ( (lv_annotations_1_0= ruleFetureAnnotation ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:452:1: (lv_annotations_1_0= ruleFetureAnnotation )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:452:1: (lv_annotations_1_0= ruleFetureAnnotation )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:453:3: lv_annotations_1_0= ruleFetureAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleReference867);
                    lv_annotations_1_0=ruleFetureAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReferenceRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_1_0, 
                            		"FetureAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:469:2: ( (lv_annotations_2_0= ruleFetureAnnotation ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=21 && LA11_0<=24)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:470:1: (lv_annotations_2_0= ruleFetureAnnotation )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:470:1: (lv_annotations_2_0= ruleFetureAnnotation )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:471:3: lv_annotations_2_0= ruleFetureAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getReferenceAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleReference888);
                    	    lv_annotations_2_0=ruleFetureAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getReferenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_2_0, 
                    	            		"FetureAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleReference903); 

                	newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getVarKeyword_2());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:491:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:492:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:492:1: (lv_name_4_0= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:493:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleReference920); 

            			newLeafNode(lv_name_4_0, grammarAccess.getReferenceAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:509:2: ( (otherlv_5= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:510:1: (otherlv_5= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:510:1: (otherlv_5= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:511:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleReference945); 

            		newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getReferenceEntityCrossReference_4_0()); 
            	

            }


            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:522:2: ( (lv_many_6_0= '[]' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:523:1: (lv_many_6_0= '[]' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:523:1: (lv_many_6_0= '[]' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:524:3: lv_many_6_0= '[]'
                    {
                    lv_many_6_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleReference963); 

                            newLeafNode(lv_many_6_0, grammarAccess.getReferenceAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleDataType"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:545:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:546:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:547:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataType_in_entryRuleDataType1013);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataType1023); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:554:1: ruleDataType returns [EObject current=null] : ( () ( ( (lv_annotations_1_0= ruleFetureAnnotation ) ) ( (lv_annotations_2_0= ruleFetureAnnotation ) )* )? otherlv_3= 'var' ( (lv_name_4_0= RULE_ID ) ) ( (lv_type_5_0= ruleDataTypes ) ) ( (lv_many_6_0= '[]' ) )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token lv_many_6_0=null;
        Enumerator lv_annotations_1_0 = null;

        Enumerator lv_annotations_2_0 = null;

        Enumerator lv_type_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:557:28: ( ( () ( ( (lv_annotations_1_0= ruleFetureAnnotation ) ) ( (lv_annotations_2_0= ruleFetureAnnotation ) )* )? otherlv_3= 'var' ( (lv_name_4_0= RULE_ID ) ) ( (lv_type_5_0= ruleDataTypes ) ) ( (lv_many_6_0= '[]' ) )? ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:558:1: ( () ( ( (lv_annotations_1_0= ruleFetureAnnotation ) ) ( (lv_annotations_2_0= ruleFetureAnnotation ) )* )? otherlv_3= 'var' ( (lv_name_4_0= RULE_ID ) ) ( (lv_type_5_0= ruleDataTypes ) ) ( (lv_many_6_0= '[]' ) )? )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:558:1: ( () ( ( (lv_annotations_1_0= ruleFetureAnnotation ) ) ( (lv_annotations_2_0= ruleFetureAnnotation ) )* )? otherlv_3= 'var' ( (lv_name_4_0= RULE_ID ) ) ( (lv_type_5_0= ruleDataTypes ) ) ( (lv_many_6_0= '[]' ) )? )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:558:2: () ( ( (lv_annotations_1_0= ruleFetureAnnotation ) ) ( (lv_annotations_2_0= ruleFetureAnnotation ) )* )? otherlv_3= 'var' ( (lv_name_4_0= RULE_ID ) ) ( (lv_type_5_0= ruleDataTypes ) ) ( (lv_many_6_0= '[]' ) )?
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:558:2: ()
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:559:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataTypeAccess().getDataTypeAction_0(),
                        current);
                

            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:564:2: ( ( (lv_annotations_1_0= ruleFetureAnnotation ) ) ( (lv_annotations_2_0= ruleFetureAnnotation ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=21 && LA15_0<=24)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:564:3: ( (lv_annotations_1_0= ruleFetureAnnotation ) ) ( (lv_annotations_2_0= ruleFetureAnnotation ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:564:3: ( (lv_annotations_1_0= ruleFetureAnnotation ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:565:1: (lv_annotations_1_0= ruleFetureAnnotation )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:565:1: (lv_annotations_1_0= ruleFetureAnnotation )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:566:3: lv_annotations_1_0= ruleFetureAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleDataType1079);
                    lv_annotations_1_0=ruleFetureAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_1_0, 
                            		"FetureAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:582:2: ( (lv_annotations_2_0= ruleFetureAnnotation ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=21 && LA14_0<=24)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:583:1: (lv_annotations_2_0= ruleFetureAnnotation )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:583:1: (lv_annotations_2_0= ruleFetureAnnotation )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:584:3: lv_annotations_2_0= ruleFetureAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleDataType1100);
                    	    lv_annotations_2_0=ruleFetureAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_2_0, 
                    	            		"FetureAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDataType1115); 

                	newLeafNode(otherlv_3, grammarAccess.getDataTypeAccess().getVarKeyword_2());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:604:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:605:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:605:1: (lv_name_4_0= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:606:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDataType1132); 

            			newLeafNode(lv_name_4_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:622:2: ( (lv_type_5_0= ruleDataTypes ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:623:1: (lv_type_5_0= ruleDataTypes )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:623:1: (lv_type_5_0= ruleDataTypes )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:624:3: lv_type_5_0= ruleDataTypes
            {
             
            	        newCompositeNode(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDataTypes_in_ruleDataType1158);
            lv_type_5_0=ruleDataTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_5_0, 
                    		"DataTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:640:2: ( (lv_many_6_0= '[]' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:641:1: (lv_many_6_0= '[]' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:641:1: (lv_many_6_0= '[]' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:642:3: lv_many_6_0= '[]'
                    {
                    lv_many_6_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDataType1176); 

                            newLeafNode(lv_many_6_0, grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleQUALIFIED_NAME"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:663:1: entryRuleQUALIFIED_NAME returns [String current=null] : iv_ruleQUALIFIED_NAME= ruleQUALIFIED_NAME EOF ;
    public final String entryRuleQUALIFIED_NAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQUALIFIED_NAME = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:664:2: (iv_ruleQUALIFIED_NAME= ruleQUALIFIED_NAME EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:665:2: iv_ruleQUALIFIED_NAME= ruleQUALIFIED_NAME EOF
            {
             newCompositeNode(grammarAccess.getQUALIFIED_NAMERule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQUALIFIED_NAME_in_entryRuleQUALIFIED_NAME1227);
            iv_ruleQUALIFIED_NAME=ruleQUALIFIED_NAME();

            state._fsp--;

             current =iv_ruleQUALIFIED_NAME.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQUALIFIED_NAME1238); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQUALIFIED_NAME"


    // $ANTLR start "ruleQUALIFIED_NAME"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:672:1: ruleQUALIFIED_NAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQUALIFIED_NAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:675:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:676:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:676:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:676:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQUALIFIED_NAME1278); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:683:1: (kw= '.' this_ID_2= RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:684:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleQUALIFIED_NAME1297); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQUALIFIED_NAMEAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQUALIFIED_NAME1312); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQUALIFIED_NAMEAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQUALIFIED_NAME"


    // $ANTLR start "ruleEntityAnnotation"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:704:1: ruleEntityAnnotation returns [Enumerator current=null] : (enumLiteral_0= '@Cache' ) ;
    public final Enumerator ruleEntityAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:706:28: ( (enumLiteral_0= '@Cache' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:707:1: (enumLiteral_0= '@Cache' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:707:1: (enumLiteral_0= '@Cache' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:707:3: enumLiteral_0= '@Cache'
            {
            enumLiteral_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEntityAnnotation1372); 

                    current = grammarAccess.getEntityAnnotationAccess().getCacheEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getEntityAnnotationAccess().getCacheEnumLiteralDeclaration()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityAnnotation"


    // $ANTLR start "ruleFetureAnnotation"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:717:1: ruleFetureAnnotation returns [Enumerator current=null] : ( (enumLiteral_0= '@Index' ) | (enumLiteral_1= '@Id' ) | (enumLiteral_2= '@Load' ) | (enumLiteral_3= '@Ignore' ) ) ;
    public final Enumerator ruleFetureAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:719:28: ( ( (enumLiteral_0= '@Index' ) | (enumLiteral_1= '@Id' ) | (enumLiteral_2= '@Load' ) | (enumLiteral_3= '@Ignore' ) ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:720:1: ( (enumLiteral_0= '@Index' ) | (enumLiteral_1= '@Id' ) | (enumLiteral_2= '@Load' ) | (enumLiteral_3= '@Ignore' ) )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:720:1: ( (enumLiteral_0= '@Index' ) | (enumLiteral_1= '@Id' ) | (enumLiteral_2= '@Load' ) | (enumLiteral_3= '@Ignore' ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt18=1;
                }
                break;
            case 22:
                {
                alt18=2;
                }
                break;
            case 23:
                {
                alt18=3;
                }
                break;
            case 24:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:720:2: (enumLiteral_0= '@Index' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:720:2: (enumLiteral_0= '@Index' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:720:4: enumLiteral_0= '@Index'
                    {
                    enumLiteral_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFetureAnnotation1416); 

                            current = grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:726:6: (enumLiteral_1= '@Id' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:726:6: (enumLiteral_1= '@Id' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:726:8: enumLiteral_1= '@Id'
                    {
                    enumLiteral_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFetureAnnotation1433); 

                            current = grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:732:6: (enumLiteral_2= '@Load' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:732:6: (enumLiteral_2= '@Load' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:732:8: enumLiteral_2= '@Load'
                    {
                    enumLiteral_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFetureAnnotation1450); 

                            current = grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:738:6: (enumLiteral_3= '@Ignore' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:738:6: (enumLiteral_3= '@Ignore' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:738:8: enumLiteral_3= '@Ignore'
                    {
                    enumLiteral_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFetureAnnotation1467); 

                            current = grammarAccess.getFetureAnnotationAccess().getIgnoreEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getFetureAnnotationAccess().getIgnoreEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFetureAnnotation"


    // $ANTLR start "ruleDataTypes"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:748:1: ruleDataTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'object' ) ) ;
    public final Enumerator ruleDataTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:750:28: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'object' ) ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:751:1: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'object' ) )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:751:1: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'integer' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'long' ) | (enumLiteral_4= 'double' ) | (enumLiteral_5= 'object' ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt19=1;
                }
                break;
            case 26:
                {
                alt19=2;
                }
                break;
            case 27:
                {
                alt19=3;
                }
                break;
            case 28:
                {
                alt19=4;
                }
                break;
            case 29:
                {
                alt19=5;
                }
                break;
            case 30:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:751:2: (enumLiteral_0= 'string' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:751:2: (enumLiteral_0= 'string' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:751:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDataTypes1512); 

                            current = grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:757:6: (enumLiteral_1= 'integer' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:757:6: (enumLiteral_1= 'integer' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:757:8: enumLiteral_1= 'integer'
                    {
                    enumLiteral_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDataTypes1529); 

                            current = grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:763:6: (enumLiteral_2= 'boolean' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:763:6: (enumLiteral_2= 'boolean' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:763:8: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleDataTypes1546); 

                            current = grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:769:6: (enumLiteral_3= 'long' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:769:6: (enumLiteral_3= 'long' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:769:8: enumLiteral_3= 'long'
                    {
                    enumLiteral_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDataTypes1563); 

                            current = grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:775:6: (enumLiteral_4= 'double' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:775:6: (enumLiteral_4= 'double' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:775:8: enumLiteral_4= 'double'
                    {
                    enumLiteral_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataTypes1580); 

                            current = grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:781:6: (enumLiteral_5= 'object' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:781:6: (enumLiteral_5= 'object' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:781:8: enumLiteral_5= 'object'
                    {
                    enumLiteral_5=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDataTypes1597); 

                            current = grammarAccess.getDataTypesAccess().getObjectEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDataTypesAccess().getObjectEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypes"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\15\uffff";
    static final String DFA5_eofS =
        "\15\uffff";
    static final String DFA5_minS =
        "\5\21\1\4\4\21\1\4\2\uffff";
    static final String DFA5_maxS =
        "\5\30\1\4\4\30\1\36\2\uffff";
    static final String DFA5_acceptS =
        "\13\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\5\3\uffff\1\1\1\2\1\3\1\4",
            "\1\5\3\uffff\1\6\1\7\1\10\1\11",
            "\1\5\3\uffff\1\6\1\7\1\10\1\11",
            "\1\5\3\uffff\1\6\1\7\1\10\1\11",
            "\1\5\3\uffff\1\6\1\7\1\10\1\11",
            "\1\12",
            "\1\5\3\uffff\1\6\1\7\1\10\1\11",
            "\1\5\3\uffff\1\6\1\7\1\10\1\11",
            "\1\5\3\uffff\1\6\1\7\1\10\1\11",
            "\1\5\3\uffff\1\6\1\7\1\10\1\11",
            "\1\14\24\uffff\6\13",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "259:1: (this_Reference_0= ruleReference | this_DataType_1= ruleDataType )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModule_in_entryRuleModule75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModule85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleModule131 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_ruleModule152 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rulePackage_in_ruleModule174 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rulePackage_in_ruleModule195 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_rulePackage_in_entryRulePackage234 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rulePackage290 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_rulePackage311 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePackage323 = new BitSet(new long[]{0x000000000010C000L});
        public static final BitSet FOLLOW_ruleEntity_in_rulePackage345 = new BitSet(new long[]{0x000000000010C000L});
        public static final BitSet FOLLOW_ruleEntity_in_rulePackage366 = new BitSet(new long[]{0x000000000010C000L});
        public static final BitSet FOLLOW_14_in_rulePackage381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature417 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReference_in_ruleFeature474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_ruleFeature501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity536 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_ruleEntity602 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_ruleEntity623 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_15_in_ruleEntity638 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEntity655 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_16_in_ruleEntity673 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEntity693 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEntity707 = new BitSet(new long[]{0x0000000001E24000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleEntity729 = new BitSet(new long[]{0x0000000001E24000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleEntity750 = new BitSet(new long[]{0x0000000001E24000L});
        public static final BitSet FOLLOW_14_in_ruleEntity765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReference_in_entryRuleReference801 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReference811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleReference867 = new BitSet(new long[]{0x0000000001E20000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleReference888 = new BitSet(new long[]{0x0000000001E20000L});
        public static final BitSet FOLLOW_17_in_ruleReference903 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleReference920 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleReference945 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleReference963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType1013 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataType1023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleDataType1079 = new BitSet(new long[]{0x0000000001E20000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleDataType1100 = new BitSet(new long[]{0x0000000001E20000L});
        public static final BitSet FOLLOW_17_in_ruleDataType1115 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDataType1132 = new BitSet(new long[]{0x000000007E000000L});
        public static final BitSet FOLLOW_ruleDataTypes_in_ruleDataType1158 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleDataType1176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQUALIFIED_NAME_in_entryRuleQUALIFIED_NAME1227 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQUALIFIED_NAME1238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIED_NAME1278 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleQUALIFIED_NAME1297 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQUALIFIED_NAME1312 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_20_in_ruleEntityAnnotation1372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleFetureAnnotation1416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleFetureAnnotation1433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleFetureAnnotation1450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleFetureAnnotation1467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleDataTypes1512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleDataTypes1529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleDataTypes1546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleDataTypes1563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleDataTypes1580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleDataTypes1597 = new BitSet(new long[]{0x0000000000000002L});
    }


}