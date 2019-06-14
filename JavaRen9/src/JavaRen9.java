class JavaRen9{
	public static void main(String args[]) {
		Account ac1 = new Account();
		Account ac2 = new Account();
		ac1.name = "Dejita";
		ac1.balance = 0;

		ac2.name = "Hamako";
		ac2.balance = 0;

		ac1.amount=15000;
		ac1.deposit();

		ac2.amount=20000;
		ac2.deposit();

		ac1.amount=7000;
		ac1.widthdraw();

		ac2.amount=3000;
		ac2.widthdraw();

		ac2.amount = 16000;
		ac2.deposit();

		ac1.dispInfo();
		ac2.dispInfo();
	}
}