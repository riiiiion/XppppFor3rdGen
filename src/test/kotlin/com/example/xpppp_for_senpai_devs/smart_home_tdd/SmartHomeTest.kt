package com.example.xpppp_for_senpai_devs.smart_home_tdd

import com.example.xpppp_for_senpai_devs.smart_home_tdd.right.AkiraHouse
import com.example.xpppp_for_senpai_devs.smart_home_tdd.right.Bulb
import com.example.xpppp_for_senpai_devs.smart_home_tdd.right.InfoDisplay
import com.example.xpppp_for_senpai_devs.smart_home_tdd.right.Switch
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test


class SmartHomeTest {
    //ここにテストを記述してください。
    //必要なTestDoubleは自分たちで設定しましょう。
    //TestDoubleを作るのにmockkなどの便利なライブラリがありますが今回は使用しないでください。
    lateinit var akiraHouse: AkiraHouse

    @Nested
    inner class DisplayBulbWarning {
        lateinit var bulb: DummyBulb
        lateinit var switch: DummySwitch
        lateinit var infoDisplay: SpyInfoDisplay

        @BeforeEach
        fun setup() {
            bulb = DummyBulb()
            switch = DummySwitch()
            infoDisplay = SpyInfoDisplay()
            akiraHouse = AkiraHouse(bulb, switch, infoDisplay)
        }

        @Test
        fun `bulbWarningがtrueの時、displayBulbWarningが実行される`() {
            //ARRANGE
            akiraHouse.bulbWarning = true

            //ACT
            akiraHouse.run()

            //ASSERT
            assertTrue(infoDisplay.wasCalledDisplayBulbWarning)
        }

        @Test
        fun `bulbWarningがfalseの時、displayBulbWarningが実行されない`() {
            //ARRANGE
            akiraHouse.bulbWarning = false

            //ACT
            akiraHouse.run()

            //ASSERT
            assertFalse(infoDisplay.wasCalledDisplayBulbWarning)
        }
    }

    @Nested
    inner class BulbWarning {

        @Test
        fun `switchIsOnCounterが5になったら,bulbWarningをtrueにする`() {

            //ARRANGE
            var bulb = DummyBulb()
            var switch = StubSwitch()
            var infoDisplay = DummyInfoDisplay()
            akiraHouse = AkiraHouse(bulb, switch, infoDisplay)

            //ACT
            akiraHouse.run()

            //ASSERT
            assertTrue(akiraHouse.bulbWarning)
        }
    }


}