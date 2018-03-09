package com.example.examplestatemachine;

public class StateContext {
	State acceptState ;
	State rejectState ;
	State s;
	String start;
public StateContext () {
	this.rejectState = new RejectState ( this );
	this.acceptState = new AcceptState ( this );
	s = rejectState; 
}
public void actionA () {
	if (start != "B") {
		start = "A";
	}
	s. actionA ();
}
public void actionB () {
	if (start != "A") {
	start = "B"; 
	}
	s. actionB ();
}

public boolean isAccept() {
	if (start == "B") {
		if (this.s == rejectState) {
			setState(acceptState); 
		} else {
			setState(rejectState); 
		}
	}
	if (this.s == acceptState) {
		return true; 
	} else {
	return false; 
	}
//	if (start == "A") {
//		if (this.s == acceptState) {
//			return true; 
//	 } else {
//		return false; 
//	 }
//	} else {
//		if (this.s == rejectState) {
//			return true;
//		} else {
//			return false; 
//		}
//	}
}

public State getAcceptState() {
	// TODO Auto-generated method stub
	return this.acceptState;
}
public State getRejectState() {
	// TODO Auto-generated method stub
	return this.rejectState;
}
public void setState(State s) {
	this.s = s; 	
}

public State gets () {
	return this.s; 
}
}

