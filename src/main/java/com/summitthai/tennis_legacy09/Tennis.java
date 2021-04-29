package com.summitthai.tennis_legacy09;

public class Tennis {

	final String zero 	= "love";
	final String one 	= "fifteen";
	final String two 	= "thirty";
	final String three 	= "forty";
	final String deuce 	= "deuce";
	final String avd_1 	= "Advantage Player one";
	final String avd_2 	= "deuce";
	
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    }
    
    private String callFinalPoint(int firstPlayerPoint, int secondPlayerPoint) {
    	
    	String firstPlayerPointCall  = "";
    	String secondPlayerPointCall = "";
    	String finalPointCall 		 = "";
    	
//    	if((firstPlayerPoint == 0) && (secondPlayerPoint == 0)){
//    		firstPlayerPointCall  = this.zero;
//    		secondPlayerPointCall = this.zero;
//    	}
    	
//    	if(firstPlayerPoint == 0){
//    		firstPlayerPointCall  = this.zero;
//    	}else if(firstPlayerPoint == 1){
//    		firstPlayerPointCall = this.one;
//    	}else if(firstPlayerPoint == 2){
//    		firstPlayerPointCall = this.two;
//    	}else if(firstPlayerPoint == 3){
//    		firstPlayerPointCall = this.three;
//    	}
    	
    	if(firstPlayerPoint > 3) {
	    	if(firstPlayerPoint == secondPlayerPoint) {
	    		finalPointCall = this.deuce;
	    	}else if(
	    				((firstPlayerPoint - secondPlayerPoint) == 1) || 
	    				((firstPlayerPoint - secondPlayerPoint) == -1)
	    			){
//	    		finalPointCall = ""
	    	}
	    	else if(
    				((firstPlayerPoint - secondPlayerPoint) == 1) || 
    				((firstPlayerPoint - secondPlayerPoint) == -1)
    			){
    		
	    	}
    	}else{
	    	firstPlayerPointCall  = callNormalPoint(firstPlayerPoint);
	    	secondPlayerPointCall = callNormalPoint(secondPlayerPoint);
	    	
	    	finalPointCall = firstPlayerPointCall + " " + secondPlayerPointCall;
    	}
    	
    	
    	
    	
    	
    	return finalPointCall;
    }
    
    private String callNormalPoint(int point) {
    	
    	String pointCall = "";
    	
    	if(point == 0){
    		pointCall  = this.zero;
    	}else if(point == 1){
    		pointCall = this.one;
    	}else if(point == 2){
    		pointCall = this.two;
    	}else if(point == 3){
    		pointCall = this.three;
    	}
    	return pointCall;
    }

}
