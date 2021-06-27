package jp.techacademy.yoshiya.myapplication2

import android.util.Log

class Human:Animal,Thinkable {
    //superで親クラスのコンストラクタを呼ぶ
    constructor(name:String,age:Int,hobby:String):super(name,age,hobby){
    }
    //Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest","私の名前は"+this.name+ "です。年は"+this.age+"歳です。")
    }

    override fun think() {
        Log.d("kotlintest","私は"+this.hobby+"について考える。")
    }

}