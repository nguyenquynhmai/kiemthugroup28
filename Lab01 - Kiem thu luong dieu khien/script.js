function isPrime(num) {		
	if ((num==2)){		
	  	return true;		
	} else {		
		if (((num % 2) == 0) || (num < 2)) {		
			return false;		
		} else {		
			var howFar = Math.sqrt(num);		
	  		for(var icount = 3; icount <= howFar; icount = icount+2){		
	    		if (num % icount == 0) {		
	      			return false;		
	    		}		
	  		}		
		}		
		return true;  		
	}		
			
}