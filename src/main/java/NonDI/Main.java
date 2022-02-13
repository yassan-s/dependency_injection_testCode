package NonDI;

public class Main {

	public static void main(String[] args) {
		// 作成する条件
        // ある会社
        // 請求書を作成したい
        // 請求書の作成にはマネーフォワード、Misocaを使うとする
        // 請求書の作成には請求先の相手の名前と金額が必要
        // 請求結果を標準出力する

		Account account = new Account();
		account.name = "Aさん";
		String closingResult = account.clonsing(100);
		System.out.println("請求結果：" + closingResult);

		Account account2 = new Account();
		account2.name = "Bさん";
		String closingResult2 = account2.clonsing(200);
		System.out.println("請求結果：" + closingResult2);

	}

}
