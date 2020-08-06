# Botscript
This is a recovered backup of an old project inspired by [RuneScript](https://runescape.wiki/w/RuneScript). This project in its current state is compiled to 'bytecode' and then interpreted by a JVM based interpreter. Started in high school (2015) and left unfinished due to higher learning opportunities.

Features (discovered in this build)
* Variables
    * Global
    * Scoped
* Functions
    * Global
    * Scoped
* Basic arithmetic
* Runtime Environment Configuration
    * Global Methods
    * Global Variables
* Compilation to rudimentary bytecode.

Other:
* AST Based navigation
* Start of variable syntax declaration
    * The ability to use any dialect preferred for example: mixing python and typescript style syntax with a simple code declaration
        ```
        [![~@PyIf, ~@LesserOrEqual]]
        ``` 

## Basic Syntax
```
foo = 'bar'

# prints 'foo bar'
println('foo: ' + foo)
```
Declares variable 'foo' as 'bar' and prints 'foo: bar'

Some day this project may be rewritten. But right now there is no need, I hope that this can at least help someone crazy enough to look into their own little language.