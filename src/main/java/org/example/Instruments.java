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

    //ArrayListを使用し、VstPluginクラスのインスタンスを格納するためのリスト型のlistを作成する
    private List<VstPlugin> list = new ArrayList<>();
    //HashMapを使用し、キーのStringとListのInteger型のmapを作成する
    private Map<String, List<Integer>> drumMap = new HashMap<>();

    //listに新たなVstPluginインスタンスを追加する
    public void addList(String value1, int value2, int value3) {
        list.add(new VstPlugin(value1, value2, value3));
        System.out.println(value1 + "　の製品登録が完了しました");
        System.out.println("--------------");
    }

    //list内から指定したVstPluginインスタンスを削除する
    public void deleteList(int i) {
        list.remove(i);
        System.out.println("リスト番号：" + i + "　の削除が完了しました");
        System.out.println("----------------------------");
    }

    //list内のVstPluginインスタンスの製品名がnull又は空白であることを検出し、検出されればエラー結果を返す
    public void chekedList() {
        int count = 0;
        for (VstPlugin item : this.list) {
            try {
                CustomException.checkValue(count, item.new GetterMethods().getValue1());
            } catch (IllegalArgumentException e) {
                System.out.println(e);
                System.out.println("--------------");
            }
            count++;
        }
        System.out.println("----------------------------");
    }

    //list内にあるすべてのインスタンスに格納されているデータを出力する
    public void allPrintList() {
        int count = 0;
        for (VstPlugin item : list) {
            System.out.println("リスト番号：" + count);
            System.out.println("製品：" + item.new GetterMethods().getValue1());
            System.out.println("価格：" + item.new GetterMethods().getValue2());
            System.out.println("在庫：" + item.new GetterMethods().getValue3());
            System.out.println("--------------");
            count++;
        }
        System.out.println("----------------------------");
    }

    //list内の指定したインスタンスのデータを変更する
    public void updateList(int i, String value1, int value2, int value3) {
        list.get(i).new SetterMethods().setValue1(value1);
        list.get(i).new SetterMethods().setValue2(value2);
        list.get(i).new SetterMethods().setValue3(value3);
        System.out.println("リスト番号：" + i + "　の変更が完了しました");
        System.out.println("----------------------------");
    }

    //list内の指定したインスタンスのデータを出力する
    public void printList(int i) {
        System.out.println("リスト番号：" + i);
        System.out.println("製品：" + list.get(i).new GetterMethods().getValue1());
        System.out.println("価格：" + list.get(i).new GetterMethods().getValue2());
        System.out.println("在庫：" + list.get(i).new GetterMethods().getValue3());
        System.out.println("----------------------------");
    }

    //拡張forループを使用し、リスト化したインスタンスからkeyとデータリストを用意し、mapを作成する
    public void createMap() {
        for (VstPlugin item : list) {
            drumMap.put(item.new GetterMethods().getValue1(), item.new GetterMethods().getList());
        }
    }

    //引数のString型value1と一致するキーがあれば、その結果を出力する
    //引数のString型value1と一致するキーがなければ、エラーを返す
    public void printMap(String value1) {
        System.out.println(value1 + "　の検索を開始します");
        try {
            CustomException.checkSearch(drumMap.get(value1));
            System.out.println(value1 + "：[価格/在庫]" + drumMap.get(value1));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println("----------------------------");
    }
}
