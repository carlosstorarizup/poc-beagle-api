package dev.carlos.bff_do_zero

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.action.*
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.core.EdgeValue
import br.com.zup.beagle.widget.core.ScrollAxis
import br.com.zup.beagle.widget.core.Size
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.layout.ScrollView
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.Text

class MyBuilder : ScreenBuilder {
    override fun build() = Screen(
            child = Container(
                    context = ContextData(
                            id = "myContext",
                            value = Article(
                                    title = "",
                                    abstract = ""
                            )
                    ),
                    children = listOf(
                            Button(
                                    text = "Discover News",
                                    styleId = "ButtonBlack",
                                    onPress = listOf(
                                            SendRequest(
                                                    url = "https://api.nytimes.com/svc/mostpopular/v2/emailed/7.json?api-key=nypgcZHlVqLh9DpLuMyOe1RuA5Fm9Wz9",
                                                    method = RequestActionMethod.GET,
                                                    onSuccess = listOf(
                                                            SetContext(
                                                                    contextId = "myContext",
                                                                    path = "article",
                                                                    value = Utils().makeArticleData()
                                                            )
                                                    )
                                            )
                                    )
                            ),
                            ScrollView(
                                    scrollDirection = ScrollAxis.VERTICAL,
                                    children = Utils().makeContainersList()
                            )
                    )
            )
    )
}