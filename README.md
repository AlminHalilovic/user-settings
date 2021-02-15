# Microservice user-settings. Take a look [here](https://github.com/AlminHalilovic/kubernetes-spring-boot) for entire setup.

You can run this application locally with following command:
`./gradlew bootRun --args='--spring.profiles.active=local'`

Configuration for *database* or *server:port* microservice url during local run can be changed in `src/main/resources/application-local.yaml` file. Additionally, connecting to config server is disabled for local runs. You can re-enable it, but you need to have corresponding config server running locally.
