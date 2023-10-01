package org.example;

public class Main {
    public static void main(String[] args) {

        //Instrumentsクラスからdrumインスタンスを生成する
        Instruments drum = new Instruments();

        //リストを追加する
        //製品名にnull又は空白を含むデータを検出された場合、エラーを返す
        drum.addInstrumentList("SUPERIOR DRUMMER 3", 49500, 50);
        drum.addInstrumentList("BFD 3", 35799, 37);
        drum.addInstrumentList("MODO DRUM 1.5", 30990, 25);
        drum.addInstrumentList("", 0, 0);
        drum.addInstrumentList(null, 1, 1);
        drum.addInstrumentList("TOKYO SCORING DRUM KITS", 44671, 0);

        //リストを出力する
        drum.printAllInstrumentsInfo();

        //指定したリストを削除する
        drum.deleteInstrumentList(3);

        //指定したリストを変更する
        drum.updateInstrumentList(1, "EZ Drummer 3", 22000, 100);

        //指定したリストを出力する
        drum.printInstrumentInfo(1);

        //drumインスタンスの全リストからMapを生成する
        drum.createInstrumentsMap();

        //検索したキーに該当するデータを出力する
        drum.searchInstrumentMap("SUPERIOR DRUMMER 3");
        drum.searchInstrumentMap("BFD 3");
        drum.searchInstrumentMap("MODO DRUM 1.5");
        drum.searchInstrumentMap("EZ Drummer 3");
        drum.searchInstrumentMap("TOKYO SCORING DRUM KITS");

        //メッセージを送信する
        drum.payInstruments();
    }
}
