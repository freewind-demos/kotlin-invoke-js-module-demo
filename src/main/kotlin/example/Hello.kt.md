通过`@JsModule("hello")`中指定的`hello`，我们可以把一个不同名的函数`helloDifferentName`与它关联起来。

这样当我们因某种需要修改了`helloDifferentName`函数的名字，它依然指向在Js文件中定义的`hello` module.