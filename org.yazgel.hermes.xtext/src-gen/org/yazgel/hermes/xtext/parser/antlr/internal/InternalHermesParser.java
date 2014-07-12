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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'description'", "'}'", "'Entity'", "'='", "'superEntity'", "':'", "'Ref'", "'many'", "'source'", "'refTo'", "'DataType'", "'type'", "'Cache'", "'Index'", "'Id'", "'Load'", "'Ignore'", "'String'", "'Integer'", "'Boolean'", "'Long'", "'Double'", "'Object'"
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

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:268:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_annotations_7_0= ruleEntityAnnotation ) ) ( (lv_annotations_8_0= ruleEntityAnnotation ) )* )? (otherlv_9= 'superEntity' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? ( ( (lv_ownedFeature_12_0= ruleFeature ) ) ( (lv_ownedFeature_13_0= ruleFeature ) )* )? otherlv_14= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Enumerator lv_annotations_7_0 = null;

        Enumerator lv_annotations_8_0 = null;

        EObject lv_ownedFeature_12_0 = null;

        EObject lv_ownedFeature_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:271:28: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_annotations_7_0= ruleEntityAnnotation ) ) ( (lv_annotations_8_0= ruleEntityAnnotation ) )* )? (otherlv_9= 'superEntity' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? ( ( (lv_ownedFeature_12_0= ruleFeature ) ) ( (lv_ownedFeature_13_0= ruleFeature ) )* )? otherlv_14= '}' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:272:1: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_annotations_7_0= ruleEntityAnnotation ) ) ( (lv_annotations_8_0= ruleEntityAnnotation ) )* )? (otherlv_9= 'superEntity' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? ( ( (lv_ownedFeature_12_0= ruleFeature ) ) ( (lv_ownedFeature_13_0= ruleFeature ) )* )? otherlv_14= '}' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:272:1: ( () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_annotations_7_0= ruleEntityAnnotation ) ) ( (lv_annotations_8_0= ruleEntityAnnotation ) )* )? (otherlv_9= 'superEntity' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? ( ( (lv_ownedFeature_12_0= ruleFeature ) ) ( (lv_ownedFeature_13_0= ruleFeature ) )* )? otherlv_14= '}' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:272:2: () otherlv_1= 'Entity' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= RULE_STRING ) ) )? ( ( (lv_annotations_7_0= ruleEntityAnnotation ) ) ( (lv_annotations_8_0= ruleEntityAnnotation ) )* )? (otherlv_9= 'superEntity' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )? ( ( (lv_ownedFeature_12_0= ruleFeature ) ) ( (lv_ownedFeature_13_0= ruleFeature ) )* )? otherlv_14= '}'
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

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEntity551); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:304:1: (otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:304:3: otherlv_4= 'description' otherlv_5= '=' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEntity564); 

                        	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getDescriptionKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEntity576); 

                        	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getEqualsSignKeyword_4_1());
                        
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:312:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:313:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:313:1: (lv_description_6_0= RULE_STRING )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:314:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEntity593); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getEntityAccess().getDescriptionSTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
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

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:330:4: ( ( (lv_annotations_7_0= ruleEntityAnnotation ) ) ( (lv_annotations_8_0= ruleEntityAnnotation ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:330:5: ( (lv_annotations_7_0= ruleEntityAnnotation ) ) ( (lv_annotations_8_0= ruleEntityAnnotation ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:330:5: ( (lv_annotations_7_0= ruleEntityAnnotation ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:331:1: (lv_annotations_7_0= ruleEntityAnnotation )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:331:1: (lv_annotations_7_0= ruleEntityAnnotation )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:332:3: lv_annotations_7_0= ruleEntityAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_ruleEntity622);
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

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:348:2: ( (lv_annotations_8_0= ruleEntityAnnotation ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==25) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:349:1: (lv_annotations_8_0= ruleEntityAnnotation )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:349:1: (lv_annotations_8_0= ruleEntityAnnotation )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:350:3: lv_annotations_8_0= ruleEntityAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getAnnotationsEntityAnnotationEnumRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEntityAnnotation_in_ruleEntity643);
                    	    lv_annotations_8_0=ruleEntityAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotations",
                    	            		lv_annotations_8_0, 
                    	            		"EntityAnnotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:366:5: (otherlv_9= 'superEntity' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:366:7: otherlv_9= 'superEntity' otherlv_10= ':' ( (otherlv_11= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEntity659); 

                        	newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getSuperEntityKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEntity671); 

                        	newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getColonKeyword_6_1());
                        
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:374:1: ( (otherlv_11= RULE_ID ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:375:1: (otherlv_11= RULE_ID )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:375:1: (otherlv_11= RULE_ID )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:376:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEntity691); 

                    		newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getSuperEntityEntityCrossReference_6_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:387:4: ( ( (lv_ownedFeature_12_0= ruleFeature ) ) ( (lv_ownedFeature_13_0= ruleFeature ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19||LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:387:5: ( (lv_ownedFeature_12_0= ruleFeature ) ) ( (lv_ownedFeature_13_0= ruleFeature ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:387:5: ( (lv_ownedFeature_12_0= ruleFeature ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:388:1: (lv_ownedFeature_12_0= ruleFeature )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:388:1: (lv_ownedFeature_12_0= ruleFeature )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:389:3: lv_ownedFeature_12_0= ruleFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleEntity715);
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

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:405:2: ( (lv_ownedFeature_13_0= ruleFeature ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==19||LA11_0==23) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:406:1: (lv_ownedFeature_13_0= ruleFeature )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:406:1: (lv_ownedFeature_13_0= ruleFeature )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:407:3: lv_ownedFeature_13_0= ruleFeature
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntityAccess().getOwnedFeatureFeatureParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleEntity736);
                    	    lv_ownedFeature_13_0=ruleFeature();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ownedFeature",
                    	            		lv_ownedFeature_13_0, 
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

            otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEntity751); 

                	newLeafNode(otherlv_14, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:435:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:436:2: (iv_ruleRef= ruleRef EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:437:2: iv_ruleRef= ruleRef EOF
            {
             newCompositeNode(grammarAccess.getRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRef_in_entryRuleRef787);
            iv_ruleRef=ruleRef();

            state._fsp--;

             current =iv_ruleRef; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRef797); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:444:1: ruleRef returns [EObject current=null] : (otherlv_0= 'Ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_many_3_0= 'many' ) )? (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_annotations_6_0= ruleFetureAnnotation ) ) ( (lv_annotations_7_0= ruleFetureAnnotation ) )* )? otherlv_8= 'source' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'refTo' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= '}' ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_many_3_0=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Enumerator lv_annotations_6_0 = null;

        Enumerator lv_annotations_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:447:28: ( (otherlv_0= 'Ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_many_3_0= 'many' ) )? (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_annotations_6_0= ruleFetureAnnotation ) ) ( (lv_annotations_7_0= ruleFetureAnnotation ) )* )? otherlv_8= 'source' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'refTo' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= '}' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:448:1: (otherlv_0= 'Ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_many_3_0= 'many' ) )? (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_annotations_6_0= ruleFetureAnnotation ) ) ( (lv_annotations_7_0= ruleFetureAnnotation ) )* )? otherlv_8= 'source' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'refTo' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= '}' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:448:1: (otherlv_0= 'Ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_many_3_0= 'many' ) )? (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_annotations_6_0= ruleFetureAnnotation ) ) ( (lv_annotations_7_0= ruleFetureAnnotation ) )* )? otherlv_8= 'source' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'refTo' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= '}' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:448:3: otherlv_0= 'Ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_many_3_0= 'many' ) )? (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_annotations_6_0= ruleFetureAnnotation ) ) ( (lv_annotations_7_0= ruleFetureAnnotation ) )* )? otherlv_8= 'source' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) otherlv_11= 'refTo' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRef834); 

                	newLeafNode(otherlv_0, grammarAccess.getRefAccess().getRefKeyword_0());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:452:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:453:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:453:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:454:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRef851); 

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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRef868); 

                	newLeafNode(otherlv_2, grammarAccess.getRefAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:474:1: ( (lv_many_3_0= 'many' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:475:1: (lv_many_3_0= 'many' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:475:1: (lv_many_3_0= 'many' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:476:3: lv_many_3_0= 'many'
                    {
                    lv_many_3_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRef886); 

                            newLeafNode(lv_many_3_0, grammarAccess.getRefAccess().getManyManyKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRefRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:489:3: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:489:5: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRef913); 

                        	newLeafNode(otherlv_4, grammarAccess.getRefAccess().getDescriptionKeyword_4_0());
                        
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:493:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:494:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:494:1: (lv_description_5_0= RULE_STRING )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:495:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRef930); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getRefAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRefRule());
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

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:511:4: ( ( (lv_annotations_6_0= ruleFetureAnnotation ) ) ( (lv_annotations_7_0= ruleFetureAnnotation ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=26 && LA16_0<=29)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:511:5: ( (lv_annotations_6_0= ruleFetureAnnotation ) ) ( (lv_annotations_7_0= ruleFetureAnnotation ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:511:5: ( (lv_annotations_6_0= ruleFetureAnnotation ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:512:1: (lv_annotations_6_0= ruleFetureAnnotation )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:512:1: (lv_annotations_6_0= ruleFetureAnnotation )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:513:3: lv_annotations_6_0= ruleFetureAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleRef959);
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

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:529:2: ( (lv_annotations_7_0= ruleFetureAnnotation ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>=26 && LA15_0<=29)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:530:1: (lv_annotations_7_0= ruleFetureAnnotation )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:530:1: (lv_annotations_7_0= ruleFetureAnnotation )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:531:3: lv_annotations_7_0= ruleFetureAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRefAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleRef980);
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
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRef995); 

                	newLeafNode(otherlv_8, grammarAccess.getRefAccess().getSourceKeyword_6());
                
            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRef1007); 

                	newLeafNode(otherlv_9, grammarAccess.getRefAccess().getEqualsSignKeyword_7());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:555:1: ( (otherlv_10= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:556:1: (otherlv_10= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:556:1: (otherlv_10= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:557:3: otherlv_10= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRule());
            	        }
                    
            otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRef1027); 

            		newLeafNode(otherlv_10, grammarAccess.getRefAccess().getSourceEntityCrossReference_8_0()); 
            	

            }


            }

            otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRef1039); 

                	newLeafNode(otherlv_11, grammarAccess.getRefAccess().getRefToKeyword_9());
                
            otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRef1051); 

                	newLeafNode(otherlv_12, grammarAccess.getRefAccess().getEqualsSignKeyword_10());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:576:1: ( (otherlv_13= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:577:1: (otherlv_13= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:577:1: (otherlv_13= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:578:3: otherlv_13= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRefRule());
            	        }
                    
            otherlv_13=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRef1071); 

            		newLeafNode(otherlv_13, grammarAccess.getRefAccess().getRefToEntityCrossReference_11_0()); 
            	

            }


            }

            otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRef1083); 

                	newLeafNode(otherlv_14, grammarAccess.getRefAccess().getRightCurlyBracketKeyword_12());
                

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:601:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:602:2: (iv_ruleDataType= ruleDataType EOF )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:603:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDataType_in_entryRuleDataType1119);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDataType1129); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:610:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'DataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_many_3_0= 'many' ) )? (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_annotations_6_0= ruleFetureAnnotation ) ) ( (lv_annotations_7_0= ruleFetureAnnotation ) )* )? otherlv_8= 'type' otherlv_9= '=' ( (lv_type_10_0= ruleDataTypes ) ) otherlv_11= '}' ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_many_3_0=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_annotations_6_0 = null;

        Enumerator lv_annotations_7_0 = null;

        Enumerator lv_type_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:613:28: ( (otherlv_0= 'DataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_many_3_0= 'many' ) )? (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_annotations_6_0= ruleFetureAnnotation ) ) ( (lv_annotations_7_0= ruleFetureAnnotation ) )* )? otherlv_8= 'type' otherlv_9= '=' ( (lv_type_10_0= ruleDataTypes ) ) otherlv_11= '}' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:614:1: (otherlv_0= 'DataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_many_3_0= 'many' ) )? (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_annotations_6_0= ruleFetureAnnotation ) ) ( (lv_annotations_7_0= ruleFetureAnnotation ) )* )? otherlv_8= 'type' otherlv_9= '=' ( (lv_type_10_0= ruleDataTypes ) ) otherlv_11= '}' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:614:1: (otherlv_0= 'DataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_many_3_0= 'many' ) )? (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_annotations_6_0= ruleFetureAnnotation ) ) ( (lv_annotations_7_0= ruleFetureAnnotation ) )* )? otherlv_8= 'type' otherlv_9= '=' ( (lv_type_10_0= ruleDataTypes ) ) otherlv_11= '}' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:614:3: otherlv_0= 'DataType' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_many_3_0= 'many' ) )? (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? ( ( (lv_annotations_6_0= ruleFetureAnnotation ) ) ( (lv_annotations_7_0= ruleFetureAnnotation ) )* )? otherlv_8= 'type' otherlv_9= '=' ( (lv_type_10_0= ruleDataTypes ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleDataType1166); 

                	newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDataTypeKeyword_0());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:618:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:619:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:619:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:620:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDataType1183); 

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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDataType1200); 

                	newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:640:1: ( (lv_many_3_0= 'many' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:641:1: (lv_many_3_0= 'many' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:641:1: (lv_many_3_0= 'many' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:642:3: lv_many_3_0= 'many'
                    {
                    lv_many_3_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDataType1218); 

                            newLeafNode(lv_many_3_0, grammarAccess.getDataTypeAccess().getManyManyKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:655:3: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:655:5: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDataType1245); 

                        	newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getDescriptionKeyword_4_0());
                        
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:659:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:660:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:660:1: (lv_description_5_0= RULE_STRING )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:661:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDataType1262); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getDataTypeAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataTypeRule());
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

            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:677:4: ( ( (lv_annotations_6_0= ruleFetureAnnotation ) ) ( (lv_annotations_7_0= ruleFetureAnnotation ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=26 && LA20_0<=29)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:677:5: ( (lv_annotations_6_0= ruleFetureAnnotation ) ) ( (lv_annotations_7_0= ruleFetureAnnotation ) )*
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:677:5: ( (lv_annotations_6_0= ruleFetureAnnotation ) )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:678:1: (lv_annotations_6_0= ruleFetureAnnotation )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:678:1: (lv_annotations_6_0= ruleFetureAnnotation )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:679:3: lv_annotations_6_0= ruleFetureAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleDataType1291);
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

                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:695:2: ( (lv_annotations_7_0= ruleFetureAnnotation ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>=26 && LA19_0<=29)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:696:1: (lv_annotations_7_0= ruleFetureAnnotation )
                    	    {
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:696:1: (lv_annotations_7_0= ruleFetureAnnotation )
                    	    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:697:3: lv_annotations_7_0= ruleFetureAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDataTypeAccess().getAnnotationsFetureAnnotationEnumRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFetureAnnotation_in_ruleDataType1312);
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
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDataType1327); 

                	newLeafNode(otherlv_8, grammarAccess.getDataTypeAccess().getTypeKeyword_6());
                
            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDataType1339); 

                	newLeafNode(otherlv_9, grammarAccess.getDataTypeAccess().getEqualsSignKeyword_7());
                
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:721:1: ( (lv_type_10_0= ruleDataTypes ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:722:1: (lv_type_10_0= ruleDataTypes )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:722:1: (lv_type_10_0= ruleDataTypes )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:723:3: lv_type_10_0= ruleDataTypes
            {
             
            	        newCompositeNode(grammarAccess.getDataTypeAccess().getTypeDataTypesEnumRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDataTypes_in_ruleDataType1360);
            lv_type_10_0=ruleDataTypes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataTypeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_10_0, 
                    		"DataTypes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDataType1372); 

                	newLeafNode(otherlv_11, grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_9());
                

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:751:1: ruleEntityAnnotation returns [Enumerator current=null] : (enumLiteral_0= 'Cache' ) ;
    public final Enumerator ruleEntityAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:753:28: ( (enumLiteral_0= 'Cache' ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:754:1: (enumLiteral_0= 'Cache' )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:754:1: (enumLiteral_0= 'Cache' )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:754:3: enumLiteral_0= 'Cache'
            {
            enumLiteral_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEntityAnnotation1421); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:764:1: ruleFetureAnnotation returns [Enumerator current=null] : ( (enumLiteral_0= 'Index' ) | (enumLiteral_1= 'Id' ) | (enumLiteral_2= 'Load' ) | (enumLiteral_3= 'Ignore' ) ) ;
    public final Enumerator ruleFetureAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:766:28: ( ( (enumLiteral_0= 'Index' ) | (enumLiteral_1= 'Id' ) | (enumLiteral_2= 'Load' ) | (enumLiteral_3= 'Ignore' ) ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:767:1: ( (enumLiteral_0= 'Index' ) | (enumLiteral_1= 'Id' ) | (enumLiteral_2= 'Load' ) | (enumLiteral_3= 'Ignore' ) )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:767:1: ( (enumLiteral_0= 'Index' ) | (enumLiteral_1= 'Id' ) | (enumLiteral_2= 'Load' ) | (enumLiteral_3= 'Ignore' ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt21=1;
                }
                break;
            case 27:
                {
                alt21=2;
                }
                break;
            case 28:
                {
                alt21=3;
                }
                break;
            case 29:
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
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:767:2: (enumLiteral_0= 'Index' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:767:2: (enumLiteral_0= 'Index' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:767:4: enumLiteral_0= 'Index'
                    {
                    enumLiteral_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleFetureAnnotation1465); 

                            current = grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFetureAnnotationAccess().getIndexEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:773:6: (enumLiteral_1= 'Id' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:773:6: (enumLiteral_1= 'Id' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:773:8: enumLiteral_1= 'Id'
                    {
                    enumLiteral_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleFetureAnnotation1482); 

                            current = grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFetureAnnotationAccess().getIdEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:779:6: (enumLiteral_2= 'Load' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:779:6: (enumLiteral_2= 'Load' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:779:8: enumLiteral_2= 'Load'
                    {
                    enumLiteral_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFetureAnnotation1499); 

                            current = grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFetureAnnotationAccess().getLoadEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:785:6: (enumLiteral_3= 'Ignore' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:785:6: (enumLiteral_3= 'Ignore' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:785:8: enumLiteral_3= 'Ignore'
                    {
                    enumLiteral_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleFetureAnnotation1516); 

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
    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:795:1: ruleDataTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'Object' ) ) ;
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
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:797:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'Object' ) ) )
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:798:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'Object' ) )
            {
            // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:798:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Long' ) | (enumLiteral_4= 'Double' ) | (enumLiteral_5= 'Object' ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt22=1;
                }
                break;
            case 31:
                {
                alt22=2;
                }
                break;
            case 32:
                {
                alt22=3;
                }
                break;
            case 33:
                {
                alt22=4;
                }
                break;
            case 34:
                {
                alt22=5;
                }
                break;
            case 35:
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
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:798:2: (enumLiteral_0= 'String' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:798:2: (enumLiteral_0= 'String' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:798:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDataTypes1561); 

                            current = grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypesAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:804:6: (enumLiteral_1= 'Integer' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:804:6: (enumLiteral_1= 'Integer' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:804:8: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDataTypes1578); 

                            current = grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypesAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:810:6: (enumLiteral_2= 'Boolean' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:810:6: (enumLiteral_2= 'Boolean' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:810:8: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDataTypes1595); 

                            current = grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypesAccess().getBooleanEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:816:6: (enumLiteral_3= 'Long' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:816:6: (enumLiteral_3= 'Long' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:816:8: enumLiteral_3= 'Long'
                    {
                    enumLiteral_3=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleDataTypes1612); 

                            current = grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypesAccess().getLongEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:822:6: (enumLiteral_4= 'Double' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:822:6: (enumLiteral_4= 'Double' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:822:8: enumLiteral_4= 'Double'
                    {
                    enumLiteral_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDataTypes1629); 

                            current = grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDataTypesAccess().getDoubleEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:828:6: (enumLiteral_5= 'Object' )
                    {
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:828:6: (enumLiteral_5= 'Object' )
                    // ../org.yazgel.hermes.xtext/src-gen/org/yazgel/hermes/xtext/parser/antlr/internal/InternalHermes.g:828:8: enumLiteral_5= 'Object'
                    {
                    enumLiteral_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleDataTypes1646); 

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
        public static final BitSet FOLLOW_RULE_ID_in_ruleEntity534 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleEntity551 = new BitSet(new long[]{0x00000000028A6000L});
        public static final BitSet FOLLOW_13_in_ruleEntity564 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleEntity576 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEntity593 = new BitSet(new long[]{0x00000000028A4000L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_ruleEntity622 = new BitSet(new long[]{0x00000000028A4000L});
        public static final BitSet FOLLOW_ruleEntityAnnotation_in_ruleEntity643 = new BitSet(new long[]{0x00000000028A4000L});
        public static final BitSet FOLLOW_17_in_ruleEntity659 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEntity671 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEntity691 = new BitSet(new long[]{0x0000000000884000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleEntity715 = new BitSet(new long[]{0x0000000000884000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleEntity736 = new BitSet(new long[]{0x0000000000884000L});
        public static final BitSet FOLLOW_14_in_ruleEntity751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRef_in_entryRuleRef787 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRef797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleRef834 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRef851 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRef868 = new BitSet(new long[]{0x000000003C302000L});
        public static final BitSet FOLLOW_20_in_ruleRef886 = new BitSet(new long[]{0x000000003C202000L});
        public static final BitSet FOLLOW_13_in_ruleRef913 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRef930 = new BitSet(new long[]{0x000000003C200000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleRef959 = new BitSet(new long[]{0x000000003C200000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleRef980 = new BitSet(new long[]{0x000000003C200000L});
        public static final BitSet FOLLOW_21_in_ruleRef995 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRef1007 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRef1027 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleRef1039 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRef1051 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRef1071 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRef1083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataType_in_entryRuleDataType1119 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDataType1129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleDataType1166 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDataType1183 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDataType1200 = new BitSet(new long[]{0x000000003D102000L});
        public static final BitSet FOLLOW_20_in_ruleDataType1218 = new BitSet(new long[]{0x000000003D002000L});
        public static final BitSet FOLLOW_13_in_ruleDataType1245 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDataType1262 = new BitSet(new long[]{0x000000003D000000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleDataType1291 = new BitSet(new long[]{0x000000003D000000L});
        public static final BitSet FOLLOW_ruleFetureAnnotation_in_ruleDataType1312 = new BitSet(new long[]{0x000000003D000000L});
        public static final BitSet FOLLOW_24_in_ruleDataType1327 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDataType1339 = new BitSet(new long[]{0x0000000FC0000000L});
        public static final BitSet FOLLOW_ruleDataTypes_in_ruleDataType1360 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDataType1372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEntityAnnotation1421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleFetureAnnotation1465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleFetureAnnotation1482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleFetureAnnotation1499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleFetureAnnotation1516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleDataTypes1561 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleDataTypes1578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleDataTypes1595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleDataTypes1612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleDataTypes1629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleDataTypes1646 = new BitSet(new long[]{0x0000000000000002L});
    }


}