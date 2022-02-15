package main.metamodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Machine {
	
	private List<State> states = new ArrayList<>();
	private State initialState;
	private HashMap<String,Integer> integers = new HashMap<>();

	public Machine(Collection<State> states, State initialState,Map<String,Integer> integers) {
		super();
		this.states.addAll(states);
		this.initialState = initialState;
		this.integers.putAll(integers);
	}
	
	public List<State> getStates() {
		return states;
		// TODO Auto-generated method stub
	}

	public State getInitialState() {
		return initialState;
		// TODO Auto-generated method stub
	}

	public State getState(String string) {
		for(State state : states)
		{
			if(state.getName() == string)
			{
				return state;
			}
		}
		
		return null;
		// TODO Auto-generated method stub
	}

	public int numberOfIntegers() {
		return integers.size();
	}

	public boolean hasInteger(String string) {
		return integers.containsKey(string);
	}
	
	public HashMap<String,Integer> getIntegers()
	{
		return integers;
	}

}
