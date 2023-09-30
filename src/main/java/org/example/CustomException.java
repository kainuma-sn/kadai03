package org.example;

//Listをインポートします

import java.util.List;

//親クラスExceptionを持つサブクラスCustomException
public class CustomException extends Exception {
    //CustomExceptionクラスコンストラクタ
    public CustomException() {
        //引数を持たない親クラスExceptionのクラスコンストラクタを呼び出す
        super();
    }

    public CustomException(String message) {
        //引数にString型のメッセージを持つ親クラスExceptionのクラスコンストラクタを呼び出す
        super(message);
    }

    //int型iとString型valueを引数に持つcheckValueクラス
    //引数String型のvalueがnull又は""の場合、エラーを返す
    //引数String型のvalueがどちらでもない場合、処理を終了する
    public static void checkValue(int i, String value) {
        if (value == null) {
            throw new IllegalArgumentException("エラー！　リスト番号：" + i + "　製品の登録がありません");
        } else if (value == "") {
            throw new IllegalArgumentException("エラー！　リスト番号：" + i + "　製品の登録がありません");
        }
    }

    //引数List<Integer>型のvalueを持つchekSearchクラス
    //valueがnull又は空の場合、エラーを返す
    //valueがnull又は空でもない場合、処理を終了する
    public static void checkSearch(List<Integer> value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("該当する製品はありません");
        }
    }
}
