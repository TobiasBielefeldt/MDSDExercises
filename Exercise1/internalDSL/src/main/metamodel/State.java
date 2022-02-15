package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {
	private String name;
	private List<Transition> transitions = new ArrayList<>();

	public State(String name)
	{
		super();
		this.name = name;
	}
	
	public Object getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return transitions;
	}
	
	public void addTransition(Transition t)
	{
		transitions.add(t);
	}

	public Transition getTransitionByEvent(String string) {
		for(Transition t : transitions)
		{
			if(t.getEvent() == string)
			{
				return t;
			}
		}
		return null;
	}

}
