package com.poc.frontandroid.beagle

import br.com.zup.beagle.android.annotation.BeagleComponent
import br.com.zup.beagle.android.setup.DesignSystem
import com.poc.frontandroid.R

@BeagleComponent
class AppDesignSystem: DesignSystem()  {

    override fun textStyle(id: String): Int? {
        return when (id) {
            "Title.Text.DarkGray" -> R.style.Title_Text_DarkGray
            "Description.Text.LightGray" -> R.style.Description_Text_LightGray
            else -> R.style.Design_System_Text_Default
        }
    }

    override fun buttonStyle(id: String): Int? = R.style.DesignSystem_Button_Default

}