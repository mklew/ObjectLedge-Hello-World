ObjectLedge REST example
======================

Step by step explanation

1. In `web.xml` new LedgeServlet was mapped to path handling rest requests
2. Name of servlet's dispatcher has to correspond to some Dispatcher component
3. In this example `PipelineHttpDispatcher` was used which takes restPipeline and context(provided by pico) as parameters
4. restPipeline is `SimplePipeline` which just processes requests with no error handling. `ErrorHandlingPipeline` could be used instead.
5. restPipeline has just one valve and that is `JerseyRestValve`
6. `JerseyRestValve` has its configuration in `org.objectledge.web.rest.JerseyRestValve.xml`
7. Jersey will scan for rest services in configured package
8. There is only one service mapped to `/hello` path which serves Hello World response.

Try it:

     1. Run it as `jetty:run`
     2. http://localhost:8080/rest/hello

ObjectLedge Hello World
=======================

Main goal of this project is to provide quickstart for more advanced development using ObjectLedge framework.

Ultimate goal is to turn this into Maven archetype as soon as... it starts working.

Installation
-------------
1. Fork ObjectLedge
2. Clone it
3. Install it into your local repository

If you want to use `JDK 6` then build `master` branch.
If you want to use `JDK 7` and latest version of ObjectLedge then build `dev` branch.

4. Once you have OL installed into your local maven repository then you can start hacking this one
5. Fork & clone it
6. Build it `mvn clean install -f objectledge-demo-parent/pom.xml`
7. `cd objectledge-demo-minimal`
8. `mkdir workdir`
9. Run it `mvn jetty:run -f objectledge-demo-minimal/pom.xml`
10. Open http://localhost:8080/ in your browser
11. Contribute to get it working...


Examples
------------
For REST services example see `rest` branch