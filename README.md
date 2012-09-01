ObjectLedge Hello World
=======================

HTML5-Bootstrap-jQuery
-----------------------
Simple modifications were added.

From this example you can learn how to:

* include scripts. It is really ugly way and I hope there is better solution.
* benefit from link object 
* create breadcrumb with pure javascript.
* use jQuery ready functions in two flavours
* manipulate DOM, create and insert new elements

Also some things for your consideration. These can be treated like potential issues

* Templates names must start with capital letter. Otherwise it is not working
* Nested views are represented by url containing dots like foo.bar.barfoo which is something I would like to change but don't know how.
* Including scripts looks bad and there should be easier way like `$pageTool.styles` and `$pageTool.scripts`

--------------

Main goal of this project is to provide quickstart for more advanced development using ObjectLedge framework.

Ultimate goal is to turn this into Maven archetype as soon as... it starts working.

Installation
-------------
1. Fork ObjectLedge
2. Clone it
3. Install it into your local repository

If you have `JDK 6` then build `dev` branch or `master` branch.
If you have `JDK 7` then build `feature/java7` branch.

4. Once you have OL installed into your local maven repository then you can start hacking this one
5. Fork & clone it
6. Build it `mvn clean install -f objectledge-demo-parent/pom.xml`
7. Run it `mvn jetty:run -f objectledge-demo-minimal/pom.xml`
8. Open http://localhost:8080/ in your browser
9. Contribute to get it working...


