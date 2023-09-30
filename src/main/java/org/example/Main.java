package org.example;

public class Main {
    public static void main(String[] args) {

        //Instrumentsクラスからdrumインスタンスを生成する
        Instruments drum = new Instruments();

        //リストを追加する
        drum.addList("SUPERIOR DRUMMER 3", 49500, 50);
        drum.addList("BFD 3", 35799, 37);
        drum.addList("MODO DRUM 1.5", 30990, 25);
        drum.addList("", 0, 0);
        drum.addList(null, 1, 1);

        //製品名にnull又は空白を含むデータを検出する
        drum.chekedList();

        //指定したリストを削除する
        drum.deleteList(4);
        drum.deleteList(3);

        //リストを出力する
        drum.allPrintList();

        //指定したリストを変更する
        drum.updateList(1, "EZ Drummer 3", 22000, 100);

        //指定したリストを出力する
        drum.printList(1);

        //drumインスタンスの全リストからMapを生成する
        drum.createMap();

        //検索したキーに該当するデータを出力する
        drum.printMap("SUPERIOR DRUMMER 3");
        drum.printMap("BFD 3");
        drum.printMap("MODO DRUM 1.5");
        drum.printMap("EZ Drummer 3");

        // 依存性の注入
        PurchaceService purchaceService = new PayService();
        UserPay userPay = new UserPay(purchaceService);

        // メッセージを送信
        userPay.sendMessage("test");

    }
}
