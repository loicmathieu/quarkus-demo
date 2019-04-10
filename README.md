Démarrer la BDD :

```
docker run --ulimit memlock=-1:-1 -it --rm=true --memory-swappiness=0 \--name postgres \
    -e POSTGRES_USER=sarah -e POSTGRES_PASSWORD=connor -e POSTGRES_DB=mydatabase \
    -p 5432:5432 postgres:10.5
```

Démarrer Quakus en mode dev (avec live reload)
```
mvn compile quarkus:dev
```

Une [collection Postman](Quarkus Demo.postman_collection.json) existe pour tester le endpoint de l'application.

Pour packager l'application via Maven :
``̀
mvn package
`̀̀ `

Pour packager l'application via Docker, ceci génerèrera un build natif :
```
docker build -t loicmathieu/quarkus-demo -f src/main/docker/Dockerfile .
```

On pourra ensuite le lancer via la commande Docker suivante, qui lie ce conteneur au conteneur Postgres précédemment
lancé et reconfigure l'URL de la BDD vers celui-ci :
```
docker run -ti -p 8080:8080 --link postgres \
 loicmathieu/quarkus-demo \
-Dquarkus.datasource.url=jdbc:postgresql://postgres:5432/mydatabase
```
