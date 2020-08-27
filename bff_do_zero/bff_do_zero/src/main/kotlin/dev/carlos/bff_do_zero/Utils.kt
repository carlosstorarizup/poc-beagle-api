package dev.carlos.bff_do_zero

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.widget.core.EdgeValue
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.ui.Text

class Utils {
    fun makeContainersList(): List<Container> {
        var news = mutableListOf<Container>()
        for (x in 0..5) {
            news.add(
                    Container(
                            children = listOf(
                                    Text(
                                            text = "@{myContext.article[$x].title}",
                                            styleId = "Title.Text.DarkGray"
                                    ).applyStyle(
                                            Style(
                                                    padding = EdgeValue(all = 4.unitPercent())
                                            )
                                    ),
                                    Text(
                                            text = "@{myContext.article[$x].abstract}",
                                            styleId = "Description.Text.Orange"
                                    ).applyStyle(
                                            Style(
                                                    padding = EdgeValue(all = 5.unitPercent())
                                            )
                                    )
                            )
                    ).applyStyle(
                            Style(
                                    margin = EdgeValue(all = 2.unitPercent())
                            )
                    )
            )
        }
        return news
    }
}