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