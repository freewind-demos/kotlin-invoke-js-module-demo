package example

@JsModule("hello")
external val hello: (String) -> Unit = definedExternally

fun main(args: Array<String>) {
    hello("KotlinJS")
}


