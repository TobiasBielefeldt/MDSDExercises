/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator;

import com.google.common.collect.Iterators;
import dk.sdu.mmmi.mdsd.math.Div;
import dk.sdu.mmmi.mdsd.math.Exp;
import dk.sdu.mmmi.mdsd.math.ExpOp;
import dk.sdu.mmmi.mdsd.math.MathExp;
import dk.sdu.mmmi.mdsd.math.Minus;
import dk.sdu.mmmi.mdsd.math.Mult;
import dk.sdu.mmmi.mdsd.math.Num;
import dk.sdu.mmmi.mdsd.math.Par;
import dk.sdu.mmmi.mdsd.math.Plus;
import dk.sdu.mmmi.mdsd.math.Primary;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MathGenerator extends AbstractGenerator {
  private static Map<String, Integer> variables = new HashMap<String, Integer>();
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final MathExp math = Iterators.<MathExp>filter(resource.getAllContents(), MathExp.class).next();
    final Map<String, Integer> result = MathGenerator.compute(math);
    this.displayPanel(result);
  }
  
  public static Map<String, Integer> compute(final MathExp math) {
    int value = MathGenerator.computeExp(math.getExp());
    String name = math.getName();
    MathGenerator.variables.put(name, Integer.valueOf(value));
    return MathGenerator.variables;
  }
  
  public static int computeExp(final Exp exp) {
    int _xblockexpression = (int) 0;
    {
      final int left = MathGenerator.computePrim(exp.getLeft());
      int _switchResult = (int) 0;
      ExpOp _operator = exp.getOperator();
      boolean _matched = false;
      if (_operator instanceof Plus) {
        _matched=true;
        int _computeExp = MathGenerator.computeExp(exp.getRight());
        _switchResult = (left + _computeExp);
      }
      if (!_matched) {
        if (_operator instanceof Minus) {
          _matched=true;
          int _computeExp = MathGenerator.computeExp(exp.getRight());
          _switchResult = (left - _computeExp);
        }
      }
      if (!_matched) {
        if (_operator instanceof Mult) {
          _matched=true;
          int _computeExp = MathGenerator.computeExp(exp.getRight());
          _switchResult = (left * _computeExp);
        }
      }
      if (!_matched) {
        if (_operator instanceof Div) {
          _matched=true;
          int _computeExp = MathGenerator.computeExp(exp.getRight());
          _switchResult = (left / _computeExp);
        }
      }
      if (!_matched) {
        _switchResult = left;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public static int computePrim(final Primary prim) {
    int _switchResult = (int) 0;
    boolean _matched = false;
    if (prim instanceof Num) {
      _matched=true;
      _switchResult = ((Num)prim).getValue();
    }
    if (!_matched) {
      if (prim instanceof Par) {
        _matched=true;
        _switchResult = MathGenerator.computeExp(((Par)prim).getExp());
      }
    }
    if (!_matched) {
      throw new Error("Don\'t");
    }
    return _switchResult;
  }
  
  public void displayPanel(final Map<String, Integer> result) {
    String resultString = "";
    Set<Map.Entry<String, Integer>> _entrySet = result.entrySet();
    for (final Map.Entry<String, Integer> entry : _entrySet) {
      String _resultString = resultString;
      String _key = entry.getKey();
      String _plus = ("var " + _key);
      String _plus_1 = (_plus + " = ");
      Integer _value = entry.getValue();
      String _plus_2 = (_plus_1 + _value);
      String _plus_3 = (_plus_2 + "\n");
      resultString = (_resultString + _plus_3);
    }
    JOptionPane.showMessageDialog(null, resultString, "Math Language", JOptionPane.INFORMATION_MESSAGE);
  }
}