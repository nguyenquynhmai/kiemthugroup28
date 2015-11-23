function triangle(){
	input(a, b, c);
	input i = 0;
	if(a==b) i=i+1;
	if(a==c) i=i+2;
	if(b==c) i=i+3;
	if(i==0){
		if((a+b)<=c){
			NOT A TRIANGLE;
		}else if ((b+c)<=a){
			NOT A TRIANGLE;
		}else if ((a+c)<=b){
			NOT A TRIANGLE;
		}else{
			TRIANGLE IS SCALENE;
		}
	}else{
		if (i==1){
			if((a+c)<=b){
				NOT A TRIANGLE;
			}else{
				TRIANGLE IS ISOSCELES;
			}
		}else{
			if(i==2){
				if((a+c)<=b){
					NOT A TRIANGLE;
				}else{
					TRIANGLE IS ISOSCELES;
				}
			}else{
				if(i==3){
					if((b+c)<=a){
						NOT A TRIANGLE;
					}else{
						TRIANGLE IS ISOSCELES;
					}
				}else{
				TRIANGLE IS EQUILATERAL;
				}
			}
		}
	}
		
}