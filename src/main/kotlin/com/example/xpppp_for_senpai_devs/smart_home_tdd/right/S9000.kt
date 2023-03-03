package com.example.xpppp_for_senpai_devs.smart_home_tdd.right

//スイッチS9000のクラスを宣言し、実装してください。
//S9000クラスはアキラくんの家に必要なインターフェースを継承してください。
class S9000 : Switch {


   override var switchIsOnCounter: Int = 0
       override fun isON(): Boolean {
        switchIsOnCounter++
        return true
    }

}