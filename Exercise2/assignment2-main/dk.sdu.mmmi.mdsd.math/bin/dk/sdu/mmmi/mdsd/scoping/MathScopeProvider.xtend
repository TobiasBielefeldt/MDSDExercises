/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import dk.sdu.mmmi.mdsd.math.MathExp
import org.eclipse.xtext.xtext.generator.parser.antlr.splitting.simpleExpressions.Comparison
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
 //I honestly don't know what i'm doing here
class MathScopeProvider extends AbstractMathScopeProvider {
	override getScope(EObject context, EReference reference) {
		switch (context){
            Comparison: {
                val math = EcoreUtil2.getContainerOfType(context,MathExp)
                return Scopes.scopeFor(math.mathExp)
            }
		}
	return super.getScope(context, reference)
	}
	
}
