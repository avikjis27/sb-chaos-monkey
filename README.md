This project is to demonstrate the [chaos engineering principles](https://principlesofchaos.org/) in testing micro-services. We have used [chaos monkey spring boot](https://github.com/codecentric/chaos-monkey-spring-boot) for simulating the chaotic nature.

## To run inside docker container
 - Run `make docker-run`

## To run locally without docker
 - Run `./gradlew clean build`
 - Run `./gradlew bootRun`
 
## To test
 - Import "Chaos Monkey Experiment.postman_collection.json" to [postman](https://www.getpostman.com/).
 - Hit the "Hit a rest endpoint" request and see **some time** the test fails due to long response time.   

 