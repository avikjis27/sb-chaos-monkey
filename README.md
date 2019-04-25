This project is to demonstrate the [chaos engineering principles](https://principlesofchaos.org/) in testing micro-services. We have used [chaos monkey spring boot](https://github.com/codecentric/chaos-monkey-spring-boot) for simulating the chaotic nature.

## To run inside docker container
 - Run `make docker-run`

## To run locally without docker
 - Run `./gradlew clean build`
 - Run `./gradlew bootRun`
  

 