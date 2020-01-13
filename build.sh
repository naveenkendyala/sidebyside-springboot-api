#/bin/bash
mvn clean package

echo "*****************************************************************************"
docker build -f src/main/docker/jvm.dockerfile -t springboot/springboot-jpa-api-jvm:$1 .; 


echo "*****************************************************************************"
docker tag springboot/springboot-jpa-api-jvm:$1 naveenkendyala/springboot-jpa-api-jvm:$1; 


echo "*****************************************************************************"
docker push naveenkendyala/springboot-jpa-api-jvm:$1

