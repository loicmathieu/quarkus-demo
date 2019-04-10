Démarrer la BDD :

`̀``
docker run --ulimit memlock=-1:-1 -it --rm=true --memory-swappiness=0 --name postgres-quarkus-hibernate \
    -e POSTGRES_USER=sarah -e POSTGRES_PASSWORD=connor -e POSTGRES_DB=mydatabase \
    -p 5432:5432 postgres:10.5
`̀``

Démarrer Quakus en mode dev (avec live reload)
`̀``
mvn compile quarkus:dev
`̀``

Une collection Postman existe pour tester le endpoint de l'application : [Quarkus Demo.postman_collection.json]