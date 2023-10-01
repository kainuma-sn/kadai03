package org.example;

public class UserPay {
    private PurchaceService purchaceService;

    //コンストラクタインジェクション
    public UserPay(PurchaceService purchaceService) {
        this.purchaceService = purchaceService;
    }

    public void sendMessage(String message) {
        purchaceService.payProduct(message);
        // メッセージを出力
        System.out.println("購入を開始します" + message);
    }
}
