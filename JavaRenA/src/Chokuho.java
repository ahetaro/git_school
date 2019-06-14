public class Chokuho {
	double width;
	double depth;
	double height;
	double buttom;
	double suface;
	double volume;

	public double SufaceArea() {
		suface=2*(depth*width+width*height+depth*height);
		return suface;
	}
//2(ab+bc+ac)
//2(d*w+w*h+d*h)
//2(22.5+42.5+38.25)

	public double Volume() {
		volume=width*height*depth;
		return volume;
	}

	public boolean Judg() {
		if(width==height&&width==depth&&height==depth){
			return true;
		}else{
			return false;
	}
}
}