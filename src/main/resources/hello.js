define('hello', function() {
    return function(name) {
        console.log("Hello, " + name + "!");
    }
})