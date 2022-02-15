package main.metamodel;

public class Transition {
	
	private String event;
	private State target;
	
	private String operationVariableName;
	private String conditionVariableName;
	private Integer conditionComparedValue;
	private Integer setValue;
	
	private boolean hasSetOperation;
	private boolean hasIncrementOperation;
	private boolean hasDecrementOperation;
	
	private boolean isConditional;
	private boolean isConditionEqual;
	private boolean isConditionGreaterThan;
	private boolean isConditionLessThan;
	private boolean hasOperation;
	
	
	
	
	
	public Transition(String event, State target) {
		super();
		this.event = event;
		this.target = target;
		
	}

	public String getEvent() {
		return event;
		// TODO Auto-generated method stub
	}

	public State getTarget() {
		return target;
		// TODO Auto-generated method stub
	}

	public boolean hasSetOperation() {
		// TODO Auto-generated method stub
		return hasSetOperation;
	}

	public boolean hasIncrementOperation() {
		// TODO Auto-generated method stub
		
		return hasIncrementOperation;
		
	}

	public boolean hasDecrementOperation() {
		// TODO Auto-generated method stub
		return hasDecrementOperation;
	}

	public String getOperationVariableName() {
		// TODO Auto-generated method stub
		return operationVariableName;
	}

	public boolean isConditional() {
		// TODO Auto-generated method stub
		return isConditional;
	}

	public String getConditionVariableName() {
		// TODO Auto-generated method stub
		return conditionVariableName;
	}

	public Integer getConditionComparedValue() {
		// TODO Auto-generated method stub
		return conditionComparedValue;
	}

	public boolean isConditionEqual() {
		// TODO Auto-generated method stub
		return isConditionEqual;
	}

	public boolean isConditionGreaterThan() {
		// TODO Auto-generated method stub
		return isConditionGreaterThan;
	}

	public boolean isConditionLessThan() {
		// TODO Auto-generated method stub
		return isConditionLessThan;
	}

	public boolean hasOperation() {
		// TODO Auto-generated method stub
		return hasOperation;
	}
	
	public Integer getSetValue()
	{
		return setValue;
	}
	
	//Set
	public void setGetSetValue(Integer i)
	{
		setValue = i;
	}
	
	public void setHasSetOperation(boolean b) {
		// TODO Auto-generated method stub
		hasSetOperation = b;
	}

	public void sethasIncrementOperation(boolean b) {
		// TODO Auto-generated method stub
		hasIncrementOperation = b;
	}

	public void setHasDecrementOperation(boolean b) {
		// TODO Auto-generated method stub
		hasDecrementOperation = b;
	}

	public void setGetOperationVariableName(String s) {
		// TODO Auto-generated method stub
		operationVariableName = s;
	}

	public void setIsConditional(boolean b) {
		// TODO Auto-generated method stub
		isConditional = b;
	}

	public void setGetConditionVariableName(String s) {
		// TODO Auto-generated method stub
		conditionVariableName = s;
	}

	public void setGetConditionComparedValue(Integer i) {
		// TODO Auto-generated method stub
		conditionComparedValue = i;
	}

	public void setIsConditionEqual(boolean b) {
		// TODO Auto-generated method stub
		isConditionEqual = b;
	}

	public void setIsConditionGreaterThan(boolean b) {
		// TODO Auto-generated method stub
		isConditionGreaterThan = b;
	}

	public void setIsConditionLessThan(boolean b) {
		// TODO Auto-generated method stub
		isConditionLessThan = b;
	}

	public void setHasOperation(boolean b) {
		// TODO Auto-generated method stub
		hasOperation = b;
	}
	
	
	
	
	

}
