ObjectLedge Hello World
=======================

Main goal of this project is to provide quickstart for more advanced development using ObjectLedge framework.

Ultimate goal is to turn this into Maven archetype as soon as... it starts working.

TODO it works already so if anyone wishes to make archetype, go ahead.


Installation
-------------

1. Fork ObjectLedge
2. Clone it
3. Install it into your local repository
4. Once you have OL installed into your local maven repository then you can start hacking this one
5. Fork & clone it
6. Build it `mvn clean install -f objectledge-demo-parent/pom.xml`
7. `cd objectledge-demo-minimal`
8. `mkdir workdir`  IMPORTANT so make workdir in each of the ledge application
9. Run it `mvn jetty:run -f objectledge-demo-minimal/pom.xml`
10. Open http://localhost:8080/ in your browser
11. Contribute

Examples
==========

ObjectLedge Minimal example
=========================

    Demonstrates (almost) minimal structure needed for ObjectLedge application
    - Shows usage of action, view
    - Shows how to create component and put it into container

    Run it `mvn jetty:run -f objectledge-demo-minimal/pom.xml`

ObjectLedge REST example
======================

To run this example you will need my version of ObjectLedge at least at time being because my pull request is not yet
merged with dev.

Clone git://github.com/mklew/ledge.git and make sure you install ledge from feature/jersey-pico-integration branch.

Step by step explanation

1. In `web.xml` new LedgeServlet was mapped to path handling rest requests
2. Name of servlet's dispatcher has to correspond to some Dispatcher component
3. In this example `PipelineHttpDispatcher` was used which takes restPipeline and context(provided by pico) as parameters
4. restPipeline is `SimplePipeline` which just processes requests with no error handling. `ErrorHandlingPipeline` could be used instead.
5. restPipeline has just one valve and that is `JerseyRestValve`
6. `JerseyRestValve` has its configuration in `org.objectledge.web.rest.JerseyRestValve.xml`
7. Jersey will scan for rest services in configured packages
8. Jersey services (resources in jersey nomenclature must be defined in container.xml)
8. There is only one service mapped to `/hello` path which serves Hello World response.

Try it:

     1. Run it `mvn jetty:run -f objectledge-demo-rest/pom.xml`
     2. http://localhost:8080/rest/hello

ObjectLedge Security example
============================

This example uses extremely awesome Apache Shiro security framework.

 Some light on things:
 1. In `web.xml` context variable, filter and listener for Shiro is added. These are pretty much excerpts from Shiro documentation.
 2. `webapp/config` there's shiro.ini file which configures simple realm
 It also configures form based authentication
 3. `login.jsp` (name from shiro.ini) does the authentication job
 4. Every path is secured by Shiro. That's configured in `web.xml`

  To test:
  1. Go to any url ( no view template will be thrown after logon but that does not matter)
  2. Login page should popup
  3. Login with username: `root` and password: `12345`
  4. See that your redirected to desired url

 This example is not yet done.
 TODO
 * Create more permissions
 * Secure resource with annotations
 * Create Valve which added somewhere to pipeline adds Subject to Context
