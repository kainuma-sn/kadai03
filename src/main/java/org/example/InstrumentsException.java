package org.example;

//Listをインポートします

import java.util.List;

//親クラスExceptionを持つサブクラスCustomException
public class InstrumentsException extends Exception {
    //CustomExceptionクラスコンストラクタ
    public InstrumentsException() {
        //引数を持たない親クラスExceptionのクラスコンストラクタを呼び出す
        super();
    }

    public InstrumentsException(String message) {
        //引数にString型のメッセージを持つ親クラスExceptionのクラスコンストラクタを呼び出す
        super(message);
    }

    //    int型iとString型valueを引数に持つcheckProductNameクラス
//    引数String型のproductNameがnull又は""の場合、エラーを返す
//    引数String型のproductNameがどちらでもない場合、処理を終了する
    public static void checkProductName(String productName) {
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("エラー！　製品登録に失敗しました");
        }
    }

    //引数List<Integer>型のvalueを持つsearchProductInfoクラス
    //productNameがnull又は空の場合、エラーを返す
    //productNameがnull又は空でもない場合、処理を終了する
    public static void searchProductInfo(List<Integer> productName) {
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("該当する製品はありません");
        }
    }
}
