需要注意的是，我们也必须使用`AMD`规范来发布我们自己的库：

```
compileKotlin2Js.kotlinOptions.moduleKind = "amd"
```