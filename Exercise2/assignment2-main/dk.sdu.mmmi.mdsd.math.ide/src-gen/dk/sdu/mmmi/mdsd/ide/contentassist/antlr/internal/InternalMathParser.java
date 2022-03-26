package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:53:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalMath.g:54:1: ( ruleMathExp EOF )
            // InternalMath.g:55:1: ruleMathExp EOF
            {
             before(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:62:1: ruleMathExp : ( ( rule__MathExp__Group__0 ) ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:66:2: ( ( ( rule__MathExp__Group__0 ) ) )
            // InternalMath.g:67:2: ( ( rule__MathExp__Group__0 ) )
            {
            // InternalMath.g:67:2: ( ( rule__MathExp__Group__0 ) )
            // InternalMath.g:68:3: ( rule__MathExp__Group__0 )
            {
             before(grammarAccess.getMathExpAccess().getGroup()); 
            // InternalMath.g:69:3: ( rule__MathExp__Group__0 )
            // InternalMath.g:69:4: rule__MathExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:78:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalMath.g:79:1: ( ruleExp EOF )
            // InternalMath.g:80:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:87:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:91:2: ( ( ( rule__Exp__Group__0 ) ) )
            // InternalMath.g:92:2: ( ( rule__Exp__Group__0 ) )
            {
            // InternalMath.g:92:2: ( ( rule__Exp__Group__0 ) )
            // InternalMath.g:93:3: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // InternalMath.g:94:3: ( rule__Exp__Group__0 )
            // InternalMath.g:94:4: rule__Exp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleExpOp"
    // InternalMath.g:103:1: entryRuleExpOp : ruleExpOp EOF ;
    public final void entryRuleExpOp() throws RecognitionException {
        try {
            // InternalMath.g:104:1: ( ruleExpOp EOF )
            // InternalMath.g:105:1: ruleExpOp EOF
            {
             before(grammarAccess.getExpOpRule()); 
            pushFollow(FOLLOW_1);
            ruleExpOp();

            state._fsp--;

             after(grammarAccess.getExpOpRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpOp"


    // $ANTLR start "ruleExpOp"
    // InternalMath.g:112:1: ruleExpOp : ( ( rule__ExpOp__Alternatives ) ) ;
    public final void ruleExpOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:116:2: ( ( ( rule__ExpOp__Alternatives ) ) )
            // InternalMath.g:117:2: ( ( rule__ExpOp__Alternatives ) )
            {
            // InternalMath.g:117:2: ( ( rule__ExpOp__Alternatives ) )
            // InternalMath.g:118:3: ( rule__ExpOp__Alternatives )
            {
             before(grammarAccess.getExpOpAccess().getAlternatives()); 
            // InternalMath.g:119:3: ( rule__ExpOp__Alternatives )
            // InternalMath.g:119:4: rule__ExpOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpOp"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:128:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMath.g:129:1: ( rulePrimary EOF )
            // InternalMath.g:130:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:137:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:141:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMath.g:142:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMath.g:142:2: ( ( rule__Primary__Alternatives ) )
            // InternalMath.g:143:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMath.g:144:3: ( rule__Primary__Alternatives )
            // InternalMath.g:144:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:153:1: entryRuleParenthesis : ruleParenthesis EOF ;
    public final void entryRuleParenthesis() throws RecognitionException {
        try {
            // InternalMath.g:154:1: ( ruleParenthesis EOF )
            // InternalMath.g:155:1: ruleParenthesis EOF
            {
             before(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            ruleParenthesis();

            state._fsp--;

             after(grammarAccess.getParenthesisRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:162:1: ruleParenthesis : ( ( rule__Parenthesis__Group__0 ) ) ;
    public final void ruleParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:166:2: ( ( ( rule__Parenthesis__Group__0 ) ) )
            // InternalMath.g:167:2: ( ( rule__Parenthesis__Group__0 ) )
            {
            // InternalMath.g:167:2: ( ( rule__Parenthesis__Group__0 ) )
            // InternalMath.g:168:3: ( rule__Parenthesis__Group__0 )
            {
             before(grammarAccess.getParenthesisAccess().getGroup()); 
            // InternalMath.g:169:3: ( rule__Parenthesis__Group__0 )
            // InternalMath.g:169:4: rule__Parenthesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalMath.g:178:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalMath.g:179:1: ( ruleNumber EOF )
            // InternalMath.g:180:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMath.g:187:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:191:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalMath.g:192:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalMath.g:192:2: ( ( rule__Number__Group__0 ) )
            // InternalMath.g:193:3: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalMath.g:194:3: ( rule__Number__Group__0 )
            // InternalMath.g:194:4: rule__Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:203:1: entryRuleVariableUse : ruleVariableUse EOF ;
    public final void entryRuleVariableUse() throws RecognitionException {
        try {
            // InternalMath.g:204:1: ( ruleVariableUse EOF )
            // InternalMath.g:205:1: ruleVariableUse EOF
            {
             before(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableUse();

            state._fsp--;

             after(grammarAccess.getVariableUseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:212:1: ruleVariableUse : ( ( rule__VariableUse__Group__0 ) ) ;
    public final void ruleVariableUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:216:2: ( ( ( rule__VariableUse__Group__0 ) ) )
            // InternalMath.g:217:2: ( ( rule__VariableUse__Group__0 ) )
            {
            // InternalMath.g:217:2: ( ( rule__VariableUse__Group__0 ) )
            // InternalMath.g:218:3: ( rule__VariableUse__Group__0 )
            {
             before(grammarAccess.getVariableUseAccess().getGroup()); 
            // InternalMath.g:219:3: ( rule__VariableUse__Group__0 )
            // InternalMath.g:219:4: rule__VariableUse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableUseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "rule__ExpOp__Alternatives"
    // InternalMath.g:227:1: rule__ExpOp__Alternatives : ( ( ( rule__ExpOp__Group_0__0 ) ) | ( ( rule__ExpOp__Group_1__0 ) ) | ( ( rule__ExpOp__Group_2__0 ) ) | ( ( rule__ExpOp__Group_3__0 ) ) );
    public final void rule__ExpOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:231:1: ( ( ( rule__ExpOp__Group_0__0 ) ) | ( ( rule__ExpOp__Group_1__0 ) ) | ( ( rule__ExpOp__Group_2__0 ) ) | ( ( rule__ExpOp__Group_3__0 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            case 16:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMath.g:232:2: ( ( rule__ExpOp__Group_0__0 ) )
                    {
                    // InternalMath.g:232:2: ( ( rule__ExpOp__Group_0__0 ) )
                    // InternalMath.g:233:3: ( rule__ExpOp__Group_0__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_0()); 
                    // InternalMath.g:234:3: ( rule__ExpOp__Group_0__0 )
                    // InternalMath.g:234:4: rule__ExpOp__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOp__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:238:2: ( ( rule__ExpOp__Group_1__0 ) )
                    {
                    // InternalMath.g:238:2: ( ( rule__ExpOp__Group_1__0 ) )
                    // InternalMath.g:239:3: ( rule__ExpOp__Group_1__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_1()); 
                    // InternalMath.g:240:3: ( rule__ExpOp__Group_1__0 )
                    // InternalMath.g:240:4: rule__ExpOp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOp__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:244:2: ( ( rule__ExpOp__Group_2__0 ) )
                    {
                    // InternalMath.g:244:2: ( ( rule__ExpOp__Group_2__0 ) )
                    // InternalMath.g:245:3: ( rule__ExpOp__Group_2__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_2()); 
                    // InternalMath.g:246:3: ( rule__ExpOp__Group_2__0 )
                    // InternalMath.g:246:4: rule__ExpOp__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOp__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMath.g:250:2: ( ( rule__ExpOp__Group_3__0 ) )
                    {
                    // InternalMath.g:250:2: ( ( rule__ExpOp__Group_3__0 ) )
                    // InternalMath.g:251:3: ( rule__ExpOp__Group_3__0 )
                    {
                     before(grammarAccess.getExpOpAccess().getGroup_3()); 
                    // InternalMath.g:252:3: ( rule__ExpOp__Group_3__0 )
                    // InternalMath.g:252:4: rule__ExpOp__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpOp__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpOpAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ExpOp__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMath.g:260:1: rule__Primary__Alternatives : ( ( ruleNumber ) | ( ruleParenthesis ) | ( ruleVariableUse ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:264:1: ( ( ruleNumber ) | ( ruleParenthesis ) | ( ruleVariableUse ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMath.g:265:2: ( ruleNumber )
                    {
                    // InternalMath.g:265:2: ( ruleNumber )
                    // InternalMath.g:266:3: ruleNumber
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:271:2: ( ruleParenthesis )
                    {
                    // InternalMath.g:271:2: ( ruleParenthesis )
                    // InternalMath.g:272:3: ruleParenthesis
                    {
                     before(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParenthesis();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:277:2: ( ruleVariableUse )
                    {
                    // InternalMath.g:277:2: ( ruleVariableUse )
                    // InternalMath.g:278:3: ruleVariableUse
                    {
                     before(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableUse();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__MathExp__Group__0"
    // InternalMath.g:287:1: rule__MathExp__Group__0 : rule__MathExp__Group__0__Impl rule__MathExp__Group__1 ;
    public final void rule__MathExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:291:1: ( rule__MathExp__Group__0__Impl rule__MathExp__Group__1 )
            // InternalMath.g:292:2: rule__MathExp__Group__0__Impl rule__MathExp__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MathExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__1();

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
    // $ANTLR end "rule__MathExp__Group__0"


    // $ANTLR start "rule__MathExp__Group__0__Impl"
    // InternalMath.g:299:1: rule__MathExp__Group__0__Impl : ( 'var' ) ;
    public final void rule__MathExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:303:1: ( ( 'var' ) )
            // InternalMath.g:304:1: ( 'var' )
            {
            // InternalMath.g:304:1: ( 'var' )
            // InternalMath.g:305:2: 'var'
            {
             before(grammarAccess.getMathExpAccess().getVarKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__0__Impl"


    // $ANTLR start "rule__MathExp__Group__1"
    // InternalMath.g:314:1: rule__MathExp__Group__1 : rule__MathExp__Group__1__Impl rule__MathExp__Group__2 ;
    public final void rule__MathExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:318:1: ( rule__MathExp__Group__1__Impl rule__MathExp__Group__2 )
            // InternalMath.g:319:2: rule__MathExp__Group__1__Impl rule__MathExp__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MathExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__2();

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
    // $ANTLR end "rule__MathExp__Group__1"


    // $ANTLR start "rule__MathExp__Group__1__Impl"
    // InternalMath.g:326:1: rule__MathExp__Group__1__Impl : ( ( rule__MathExp__NameAssignment_1 ) ) ;
    public final void rule__MathExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:330:1: ( ( ( rule__MathExp__NameAssignment_1 ) ) )
            // InternalMath.g:331:1: ( ( rule__MathExp__NameAssignment_1 ) )
            {
            // InternalMath.g:331:1: ( ( rule__MathExp__NameAssignment_1 ) )
            // InternalMath.g:332:2: ( rule__MathExp__NameAssignment_1 )
            {
             before(grammarAccess.getMathExpAccess().getNameAssignment_1()); 
            // InternalMath.g:333:2: ( rule__MathExp__NameAssignment_1 )
            // InternalMath.g:333:3: rule__MathExp__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__1__Impl"


    // $ANTLR start "rule__MathExp__Group__2"
    // InternalMath.g:341:1: rule__MathExp__Group__2 : rule__MathExp__Group__2__Impl rule__MathExp__Group__3 ;
    public final void rule__MathExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:345:1: ( rule__MathExp__Group__2__Impl rule__MathExp__Group__3 )
            // InternalMath.g:346:2: rule__MathExp__Group__2__Impl rule__MathExp__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MathExp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__3();

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
    // $ANTLR end "rule__MathExp__Group__2"


    // $ANTLR start "rule__MathExp__Group__2__Impl"
    // InternalMath.g:353:1: rule__MathExp__Group__2__Impl : ( '=' ) ;
    public final void rule__MathExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:357:1: ( ( '=' ) )
            // InternalMath.g:358:1: ( '=' )
            {
            // InternalMath.g:358:1: ( '=' )
            // InternalMath.g:359:2: '='
            {
             before(grammarAccess.getMathExpAccess().getEqualsSignKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__2__Impl"


    // $ANTLR start "rule__MathExp__Group__3"
    // InternalMath.g:368:1: rule__MathExp__Group__3 : rule__MathExp__Group__3__Impl ;
    public final void rule__MathExp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:372:1: ( rule__MathExp__Group__3__Impl )
            // InternalMath.g:373:2: rule__MathExp__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__3__Impl();

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
    // $ANTLR end "rule__MathExp__Group__3"


    // $ANTLR start "rule__MathExp__Group__3__Impl"
    // InternalMath.g:379:1: rule__MathExp__Group__3__Impl : ( ( rule__MathExp__ExpAssignment_3 ) ) ;
    public final void rule__MathExp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:383:1: ( ( ( rule__MathExp__ExpAssignment_3 ) ) )
            // InternalMath.g:384:1: ( ( rule__MathExp__ExpAssignment_3 ) )
            {
            // InternalMath.g:384:1: ( ( rule__MathExp__ExpAssignment_3 ) )
            // InternalMath.g:385:2: ( rule__MathExp__ExpAssignment_3 )
            {
             before(grammarAccess.getMathExpAccess().getExpAssignment_3()); 
            // InternalMath.g:386:2: ( rule__MathExp__ExpAssignment_3 )
            // InternalMath.g:386:3: rule__MathExp__ExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__ExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getExpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__3__Impl"


    // $ANTLR start "rule__Exp__Group__0"
    // InternalMath.g:395:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:399:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalMath.g:400:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Exp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group__1();

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
    // $ANTLR end "rule__Exp__Group__0"


    // $ANTLR start "rule__Exp__Group__0__Impl"
    // InternalMath.g:407:1: rule__Exp__Group__0__Impl : ( ( rule__Exp__LeftAssignment_0 ) ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:411:1: ( ( ( rule__Exp__LeftAssignment_0 ) ) )
            // InternalMath.g:412:1: ( ( rule__Exp__LeftAssignment_0 ) )
            {
            // InternalMath.g:412:1: ( ( rule__Exp__LeftAssignment_0 ) )
            // InternalMath.g:413:2: ( rule__Exp__LeftAssignment_0 )
            {
             before(grammarAccess.getExpAccess().getLeftAssignment_0()); 
            // InternalMath.g:414:2: ( rule__Exp__LeftAssignment_0 )
            // InternalMath.g:414:3: rule__Exp__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__0__Impl"


    // $ANTLR start "rule__Exp__Group__1"
    // InternalMath.g:422:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:426:1: ( rule__Exp__Group__1__Impl )
            // InternalMath.g:427:2: rule__Exp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__1__Impl();

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
    // $ANTLR end "rule__Exp__Group__1"


    // $ANTLR start "rule__Exp__Group__1__Impl"
    // InternalMath.g:433:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )? ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:437:1: ( ( ( rule__Exp__Group_1__0 )? ) )
            // InternalMath.g:438:1: ( ( rule__Exp__Group_1__0 )? )
            {
            // InternalMath.g:438:1: ( ( rule__Exp__Group_1__0 )? )
            // InternalMath.g:439:2: ( rule__Exp__Group_1__0 )?
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalMath.g:440:2: ( rule__Exp__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=13 && LA3_0<=16)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMath.g:440:3: rule__Exp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__1__Impl"


    // $ANTLR start "rule__Exp__Group_1__0"
    // InternalMath.g:449:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:453:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalMath.g:454:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Exp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1();

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
    // $ANTLR end "rule__Exp__Group_1__0"


    // $ANTLR start "rule__Exp__Group_1__0__Impl"
    // InternalMath.g:461:1: rule__Exp__Group_1__0__Impl : ( ( rule__Exp__OperatorAssignment_1_0 ) ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:465:1: ( ( ( rule__Exp__OperatorAssignment_1_0 ) ) )
            // InternalMath.g:466:1: ( ( rule__Exp__OperatorAssignment_1_0 ) )
            {
            // InternalMath.g:466:1: ( ( rule__Exp__OperatorAssignment_1_0 ) )
            // InternalMath.g:467:2: ( rule__Exp__OperatorAssignment_1_0 )
            {
             before(grammarAccess.getExpAccess().getOperatorAssignment_1_0()); 
            // InternalMath.g:468:2: ( rule__Exp__OperatorAssignment_1_0 )
            // InternalMath.g:468:3: rule__Exp__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__OperatorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getOperatorAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1__1"
    // InternalMath.g:476:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:480:1: ( rule__Exp__Group_1__1__Impl )
            // InternalMath.g:481:2: rule__Exp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1__Impl();

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
    // $ANTLR end "rule__Exp__Group_1__1"


    // $ANTLR start "rule__Exp__Group_1__1__Impl"
    // InternalMath.g:487:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__RightAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:491:1: ( ( ( rule__Exp__RightAssignment_1_1 ) ) )
            // InternalMath.g:492:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            {
            // InternalMath.g:492:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            // InternalMath.g:493:2: ( rule__Exp__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_1()); 
            // InternalMath.g:494:2: ( rule__Exp__RightAssignment_1_1 )
            // InternalMath.g:494:3: rule__Exp__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__1__Impl"


    // $ANTLR start "rule__ExpOp__Group_0__0"
    // InternalMath.g:503:1: rule__ExpOp__Group_0__0 : rule__ExpOp__Group_0__0__Impl rule__ExpOp__Group_0__1 ;
    public final void rule__ExpOp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:507:1: ( rule__ExpOp__Group_0__0__Impl rule__ExpOp__Group_0__1 )
            // InternalMath.g:508:2: rule__ExpOp__Group_0__0__Impl rule__ExpOp__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__ExpOp__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_0__1();

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
    // $ANTLR end "rule__ExpOp__Group_0__0"


    // $ANTLR start "rule__ExpOp__Group_0__0__Impl"
    // InternalMath.g:515:1: rule__ExpOp__Group_0__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:519:1: ( ( () ) )
            // InternalMath.g:520:1: ( () )
            {
            // InternalMath.g:520:1: ( () )
            // InternalMath.g:521:2: ()
            {
             before(grammarAccess.getExpOpAccess().getPlusAction_0_0()); 
            // InternalMath.g:522:2: ()
            // InternalMath.g:522:3: 
            {
            }

             after(grammarAccess.getExpOpAccess().getPlusAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_0__0__Impl"


    // $ANTLR start "rule__ExpOp__Group_0__1"
    // InternalMath.g:530:1: rule__ExpOp__Group_0__1 : rule__ExpOp__Group_0__1__Impl ;
    public final void rule__ExpOp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:534:1: ( rule__ExpOp__Group_0__1__Impl )
            // InternalMath.g:535:2: rule__ExpOp__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_0__1__Impl();

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
    // $ANTLR end "rule__ExpOp__Group_0__1"


    // $ANTLR start "rule__ExpOp__Group_0__1__Impl"
    // InternalMath.g:541:1: rule__ExpOp__Group_0__1__Impl : ( '+' ) ;
    public final void rule__ExpOp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:545:1: ( ( '+' ) )
            // InternalMath.g:546:1: ( '+' )
            {
            // InternalMath.g:546:1: ( '+' )
            // InternalMath.g:547:2: '+'
            {
             before(grammarAccess.getExpOpAccess().getPlusSignKeyword_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExpOpAccess().getPlusSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_0__1__Impl"


    // $ANTLR start "rule__ExpOp__Group_1__0"
    // InternalMath.g:557:1: rule__ExpOp__Group_1__0 : rule__ExpOp__Group_1__0__Impl rule__ExpOp__Group_1__1 ;
    public final void rule__ExpOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:561:1: ( rule__ExpOp__Group_1__0__Impl rule__ExpOp__Group_1__1 )
            // InternalMath.g:562:2: rule__ExpOp__Group_1__0__Impl rule__ExpOp__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ExpOp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_1__1();

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
    // $ANTLR end "rule__ExpOp__Group_1__0"


    // $ANTLR start "rule__ExpOp__Group_1__0__Impl"
    // InternalMath.g:569:1: rule__ExpOp__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:573:1: ( ( () ) )
            // InternalMath.g:574:1: ( () )
            {
            // InternalMath.g:574:1: ( () )
            // InternalMath.g:575:2: ()
            {
             before(grammarAccess.getExpOpAccess().getMinusAction_1_0()); 
            // InternalMath.g:576:2: ()
            // InternalMath.g:576:3: 
            {
            }

             after(grammarAccess.getExpOpAccess().getMinusAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_1__0__Impl"


    // $ANTLR start "rule__ExpOp__Group_1__1"
    // InternalMath.g:584:1: rule__ExpOp__Group_1__1 : rule__ExpOp__Group_1__1__Impl ;
    public final void rule__ExpOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:588:1: ( rule__ExpOp__Group_1__1__Impl )
            // InternalMath.g:589:2: rule__ExpOp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_1__1__Impl();

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
    // $ANTLR end "rule__ExpOp__Group_1__1"


    // $ANTLR start "rule__ExpOp__Group_1__1__Impl"
    // InternalMath.g:595:1: rule__ExpOp__Group_1__1__Impl : ( '-' ) ;
    public final void rule__ExpOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:599:1: ( ( '-' ) )
            // InternalMath.g:600:1: ( '-' )
            {
            // InternalMath.g:600:1: ( '-' )
            // InternalMath.g:601:2: '-'
            {
             before(grammarAccess.getExpOpAccess().getHyphenMinusKeyword_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExpOpAccess().getHyphenMinusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_1__1__Impl"


    // $ANTLR start "rule__ExpOp__Group_2__0"
    // InternalMath.g:611:1: rule__ExpOp__Group_2__0 : rule__ExpOp__Group_2__0__Impl rule__ExpOp__Group_2__1 ;
    public final void rule__ExpOp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:615:1: ( rule__ExpOp__Group_2__0__Impl rule__ExpOp__Group_2__1 )
            // InternalMath.g:616:2: rule__ExpOp__Group_2__0__Impl rule__ExpOp__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__ExpOp__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_2__1();

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
    // $ANTLR end "rule__ExpOp__Group_2__0"


    // $ANTLR start "rule__ExpOp__Group_2__0__Impl"
    // InternalMath.g:623:1: rule__ExpOp__Group_2__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:627:1: ( ( () ) )
            // InternalMath.g:628:1: ( () )
            {
            // InternalMath.g:628:1: ( () )
            // InternalMath.g:629:2: ()
            {
             before(grammarAccess.getExpOpAccess().getMultAction_2_0()); 
            // InternalMath.g:630:2: ()
            // InternalMath.g:630:3: 
            {
            }

             after(grammarAccess.getExpOpAccess().getMultAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_2__0__Impl"


    // $ANTLR start "rule__ExpOp__Group_2__1"
    // InternalMath.g:638:1: rule__ExpOp__Group_2__1 : rule__ExpOp__Group_2__1__Impl ;
    public final void rule__ExpOp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:642:1: ( rule__ExpOp__Group_2__1__Impl )
            // InternalMath.g:643:2: rule__ExpOp__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_2__1__Impl();

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
    // $ANTLR end "rule__ExpOp__Group_2__1"


    // $ANTLR start "rule__ExpOp__Group_2__1__Impl"
    // InternalMath.g:649:1: rule__ExpOp__Group_2__1__Impl : ( '*' ) ;
    public final void rule__ExpOp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:653:1: ( ( '*' ) )
            // InternalMath.g:654:1: ( '*' )
            {
            // InternalMath.g:654:1: ( '*' )
            // InternalMath.g:655:2: '*'
            {
             before(grammarAccess.getExpOpAccess().getAsteriskKeyword_2_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExpOpAccess().getAsteriskKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_2__1__Impl"


    // $ANTLR start "rule__ExpOp__Group_3__0"
    // InternalMath.g:665:1: rule__ExpOp__Group_3__0 : rule__ExpOp__Group_3__0__Impl rule__ExpOp__Group_3__1 ;
    public final void rule__ExpOp__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:669:1: ( rule__ExpOp__Group_3__0__Impl rule__ExpOp__Group_3__1 )
            // InternalMath.g:670:2: rule__ExpOp__Group_3__0__Impl rule__ExpOp__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__ExpOp__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_3__1();

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
    // $ANTLR end "rule__ExpOp__Group_3__0"


    // $ANTLR start "rule__ExpOp__Group_3__0__Impl"
    // InternalMath.g:677:1: rule__ExpOp__Group_3__0__Impl : ( () ) ;
    public final void rule__ExpOp__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:681:1: ( ( () ) )
            // InternalMath.g:682:1: ( () )
            {
            // InternalMath.g:682:1: ( () )
            // InternalMath.g:683:2: ()
            {
             before(grammarAccess.getExpOpAccess().getDivAction_3_0()); 
            // InternalMath.g:684:2: ()
            // InternalMath.g:684:3: 
            {
            }

             after(grammarAccess.getExpOpAccess().getDivAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_3__0__Impl"


    // $ANTLR start "rule__ExpOp__Group_3__1"
    // InternalMath.g:692:1: rule__ExpOp__Group_3__1 : rule__ExpOp__Group_3__1__Impl ;
    public final void rule__ExpOp__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:696:1: ( rule__ExpOp__Group_3__1__Impl )
            // InternalMath.g:697:2: rule__ExpOp__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpOp__Group_3__1__Impl();

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
    // $ANTLR end "rule__ExpOp__Group_3__1"


    // $ANTLR start "rule__ExpOp__Group_3__1__Impl"
    // InternalMath.g:703:1: rule__ExpOp__Group_3__1__Impl : ( '/' ) ;
    public final void rule__ExpOp__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:707:1: ( ( '/' ) )
            // InternalMath.g:708:1: ( '/' )
            {
            // InternalMath.g:708:1: ( '/' )
            // InternalMath.g:709:2: '/'
            {
             before(grammarAccess.getExpOpAccess().getSolidusKeyword_3_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExpOpAccess().getSolidusKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpOp__Group_3__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__0"
    // InternalMath.g:719:1: rule__Parenthesis__Group__0 : rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 ;
    public final void rule__Parenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:723:1: ( rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 )
            // InternalMath.g:724:2: rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Parenthesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__1();

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
    // $ANTLR end "rule__Parenthesis__Group__0"


    // $ANTLR start "rule__Parenthesis__Group__0__Impl"
    // InternalMath.g:731:1: rule__Parenthesis__Group__0__Impl : ( () ) ;
    public final void rule__Parenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:735:1: ( ( () ) )
            // InternalMath.g:736:1: ( () )
            {
            // InternalMath.g:736:1: ( () )
            // InternalMath.g:737:2: ()
            {
             before(grammarAccess.getParenthesisAccess().getParAction_0()); 
            // InternalMath.g:738:2: ()
            // InternalMath.g:738:3: 
            {
            }

             after(grammarAccess.getParenthesisAccess().getParAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0__Impl"


    // $ANTLR start "rule__Parenthesis__Group__1"
    // InternalMath.g:746:1: rule__Parenthesis__Group__1 : rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 ;
    public final void rule__Parenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:750:1: ( rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 )
            // InternalMath.g:751:2: rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Parenthesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2();

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
    // $ANTLR end "rule__Parenthesis__Group__1"


    // $ANTLR start "rule__Parenthesis__Group__1__Impl"
    // InternalMath.g:758:1: rule__Parenthesis__Group__1__Impl : ( '(' ) ;
    public final void rule__Parenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:762:1: ( ( '(' ) )
            // InternalMath.g:763:1: ( '(' )
            {
            // InternalMath.g:763:1: ( '(' )
            // InternalMath.g:764:2: '('
            {
             before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__2"
    // InternalMath.g:773:1: rule__Parenthesis__Group__2 : rule__Parenthesis__Group__2__Impl rule__Parenthesis__Group__3 ;
    public final void rule__Parenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:777:1: ( rule__Parenthesis__Group__2__Impl rule__Parenthesis__Group__3 )
            // InternalMath.g:778:2: rule__Parenthesis__Group__2__Impl rule__Parenthesis__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Parenthesis__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__3();

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
    // $ANTLR end "rule__Parenthesis__Group__2"


    // $ANTLR start "rule__Parenthesis__Group__2__Impl"
    // InternalMath.g:785:1: rule__Parenthesis__Group__2__Impl : ( ( rule__Parenthesis__ExpAssignment_2 ) ) ;
    public final void rule__Parenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:789:1: ( ( ( rule__Parenthesis__ExpAssignment_2 ) ) )
            // InternalMath.g:790:1: ( ( rule__Parenthesis__ExpAssignment_2 ) )
            {
            // InternalMath.g:790:1: ( ( rule__Parenthesis__ExpAssignment_2 ) )
            // InternalMath.g:791:2: ( rule__Parenthesis__ExpAssignment_2 )
            {
             before(grammarAccess.getParenthesisAccess().getExpAssignment_2()); 
            // InternalMath.g:792:2: ( rule__Parenthesis__ExpAssignment_2 )
            // InternalMath.g:792:3: rule__Parenthesis__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2__Impl"


    // $ANTLR start "rule__Parenthesis__Group__3"
    // InternalMath.g:800:1: rule__Parenthesis__Group__3 : rule__Parenthesis__Group__3__Impl ;
    public final void rule__Parenthesis__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:804:1: ( rule__Parenthesis__Group__3__Impl )
            // InternalMath.g:805:2: rule__Parenthesis__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__3__Impl();

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
    // $ANTLR end "rule__Parenthesis__Group__3"


    // $ANTLR start "rule__Parenthesis__Group__3__Impl"
    // InternalMath.g:811:1: rule__Parenthesis__Group__3__Impl : ( ')' ) ;
    public final void rule__Parenthesis__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:815:1: ( ( ')' ) )
            // InternalMath.g:816:1: ( ')' )
            {
            // InternalMath.g:816:1: ( ')' )
            // InternalMath.g:817:2: ')'
            {
             before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__3__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // InternalMath.g:827:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:831:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalMath.g:832:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__1();

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
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalMath.g:839:1: rule__Number__Group__0__Impl : ( () ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:843:1: ( ( () ) )
            // InternalMath.g:844:1: ( () )
            {
            // InternalMath.g:844:1: ( () )
            // InternalMath.g:845:2: ()
            {
             before(grammarAccess.getNumberAccess().getNumAction_0()); 
            // InternalMath.g:846:2: ()
            // InternalMath.g:846:3: 
            {
            }

             after(grammarAccess.getNumberAccess().getNumAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalMath.g:854:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:858:1: ( rule__Number__Group__1__Impl )
            // InternalMath.g:859:2: rule__Number__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__1__Impl();

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
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalMath.g:865:1: rule__Number__Group__1__Impl : ( ( rule__Number__ValueAssignment_1 ) ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:869:1: ( ( ( rule__Number__ValueAssignment_1 ) ) )
            // InternalMath.g:870:1: ( ( rule__Number__ValueAssignment_1 ) )
            {
            // InternalMath.g:870:1: ( ( rule__Number__ValueAssignment_1 ) )
            // InternalMath.g:871:2: ( rule__Number__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment_1()); 
            // InternalMath.g:872:2: ( rule__Number__ValueAssignment_1 )
            // InternalMath.g:872:3: rule__Number__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Number__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__VariableUse__Group__0"
    // InternalMath.g:881:1: rule__VariableUse__Group__0 : rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1 ;
    public final void rule__VariableUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:885:1: ( rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1 )
            // InternalMath.g:886:2: rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__VariableUse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableUse__Group__1();

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
    // $ANTLR end "rule__VariableUse__Group__0"


    // $ANTLR start "rule__VariableUse__Group__0__Impl"
    // InternalMath.g:893:1: rule__VariableUse__Group__0__Impl : ( () ) ;
    public final void rule__VariableUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:897:1: ( ( () ) )
            // InternalMath.g:898:1: ( () )
            {
            // InternalMath.g:898:1: ( () )
            // InternalMath.g:899:2: ()
            {
             before(grammarAccess.getVariableUseAccess().getRefAction_0()); 
            // InternalMath.g:900:2: ()
            // InternalMath.g:900:3: 
            {
            }

             after(grammarAccess.getVariableUseAccess().getRefAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__Group__0__Impl"


    // $ANTLR start "rule__VariableUse__Group__1"
    // InternalMath.g:908:1: rule__VariableUse__Group__1 : rule__VariableUse__Group__1__Impl ;
    public final void rule__VariableUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:912:1: ( rule__VariableUse__Group__1__Impl )
            // InternalMath.g:913:2: rule__VariableUse__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__Group__1__Impl();

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
    // $ANTLR end "rule__VariableUse__Group__1"


    // $ANTLR start "rule__VariableUse__Group__1__Impl"
    // InternalMath.g:919:1: rule__VariableUse__Group__1__Impl : ( ( rule__VariableUse__RefAssignment_1 ) ) ;
    public final void rule__VariableUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:923:1: ( ( ( rule__VariableUse__RefAssignment_1 ) ) )
            // InternalMath.g:924:1: ( ( rule__VariableUse__RefAssignment_1 ) )
            {
            // InternalMath.g:924:1: ( ( rule__VariableUse__RefAssignment_1 ) )
            // InternalMath.g:925:2: ( rule__VariableUse__RefAssignment_1 )
            {
             before(grammarAccess.getVariableUseAccess().getRefAssignment_1()); 
            // InternalMath.g:926:2: ( rule__VariableUse__RefAssignment_1 )
            // InternalMath.g:926:3: rule__VariableUse__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableUseAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__Group__1__Impl"


    // $ANTLR start "rule__MathExp__NameAssignment_1"
    // InternalMath.g:935:1: rule__MathExp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MathExp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:939:1: ( ( RULE_ID ) )
            // InternalMath.g:940:2: ( RULE_ID )
            {
            // InternalMath.g:940:2: ( RULE_ID )
            // InternalMath.g:941:3: RULE_ID
            {
             before(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__NameAssignment_1"


    // $ANTLR start "rule__MathExp__ExpAssignment_3"
    // InternalMath.g:950:1: rule__MathExp__ExpAssignment_3 : ( ruleExp ) ;
    public final void rule__MathExp__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:954:1: ( ( ruleExp ) )
            // InternalMath.g:955:2: ( ruleExp )
            {
            // InternalMath.g:955:2: ( ruleExp )
            // InternalMath.g:956:3: ruleExp
            {
             before(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__ExpAssignment_3"


    // $ANTLR start "rule__Exp__LeftAssignment_0"
    // InternalMath.g:965:1: rule__Exp__LeftAssignment_0 : ( rulePrimary ) ;
    public final void rule__Exp__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:969:1: ( ( rulePrimary ) )
            // InternalMath.g:970:2: ( rulePrimary )
            {
            // InternalMath.g:970:2: ( rulePrimary )
            // InternalMath.g:971:3: rulePrimary
            {
             before(grammarAccess.getExpAccess().getLeftPrimaryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getExpAccess().getLeftPrimaryParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__LeftAssignment_0"


    // $ANTLR start "rule__Exp__OperatorAssignment_1_0"
    // InternalMath.g:980:1: rule__Exp__OperatorAssignment_1_0 : ( ruleExpOp ) ;
    public final void rule__Exp__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:984:1: ( ( ruleExpOp ) )
            // InternalMath.g:985:2: ( ruleExpOp )
            {
            // InternalMath.g:985:2: ( ruleExpOp )
            // InternalMath.g:986:3: ruleExpOp
            {
             before(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpOp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__OperatorAssignment_1_0"


    // $ANTLR start "rule__Exp__RightAssignment_1_1"
    // InternalMath.g:995:1: rule__Exp__RightAssignment_1_1 : ( ruleExp ) ;
    public final void rule__Exp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:999:1: ( ( ruleExp ) )
            // InternalMath.g:1000:2: ( ruleExp )
            {
            // InternalMath.g:1000:2: ( ruleExp )
            // InternalMath.g:1001:3: ruleExp
            {
             before(grammarAccess.getExpAccess().getRightExpParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightExpParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__RightAssignment_1_1"


    // $ANTLR start "rule__Parenthesis__ExpAssignment_2"
    // InternalMath.g:1010:1: rule__Parenthesis__ExpAssignment_2 : ( ruleExp ) ;
    public final void rule__Parenthesis__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1014:1: ( ( ruleExp ) )
            // InternalMath.g:1015:2: ( ruleExp )
            {
            // InternalMath.g:1015:2: ( ruleExp )
            // InternalMath.g:1016:3: ruleExp
            {
             before(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__ExpAssignment_2"


    // $ANTLR start "rule__Number__ValueAssignment_1"
    // InternalMath.g:1025:1: rule__Number__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1029:1: ( ( RULE_INT ) )
            // InternalMath.g:1030:2: ( RULE_INT )
            {
            // InternalMath.g:1030:2: ( RULE_INT )
            // InternalMath.g:1031:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__ValueAssignment_1"


    // $ANTLR start "rule__VariableUse__RefAssignment_1"
    // InternalMath.g:1040:1: rule__VariableUse__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VariableUse__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1044:1: ( ( ( RULE_ID ) ) )
            // InternalMath.g:1045:2: ( ( RULE_ID ) )
            {
            // InternalMath.g:1045:2: ( ( RULE_ID ) )
            // InternalMath.g:1046:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableUseAccess().getRefMathExpCrossReference_1_0()); 
            // InternalMath.g:1047:3: ( RULE_ID )
            // InternalMath.g:1048:4: RULE_ID
            {
             before(grammarAccess.getVariableUseAccess().getRefMathExpIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableUseAccess().getRefMathExpIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getVariableUseAccess().getRefMathExpCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__RefAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});

}