function isPrime(a) {
	if (a <= 0)
		return false;
	if ((a == 1) || (a==2)){
	  return true;
	} else {
		if ((a % 2) == 0) {
			return false;
		}else {
			var howFar = Math.abs(Math.sqrt(a));
	  		for(var icount = 3; icount <= howFar; icount = icount+2){
	    		if(a % icount == 0) {
	      			return false;
	    		}
	  		}
		}
	return true;  
	}
	
}

