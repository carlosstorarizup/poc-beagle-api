package dev.carlos.bff_do_zero

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController(private val myService: MyService) {
    @GetMapping("pag")
    fun getScreen() = myService.createScreen()
}