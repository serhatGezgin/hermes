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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'}'", "'Entity'", "':'", "'Ref'", "'[]'", "'DataType'", "'Cache'", "'Index'", "'Id'", "'Load'", "'Ignore'", "'String'", "'Integer'", "'Boolean'", "'Long'", "'Double'", "'Object'"
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

            if ( (LA2_0==14) ) {
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

                        if ( (LA1_0==14) ) {
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
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:246:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_annotations_6_0= ruleEntityAnnotation ) ) ( (lv_annotations_7_0= ruleEntityAnnotation ) )* )? ( ( (lv_ownedFeature_8_0= ruleFeature ) ) ( (lv_ownedFeature_9_0= ruleFeature ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        Enumerator lv_annotations_6_0 = null;

        Enumerator lv_annotations_7_0 = null;

        EObject lv_ownedFeature_8_0 = null;

        EObject lv_ownedFeature_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:249:28: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_annotations_6_0= ruleEntityAnnotation ) ) ( (lv_annotations_7_0= ruleEntityAnnotation ) )* )? ( ( (lv_ownedFeature_8_0= ruleFeature ) ) ( (lv_ownedFeature_9_0= ruleFeature ) )* )? otherlv_10= '}' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:250:1: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_annotations_6_0= ruleEntityAnnotation ) ) ( (lv_annotations_7_0= ruleEntityAnnotation ) )* )? ( ( (lv_ownedFeature_8_0= ruleFeature ) ) ( (lv_ownedFeature_9_0= ruleFeature ) )* )? otherlv_10= '}' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:250:1: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_annotations_6_0= ruleEntityAnnotation ) ) ( (lv_annotations_7_0= ruleEntityAnnotation ) )* )? ( ( (lv_ownedFeature_8_0= ruleFeature ) ) ( (lv_ownedFeature_9_0= ruleFeature ) )* )? otherlv_10= '}' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:250:2: () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' ( ( (lv_annotations_6_0= ruleEntityAnnotation ) ) ( (lv_annotations_7_0= ruleEntityAnnotation ) )* )? ( ( (lv_ownedFeature_8_0= ruleFeature ) ) ( (lv_ownedFeature_9_0= ruleFeature ) )* )? otherlv_10= '}'
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:250:2: ()
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:251:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityAccess().getEntityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEntity480); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:260:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:261:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:261:1: (lv_name_2_0= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:262:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEntity497); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:278:2: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:278:4: otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEntity515); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getColonKeyword_3_0());
                        
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:282:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:283:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:283:1: (otherlv_4= RULE_ID )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:284:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEntity535); 

                    		newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEntity549); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:299:1: ( ( (lv_annotations_6_0= ruleEntityAnnotation ) ) ( (lv_annotations_7_0= ruleEntityAnnotation ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:299:2: ( (lv_annotations_6_0= ruleEntityAnnotation ) ) ( (lv_annotations_7_0= ruleEntityAnnotation ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:299:2: ( (lv_annotations_6_0= ruleEntityAnnotation ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:300:1: (lv_annotations_6_0= ruleEntityAnnotation )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:300:1: (lv_annotations_6_0= ruleEntityAnnotation )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:301:3: lv_annotations_6_0= ruleEntityAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_ruleEntity571);
                    lv_annotations_6_0=ruleEntityAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_6_0, 
                            		"EntityAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:317:2: ( (lv_annotations_7_0= ruleEntityAnnotation ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==19) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:318:1: (lv_annotations_7_0= ruleEntityAnnotation )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:318:1: (lv_annotations_7_0= ruleEntityAnnotation )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:319:3: lv_annotations_7_0= ruleEntityAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_ruleEntity592);
                    	    lv_annotations_7_0=ruleEntityAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_7_0, 
                    	            		"EntityAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:335:5: ( ( (lv_ownedFeature_8_0= ruleFeature ) ) ( (lv_ownedFeature_9_0= ruleFeature ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16||LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:335:6: ( (lv_ownedFeature_8_0= ruleFeature ) ) ( (lv_ownedFeature_9_0= ruleFeature ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:335:6: ( (lv_ownedFeature_8_0= ruleFeature ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:336:1: (lv_ownedFeature_8_0= ruleFeature )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:336:1: (lv_ownedFeature_8_0= ruleFeature )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:337:3: lv_ownedFeature_8_0= ruleFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleEntity617);
                    lv_ownedFeature_8_0=ruleFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		add(
                           			current, 
                           			"ownedFeature",
                            		lv_ownedFeature_8_0, 
                            		"Feature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:353:2: ( (lv_ownedFeature_9_0= ruleFeature ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16||LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:354:1: (lv_ownedFeature_9_0= ruleFeature )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:354:1: (lv_ownedFeature_9_0= ruleFeature )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:355:3: lv_ownedFeature_9_0= ruleFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleEntity638);
                    	    lv_ownedFeature_9_0=ruleFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ownedFeature",
                    	            		lv_ownedFeature_9_0, 
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

            otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEntity653); 

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


    // $ANTLR start "entryRuleRef"
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:383:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:384:2: (iv_ruleRef= ruleRef EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:385:2: iv_ruleRef= ruleRef EOF
            {
             newCompositeNode(grammarAccess.getRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRef_in_entryRuleRef689);
            iv_ruleRef=ruleRef();

            state._fsp--;

             current =iv_ruleRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRef699); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:392:1: ruleRef returns [EObject current=null] : (otherlv_0= 'Ref' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' ( ( (lv_annotations_5_0= ruleFetureAnnotation ) ) ( (lv_annotations_6_0= ruleFetureAnnotation ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_many_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Enumerator lv_annotations_5_0 = null;

        Enumerator lv_annotations_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:395:28: ( (otherlv_0= 'Ref' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' ( ( (lv_annotations_5_0= ruleFetureAnnotation ) ) ( (lv_annotations_6_0= ruleFetureAnnotation ) )* )? otherlv_7= '}' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:396:1: (otherlv_0= 'Ref' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' ( ( (lv_annotations_5_0= ruleFetureAnnotation ) ) ( (lv_annotations_6_0= ruleFetureAnnotation ) )* )? otherlv_7= '}' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:396:1: (otherlv_0= 'Ref' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' ( ( (lv_annotations_5_0= ruleFetureAnnotation ) ) ( (lv_annotations_6_0= ruleFetureAnnotation ) )* )? otherlv_7= '}' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:396:3: otherlv_0= 'Ref' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' ( ( (lv_annotations_5_0= ruleFetureAnnotation ) ) ( (lv_annotations_6_0= ruleFetureAnnotation ) )* )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRef736); 

                	newLeafNode(otherlv_0, grammarAccess.getRefAccess().getRefKeyword_0());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:400:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:401:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:401:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:402:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRef753); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRefAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:418:2: ( (otherlv_2= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:419:1: (otherlv_2= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:419:1: (otherlv_2= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:420:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRef778); 

            		newLeafNode(otherlv_2, grammarAccess.getRefAccess().getRefToEntityCrossReference_2_0()); 
            	

            }


            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:431:2: ( (lv_many_3_0= '[]' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:432:1: (lv_many_3_0= '[]' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:432:1: (lv_many_3_0= '[]' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:433:3: lv_many_3_0= '[]'
                    {
                    lv_many_3_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRef796); 

                            newLeafNode(lv_many_3_0, grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRefRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRef822); 

                	newLeafNode(otherlv_4, grammarAccess.getRefAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:450:1: ( ( (lv_annotations_5_0= ruleFetureAnnotation ) ) ( (lv_annotations_6_0= ruleFetureAnnotation ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=20 && LA13_0<=23)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:450:2: ( (lv_annotations_5_0= ruleFetureAnnotation ) ) ( (lv_annotations_6_0= ruleFetureAnnotation ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:450:2: ( (lv_annotations_5_0= ruleFetureAnnotation ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:451:1: (lv_annotations_5_0= ruleFetureAnnotation )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:451:1: (lv_annotations_5_0= ruleFetureAnnotation )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:452:3: lv_annotations_5_0= ruleFetureAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleRef844);
                    lv_annotations_5_0=ruleFetureAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRefRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_5_0, 
                            		"FetureAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:468:2: ( (lv_annotations_6_0= ruleFetureAnnotation ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=20 && LA12_0<=23)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:469:1: (lv_annotations_6_0= ruleFetureAnnotation )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:469:1: (lv_annotations_6_0= ruleFetureAnnotation )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:470:3: lv_annotations_6_0= ruleFetureAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleRef865);
                    	    lv_annotations_6_0=ruleFetureAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_6_0, 
                    	            		"FetureAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRef880); 

                	newLeafNode(otherlv_7, grammarAccess.getRefAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:498:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:499:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:500:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataType_in_entryRuleDataType916);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataType926); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:507:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'DataType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleDataTypes ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' ( ( (lv_annotations_5_0= ruleFetureAnnotation ) ) ( (lv_annotations_6_0= ruleFetureAnnotation ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_many_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Enumerator lv_type_2_0 = null;

        Enumerator lv_annotations_5_0 = null;

        Enumerator lv_annotations_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:510:28: ( (otherlv_0= 'DataType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleDataTypes ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' ( ( (lv_annotations_5_0= ruleFetureAnnotation ) ) ( (lv_annotations_6_0= ruleFetureAnnotation ) )* )? otherlv_7= '}' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:511:1: (otherlv_0= 'DataType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleDataTypes ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' ( ( (lv_annotations_5_0= ruleFetureAnnotation ) ) ( (lv_annotations_6_0= ruleFetureAnnotation ) )* )? otherlv_7= '}' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:511:1: (otherlv_0= 'DataType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleDataTypes ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' ( ( (lv_annotations_5_0= ruleFetureAnnotation ) ) ( (lv_annotations_6_0= ruleFetureAnnotation ) )* )? otherlv_7= '}' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:511:3: otherlv_0= 'DataType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleDataTypes ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' ( ( (lv_annotations_5_0= ruleFetureAnnotation ) ) ( (lv_annotations_6_0= ruleFetureAnnotation ) )* )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDataType963); 

                	newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDataTypeKeyword_0());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:515:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:516:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:516:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:517:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDataType980); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:533:2: ( (lv_type_2_0= ruleDataTypes ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:534:1: (lv_type_2_0= ruleDataTypes )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:534:1: (lv_type_2_0= ruleDataTypes )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:535:3: lv_type_2_0= ruleDataTypes
            {
             
            	        newCompositeNode(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDataTypes_in_ruleDataType1006);
            lv_type_2_0=ruleDataTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"DataTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:551:2: ( (lv_many_3_0= '[]' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:552:1: (lv_many_3_0= '[]' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:552:1: (lv_many_3_0= '[]' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:553:3: lv_many_3_0= '[]'
                    {
                    lv_many_3_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDataType1024); 

                            newLeafNode(lv_many_3_0, grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataType1050); 

                	newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:570:1: ( ( (lv_annotations_5_0= ruleFetureAnnotation ) ) ( (lv_annotations_6_0= ruleFetureAnnotation ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=20 && LA16_0<=23)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:570:2: ( (lv_annotations_5_0= ruleFetureAnnotation ) ) ( (lv_annotations_6_0= ruleFetureAnnotation ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:570:2: ( (lv_annotations_5_0= ruleFetureAnnotation ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:571:1: (lv_annotations_5_0= ruleFetureAnnotation )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:571:1: (lv_annotations_5_0= ruleFetureAnnotation )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:572:3: lv_annotations_5_0= ruleFetureAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleDataType1072);
                    lv_annotations_5_0=ruleFetureAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_5_0, 
                            		"FetureAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:588:2: ( (lv_annotations_6_0= ruleFetureAnnotation ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>=20 && LA15_0<=23)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:589:1: (lv_annotations_6_0= ruleFetureAnnotation )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:589:1: (lv_annotations_6_0= ruleFetureAnnotation )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:590:3: lv_annotations_6_0= ruleFetureAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleDataType1093);
                    	    lv_annotations_6_0=ruleFetureAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_6_0, 
                    	            		"FetureAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDataType1108); 

                	newLeafNode(otherlv_7, grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:618:1: ruleEntityAnnotation returns [Enumerator current=null] : (enumLiteral_0= 'Cache' ) ;
    public final Enumerator ruleEntityAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:620:28: ( (enumLiteral_0= 'Cache' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:621:1: (enumLiteral_0= 'Cache' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:621:1: (enumLiteral_0= 'Cache' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:621:3: enumLiteral_0= 'Cache'
            {
            enumLiteral_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleEntityAnnotation1157); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:631:1: ruleFetureAnnotation returns [Enumerator current=null] : ( (enumLiteral_0= 'Index' ) | (enumLiteral_1= 'Id' ) | (enumLiteral_2= 'Load' ) | (enumLiteral_3= 'Ignore' ) ) ;
    public final Enumerator ruleFetureAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:633:28: ( ( (enumLiteral_0= 'Index' ) | (enumLiteral_1= 'Id' ) | (enumLiteral_2= 'Load' ) | (enumLiteral_3= 'Ignore' ) ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:634:1: ( (enumLiteral_0= 'Index' ) | (enumLiteral_1= 'Id' ) | (enumLiteral_2= 'Load' ) | (enumLiteral_3= 'Ignore' ) )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:634:1: ( (enumLiteral_0= 'Index' ) | (enumLiteral_1= 'Id' ) | (enumLiteral_2= 'Load' ) | (enumLiteral_3= 'Ignore' ) )
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
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:634:2: (enumLiteral_0= 'Index' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:634:2: (enumLiteral_0= 'Index' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:634:4: enumLiteral_0= 'Index'
                    {
                    enumLiteral_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFetureAnnotation1201); 

                            current = grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:640:6: (enumLiteral_1= 'Id' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:640:6: (enumLiteral_1= 'Id' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:640:8: enumLiteral_1= 'Id'
                    {
                    enumLiteral_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFetureAnnotation1218); 

                            current = grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:646:6: (enumLiteral_2= 'Load' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:646:6: (enumLiteral_2= 'Load' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:646:8: enumLiteral_2= 'Load'
                    {
                    enumLiteral_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFetureAnnotation1235); 

                            current = grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:652:6: (enumLiteral_3= 'Ignore' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:652:6: (enumLiteral_3= 'Ignore' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:652:8: enumLiteral_3= 'Ignore'
                    {
                    enumLiteral_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFetureAnnotation1252); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:662:1: ruleDataTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'Object' ) ) ;
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
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:664:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'Object' ) ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:665:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'Object' ) )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:665:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'Object' ) )
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
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:665:2: (enumLiteral_0= 'String' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:665:2: (enumLiteral_0= 'String' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:665:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDataTypes1297); 

                            current = grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:671:6: (enumLiteral_1= 'Integer' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:671:6: (enumLiteral_1= 'Integer' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:671:8: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDataTypes1314); 

                            current = grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:677:6: (enumLiteral_2= 'Boolean' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:677:6: (enumLiteral_2= 'Boolean' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:677:8: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDataTypes1331); 

                            current = grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:683:6: (enumLiteral_3= 'Long' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:683:6: (enumLiteral_3= 'Long' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:683:8: enumLiteral_3= 'Long'
                    {
                    enumLiteral_3=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleDataTypes1348); 

                            current = grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:689:6: (enumLiteral_4= 'Double' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:689:6: (enumLiteral_4= 'Double' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:689:8: enumLiteral_4= 'Double'
                    {
                    enumLiteral_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDataTypes1365); 

                            current = grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:695:6: (enumLiteral_5= 'Object' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:695:6: (enumLiteral_5= 'Object' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:695:8: enumLiteral_5= 'Object'
                    {
                    enumLiteral_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataTypes1382); 

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


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulePackage_in_entryRulePackage75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePackage85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rulePackage131 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePackage148 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePackage165 = new BitSet(new long[]{0x0000000000006800L});
        public static final BitSet FOLLOW_ruleEntity_in_rulePackage187 = new BitSet(new long[]{0x0000000000006800L});
        public static final BitSet FOLLOW_ruleEntity_in_rulePackage208 = new BitSet(new long[]{0x0000000000006800L});
        public static final BitSet FOLLOW_rulePackage_in_rulePackage233 = new BitSet(new long[]{0x0000000000002800L});
        public static final BitSet FOLLOW_rulePackage_in_rulePackage254 = new BitSet(new long[]{0x0000000000002800L});
        public static final BitSet FOLLOW_13_in_rulePackage269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRef_in_ruleFeature362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_ruleFeature389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity424 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleEntity480 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEntity497 = new BitSet(new long[]{0x0000000000009000L});
        public static final BitSet FOLLOW_15_in_ruleEntity515 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEntity535 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEntity549 = new BitSet(new long[]{0x00000000000D2000L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_ruleEntity571 = new BitSet(new long[]{0x00000000000D2000L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_ruleEntity592 = new BitSet(new long[]{0x00000000000D2000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleEntity617 = new BitSet(new long[]{0x0000000000052000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleEntity638 = new BitSet(new long[]{0x0000000000052000L});
        public static final BitSet FOLLOW_13_in_ruleEntity653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRef_in_entryRuleRef689 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRef699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleRef736 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRef753 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRef778 = new BitSet(new long[]{0x0000000000021000L});
        public static final BitSet FOLLOW_17_in_ruleRef796 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRef822 = new BitSet(new long[]{0x0000000000F02000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleRef844 = new BitSet(new long[]{0x0000000000F02000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleRef865 = new BitSet(new long[]{0x0000000000F02000L});
        public static final BitSet FOLLOW_13_in_ruleRef880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType916 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataType926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleDataType963 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDataType980 = new BitSet(new long[]{0x000000003F000000L});
        public static final BitSet FOLLOW_ruleDataTypes_in_ruleDataType1006 = new BitSet(new long[]{0x0000000000021000L});
        public static final BitSet FOLLOW_17_in_ruleDataType1024 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataType1050 = new BitSet(new long[]{0x0000000000F02000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleDataType1072 = new BitSet(new long[]{0x0000000000F02000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleDataType1093 = new BitSet(new long[]{0x0000000000F02000L});
        public static final BitSet FOLLOW_13_in_ruleDataType1108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleEntityAnnotation1157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleFetureAnnotation1201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleFetureAnnotation1218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleFetureAnnotation1235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleFetureAnnotation1252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleDataTypes1297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleDataTypes1314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleDataTypes1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleDataTypes1348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleDataTypes1365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleDataTypes1382 = new BitSet(new long[]{0x0000000000000002L});
    }


}