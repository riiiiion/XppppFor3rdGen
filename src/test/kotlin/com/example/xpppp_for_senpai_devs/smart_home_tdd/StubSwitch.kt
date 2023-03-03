package com.example.xpppp_for_senpai_devs.smart_home_tdd

import com.example.xpppp_for_senpai_devs.smart_home_tdd.right.Switch

class StubSwitch : Switch {
   override var switchIsOnCounter: Int = 5
    override fun isON(): Boolean {
      return false
    }

}
