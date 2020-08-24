package dev.carlos.bff_do_zero

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.widget.core.AlignSelf
import br.com.zup.beagle.widget.core.Flex
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.ui.Text
import org.springframework.stereotype.Service

@Service
class MyService {
    fun createScreen() = MyBuilder()
}