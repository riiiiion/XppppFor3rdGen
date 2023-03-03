package com.example.xpppp_for_senpai_devs.smart_home_tdd.right
//SmartHomeのインターフェースを宣言してください。


//main関数はスマートホームに必要な部品のインスタンスを作成し、アキラくんの家に依存を注入する。
fun main(){
    //現状はクラスが宣言されていないのでエラーが出ていますが正しく実装できればエラーはなくなるはずです。
    val bulb = B9100()
    val switch = S9000()
    val infoDisplay = D9000()
    val smartHome = AkiraHouse(bulb, switch, infoDisplay)
    smartHome.run()
}
