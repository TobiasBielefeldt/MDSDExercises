/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal.InternalMathParser;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MathParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MathGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MathGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getExpAccess().getAlternatives_1_0(), "rule__Exp__Alternatives_1_0");
			builder.put(grammarAccess.getTermAccess().getAlternatives_1_0(), "rule__Term__Alternatives_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getOneMathAccess().getGroup(), "rule__OneMath__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup(), "rule__Exp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1(), "rule__Exp__Group_1__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_0(), "rule__Exp__Group_1_0_0__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_1(), "rule__Exp__Group_1_0_1__0");
			builder.put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
			builder.put(grammarAccess.getTermAccess().getGroup_1(), "rule__Term__Group_1__0");
			builder.put(grammarAccess.getTermAccess().getGroup_1_0_0(), "rule__Term__Group_1_0_0__0");
			builder.put(grammarAccess.getTermAccess().getGroup_1_0_1(), "rule__Term__Group_1_0_1__0");
			builder.put(grammarAccess.getVariableUseAccess().getGroup(), "rule__VariableUse__Group__0");
			builder.put(grammarAccess.getVariableBindingAccess().getGroup(), "rule__VariableBinding__Group__0");
			builder.put(grammarAccess.getParenthesisAccess().getGroup(), "rule__Parenthesis__Group__0");
			builder.put(grammarAccess.getNumberAccess().getGroup(), "rule__Number__Group__0");
			builder.put(grammarAccess.getMathExpAccess().getMathExpAssignment(), "rule__MathExp__MathExpAssignment");
			builder.put(grammarAccess.getOneMathAccess().getNameAssignment_1(), "rule__OneMath__NameAssignment_1");
			builder.put(grammarAccess.getOneMathAccess().getExpAssignment_3(), "rule__OneMath__ExpAssignment_3");
			builder.put(grammarAccess.getExpAccess().getRightAssignment_1_1(), "rule__Exp__RightAssignment_1_1");
			builder.put(grammarAccess.getTermAccess().getRightAssignment_1_1(), "rule__Term__RightAssignment_1_1");
			builder.put(grammarAccess.getVariableUseAccess().getIdAssignment_1(), "rule__VariableUse__IdAssignment_1");
			builder.put(grammarAccess.getVariableBindingAccess().getVarAssignment_2(), "rule__VariableBinding__VarAssignment_2");
			builder.put(grammarAccess.getVariableBindingAccess().getBindAssignment_4(), "rule__VariableBinding__BindAssignment_4");
			builder.put(grammarAccess.getVariableBindingAccess().getBodyAssignment_6(), "rule__VariableBinding__BodyAssignment_6");
			builder.put(grammarAccess.getParenthesisAccess().getExpAssignment_2(), "rule__Parenthesis__ExpAssignment_2");
			builder.put(grammarAccess.getNumberAccess().getValueAssignment_1(), "rule__Number__ValueAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MathGrammarAccess grammarAccess;

	@Override
	protected InternalMathParser createParser() {
		InternalMathParser result = new InternalMathParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MathGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
