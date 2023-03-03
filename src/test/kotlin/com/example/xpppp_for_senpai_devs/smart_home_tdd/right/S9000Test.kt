package com.example.xpppp_for_senpai_devs.smart_home_tdd.right

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class S9000Test {

    @Test
    fun `SwitchのisOnメソッドが実行された回数がswitchIsOnCounterに保存されていること`() {
        //ARRANGE
        val switch = S9000()

        //ASSERT
        assertEquals(0, switch.switchIsOnCounter)

        //ACT
        switch.isON()
        switch.isON()
        switch.isON()

        //ASSERT
        assertEquals(3, switch.switchIsOnCounter)
    }

}