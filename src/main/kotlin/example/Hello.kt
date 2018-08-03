package example

import kotlin.browser.document

@JsModule("hello")
external fun helloAnotherName(name: String): String = definedExternally

fun main(args: Array<String>) {
    document.getElementById("main")!!.innerHTML = helloAnotherName("KotlinJS")
}
