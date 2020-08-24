package dev.carlos.bff_do_zero

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.widget.action.RequestActionMethod
import br.com.zup.beagle.widget.action.SendRequest
import br.com.zup.beagle.widget.action.SetContext
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.core.EdgeValue
import br.com.zup.beagle.widget.core.ScrollAxis
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
                                    onPress = listOf(
                                            SendRequest(
                                                    url = "https://api.nytimes.com/svc/mostpopular/v2/emailed/7.json?api-key=nypgcZHlVqLh9DpLuMyOe1RuA5Fm9Wz9",
                                                    method = RequestActionMethod.GET,
                                                    onSuccess = listOf(
                                                            SetContext(
                                                                    contextId = "myContext",
                                                                    path = "article",
                                                                    value = mutableListOf(
                                                                            Article(
                                                                                    title = "@{onSuccess.data.results[0].title}",
                                                                                    abstract = "@{onSuccess.data.results[0].abstract}"
                                                                            ),
                                                                            Article(
                                                                                    title = "@{onSuccess.data.results[1].title}",
                                                                                    abstract = "@{onSuccess.data.results[1].abstract}"
                                                                            ),
                                                                            Article(
                                                                                    title = "@{onSuccess.data.results[2].title}",
                                                                                    abstract = "@{onSuccess.data.results[2].abstract}"
                                                                            ),
                                                                            Article(
                                                                                    title = "@{onSuccess.data.results[3].title}",
                                                                                    abstract = "@{onSuccess.data.results[3].abstract}"
                                                                            ),
                                                                            Article(
                                                                                    title = "@{onSuccess.data.results[4].title}",
                                                                                    abstract = "@{onSuccess.data.results[4].abstract}"
                                                                            ),
                                                                            Article(
                                                                                    title = "@{onSuccess.data.results[5].title}",
                                                                                    abstract = "@{onSuccess.data.results[5].abstract}"
                                                                            )
                                                                    )
                                                            )
                                                    )
                                            )
                                    )
                            ),
                            ScrollView(
                                    scrollDirection = ScrollAxis.VERTICAL,
                                    scrollBarEnabled = true,
                                    children = Utils().makeContainersList()
                            )
                    )
            )
    )
}