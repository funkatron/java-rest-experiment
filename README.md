# Welp

So I build the .jar with:

`mvn clean package`

So I try to run with

`java -cp target/geocodio-0.1.jar com.graphstory.rest.RestTest`

I get this error:

    Error: A JNI error has occurred, please check your installation and try again
    Exception in thread "main" java.lang.NoClassDefFoundError: com/mashape/unirest/http/exceptions/UnirestException
        at java.lang.Class.getDeclaredMethods0(Native Method)
        at java.lang.Class.privateGetDeclaredMethods(Class.java:2701)
        at java.lang.Class.privateGetMethodRecursive(Class.java:3048)
        at java.lang.Class.getMethod0(Class.java:3018)
        at java.lang.Class.getMethod(Class.java:1784)
        at sun.launcher.LauncherHelper.validateMainClass(LauncherHelper.java:544)
        at sun.launcher.LauncherHelper.checkAndLoadMain(LauncherHelper.java:526)
    Caused by: java.lang.ClassNotFoundException: com.mashape.unirest.http.exceptions.UnirestException
        at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
        at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
        ... 7 more


I can run the class from within IntelliJ IDEA, though.