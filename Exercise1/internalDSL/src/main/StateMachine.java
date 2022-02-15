package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class StateMachine {
	
	private State initialState;
	private HashMap<String,Integer> integers = new HashMap<>();
	private List<State> states = new ArrayList<>();
	private State currentState;
	private String currentEvent;
	private Transition currentTransition;
	

	public Machine build() {
		return new Machine(states,initialState,integers);
		// TODO Auto-generated method stub
	}

	private State getState(String name) {
		
		for(State state : states)
		{
			if(state.getName() == name)
			{				
				return state;
			}
		}
		
		State newState = new State(name);
		states.add(newState);
		return newState;
	}
	
	public StateMachine state(String string) {
		
		currentState = getState(string);
		return this;
		
		
		// TODO Auto-generated method stub
	}

	public StateMachine initial() {
		initialState = currentState;
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine when(String string) {
		currentEvent = string;
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine to(String string) {
		Transition t = new Transition(currentEvent,getState(string));
		currentTransition = t;
		currentState.addTransition(currentTransition);
		return this;
		// TODO Auto-generated method stub
	}

	public StateMachine integer(String string) {
		integers.put(string, 0);
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine set(String string, int i) {
		currentTransition.setHasOperation(true);
		currentTransition.setHasSetOperation(true);
		currentTransition.setGetOperationVariableName(string);
		currentTransition.setGetSetValue(i);
		return this;
	}

	public StateMachine increment(String string) {
		currentTransition.setHasOperation(true);
		currentTransition.sethasIncrementOperation(true);
		currentTransition.setGetOperationVariableName(string);
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine decrement(String string) {
		currentTransition.setHasOperation(true);
		currentTransition.setHasDecrementOperation(true);
		currentTransition.setGetOperationVariableName(string);
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
		currentTransition.setHasOperation(true);
		currentTransition.setIsConditional(true);
		currentTransition.setIsConditionEqual(true);
		currentTransition.setGetConditionComparedValue(i);
		currentTransition.setGetConditionVariableName(string);
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		currentTransition.setHasOperation(true);
		// TODO Auto-generated method stub
		currentTransition.setIsConditional(true);
		currentTransition.setIsConditionGreaterThan(true);
		currentTransition.setGetConditionComparedValue(i);
		currentTransition.setGetConditionVariableName(string);
		return this;
	}

	public StateMachine ifLessThan(String string, int i) {
		currentTransition.setHasOperation(true);
		currentTransition.setIsConditional(true);
		currentTransition.setIsConditionLessThan(true);
		currentTransition.setGetConditionComparedValue(i);
		currentTransition.setGetConditionVariableName(string);
		return this;
	}

}
