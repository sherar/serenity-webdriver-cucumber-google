## Automated web tests using Serenity, Cucumber and Maven

A simple example of some BDD-style automated acceptance criteria, running against http://www.google.co.nz

### Setup

 - Install JDK 7+
 -  Install Maven

## Run the tests!

```
mvn clean verify -Dwebdriver.driver=firefox
```

The reports will be generated in `target/site/serenity`.
