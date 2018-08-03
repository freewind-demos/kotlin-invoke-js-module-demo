package example

import kotlin.browser.document

@JsModule("hello")
external fun helloDifferentName(name: String): String = definedExternally

fun main(args: Array<String>) {
    document.getElementById("main")!!.innerHTML = helloDifferentName("KotlinJS")
}
