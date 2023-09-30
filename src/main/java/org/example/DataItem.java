package org.example;

//ListとArrayListをインポートする

import java.util.ArrayList;
import java.util.List;

//抽象クラスDataItem
public abstract class DataItem {
    //製品名を格納する修飾子privateのString型のvalue1を宣言する
    private String value1;
    //製品価格を格納する修飾子privateのint型のvalue2を宣言する
    private int value2;
    //在庫数を格納する修飾子privateのint型のvalue3を宣言する
    private int value3;
    //製品価格value2と在庫数value3を格納するList型のdataItemListを宣言し、ArrayListで初期化する
    private List<Integer> dataItemList = new ArrayList<>();

    //DataItemのクラスコンストラクタ
    //引数として、製品名を持つString型のvalue1、製品価格を持つint型のvalue2、在庫数を持つint型のvalue3がある
    //引数のvalue1、value2、value3をDataItem.javaのvalue1、value2、value3に代入する
    //DataItem.javaのvalue2、value3をList型のdataItemListに追加する
    public DataItem(String value1, int value2, int value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        dataItemList.add(this.value2);
        dataItemList.add(this.value3);
    }

    //内部クラスGetterMethodsを定義し、Getterメソッドを定義する
    public class GetterMethods {
        //製品名を格納するString型のvalue1を返すgetValue1を返す
        public String getValue1() {
            return value1;
        }

        //製品価格を格納するString型のvalue2を返すgetValue2を返す
        public int getValue2() {
            return value2;
        }

        //在庫数を格納するString型のvalue3を返すgetValue3を返す
        public int getValue3() {
            return value3;
        }

        //製品価格value2と在庫数value3が格納されたList型のdataItemListを返す
        public List<Integer> getList() {
            return dataItemList;
        }
    }

    //内部クラスSetterMethodsを定義し、Setterメソッドを定義する
    public class SetterMethods {
        //製品名を格納するString型のvalue1を変更する
        public void setValue1(String inValue1) {
            value1 = inValue1;
        }

        //製品価格を格納するString型のvalue2を変更する
        public void setValue2(int inValue2) {
            value2 = inValue2;
        }

        //在庫数を格納するString型のvalue3を変更する
        public void setValue3(int inValue3) {
            value3 = inValue3;
        }
    }

    //多態化（ポリモーフィズム）
    public void meta1() {
        System.out.println("スーパークラスで抽象メソッドを定義");
    }

    //サブクラスでオーバーライドする抽象メソッド
    public abstract void meta2();

}

