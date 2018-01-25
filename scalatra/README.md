## Scalatra's Philosophy
1. Start small, build upwards.
2. Freedom
3. Solid, but not stolid.
4. Love HTTP

Read the full version [*here*](http://scalatra.org/guides/2.6/scalatra-philosophy.html).

### Now this: Hello Scalatra!
After installing sbt, let's start by creating a simple servlet, our humble servlet. (Following the instructions of [this tutorial](http://scalatra.org/getting-started/first-project.html) )

* In console, create a new project:
```
sbt new scalatra/scalatra.g8
```

* Complete the information about organization, name and version of your web app, name of your servlet, name of your package and version of scala, sbt and scalatra (if you're not sure, use default values).

* Navigate to your application's top level directory and execute:
```
sbt
```

* After that, we're set, let's launch our server!
```
jetty:start
```
* If you're using __localhost__ go to http://localhost:8080/
##That's all, but wait, it's time to try [__scalate__](https://github.com/scalate/scalate "Scalate is a Scala based template engine which supports HAML, Mustache and JSP, Erb and Velocity style syntaxes.")

Note: Manning has an interesting book called Scalatra in action. You can check a few sample pages [here](http://freecontent.manning.com/wp-content/uploads/introducing-scalatra.pdf)
