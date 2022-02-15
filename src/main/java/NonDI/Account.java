package NonDI;

public class Account {

	String name;

	/**
	 *  請求書の月末締め処理
	 */
	public String clonsing(int amountInYen){
		MoneyForward MF = new MoneyForward();
		String result = MF.createInvoice(this.name, amountInYen);
		return result;
	}

	/**
	 *  追加請求処理
	 */
	public String createInvoiceInTime(int amountInYen) {
		MoneyForward MF = new MoneyForward();
		String result = MF.createInvoice(this.name, amountInYen);
		return result;
	}
}
