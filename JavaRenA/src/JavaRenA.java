class JavaRenA{
	public static void main(String args[]){
		Chokuho ch1=new Chokuho();
		Chokuho ch2=new Chokuho();

		ch1.width = 5.0;
		ch1.depth = 4.5;
		ch1.height = 8.5;

		ch2.width = 5.0;
		ch2.depth = 5.0;
		ch2.height = 5.0;

		System.out.print("ch1の表面積は" +ch1.SufaceArea()+ "です"+"\r\n");
		System.out.print("ch1の体積は" +ch1.Volume()+ "です"+"\r\n");

		if(ch1.Judg()==true) {
			System.out.print("ch1は立体です。"+"\r\n");
		}else{
			System.out.print("ch1は立体ではないです。"+"\r\n");
		}
		System.out.print("\r\n");


		System.out.print("ch2の表面積は" +ch2.SufaceArea()+ "です"+"\r\n");
		System.out.print("ch2の体積は" +ch2.Volume()+ "です"+"\r\n");
			if(ch2.Judg()==true) {
				System.out.print("ch2は立体です。"+"\r\n");
			}else{
				System.out.print("ch2は立体ではないです。"+"\r\n");
			}
	}
}