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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'description'", "'}'", "'Entity'", "':'", "'='", "'Ref'", "'[]'", "'source'", "'DataType'", "'Cache'", "'Index'", "'Id'", "'Load'", "'Ignore'", "'String'", "'Integer'", "'Boolean'", "'Long'", "'Double'", "'Object'"
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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:77:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'Package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_ownedEntity_6_0= ruleEntity ) ) ( (lv_ownedEntity_7_0= ruleEntity ) )* )? ( ( (lv_subPackage_8_0= rulePackage ) ) ( (lv_subPackage_9_0= rulePackage ) )* )? otherlv_10= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_10=null;
        EObject lv_ownedEntity_6_0 = null;

        EObject lv_ownedEntity_7_0 = null;

        EObject lv_subPackage_8_0 = null;

        EObject lv_subPackage_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:80:28: ( ( () otherlv_1= 'Package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_ownedEntity_6_0= ruleEntity ) ) ( (lv_ownedEntity_7_0= ruleEntity ) )* )? ( ( (lv_subPackage_8_0= rulePackage ) ) ( (lv_subPackage_9_0= rulePackage ) )* )? otherlv_10= '}' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:81:1: ( () otherlv_1= 'Package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_ownedEntity_6_0= ruleEntity ) ) ( (lv_ownedEntity_7_0= ruleEntity ) )* )? ( ( (lv_subPackage_8_0= rulePackage ) ) ( (lv_subPackage_9_0= rulePackage ) )* )? otherlv_10= '}' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:81:1: ( () otherlv_1= 'Package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_ownedEntity_6_0= ruleEntity ) ) ( (lv_ownedEntity_7_0= ruleEntity ) )* )? ( ( (lv_subPackage_8_0= rulePackage ) ) ( (lv_subPackage_9_0= rulePackage ) )* )? otherlv_10= '}' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:81:2: () otherlv_1= 'Package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_ownedEntity_6_0= ruleEntity ) ) ( (lv_ownedEntity_7_0= ruleEntity ) )* )? ( ( (lv_subPackage_8_0= rulePackage ) ) ( (lv_subPackage_9_0= rulePackage ) )* )? otherlv_10= '}'
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
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:113:1: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:113:3: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePackage178); 

                        	newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getDescriptionKeyword_4_0());
                        
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:117:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:118:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:118:1: (lv_description_5_0= RULE_STRING )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:119:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePackage195); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getPackageAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPackageRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:135:4: ( ( (lv_ownedEntity_6_0= ruleEntity ) ) ( (lv_ownedEntity_7_0= ruleEntity ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:135:5: ( (lv_ownedEntity_6_0= ruleEntity ) ) ( (lv_ownedEntity_7_0= ruleEntity ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:135:5: ( (lv_ownedEntity_6_0= ruleEntity ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:136:1: (lv_ownedEntity_6_0= ruleEntity )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:136:1: (lv_ownedEntity_6_0= ruleEntity )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:137:3: lv_ownedEntity_6_0= ruleEntity
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rulePackage224);
                    lv_ownedEntity_6_0=ruleEntity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"ownedEntity",
                            		lv_ownedEntity_6_0, 
                            		"Entity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:153:2: ( (lv_ownedEntity_7_0= ruleEntity ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:154:1: (lv_ownedEntity_7_0= ruleEntity )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:154:1: (lv_ownedEntity_7_0= ruleEntity )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:155:3: lv_ownedEntity_7_0= ruleEntity
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPackageAccess().getOwnedEntityEntityParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rulePackage245);
                    	    lv_ownedEntity_7_0=ruleEntity();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ownedEntity",
                    	            		lv_ownedEntity_7_0, 
                    	            		"Entity");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:171:5: ( ( (lv_subPackage_8_0= rulePackage ) ) ( (lv_subPackage_9_0= rulePackage ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:171:6: ( (lv_subPackage_8_0= rulePackage ) ) ( (lv_subPackage_9_0= rulePackage ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:171:6: ( (lv_subPackage_8_0= rulePackage ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:172:1: (lv_subPackage_8_0= rulePackage )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:172:1: (lv_subPackage_8_0= rulePackage )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:173:3: lv_subPackage_8_0= rulePackage
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePackage_in_rulePackage270);
                    lv_subPackage_8_0=rulePackage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"subPackage",
                            		lv_subPackage_8_0, 
                            		"Package");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:189:2: ( (lv_subPackage_9_0= rulePackage ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==11) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:190:1: (lv_subPackage_9_0= rulePackage )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:190:1: (lv_subPackage_9_0= rulePackage )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:191:3: lv_subPackage_9_0= rulePackage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPackageAccess().getSubPackagePackageParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePackage_in_rulePackage291);
                    	    lv_subPackage_9_0=rulePackage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subPackage",
                    	            		lv_subPackage_9_0, 
                    	            		"Package");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePackage306); 

                	newLeafNode(otherlv_10, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:219:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:220:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:221:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature342);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature352); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:228:1: ruleFeature returns [EObject current=null] : (this_Ref_0= ruleRef | this_DataType_1= ruleDataType ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Ref_0 = null;

        EObject this_DataType_1 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:231:28: ( (this_Ref_0= ruleRef | this_DataType_1= ruleDataType ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:232:1: (this_Ref_0= ruleRef | this_DataType_1= ruleDataType )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:232:1: (this_Ref_0= ruleRef | this_DataType_1= ruleDataType )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:233:5: this_Ref_0= ruleRef
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getRefParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRef_in_ruleFeature399);
                    this_Ref_0=ruleRef();

                    state._fsp--;

                     
                            current = this_Ref_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:243:5: this_DataType_1= ruleDataType
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getDataTypeParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDataType_in_ruleFeature426);
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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:259:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:260:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:261:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity461);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity471); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:268:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) )? ( ( (lv_annotations_9_0= ruleEntityAnnotation ) ) ( (lv_annotations_10_0= ruleEntityAnnotation ) )* )? ( ( (lv_ownedFeature_11_0= ruleFeature ) ) ( (lv_ownedFeature_12_0= ruleFeature ) )* )? otherlv_13= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_13=null;
        Enumerator lv_annotations_9_0 = null;

        Enumerator lv_annotations_10_0 = null;

        EObject lv_ownedFeature_11_0 = null;

        EObject lv_ownedFeature_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:271:28: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) )? ( ( (lv_annotations_9_0= ruleEntityAnnotation ) ) ( (lv_annotations_10_0= ruleEntityAnnotation ) )* )? ( ( (lv_ownedFeature_11_0= ruleFeature ) ) ( (lv_ownedFeature_12_0= ruleFeature ) )* )? otherlv_13= '}' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:272:1: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) )? ( ( (lv_annotations_9_0= ruleEntityAnnotation ) ) ( (lv_annotations_10_0= ruleEntityAnnotation ) )* )? ( ( (lv_ownedFeature_11_0= ruleFeature ) ) ( (lv_ownedFeature_12_0= ruleFeature ) )* )? otherlv_13= '}' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:272:1: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) )? ( ( (lv_annotations_9_0= ruleEntityAnnotation ) ) ( (lv_annotations_10_0= ruleEntityAnnotation ) )* )? ( ( (lv_ownedFeature_11_0= ruleFeature ) ) ( (lv_ownedFeature_12_0= ruleFeature ) )* )? otherlv_13= '}' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:272:2: () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= '{' (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) )? ( ( (lv_annotations_9_0= ruleEntityAnnotation ) ) ( (lv_annotations_10_0= ruleEntityAnnotation ) )* )? ( ( (lv_ownedFeature_11_0= ruleFeature ) ) ( (lv_ownedFeature_12_0= ruleFeature ) )* )? otherlv_13= '}'
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:272:2: ()
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:273:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityAccess().getEntityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEntity517); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:282:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:283:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:283:1: (lv_name_2_0= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:284:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEntity534); 

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

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:300:2: (otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:300:4: otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEntity552); 

                        	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getColonKeyword_3_0());
                        
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:304:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:305:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:305:1: (otherlv_4= RULE_ID )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:306:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEntity572); 

                    		newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_3_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEntity586); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:321:1: (otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:321:3: otherlv_6= 'description' otherlv_7= '=' ( (lv_description_8_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEntity599); 

                        	newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getDescriptionKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEntity611); 

                        	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getEqualsSignKeyword_5_1());
                        
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:329:1: ( (lv_description_8_0= RULE_STRING ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:330:1: (lv_description_8_0= RULE_STRING )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:330:1: (lv_description_8_0= RULE_STRING )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:331:3: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEntity628); 

                    			newLeafNode(lv_description_8_0, grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_8_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:347:4: ( ( (lv_annotations_9_0= ruleEntityAnnotation ) ) ( (lv_annotations_10_0= ruleEntityAnnotation ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:347:5: ( (lv_annotations_9_0= ruleEntityAnnotation ) ) ( (lv_annotations_10_0= ruleEntityAnnotation ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:347:5: ( (lv_annotations_9_0= ruleEntityAnnotation ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:348:1: (lv_annotations_9_0= ruleEntityAnnotation )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:348:1: (lv_annotations_9_0= ruleEntityAnnotation )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:349:3: lv_annotations_9_0= ruleEntityAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_ruleEntity657);
                    lv_annotations_9_0=ruleEntityAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_9_0, 
                            		"EntityAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:365:2: ( (lv_annotations_10_0= ruleEntityAnnotation ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==22) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:366:1: (lv_annotations_10_0= ruleEntityAnnotation )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:366:1: (lv_annotations_10_0= ruleEntityAnnotation )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:367:3: lv_annotations_10_0= ruleEntityAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_ruleEntity678);
                    	    lv_annotations_10_0=ruleEntityAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_10_0, 
                    	            		"EntityAnnotation");
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

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:383:5: ( ( (lv_ownedFeature_11_0= ruleFeature ) ) ( (lv_ownedFeature_12_0= ruleFeature ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18||LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:383:6: ( (lv_ownedFeature_11_0= ruleFeature ) ) ( (lv_ownedFeature_12_0= ruleFeature ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:383:6: ( (lv_ownedFeature_11_0= ruleFeature ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:384:1: (lv_ownedFeature_11_0= ruleFeature )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:384:1: (lv_ownedFeature_11_0= ruleFeature )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:385:3: lv_ownedFeature_11_0= ruleFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleEntity703);
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

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:401:2: ( (lv_ownedFeature_12_0= ruleFeature ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==18||LA11_0==21) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:402:1: (lv_ownedFeature_12_0= ruleFeature )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:402:1: (lv_ownedFeature_12_0= ruleFeature )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:403:3: lv_ownedFeature_12_0= ruleFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleEntity724);
                    	    lv_ownedFeature_12_0=ruleFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ownedFeature",
                    	            		lv_ownedFeature_12_0, 
                    	            		"Feature");
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEntity739); 

                	newLeafNode(otherlv_13, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:431:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:432:2: (iv_ruleRef= ruleRef EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:433:2: iv_ruleRef= ruleRef EOF
            {
             newCompositeNode(grammarAccess.getRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRef_in_entryRuleRef775);
            iv_ruleRef=ruleRef();

            state._fsp--;

             current =iv_ruleRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRef785); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:440:1: ruleRef returns [EObject current=null] : (otherlv_0= 'Ref' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_annotations_7_0= ruleFetureAnnotation ) ) ( (lv_annotations_8_0= ruleFetureAnnotation ) )* )? otherlv_9= 'source' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_many_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Enumerator lv_annotations_7_0 = null;

        Enumerator lv_annotations_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:443:28: ( (otherlv_0= 'Ref' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_annotations_7_0= ruleFetureAnnotation ) ) ( (lv_annotations_8_0= ruleFetureAnnotation ) )* )? otherlv_9= 'source' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:444:1: (otherlv_0= 'Ref' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_annotations_7_0= ruleFetureAnnotation ) ) ( (lv_annotations_8_0= ruleFetureAnnotation ) )* )? otherlv_9= 'source' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:444:1: (otherlv_0= 'Ref' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_annotations_7_0= ruleFetureAnnotation ) ) ( (lv_annotations_8_0= ruleFetureAnnotation ) )* )? otherlv_9= 'source' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:444:3: otherlv_0= 'Ref' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_annotations_7_0= ruleFetureAnnotation ) ) ( (lv_annotations_8_0= ruleFetureAnnotation ) )* )? otherlv_9= 'source' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRef822); 

                	newLeafNode(otherlv_0, grammarAccess.getRefAccess().getRefKeyword_0());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:448:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:449:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:449:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:450:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRef839); 

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

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:466:2: ( (otherlv_2= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:467:1: (otherlv_2= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:467:1: (otherlv_2= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:468:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRef864); 

            		newLeafNode(otherlv_2, grammarAccess.getRefAccess().getRefToEntityCrossReference_2_0()); 
            	

            }


            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:479:2: ( (lv_many_3_0= '[]' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:480:1: (lv_many_3_0= '[]' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:480:1: (lv_many_3_0= '[]' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:481:3: lv_many_3_0= '[]'
                    {
                    lv_many_3_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRef882); 

                            newLeafNode(lv_many_3_0, grammarAccess.getRefAccess().getManyLeftSquareBracketRightSquareBracketKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRefRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRef908); 

                	newLeafNode(otherlv_4, grammarAccess.getRefAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:498:1: (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:498:3: otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRef921); 

                        	newLeafNode(otherlv_5, grammarAccess.getRefAccess().getDescriptionKeyword_5_0());
                        
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:502:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:503:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:503:1: (lv_description_6_0= RULE_STRING )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:504:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRef938); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getRefAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRefRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:520:4: ( ( (lv_annotations_7_0= ruleFetureAnnotation ) ) ( (lv_annotations_8_0= ruleFetureAnnotation ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=23 && LA16_0<=26)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:520:5: ( (lv_annotations_7_0= ruleFetureAnnotation ) ) ( (lv_annotations_8_0= ruleFetureAnnotation ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:520:5: ( (lv_annotations_7_0= ruleFetureAnnotation ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:521:1: (lv_annotations_7_0= ruleFetureAnnotation )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:521:1: (lv_annotations_7_0= ruleFetureAnnotation )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:522:3: lv_annotations_7_0= ruleFetureAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleRef967);
                    lv_annotations_7_0=ruleFetureAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRefRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_7_0, 
                            		"FetureAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:538:2: ( (lv_annotations_8_0= ruleFetureAnnotation ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>=23 && LA15_0<=26)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:539:1: (lv_annotations_8_0= ruleFetureAnnotation )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:539:1: (lv_annotations_8_0= ruleFetureAnnotation )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:540:3: lv_annotations_8_0= ruleFetureAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleRef988);
                    	    lv_annotations_8_0=ruleFetureAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_8_0, 
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

            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRef1003); 

                	newLeafNode(otherlv_9, grammarAccess.getRefAccess().getSourceKeyword_7());
                
            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRef1015); 

                	newLeafNode(otherlv_10, grammarAccess.getRefAccess().getEqualsSignKeyword_8());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:564:1: ( (otherlv_11= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:565:1: (otherlv_11= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:565:1: (otherlv_11= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:566:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRef1035); 

            		newLeafNode(otherlv_11, grammarAccess.getRefAccess().getSourceEntityCrossReference_9_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRef1047); 

                	newLeafNode(otherlv_12, grammarAccess.getRefAccess().getRightCurlyBracketKeyword_10());
                

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:589:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:590:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:591:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataType_in_entryRuleDataType1083);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataType1093); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:598:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'DataType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleDataTypes ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_annotations_7_0= ruleFetureAnnotation ) ) ( (lv_annotations_8_0= ruleFetureAnnotation ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_many_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_9=null;
        Enumerator lv_type_2_0 = null;

        Enumerator lv_annotations_7_0 = null;

        Enumerator lv_annotations_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:601:28: ( (otherlv_0= 'DataType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleDataTypes ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_annotations_7_0= ruleFetureAnnotation ) ) ( (lv_annotations_8_0= ruleFetureAnnotation ) )* )? otherlv_9= '}' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:602:1: (otherlv_0= 'DataType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleDataTypes ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_annotations_7_0= ruleFetureAnnotation ) ) ( (lv_annotations_8_0= ruleFetureAnnotation ) )* )? otherlv_9= '}' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:602:1: (otherlv_0= 'DataType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleDataTypes ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_annotations_7_0= ruleFetureAnnotation ) ) ( (lv_annotations_8_0= ruleFetureAnnotation ) )* )? otherlv_9= '}' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:602:3: otherlv_0= 'DataType' ( (lv_name_1_0= RULE_ID ) ) ( (lv_type_2_0= ruleDataTypes ) ) ( (lv_many_3_0= '[]' ) )? otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_annotations_7_0= ruleFetureAnnotation ) ) ( (lv_annotations_8_0= ruleFetureAnnotation ) )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDataType1130); 

                	newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDataTypeKeyword_0());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:606:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:607:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:607:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:608:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDataType1147); 

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

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:624:2: ( (lv_type_2_0= ruleDataTypes ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:625:1: (lv_type_2_0= ruleDataTypes )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:625:1: (lv_type_2_0= ruleDataTypes )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:626:3: lv_type_2_0= ruleDataTypes
            {
             
            	        newCompositeNode(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDataTypes_in_ruleDataType1173);
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

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:642:2: ( (lv_many_3_0= '[]' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:643:1: (lv_many_3_0= '[]' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:643:1: (lv_many_3_0= '[]' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:644:3: lv_many_3_0= '[]'
                    {
                    lv_many_3_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDataType1191); 

                            newLeafNode(lv_many_3_0, grammarAccess.getDataTypeAccess().getManyLeftSquareBracketRightSquareBracketKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "[]");
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataType1217); 

                	newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:661:1: (otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:661:3: otherlv_5= 'description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDataType1230); 

                        	newLeafNode(otherlv_5, grammarAccess.getDataTypeAccess().getDescriptionKeyword_5_0());
                        
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:665:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:666:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:666:1: (lv_description_6_0= RULE_STRING )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:667:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDataType1247); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getDataTypeAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:683:4: ( ( (lv_annotations_7_0= ruleFetureAnnotation ) ) ( (lv_annotations_8_0= ruleFetureAnnotation ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=23 && LA20_0<=26)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:683:5: ( (lv_annotations_7_0= ruleFetureAnnotation ) ) ( (lv_annotations_8_0= ruleFetureAnnotation ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:683:5: ( (lv_annotations_7_0= ruleFetureAnnotation ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:684:1: (lv_annotations_7_0= ruleFetureAnnotation )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:684:1: (lv_annotations_7_0= ruleFetureAnnotation )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:685:3: lv_annotations_7_0= ruleFetureAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_6_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleDataType1276);
                    lv_annotations_7_0=ruleFetureAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"annotations",
                            		lv_annotations_7_0, 
                            		"FetureAnnotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:701:2: ( (lv_annotations_8_0= ruleFetureAnnotation ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=23 && LA19_0<=26)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:702:1: (lv_annotations_8_0= ruleFetureAnnotation )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:702:1: (lv_annotations_8_0= ruleFetureAnnotation )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:703:3: lv_annotations_8_0= ruleFetureAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleDataType1297);
                    	    lv_annotations_8_0=ruleFetureAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_8_0, 
                    	            		"FetureAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDataType1312); 

                	newLeafNode(otherlv_9, grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:731:1: ruleEntityAnnotation returns [Enumerator current=null] : (enumLiteral_0= 'Cache' ) ;
    public final Enumerator ruleEntityAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:733:28: ( (enumLiteral_0= 'Cache' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:734:1: (enumLiteral_0= 'Cache' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:734:1: (enumLiteral_0= 'Cache' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:734:3: enumLiteral_0= 'Cache'
            {
            enumLiteral_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEntityAnnotation1361); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:744:1: ruleFetureAnnotation returns [Enumerator current=null] : ( (enumLiteral_0= 'Index' ) | (enumLiteral_1= 'Id' ) | (enumLiteral_2= 'Load' ) | (enumLiteral_3= 'Ignore' ) ) ;
    public final Enumerator ruleFetureAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:746:28: ( ( (enumLiteral_0= 'Index' ) | (enumLiteral_1= 'Id' ) | (enumLiteral_2= 'Load' ) | (enumLiteral_3= 'Ignore' ) ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:747:1: ( (enumLiteral_0= 'Index' ) | (enumLiteral_1= 'Id' ) | (enumLiteral_2= 'Load' ) | (enumLiteral_3= 'Ignore' ) )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:747:1: ( (enumLiteral_0= 'Index' ) | (enumLiteral_1= 'Id' ) | (enumLiteral_2= 'Load' ) | (enumLiteral_3= 'Ignore' ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt21=1;
                }
                break;
            case 24:
                {
                alt21=2;
                }
                break;
            case 25:
                {
                alt21=3;
                }
                break;
            case 26:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:747:2: (enumLiteral_0= 'Index' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:747:2: (enumLiteral_0= 'Index' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:747:4: enumLiteral_0= 'Index'
                    {
                    enumLiteral_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFetureAnnotation1405); 

                            current = grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:753:6: (enumLiteral_1= 'Id' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:753:6: (enumLiteral_1= 'Id' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:753:8: enumLiteral_1= 'Id'
                    {
                    enumLiteral_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFetureAnnotation1422); 

                            current = grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:759:6: (enumLiteral_2= 'Load' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:759:6: (enumLiteral_2= 'Load' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:759:8: enumLiteral_2= 'Load'
                    {
                    enumLiteral_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleFetureAnnotation1439); 

                            current = grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:765:6: (enumLiteral_3= 'Ignore' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:765:6: (enumLiteral_3= 'Ignore' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:765:8: enumLiteral_3= 'Ignore'
                    {
                    enumLiteral_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleFetureAnnotation1456); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:775:1: ruleDataTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'Object' ) ) ;
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
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:777:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'Object' ) ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:778:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'Object' ) )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:778:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'Object' ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt22=1;
                }
                break;
            case 28:
                {
                alt22=2;
                }
                break;
            case 29:
                {
                alt22=3;
                }
                break;
            case 30:
                {
                alt22=4;
                }
                break;
            case 31:
                {
                alt22=5;
                }
                break;
            case 32:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:778:2: (enumLiteral_0= 'String' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:778:2: (enumLiteral_0= 'String' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:778:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleDataTypes1501); 

                            current = grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:784:6: (enumLiteral_1= 'Integer' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:784:6: (enumLiteral_1= 'Integer' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:784:8: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDataTypes1518); 

                            current = grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:790:6: (enumLiteral_2= 'Boolean' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:790:6: (enumLiteral_2= 'Boolean' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:790:8: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDataTypes1535); 

                            current = grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:796:6: (enumLiteral_3= 'Long' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:796:6: (enumLiteral_3= 'Long' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:796:8: enumLiteral_3= 'Long'
                    {
                    enumLiteral_3=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDataTypes1552); 

                            current = grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:802:6: (enumLiteral_4= 'Double' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:802:6: (enumLiteral_4= 'Double' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:802:8: enumLiteral_4= 'Double'
                    {
                    enumLiteral_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDataTypes1569); 

                            current = grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:808:6: (enumLiteral_5= 'Object' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:808:6: (enumLiteral_5= 'Object' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:808:8: enumLiteral_5= 'Object'
                    {
                    enumLiteral_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDataTypes1586); 

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
        public static final BitSet FOLLOW_12_in_rulePackage165 = new BitSet(new long[]{0x000000000000E800L});
        public static final BitSet FOLLOW_13_in_rulePackage178 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePackage195 = new BitSet(new long[]{0x000000000000C800L});
        public static final BitSet FOLLOW_ruleEntity_in_rulePackage224 = new BitSet(new long[]{0x000000000000C800L});
        public static final BitSet FOLLOW_ruleEntity_in_rulePackage245 = new BitSet(new long[]{0x000000000000C800L});
        public static final BitSet FOLLOW_rulePackage_in_rulePackage270 = new BitSet(new long[]{0x0000000000004800L});
        public static final BitSet FOLLOW_rulePackage_in_rulePackage291 = new BitSet(new long[]{0x0000000000004800L});
        public static final BitSet FOLLOW_14_in_rulePackage306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature342 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRef_in_ruleFeature399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_ruleFeature426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity461 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleEntity517 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEntity534 = new BitSet(new long[]{0x0000000000011000L});
        public static final BitSet FOLLOW_16_in_ruleEntity552 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEntity572 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEntity586 = new BitSet(new long[]{0x0000000000646000L});
        public static final BitSet FOLLOW_13_in_ruleEntity599 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEntity611 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity628 = new BitSet(new long[]{0x0000000000644000L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_ruleEntity657 = new BitSet(new long[]{0x0000000000644000L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_ruleEntity678 = new BitSet(new long[]{0x0000000000644000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleEntity703 = new BitSet(new long[]{0x0000000000244000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleEntity724 = new BitSet(new long[]{0x0000000000244000L});
        public static final BitSet FOLLOW_14_in_ruleEntity739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRef_in_entryRuleRef775 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRef785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleRef822 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRef839 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRef864 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_19_in_ruleRef882 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRef908 = new BitSet(new long[]{0x0000000007902000L});
        public static final BitSet FOLLOW_13_in_ruleRef921 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRef938 = new BitSet(new long[]{0x0000000007900000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleRef967 = new BitSet(new long[]{0x0000000007900000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleRef988 = new BitSet(new long[]{0x0000000007900000L});
        public static final BitSet FOLLOW_20_in_ruleRef1003 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRef1015 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRef1035 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRef1047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType1083 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataType1093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleDataType1130 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDataType1147 = new BitSet(new long[]{0x00000001F8000000L});
        public static final BitSet FOLLOW_ruleDataTypes_in_ruleDataType1173 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_19_in_ruleDataType1191 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataType1217 = new BitSet(new long[]{0x0000000007806000L});
        public static final BitSet FOLLOW_13_in_ruleDataType1230 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDataType1247 = new BitSet(new long[]{0x0000000007804000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleDataType1276 = new BitSet(new long[]{0x0000000007804000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleDataType1297 = new BitSet(new long[]{0x0000000007804000L});
        public static final BitSet FOLLOW_14_in_ruleDataType1312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleEntityAnnotation1361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleFetureAnnotation1405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleFetureAnnotation1422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleFetureAnnotation1439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleFetureAnnotation1456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleDataTypes1501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleDataTypes1518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleDataTypes1535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleDataTypes1552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleDataTypes1569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleDataTypes1586 = new BitSet(new long[]{0x0000000000000002L});
    }


}