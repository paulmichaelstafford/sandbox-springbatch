docker exec postgres psql -c "create database spring_batch;" --user postgres

docker run -d -p 3000:3000 --name=grafana grafana/grafana-enterprise

docker run -r -p 9090:9090 prom/prometheus