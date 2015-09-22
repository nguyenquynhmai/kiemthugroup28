function giaipt(a, b) {
	if((a==0)&& (b==0)) {
		alert("Phuong trinh co nghiem tuy y");
	} else {
		if((a==0) && (b != 0)) {
			alert("Phuong trinh vo nghiem");
		}else {
			alert("Phuong trinh co nghiem: " + -b/a);
		}
	}
}