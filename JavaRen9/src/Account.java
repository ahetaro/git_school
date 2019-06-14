class Account {
	String name;
	int balance;
	int amount = 0;
	public void deposit(){
		balance=balance+amount;
		System.out.print(name+"さんが"+amount+"円貯金しました"+"\r\n");
	}

	public void widthdraw() {
		balance=balance-amount;
		System.out.print(name+"さんが"+amount+"円引き出しました"+"\r\n");
	}

	public void dispInfo() {
		System.out.print(name+"さんの口座の残高は"+balance+"円です"+"\r\n");
	}
}
