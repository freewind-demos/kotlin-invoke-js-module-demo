Kotlin Invoke Js Module Demo
=======================

在JavaScript的AMD规范中，我们可以通过`define`来定义一个module:

```
define('hello', function() {
    return function(name) {
        console.log("Hello, " + name + "!");
    }
})
```

这里就定义了一个名为`hello`的module。

那么我们的KotlinJs中，应该如何引用它呢？
------------------------

主要是通过`@JsModule`这个annotation将我们定义的某个wrapper与它关联起来：

```
@JsModule("hello")
external val hello: (String) -> Unit = definedExternally
```

运行示例
-------

为了能够让代码完整的运行起来，我们还需要借助一些AMD模块载入库，比如`requirejs`等，以及相应的配置。这些可以在`index.html`中看到。

Run:

```
npm install
./gradlew clean compileKotlin2Js
npm install -g http-server
http-server .
```

Open <http://localhost:8080/index.html> from your browser, you will see "Hello, Kotlin!" in console of your browser's developer panel.


