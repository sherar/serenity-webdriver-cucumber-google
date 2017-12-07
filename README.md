## Automated web tests using Serenity, Cucumber and Maven

A simple example of some BDD-style automated acceptance criteria, running against http://www.google.co.nz

Run the tests like this:

```
mvn clean verify -Dwebdriver.driver=firefox
```

The reports will be generated in `target/site/serenity`.
