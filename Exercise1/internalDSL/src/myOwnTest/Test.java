package myOwnTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

import main.*;
import main.metamodel.Machine;
import main.metamodel.State;

public class Test {
	//Had Issues with some tests so needed to be able to test them by themselves
	//Did finally solve them tho
	
public static MachineInterpreter interpreter;
	
	public static void init() {
		StateMachine stateMachine = new StateMachine();
		final int NUMBER_TRACKS= 10;
		Machine m = stateMachine.
					integer("track").
					state("STOP").initial().
						when("PLAY").to("PLAYING").set("track", 1).ifEquals("track", 0).
						when("PLAY").to("PLAYING").
					state("PLAYING").
						when("STOP").to("STOP").
						when("PAUSE").to("PAUSED").
						when("TRACK_END").to("STOP").ifEquals("track", NUMBER_TRACKS).
						when("TRACK_END").to("PLAYING").increment("track").
					state("PAUSED").
						when("STOP").to("STOP").
						when("PLAY").to("PLAYING").
						when("FORWARD").to("PAUSED").increment("track").ifLessThan("track", NUMBER_TRACKS + 1).
						when("BACK").to("PAUSED").decrement("track").ifGreaterThan("track", 1).
						
						
					build();
		interpreter = new MachineInterpreter();
		interpreter.run(m);
	}
	
	
	public static void main(String[] args)
	{		
		init();
		
		interpreter.processEvent("PLAY");	
		interpreter.processEvent("TRACK_END");
	
	
	}

}
