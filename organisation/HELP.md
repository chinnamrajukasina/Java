# Getting Started

Install mongo DB full version - https://fastdl.mongodb.org/windows/mongodb-windows-x86_64-7.0.3-signed.msi



from mongo compass create username and password with below instauctions:

use admin

    db.createUser({user:"Username", pwd:"Password", roles:[{role:"root", db:"admin"}]})
    
    
    
    
    curl --location 'http://localhost:8080/api/organisations' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Organisation Name",
    "address": "Organisation Address"
    
}'


curl --location 'http://localhost:8080/api/organisations'



curl --location 'http://localhost:8080/api/organisations/655b873f274f60195827be12'



