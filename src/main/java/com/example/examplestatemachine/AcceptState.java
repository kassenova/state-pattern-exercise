package com.example.examplestatemachine;

public class AcceptState extends State{
		StateContext theContext ;
		public AcceptState (StateContext theContext) {
		this.theContext = theContext ;
	}
		
	@Override
	public void actionA () {
		System.out.println (" I ’ m in accept state ");
	}
	
	@Override
	public void actionB () {
		System.out.println (" Accept --> Reject ");
		theContext.setState ( theContext.getRejectState ());

	}
}
