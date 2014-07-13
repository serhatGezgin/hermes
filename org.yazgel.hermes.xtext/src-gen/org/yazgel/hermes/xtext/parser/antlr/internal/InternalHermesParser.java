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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'}'", "'@'", "'Entity'", "':'", "'var'", "'[]'", "'Cache'", "'Index'", "'Id'", "'Load'", "'Ignore'", "'String'", "'Integer'", "'Boolean'", "'Long'", "'Double'", "'Object'"
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
        	return "Package";	
       	}
       	
       	@Override
       	protected HermesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePackage"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:68:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:69:2: (iv_rulePackage= rulePackage EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:70:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePackage_in_entryRulePackage75);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePackage85); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:77:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'Package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_ownedEntity_4_0= ruleEntity ) ) ( (lv_ownedEntity_5_0= ruleEntity ) )* )? ( ( (lv_subPackage_6_0= rulePackage ) ) ( (lv_subPackage_7_0= rulePackage ) )* )? otherlv_8= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        EObject lv_ownedEntity_4_0 = null;

        EObject lv_ownedEntity_5_0 = null;

        EObject lv_subPackage_6_0 = null;

        EObject lv_subPackage_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:80:28: ( ( () otherlv_1= 'Package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_ownedEntity_4_0= ruleEntity ) ) ( (lv_ownedEntity_5_0= ruleEntity ) )* )? ( ( (lv_subPackage_6_0= rulePackage ) ) ( (lv_subPackage_7_0= rulePackage ) )* )? otherlv_8= '}' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:81:1: ( () otherlv_1= 'Package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_ownedEntity_4_0= ruleEntity ) ) ( (lv_ownedEntity_5_0= ruleEntity ) )* )? ( ( (lv_subPackage_6_0= rulePackage ) ) ( (lv_subPackage_7_0= rulePackage ) )* )? otherlv_8= '}' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:81:1: ( () otherlv_1= 'Package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_ownedEntity_4_0= ruleEntity ) ) ( (lv_ownedEntity_5_0= ruleEntity ) )* )? ( ( (lv_subPackage_6_0= rulePackage ) ) ( (lv_subPackage_7_0= rulePackage ) )* )? otherlv_8= '}' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:81:2: () otherlv_1= 'Package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_ownedEntity_4_0= ruleEntity ) ) ( (lv_ownedEntity_5_0= ruleEntity ) )* )? ( ( (lv_subPackage_6_0= rulePackage ) ) ( (lv_subPackage_7_0= rulePackage ) )* )? otherlv_8= '}'
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:81:2: ()
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPackageAccess().getPackageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePackage131); 

                	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:91:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:92:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:92:1: (lv_name_2_0= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:93:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePackage148); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPackageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePackage165); 

                	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:113:1: ( ( (lv_ownedEntity_4_0= ruleEntity ) ) ( (lv_ownedEntity_5_0= ruleEntity ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=14 && LA2_0<=15)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:113:2: ( (lv_ownedEntity_4_0= ruleEntity ) ) ( (lv_ownedEntity_5_0= ruleEntity ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:113:2: ( (lv_ownedEntity_4_0= ruleEntity ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:114:1: (lv_ownedEntity_4_0= ruleEntity )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:114:1: (lv_ownedEntity_4_0= ruleEntity )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:115:3: lv_ownedEntity_4_0= ruleEntity
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rulePackage187);
                    lv_ownedEntity_4_0=ruleEntity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"ownedEntity",
                            		lv_ownedEntity_4_0, 
                            		"Entity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:131:2: ( (lv_ownedEntity_5_0= ruleEntity ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:132:1: (lv_ownedEntity_5_0= ruleEntity )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:132:1: (lv_ownedEntity_5_0= ruleEntity )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:133:3: lv_ownedEntity_5_0= ruleEntity
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rulePackage208);
                    	    lv_ownedEntity_5_0=ruleEntity();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ownedEntity",
                    	            		lv_ownedEntity_5_0, 
                    	            		"Entity");
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

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:149:5: ( ( (lv_subPackage_6_0= rulePackage ) ) ( (lv_subPackage_7_0= rulePackage ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:149:6: ( (lv_subPackage_6_0= rulePackage ) ) ( (lv_subPackage_7_0= rulePackage ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:149:6: ( (lv_subPackage_6_0= rulePackage ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:150:1: (lv_subPackage_6_0= rulePackage )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:150:1: (lv_subPackage_6_0= rulePackage )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:151:3: lv_subPackage_6_0= rulePackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePackage_in_rulePackage233);
                    lv_subPackage_6_0=rulePackage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"subPackage",
                            		lv_subPackage_6_0, 
                            		"Package");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:167:2: ( (lv_subPackage_7_0= rulePackage ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==11) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:168:1: (lv_subPackage_7_0= rulePackage )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:168:1: (lv_subPackage_7_0= rulePackage )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:169:3: lv_subPackage_7_0= rulePackage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePackage_in_rulePackage254);
                    	    lv_subPackage_7_0=rulePackage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subPackage",
                    	            		lv_subPackage_7_0, 
                    	            		"Package");
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

            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePackage269); 

                	newLeafNode(otherlv_8, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:197:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:198:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:199:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature305);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature315); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:206:1: ruleFeature returns [EObject current=null] : (this_Ref_0= ruleRef | this_DataType_1= ruleDataType ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Ref_0 = null;

        EObject this_DataType_1 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:209:28: ( (this_Ref_0= ruleRef | this_DataType_1= ruleDataType ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:210:1: (this_Ref_0= ruleRef | this_DataType_1= ruleDataType )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:210:1: (this_Ref_0= ruleRef | this_DataType_1= ruleDataType )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:211:5: this_Ref_0= ruleRef
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getRefParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRef_in_ruleFeature362);
                    this_Ref_0=ruleRef();

                    state._fsp--;

                     
                            current = this_Ref_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:221:5: this_DataType_1= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDataType_in_ruleFeature389);
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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:237:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:238:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:239:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity424);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity434); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:246:1: ruleEntity returns [EObject current=null] : ( () (otherlv_1= '@' ( (lv_annotations_2_0= ruleEntityAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleEntityAnnotation ) ) )* )? otherlv_5= 'Entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_ownedFeature_10_0= ruleFeature ) ) ( (lv_ownedFeature_11_0= ruleFeature ) )* )? otherlv_12= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Enumerator lv_annotations_2_0 = null;

        Enumerator lv_annotations_4_0 = null;

        EObject lv_ownedFeature_10_0 = null;

        EObject lv_ownedFeature_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:249:28: ( ( () (otherlv_1= '@' ( (lv_annotations_2_0= ruleEntityAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleEntityAnnotation ) ) )* )? otherlv_5= 'Entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_ownedFeature_10_0= ruleFeature ) ) ( (lv_ownedFeature_11_0= ruleFeature ) )* )? otherlv_12= '}' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:250:1: ( () (otherlv_1= '@' ( (lv_annotations_2_0= ruleEntityAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleEntityAnnotation ) ) )* )? otherlv_5= 'Entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_ownedFeature_10_0= ruleFeature ) ) ( (lv_ownedFeature_11_0= ruleFeature ) )* )? otherlv_12= '}' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:250:1: ( () (otherlv_1= '@' ( (lv_annotations_2_0= ruleEntityAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleEntityAnnotation ) ) )* )? otherlv_5= 'Entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_ownedFeature_10_0= ruleFeature ) ) ( (lv_ownedFeature_11_0= ruleFeature ) )* )? otherlv_12= '}' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:250:2: () (otherlv_1= '@' ( (lv_annotations_2_0= ruleEntityAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleEntityAnnotation ) ) )* )? otherlv_5= 'Entity' ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( ( (lv_ownedFeature_10_0= ruleFeature ) ) ( (lv_ownedFeature_11_0= ruleFeature ) )* )? otherlv_12= '}'
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:250:2: ()
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:251:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityAccess().getEntityAction_0(),
                        current);
                

            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:256:2: (otherlv_1= '@' ( (lv_annotations_2_0= ruleEntityAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleEntityAnnotation ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:256:4: otherlv_1= '@' ( (lv_annotations_2_0= ruleEntityAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleEntityAnnotation ) ) )*
                    {
                    otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEntity481); 

                        	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getCommercialAtKeyword_1_0());
                        
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:260:1: ( (lv_annotations_2_0= ruleEntityAnnotation ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:261:1: (lv_annotations_2_0= ruleEntityAnnotation )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:261:1: (lv_annotations_2_0= ruleEntityAnnotation )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:262:3: lv_annotations_2_0= ruleEntityAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_ruleEntity502);
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

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:278:2: (otherlv_3= '@' ( (lv_annotations_4_0= ruleEntityAnnotation ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:278:4: otherlv_3= '@' ( (lv_annotations_4_0= ruleEntityAnnotation ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEntity515); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getCommercialAtKeyword_1_2_0());
                    	        
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:282:1: ( (lv_annotations_4_0= ruleEntityAnnotation ) )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:283:1: (lv_annotations_4_0= ruleEntityAnnotation )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:283:1: (lv_annotations_4_0= ruleEntityAnnotation )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:284:3: lv_annotations_4_0= ruleEntityAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_ruleEntity536);
                    	    lv_annotations_4_0=ruleEntityAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_4_0, 
                    	            		"EntityAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


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

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEntity552); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getEntityKeyword_2());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:304:1: ( (lv_name_6_0= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:305:1: (lv_name_6_0= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:305:1: (lv_name_6_0= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:306:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEntity569); 

            			newLeafNode(lv_name_6_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"ID");
            	    

            }


            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:322:2: (otherlv_7= ':' ( (otherlv_8= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:322:4: otherlv_7= ':' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEntity587); 

                        	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getColonKeyword_4_0());
                        
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:326:1: ( (otherlv_8= RULE_ID ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:327:1: (otherlv_8= RULE_ID )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:327:1: (otherlv_8= RULE_ID )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:328:3: otherlv_8= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEntity607); 

                    		newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEntity621); 

                	newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:343:1: ( ( (lv_ownedFeature_10_0= ruleFeature ) ) ( (lv_ownedFeature_11_0= ruleFeature ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14||LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:343:2: ( (lv_ownedFeature_10_0= ruleFeature ) ) ( (lv_ownedFeature_11_0= ruleFeature ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:343:2: ( (lv_ownedFeature_10_0= ruleFeature ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:344:1: (lv_ownedFeature_10_0= ruleFeature )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:344:1: (lv_ownedFeature_10_0= ruleFeature )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:345:3: lv_ownedFeature_10_0= ruleFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleEntity643);
                    lv_ownedFeature_10_0=ruleFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		add(
                           			current, 
                           			"ownedFeature",
                            		lv_ownedFeature_10_0, 
                            		"Feature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:361:2: ( (lv_ownedFeature_11_0= ruleFeature ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14||LA9_0==17) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:362:1: (lv_ownedFeature_11_0= ruleFeature )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:362:1: (lv_ownedFeature_11_0= ruleFeature )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:363:3: lv_ownedFeature_11_0= ruleFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleEntity664);
                    	    lv_ownedFeature_11_0=ruleFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ownedFeature",
                    	            		lv_ownedFeature_11_0, 
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

            otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEntity679); 

                	newLeafNode(otherlv_12, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleRef"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:391:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:392:2: (iv_ruleRef= ruleRef EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:393:2: iv_ruleRef= ruleRef EOF
            {
             newCompositeNode(grammarAccess.getRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRef_in_entryRuleRef715);
            iv_ruleRef=ruleRef();

            state._fsp--;

             current =iv_ruleRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRef725); 

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
    // $ANTLR end "entryRuleRef"


    // $ANTLR start "ruleRef"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:400:1: ruleRef returns [EObject current=null] : ( () (otherlv_1= '@' ( (lv_annotations_2_0= ruleFetureAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) ) )* )? otherlv_5= 'var' ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token lv_many_8_0=null;
        Enumerator lv_annotations_2_0 = null;

        Enumerator lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:403:28: ( ( () (otherlv_1= '@' ( (lv_annotations_2_0= ruleFetureAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) ) )* )? otherlv_5= 'var' ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:404:1: ( () (otherlv_1= '@' ( (lv_annotations_2_0= ruleFetureAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) ) )* )? otherlv_5= 'var' ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:404:1: ( () (otherlv_1= '@' ( (lv_annotations_2_0= ruleFetureAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) ) )* )? otherlv_5= 'var' ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_many_8_0= '[]' ) )? )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:404:2: () (otherlv_1= '@' ( (lv_annotations_2_0= ruleFetureAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) ) )* )? otherlv_5= 'var' ( (lv_name_6_0= RULE_ID ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_many_8_0= '[]' ) )?
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:404:2: ()
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:405:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRefAccess().getRefAction_0(),
                        current);
                

            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:410:2: (otherlv_1= '@' ( (lv_annotations_2_0= ruleFetureAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:410:4: otherlv_1= '@' ( (lv_annotations_2_0= ruleFetureAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) ) )*
                    {
                    otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRef772); 

                        	newLeafNode(otherlv_1, grammarAccess.getRefAccess().getCommercialAtKeyword_1_0());
                        
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:414:1: ( (lv_annotations_2_0= ruleFetureAnnotation ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:415:1: (lv_annotations_2_0= ruleFetureAnnotation )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:415:1: (lv_annotations_2_0= ruleFetureAnnotation )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:416:3: lv_annotations_2_0= ruleFetureAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleRef793);
                    lv_annotations_2_0=ruleFetureAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRefRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_2_0, 
                            		"FetureAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:432:2: (otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:432:4: otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRef806); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getRefAccess().getCommercialAtKeyword_1_2_0());
                    	        
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:436:1: ( (lv_annotations_4_0= ruleFetureAnnotation ) )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:437:1: (lv_annotations_4_0= ruleFetureAnnotation )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:437:1: (lv_annotations_4_0= ruleFetureAnnotation )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:438:3: lv_annotations_4_0= ruleFetureAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleRef827);
                    	    lv_annotations_4_0=ruleFetureAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_4_0, 
                    	            		"FetureAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


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

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRef843); 

                	newLeafNode(otherlv_5, grammarAccess.getRefAccess().getVarKeyword_2());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:458:1: ( (lv_name_6_0= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:459:1: (lv_name_6_0= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:459:1: (lv_name_6_0= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:460:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRef860); 

            			newLeafNode(lv_name_6_0, grammarAccess.getRefAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"ID");
            	    

            }


            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:476:2: ( (otherlv_7= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:477:1: (otherlv_7= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:477:1: (otherlv_7= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:478:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRef885); 

            		newLeafNode(otherlv_7, grammarAccess.getRefAccess().getRefToEntityCrossReference_4_0()); 
            	

            }


            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:489:2: ( (lv_many_8_0= '[]' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:490:1: (lv_many_8_0= '[]' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:490:1: (lv_many_8_0= '[]' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:491:3: lv_many_8_0= '[]'
                    {
                    lv_many_8_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRef903); 

                            newLeafNode(lv_many_8_0, grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRefRule());
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
    // $ANTLR end "ruleRef"


    // $ANTLR start "entryRuleDataType"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:512:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:513:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:514:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataType_in_entryRuleDataType953);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataType963); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:521:1: ruleDataType returns [EObject current=null] : ( () (otherlv_1= '@' ( (lv_annotations_2_0= ruleFetureAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) ) )* )? otherlv_5= 'var' ( (lv_name_6_0= RULE_ID ) ) ( (lv_type_7_0= ruleDataTypes ) ) ( (lv_many_8_0= '[]' ) )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token lv_many_8_0=null;
        Enumerator lv_annotations_2_0 = null;

        Enumerator lv_annotations_4_0 = null;

        Enumerator lv_type_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:524:28: ( ( () (otherlv_1= '@' ( (lv_annotations_2_0= ruleFetureAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) ) )* )? otherlv_5= 'var' ( (lv_name_6_0= RULE_ID ) ) ( (lv_type_7_0= ruleDataTypes ) ) ( (lv_many_8_0= '[]' ) )? ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:525:1: ( () (otherlv_1= '@' ( (lv_annotations_2_0= ruleFetureAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) ) )* )? otherlv_5= 'var' ( (lv_name_6_0= RULE_ID ) ) ( (lv_type_7_0= ruleDataTypes ) ) ( (lv_many_8_0= '[]' ) )? )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:525:1: ( () (otherlv_1= '@' ( (lv_annotations_2_0= ruleFetureAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) ) )* )? otherlv_5= 'var' ( (lv_name_6_0= RULE_ID ) ) ( (lv_type_7_0= ruleDataTypes ) ) ( (lv_many_8_0= '[]' ) )? )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:525:2: () (otherlv_1= '@' ( (lv_annotations_2_0= ruleFetureAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) ) )* )? otherlv_5= 'var' ( (lv_name_6_0= RULE_ID ) ) ( (lv_type_7_0= ruleDataTypes ) ) ( (lv_many_8_0= '[]' ) )?
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:525:2: ()
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:526:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDataTypeAccess().getDataTypeAction_0(),
                        current);
                

            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:531:2: (otherlv_1= '@' ( (lv_annotations_2_0= ruleFetureAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:531:4: otherlv_1= '@' ( (lv_annotations_2_0= ruleFetureAnnotation ) ) (otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) ) )*
                    {
                    otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDataType1010); 

                        	newLeafNode(otherlv_1, grammarAccess.getDataTypeAccess().getCommercialAtKeyword_1_0());
                        
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:535:1: ( (lv_annotations_2_0= ruleFetureAnnotation ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:536:1: (lv_annotations_2_0= ruleFetureAnnotation )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:536:1: (lv_annotations_2_0= ruleFetureAnnotation )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:537:3: lv_annotations_2_0= ruleFetureAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleDataType1031);
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

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:553:2: (otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:553:4: otherlv_3= '@' ( (lv_annotations_4_0= ruleFetureAnnotation ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDataType1044); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getDataTypeAccess().getCommercialAtKeyword_1_2_0());
                    	        
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:557:1: ( (lv_annotations_4_0= ruleFetureAnnotation ) )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:558:1: (lv_annotations_4_0= ruleFetureAnnotation )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:558:1: (lv_annotations_4_0= ruleFetureAnnotation )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:559:3: lv_annotations_4_0= ruleFetureAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleDataType1065);
                    	    lv_annotations_4_0=ruleFetureAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_4_0, 
                    	            		"FetureAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


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

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDataType1081); 

                	newLeafNode(otherlv_5, grammarAccess.getDataTypeAccess().getVarKeyword_2());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:579:1: ( (lv_name_6_0= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:580:1: (lv_name_6_0= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:580:1: (lv_name_6_0= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:581:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDataType1098); 

            			newLeafNode(lv_name_6_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"ID");
            	    

            }


            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:597:2: ( (lv_type_7_0= ruleDataTypes ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:598:1: (lv_type_7_0= ruleDataTypes )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:598:1: (lv_type_7_0= ruleDataTypes )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:599:3: lv_type_7_0= ruleDataTypes
            {
             
            	        newCompositeNode(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDataTypes_in_ruleDataType1124);
            lv_type_7_0=ruleDataTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_7_0, 
                    		"DataTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:615:2: ( (lv_many_8_0= '[]' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:616:1: (lv_many_8_0= '[]' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:616:1: (lv_many_8_0= '[]' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:617:3: lv_many_8_0= '[]'
                    {
                    lv_many_8_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDataType1142); 

                            newLeafNode(lv_many_8_0, grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_5_0());
                        

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


    // $ANTLR start "ruleEntityAnnotation"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:638:1: ruleEntityAnnotation returns [Enumerator current=null] : (enumLiteral_0= 'Cache' ) ;
    public final Enumerator ruleEntityAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:640:28: ( (enumLiteral_0= 'Cache' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:641:1: (enumLiteral_0= 'Cache' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:641:1: (enumLiteral_0= 'Cache' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:641:3: enumLiteral_0= 'Cache'
            {
            enumLiteral_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEntityAnnotation1205); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:651:1: ruleFetureAnnotation returns [Enumerator current=null] : ( (enumLiteral_0= 'Index' ) | (enumLiteral_1= 'Id' ) | (enumLiteral_2= 'Load' ) | (enumLiteral_3= 'Ignore' ) ) ;
    public final Enumerator ruleFetureAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:653:28: ( ( (enumLiteral_0= 'Index' ) | (enumLiteral_1= 'Id' ) | (enumLiteral_2= 'Load' ) | (enumLiteral_3= 'Ignore' ) ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:654:1: ( (enumLiteral_0= 'Index' ) | (enumLiteral_1= 'Id' ) | (enumLiteral_2= 'Load' ) | (enumLiteral_3= 'Ignore' ) )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:654:1: ( (enumLiteral_0= 'Index' ) | (enumLiteral_1= 'Id' ) | (enumLiteral_2= 'Load' ) | (enumLiteral_3= 'Ignore' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt17=1;
                }
                break;
            case 21:
                {
                alt17=2;
                }
                break;
            case 22:
                {
                alt17=3;
                }
                break;
            case 23:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:654:2: (enumLiteral_0= 'Index' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:654:2: (enumLiteral_0= 'Index' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:654:4: enumLiteral_0= 'Index'
                    {
                    enumLiteral_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFetureAnnotation1249); 

                            current = grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:660:6: (enumLiteral_1= 'Id' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:660:6: (enumLiteral_1= 'Id' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:660:8: enumLiteral_1= 'Id'
                    {
                    enumLiteral_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFetureAnnotation1266); 

                            current = grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:666:6: (enumLiteral_2= 'Load' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:666:6: (enumLiteral_2= 'Load' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:666:8: enumLiteral_2= 'Load'
                    {
                    enumLiteral_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFetureAnnotation1283); 

                            current = grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:672:6: (enumLiteral_3= 'Ignore' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:672:6: (enumLiteral_3= 'Ignore' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:672:8: enumLiteral_3= 'Ignore'
                    {
                    enumLiteral_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFetureAnnotation1300); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:682:1: ruleDataTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'Object' ) ) ;
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
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:684:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'Object' ) ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:685:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'Object' ) )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:685:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'Object' ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt18=1;
                }
                break;
            case 25:
                {
                alt18=2;
                }
                break;
            case 26:
                {
                alt18=3;
                }
                break;
            case 27:
                {
                alt18=4;
                }
                break;
            case 28:
                {
                alt18=5;
                }
                break;
            case 29:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:685:2: (enumLiteral_0= 'String' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:685:2: (enumLiteral_0= 'String' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:685:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDataTypes1345); 

                            current = grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:691:6: (enumLiteral_1= 'Integer' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:691:6: (enumLiteral_1= 'Integer' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:691:8: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDataTypes1362); 

                            current = grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:697:6: (enumLiteral_2= 'Boolean' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:697:6: (enumLiteral_2= 'Boolean' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:697:8: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDataTypes1379); 

                            current = grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:703:6: (enumLiteral_3= 'Long' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:703:6: (enumLiteral_3= 'Long' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:703:8: enumLiteral_3= 'Long'
                    {
                    enumLiteral_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleDataTypes1396); 

                            current = grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:709:6: (enumLiteral_4= 'Double' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:709:6: (enumLiteral_4= 'Double' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:709:8: enumLiteral_4= 'Double'
                    {
                    enumLiteral_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDataTypes1413); 

                            current = grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:715:6: (enumLiteral_5= 'Object' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:715:6: (enumLiteral_5= 'Object' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:715:8: enumLiteral_5= 'Object'
                    {
                    enumLiteral_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataTypes1430); 

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
        "\17\uffff";
    static final String DFA5_eofS =
        "\17\uffff";
    static final String DFA5_minS =
        "\1\16\1\24\1\4\4\16\1\4\1\24\2\uffff\4\16";
    static final String DFA5_maxS =
        "\1\21\1\27\1\4\4\21\1\35\1\27\2\uffff\4\21";
    static final String DFA5_acceptS =
        "\11\uffff\1\1\1\2\4\uffff";
    static final String DFA5_specialS =
        "\17\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\2\uffff\1\2",
            "\1\3\1\4\1\5\1\6",
            "\1\7",
            "\1\10\2\uffff\1\2",
            "\1\10\2\uffff\1\2",
            "\1\10\2\uffff\1\2",
            "\1\10\2\uffff\1\2",
            "\1\11\23\uffff\6\12",
            "\1\13\1\14\1\15\1\16",
            "",
            "",
            "\1\10\2\uffff\1\2",
            "\1\10\2\uffff\1\2",
            "\1\10\2\uffff\1\2",
            "\1\10\2\uffff\1\2"
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
            return "210:1: (this_Ref_0= ruleRef | this_DataType_1= ruleDataType )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulePackage_in_entryRulePackage75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rulePackage131 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePackage148 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePackage165 = new BitSet(new long[]{0x000000000000E800L});
        public static final BitSet FOLLOW_ruleEntity_in_rulePackage187 = new BitSet(new long[]{0x000000000000E800L});
        public static final BitSet FOLLOW_ruleEntity_in_rulePackage208 = new BitSet(new long[]{0x000000000000E800L});
        public static final BitSet FOLLOW_rulePackage_in_rulePackage233 = new BitSet(new long[]{0x0000000000002800L});
        public static final BitSet FOLLOW_rulePackage_in_rulePackage254 = new BitSet(new long[]{0x0000000000002800L});
        public static final BitSet FOLLOW_13_in_rulePackage269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRef_in_ruleFeature362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_ruleFeature389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity424 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleEntity481 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_ruleEntity502 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleEntity515 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_ruleEntity536 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleEntity552 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEntity569 = new BitSet(new long[]{0x0000000000011000L});
        public static final BitSet FOLLOW_16_in_ruleEntity587 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEntity607 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEntity621 = new BitSet(new long[]{0x0000000000026000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleEntity643 = new BitSet(new long[]{0x0000000000026000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleEntity664 = new BitSet(new long[]{0x0000000000026000L});
        public static final BitSet FOLLOW_13_in_ruleEntity679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRef_in_entryRuleRef715 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRef725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleRef772 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleRef793 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_14_in_ruleRef806 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleRef827 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_17_in_ruleRef843 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRef860 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRef885 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleRef903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType953 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataType963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleDataType1010 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleDataType1031 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_14_in_ruleDataType1044 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleDataType1065 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_17_in_ruleDataType1081 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDataType1098 = new BitSet(new long[]{0x000000003F000000L});
        public static final BitSet FOLLOW_ruleDataTypes_in_ruleDataType1124 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleDataType1142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleEntityAnnotation1205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleFetureAnnotation1249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleFetureAnnotation1266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleFetureAnnotation1283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleFetureAnnotation1300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleDataTypes1345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleDataTypes1362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleDataTypes1379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleDataTypes1396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleDataTypes1413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleDataTypes1430 = new BitSet(new long[]{0x0000000000000002L});
    }


}