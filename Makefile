docker-build:
	docker build -t sb-chaos-monkey .

docker-run: docker-build
	docker run -p 8080:8080 sb-chaos-monkey
