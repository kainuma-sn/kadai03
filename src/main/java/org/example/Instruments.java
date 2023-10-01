package org.example;

//ArrayListとList、MapとHashMapをインポートする

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Instrumentsクラス
public class Instruments {
    //Instrumentsのクラスコンストラクタ
    public Instruments() {
    }

    //ArrayListを使用し、VstPluginCatalogクラスのインスタンスを格納するためのリスト型のinstrumentsListを作成する
    private final List<VstPluginCatalog> instrumentsList = new ArrayList<>();
    //HashMapを使用し、キーのStringとListのInteger型のmap型のinstrumentsMapを作成する
    private final Map<String, List<Integer>> instrumentsMap = new HashMap<>();

    //instrumentsListに新たなVstPluginCatalogインスタンスを追加する
    public void addInstrumentList(String productName, int productPrice, int productStock) {
        try {
            InstrumentsException.checkProductName(productName);
            instrumentsList.add(new VstPluginCatalog(productName, productPrice, productStock));
            System.out.println(productName + "　の製品登録が完了しました");
            System.out.println("--------------");
        } catch (IllegalArgumentException error) {
            System.out.println(error);
            System.out.println("--------------");
        }

    }

    //list内から指定したVstPluginインスタンスを削除する
    public void deleteInstrumentList(int instrumentsListNumber) {
        instrumentsList.remove(instrumentsListNumber);
        System.out.println("リスト番号：" + instrumentsListNumber + "　の削除が完了しました");
        System.out.println("----------------------------");
    }

    //list内にあるすべてのインスタンスに格納されているデータを出力する
    public void printAllInstrumentsInfo() {
        int instrumentsListNumber = 0;
        for (VstPluginCatalog item : instrumentsList) {
            System.out.println("リスト番号：" + instrumentsListNumber);
            System.out.println("製品：" + item.new ProductGetter().getProductName());
            System.out.println("価格：" + item.new ProductGetter().getProductPrice());
            System.out.println("在庫：" + item.new ProductGetter().getProductStock());
            System.out.println("--------------");
            instrumentsListNumber++;
        }
        System.out.println("----------------------------");
    }

    //list内の指定したインスタンスのデータを変更する
    public void updateInstrumentList(int instrumentsListNumber, String productName, int productPrice, int productStock) {
        instrumentsList.get(instrumentsListNumber).new ProductSetter().setProductName(productName);
        instrumentsList.get(instrumentsListNumber).new ProductSetter().setProductPrice(productPrice);
        instrumentsList.get(instrumentsListNumber).new ProductSetter().setProductStock(productStock);
        System.out.println("リスト番号：" + instrumentsListNumber + "　の変更が完了しました");
        System.out.println("----------------------------");
    }

    //list内の指定したインスタンスのデータを出力する
    public void printInstrumentInfo(int i) {
        System.out.println("リスト番号：" + i);
        System.out.println("製品：" + instrumentsList.get(i).new ProductGetter().getProductName());
        System.out.println("価格：" + instrumentsList.get(i).new ProductGetter().getProductPrice());
        System.out.println("在庫：" + instrumentsList.get(i).new ProductGetter().getProductStock());
        System.out.println("----------------------------");
    }

    //拡張forループを使用し、リスト化したインスタンスからkeyとデータリストを用意し、mapを作成する
    public void createInstrumentsMap() {
        for (VstPluginCatalog item : instrumentsList) {
            instrumentsMap.put(item.new ProductGetter().getProductName(), item.new ProductGetter().getProductList());
        }
    }

    //引数のString型productNameと一致するキーがあれば、その結果を出力する
    //引数のString型productNameと一致するキーがなければ、エラーを返す
    public void searchInstrumentMap(String productName) {
        System.out.println(productName + "　の検索を開始します");
        try {
            InstrumentsException.searchProductInfo(instrumentsMap.get(productName));
            System.out.println(productName + "：[価格/在庫]" + instrumentsMap.get(productName));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println("----------------------------");
    }

    //list内にあるすべてのインスタンスに格納されているデータを出力する
    public void payInstruments() {
        // PurchaceServiceのインスタンスを生成
        PurchaceService purchaceService = new PayService();
        // 依存性の注入
        UserPay userPay = new UserPay(purchaceService);
        // メッセージを送信
        userPay.sendMessage("\n購入が完了しました");
        System.out.println("----------------------------");
    }
}
