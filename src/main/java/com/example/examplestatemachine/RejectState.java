package com.example.examplestatemachine;

public class RejectState extends State{
		StateContext theContext ;
		public RejectState ( StateContext theContext ) {
		this.theContext = theContext ;
	}
	@Override
		public void actionA () {
		System.out.println (" Reject --> Accept ");
		theContext.setState ( theContext.getAcceptState ());
	}
	@Override
		public void actionB () {
		System.out.println (" I ’ m in reject state ");
	}

}
