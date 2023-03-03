package com.example.xpppp_for_senpai_devs.smart_home_tdd

import com.example.xpppp_for_senpai_devs.smart_home_tdd.right.Switch

class DummySwitch : Switch {
    override var switchIsOnCounter: Int = 0
    override fun isON(): Boolean {
        return false
    }

}
