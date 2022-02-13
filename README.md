# dependency injection の解説用
DIを用いたテストコードを記述しています。

【src/main/java/配下】

* デフォルトパッケージ<br>
  DIありでコードを記述
* NonDI
  DIなしでコードを記述<br>

## DI (dependency injection)
***
### DI
#### 依存関係(dependency)
`@Mapper`, `@Controller`, `@Controller`など<br>
これらは`@Component`を格納している。<br>
eclipseだと @Controllerに「cmd + クリック」で確認できる。

#### メリット

* 呼び出したいクラスを簡単に切り替えることができる<br>
* テストがしやすい<br>
  テスト用のクラスを簡単に実装することができる
* つまりinterfaceを使うことで実装内容を間違いにくく、変更に対応できるコードを書くことができる

#### @SpringBootApplication
spring で動いていることの目印になる。<br>
DIを使用することを記述している。

### シングルトン(`@Component`で管理している場合)
インスタンスが１つであり独立しているということ。

* 2回目以降使用されるときは、インスタンスが使いまわされる
* アプリが起動した時に作成される<br>
  インスタンスを作りすぎるとメモリが足りなくなり、アプリが落ちる可能性があり。
* 状態を持たせない<br>
  フィールドにパスワードを持たせてしまった場合、他の人にパスワードを覗かれるかもしれない。


```java
// Controllerクラスの例
private final Service service;

@Autowired
コンストラクタ(){
}
```
毎回Serviceクラスを作成する必要はないので、フィールドに定義してあげる。
(追加でコンストラクタも)


```java
// Serviceクラスなどでインタフェースを使い多様性を実装する例
// インタフェースをフィールドにセット
private final InvoiceProcessor invoiceProcessor;

// 必要な依存するクラスのインスタンスを作成してくれる
// コンストラクタが１つの場合は、勝手に判断してくれる
// @Autowired も省略可能
@Autowired
コンストラクタ(InvoiceProcessor invoiceProcessor){
  this.invoiceProcessor = new インタフェースの実装クラス();
}

//~~以降の処理〜〜
```

## filter
メイン処理の前後に処理を挟むことができる
ログを出力する時に便利

Filterインタフェースを実装することで使用できる
doFilterメソッドを使用する

### Listenner
例：ボタンを押したときの動作を指定する。
などイベントを受けているということ。
javascriptのaddEventListennerがわかりやすい


## 押さえておきたい用語

* interface (java 他の言語でも同じ)
* 多態性 ポリモーフィズム (オブジェクト指向)
* DI (デザインパターン、書き方の話)
* spring DI (spring boot)
* コンストラクタインジェクション
* フィールドインジェクション
