package NonDI;

public class MoneyForward {

	public String createInvoice(String name, int money) {
		return name + "様に" + money + "円をMoneyForwardで請求しました";
	}

}
