package com.example.xpppp_for_senpai_devs.smart_home_tdd.right

//ヒント
//DIPの講義で使用したAE86のコードを参考にしましょう。
//wrongフォルダに良くない例としてスマートホームのサンプルコードを示してあります。
//サンプルコード（wrongフォルダ内）を良くみてDIPに則った形に書き直してください。
//まずは必要なインターフェースを実装しましょう
//次にアキラくんの家（class AkiraHouse)を宣言し実装しましょう
//アキラくんの家はSmartHomeのインターフェースを継承する形で定義してください。
//アキラくんの家は依存関係を注入できるようにコンストラクターの引数を設定しましょう。

interface SmartHome {
    fun run()
}

interface Bulb {
    fun turnOn()
    fun turnOff()
}

interface Switch {
    var switchIsOnCounter:Int
    fun isON(): Boolean
}

interface InfoDisplay {
    fun displayBulbWarning()
}


class AkiraHouse(val bulb: Bulb, val switch: Switch, val infoDisplay: InfoDisplay) : SmartHome {
    var bulbWarning: Boolean = false

    //runメソッドでスマートホームのシステムを起動する
    //今はとりあえず照明の管理だけ
    override fun run() {
        if (bulbWarning) {
            infoDisplay.displayBulbWarning()
        }
        if (switch.switchIsOnCounter == 5){
            this.bulbWarning = true
        }
        lighting(bulb, switch)
    }

    //ここから下は各部屋の照明を管理するメソッド
    private fun lighting(bulb: Bulb, switch: Switch) {
        if (switch.isON()) {
            bulb.turnOn()
        } else {
            bulb.turnOff()
        }
    }

}



