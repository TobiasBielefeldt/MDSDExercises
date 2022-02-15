package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {

	private Machine machine;
	private State currentState; 
	
	public void run(Machine m) {
		machine = m;
		currentState = m.getInitialState();
		// TODO Auto-generated method stub
		
	}

	public State getCurrentState() {
		return currentState;
		// TODO Auto-generated method stub
	}

	public void processEvent(String string) {
		for(Transition t: currentState.getTransitions()) {
			if(t.getEvent().equals(string)) {
				
				
				if(t.isConditional())
				{
					
					Integer conValue = t.getConditionComparedValue();
					System.out.println(conValue);
					
					Integer conVar = machine.getIntegers().get(t.getConditionVariableName());
					
					if(t.isConditionEqual())
					{
						if(conVar != conValue)
						{
							continue;
						}
					} 
					else if(t.isConditionGreaterThan())
					{
						if(!(conVar > conValue))
						{
							continue;
						}
					}
					else if(t.isConditionLessThan())
					{
						if(!(conVar < conValue))
						{
							continue;
						}
					}
					
					
				}
				
				
				if(t.hasOperation())
				{
					
					String varName = t.getOperationVariableName();
									
					if(t.hasSetOperation())
					{
						Integer varValue = t.getSetValue();
						
						machine.getIntegers().put(varName, varValue);				
						
					}
					else if(t.hasIncrementOperation())
					{
						
						machine.getIntegers().put(varName, machine.getIntegers().get(varName) + 1);	
					} 
					else if(t.hasDecrementOperation())
					{
						machine.getIntegers().put(varName, machine.getIntegers().get(varName) - 1);	
					}
				}
				
				
				
				currentState = t.getTarget();
				return;
			}
		}
		
		
		
		// TODO Auto-generated method stub
		
	}

	public Integer getInteger(String string) {
		return machine.getIntegers().get(string);
	}

}
