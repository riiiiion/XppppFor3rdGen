package com.example.xpppp_for_senpai_devs.smart_home_tdd.right

//バルブB9000のクラスを宣言し、実装してください。
//B9000クラスはアキラくんの家に必要なインターフェースを継承してください。
class B9100 : Bulb {
    override fun turnOn() {
       lightOn()
    }
    private fun lightOn() {
        print("照明が点灯しました")
    }

    override fun turnOff() {
        lightOff()
    }
    private fun lightOff() {
        print("照明が消灯しました")
    }
}