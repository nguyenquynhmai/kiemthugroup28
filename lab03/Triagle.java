public class triagle {
	 static String tamGiac(int a, int b, int c){
			String tamGiac = new String();
			int kq;
	
			if((a+b<=c)||(b+c<=a)||(c+a<=b)){
				kq=0;
				tamGiac = "Khong phai tam giac.";
			}else{
				kq=1;
			}
			
			if(kq==1){
				if((a==b)||(b==c)||(c==a)){
					tamGiac = "Tam giac can.";
				}else if((a==b) && (b==c)){
					tamGiac = "Tam giac deu.";
				}else if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(c*c+b*b==a*a)){
					tamGiac = "Tam giac vuong.";
				}else{
					tamGiac = "Tam giac thuong.";
				}
					
			}
			return tamGiac;
	}
}
