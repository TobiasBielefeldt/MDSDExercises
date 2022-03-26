package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }



     	private MathGrammarAccess grammarAccess;

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:71:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ) )
            // InternalMath.g:78:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) )
            {
            // InternalMath.g:78:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) )
            // InternalMath.g:79:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getVarKeyword_0());
            		
            // InternalMath.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMathExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMathExpAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:105:3: ( (lv_exp_3_0= ruleExp ) )
            // InternalMath.g:106:4: (lv_exp_3_0= ruleExp )
            {
            // InternalMath.g:106:4: (lv_exp_3_0= ruleExp )
            // InternalMath.g:107:5: lv_exp_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:128:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:128:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:129:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:135:1: ruleExp returns [EObject current=null] : ( ( (lv_left_0_0= rulePrimary ) ) ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )? ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:141:2: ( ( ( (lv_left_0_0= rulePrimary ) ) ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )? ) )
            // InternalMath.g:142:2: ( ( (lv_left_0_0= rulePrimary ) ) ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )? )
            {
            // InternalMath.g:142:2: ( ( (lv_left_0_0= rulePrimary ) ) ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )? )
            // InternalMath.g:143:3: ( (lv_left_0_0= rulePrimary ) ) ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )?
            {
            // InternalMath.g:143:3: ( (lv_left_0_0= rulePrimary ) )
            // InternalMath.g:144:4: (lv_left_0_0= rulePrimary )
            {
            // InternalMath.g:144:4: (lv_left_0_0= rulePrimary )
            // InternalMath.g:145:5: lv_left_0_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getExpAccess().getLeftPrimaryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_left_0_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"dk.sdu.mmmi.mdsd.Math.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMath.g:162:3: ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=13 && LA1_0<=16)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMath.g:163:4: ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) )
                    {
                    // InternalMath.g:163:4: ( (lv_operator_1_0= ruleExpOp ) )
                    // InternalMath.g:164:5: (lv_operator_1_0= ruleExpOp )
                    {
                    // InternalMath.g:164:5: (lv_operator_1_0= ruleExpOp )
                    // InternalMath.g:165:6: lv_operator_1_0= ruleExpOp
                    {

                    						newCompositeNode(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_operator_1_0=ruleExpOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_1_0,
                    							"dk.sdu.mmmi.mdsd.Math.ExpOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMath.g:182:4: ( (lv_right_2_0= ruleExp ) )
                    // InternalMath.g:183:5: (lv_right_2_0= ruleExp )
                    {
                    // InternalMath.g:183:5: (lv_right_2_0= ruleExp )
                    // InternalMath.g:184:6: lv_right_2_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getExpAccess().getRightExpParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"dk.sdu.mmmi.mdsd.Math.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleExpOp"
    // InternalMath.g:206:1: entryRuleExpOp returns [EObject current=null] : iv_ruleExpOp= ruleExpOp EOF ;
    public final EObject entryRuleExpOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpOp = null;


        try {
            // InternalMath.g:206:46: (iv_ruleExpOp= ruleExpOp EOF )
            // InternalMath.g:207:2: iv_ruleExpOp= ruleExpOp EOF
            {
             newCompositeNode(grammarAccess.getExpOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpOp=ruleExpOp();

            state._fsp--;

             current =iv_ruleExpOp; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpOp"


    // $ANTLR start "ruleExpOp"
    // InternalMath.g:213:1: ruleExpOp returns [EObject current=null] : ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) | ( () otherlv_5= '*' ) | ( () otherlv_7= '/' ) ) ;
    public final EObject ruleExpOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMath.g:219:2: ( ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) | ( () otherlv_5= '*' ) | ( () otherlv_7= '/' ) ) )
            // InternalMath.g:220:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) | ( () otherlv_5= '*' ) | ( () otherlv_7= '/' ) )
            {
            // InternalMath.g:220:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) | ( () otherlv_5= '*' ) | ( () otherlv_7= '/' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
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
                    // InternalMath.g:221:3: ( () otherlv_1= '+' )
                    {
                    // InternalMath.g:221:3: ( () otherlv_1= '+' )
                    // InternalMath.g:222:4: () otherlv_1= '+'
                    {
                    // InternalMath.g:222:4: ()
                    // InternalMath.g:223:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpOpAccess().getPlusAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpOpAccess().getPlusSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:235:3: ( () otherlv_3= '-' )
                    {
                    // InternalMath.g:235:3: ( () otherlv_3= '-' )
                    // InternalMath.g:236:4: () otherlv_3= '-'
                    {
                    // InternalMath.g:236:4: ()
                    // InternalMath.g:237:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpOpAccess().getMinusAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpOpAccess().getHyphenMinusKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:249:3: ( () otherlv_5= '*' )
                    {
                    // InternalMath.g:249:3: ( () otherlv_5= '*' )
                    // InternalMath.g:250:4: () otherlv_5= '*'
                    {
                    // InternalMath.g:250:4: ()
                    // InternalMath.g:251:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpOpAccess().getMultAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpOpAccess().getAsteriskKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMath.g:263:3: ( () otherlv_7= '/' )
                    {
                    // InternalMath.g:263:3: ( () otherlv_7= '/' )
                    // InternalMath.g:264:4: () otherlv_7= '/'
                    {
                    // InternalMath.g:264:4: ()
                    // InternalMath.g:265:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpOpAccess().getDivAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getExpOpAccess().getSolidusKeyword_3_1());
                    			

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
    // $ANTLR end "ruleExpOp"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:280:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:280:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:281:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:287:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_VariableUse_2 = null;



        	enterRule();

        try {
            // InternalMath.g:293:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse ) )
            // InternalMath.g:294:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse )
            {
            // InternalMath.g:294:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_VariableUse_2= ruleVariableUse )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMath.g:295:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMath.g:304:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMath.g:313:3: this_VariableUse_2= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_2=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_2;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:325:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMath.g:325:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMath.g:326:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:332:1: ruleParenthesis returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:338:2: ( ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' ) )
            // InternalMath.g:339:2: ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' )
            {
            // InternalMath.g:339:2: ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' )
            // InternalMath.g:340:3: () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')'
            {
            // InternalMath.g:340:3: ()
            // InternalMath.g:341:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParenthesisAccess().getParAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:351:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalMath.g:352:4: (lv_exp_2_0= ruleExp )
            {
            // InternalMath.g:352:4: (lv_exp_2_0= ruleExp )
            // InternalMath.g:353:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalMath.g:378:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMath.g:378:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMath.g:379:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMath.g:385:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMath.g:391:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalMath.g:392:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalMath.g:392:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalMath.g:393:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalMath.g:393:3: ()
            // InternalMath.g:394:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumAction_0(),
            					current);
            			

            }

            // InternalMath.g:400:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalMath.g:401:4: (lv_value_1_0= RULE_INT )
            {
            // InternalMath.g:401:4: (lv_value_1_0= RULE_INT )
            // InternalMath.g:402:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:422:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:422:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:423:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:429:1: ruleVariableUse returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMath.g:435:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMath.g:436:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMath.g:436:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalMath.g:437:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalMath.g:437:3: ()
            // InternalMath.g:438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableUseAccess().getRefAction_0(),
            					current);
            			

            }

            // InternalMath.g:444:3: ( (otherlv_1= RULE_ID ) )
            // InternalMath.g:445:4: (otherlv_1= RULE_ID )
            {
            // InternalMath.g:445:4: (otherlv_1= RULE_ID )
            // InternalMath.g:446:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableUseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getVariableUseAccess().getRefMathExpCrossReference_1_0());
            				

            }


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
    // $ANTLR end "ruleVariableUse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});

}