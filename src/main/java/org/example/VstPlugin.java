package org.example;

//親クラスDataItemを持つサブクラスVstPlugin
public class VstPlugin extends DataItem {

    //VstPluginクラスコンストラクタ
    public VstPlugin(String value1, int value2, int value3) {
        super(value1, value2, value3);
    }

    //多態化（ポリモーフィズム）
    public void meta1() {
        System.out.println("オーバーライド");
    }

    public void meta2() {
        System.out.println("抽象メソッドのオーバーライド");
    }
}
