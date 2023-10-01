package org.example;

//ListとArrayListをインポートする

import java.util.ArrayList;
import java.util.List;

//抽象クラスDataItem
//このクラスは製品データの保管や変更に使用されるクラスである
public abstract class ProductCatalog {
    //製品名を格納する修飾子privateのString型のproductNameを宣言する
    private String productName;
    //製品価格を格納する修飾子privateのint型のproductPriceを宣言する
    private int productPrice;
    //在庫数を格納する修飾子privateのint型のproductStockを宣言する
    private int productStock;
    //製品価格value2と在庫数value3を格納するList型のproductListを宣言し、ArrayListで初期化する
    private final List<Integer> productList = new ArrayList<>();

    //ProductCatalogのクラスコンストラクタ
    //引数として、製品名を持つString型のproductName、製品価格を持つint型のproductPrice、在庫数を持つint型のproductStockがある
    //引数のproductName、productPrice、productStockをDataItem.javaのproductName、productPrice、productStockに代入する
    //DataItem.javaのproductPrice、productStockをList型のdataItemListに追加する
    public ProductCatalog(String productName, int productPrice, int productStock) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        productList.add(this.productPrice);
        productList.add(this.productStock);
    }

    //内部クラスProductGetterを定義し、Getterメソッドを定義する
    public class ProductGetter {
        //製品名を格納するString型のvalue1を返すproductNameを返す
        public String getProductName() {
            return productName;
        }

        //製品価格を格納するString型のvalue2を返すproductPriceを返す
        public int getProductPrice() {
            return productPrice;
        }

        //在庫数を格納するString型のvalue3を返すgetValue3を返す
        public int getProductStock() {
            return productStock;
        }

        //製品価格productPriceと在庫数productStockが格納されたList型のproductListを返す
        public List<Integer> getProductList() {
            return productList;
        }
    }

    //内部クラスProductSetterを定義し、Setterメソッドを定義する
    public class ProductSetter {
        //製品名を格納するString型のproductNameを変更する
        public void setProductName(String inProductName) {
            productName = inProductName;
        }

        //製品価格を格納するString型のproductPriceを変更する
        public void setProductPrice(int inProductPrice) {
            productPrice = inProductPrice;
        }

        //在庫数を格納するString型のproductStockを変更する
        public void setProductStock(int inProductStock) {
            productStock = inProductStock;
        }
    }

    //多態化（ポリモーフィズム）
    public void abstractMethod1() {
        System.out.println("スーパークラスで抽象メソッドを定義");
    }

    //サブクラスでオーバーライドする抽象メソッド
    public abstract void abstractMethod2();

}

