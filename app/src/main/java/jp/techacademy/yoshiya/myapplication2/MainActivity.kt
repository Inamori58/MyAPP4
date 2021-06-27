package jp.techacademy.yoshiya.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("山田", 25, hobby = "山登り")  // 名前を山田、年齢25歳、趣味は山登りで、Humanのインスタンスを作る
        human.say()

        val human2 = Human("山田", 25, hobby = "山登り") // 名前を山田、年齢25歳、趣味は山登りで、Human2のインスタンスを作る
        human2.think()
    }
}