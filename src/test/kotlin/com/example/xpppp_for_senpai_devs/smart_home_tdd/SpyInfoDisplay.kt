package com.example.xpppp_for_senpai_devs.smart_home_tdd

import com.example.xpppp_for_senpai_devs.smart_home_tdd.right.InfoDisplay

class  SpyInfoDisplay: InfoDisplay {
    var wasCalledDisplayBulbWarning:Boolean = false
    override fun displayBulbWarning() {
        this.wasCalledDisplayBulbWarning = true
    }

}
