package org.example;

// 親クラスDataItemを持つサブクラスVstPlugin
//このクラスはVstプラグイン製品データの保管や変更に使用するクラスである
public class VstPluginCatalog extends ProductCatalog {

    //VstPluginクラスコンストラクタ
    public VstPluginCatalog(String vstPluginName, int vstPluginPrice, int vstPluginStock) {
        super(vstPluginName, vstPluginPrice, vstPluginStock);
    }

    //多態化（ポリモーフィズム）
    public void abstractMethod1() {
        System.out.println("オーバーライド");
    }

    public void abstractMethod2() {
        System.out.println("抽象メソッドのオーバーライド");
    }
}
