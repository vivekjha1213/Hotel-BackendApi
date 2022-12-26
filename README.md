# Hotel-BackendApi
Hotel Backend Api  in spring boot

Swagger Ui..
http://localhost:8081/swagger-ui/#/

POST
​/myApp​/api​/signUpForNewUsers
signUpForNewUsers

http://localhost:8081/myApp/api/signUpForNewUsers 

curl -X POST "http://localhost:8081/myApp/api/signUpForNewUsers" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"address\": \"string\", \"dob\": \"string\", \"emailId\": \"string\", \"firstName\": \"string\", \"lastName\": \"string\", \"mobileNo\": \"string\", \"panCard\": \"string\", \"password\": \"string\", \"pincode\": \"string\"}"


POST
​/myApp​/api​/login
loginForUser

http://localhost:8081/myApp/api/login

curl -X POST "http://localhost:8081/myApp/api/login" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"additionalProp1\": {}, \"additionalProp2\": {}, \"additionalProp3\": {}}"


PUT
​/myApp​/api​/updateTheProfile​/{existingMobileNo}
updateTheProfile

{
  "address": "string",
  "dob": "string",
  "emailId": "string",
  "firstName": "string",
  "lastName": "string",
  "mobileNo": "string",
  "panCard": "string",
  "password": "string",
  "pincode": "string"
}

GET
​/myApp​/api​/viewTheProfile​/{existingMobileNo}
viewTheProfile

curl -X GET "http://localhost:8081/myApp/api/viewTheProfile/xxxx" -H "accept: */*"


Controller..
![Screenshot 2022-12-26 at 8 59 12 PM](https://user-images.githubusercontent.com/67068290/209564204-d58ee0a2-d9af-4dd0-8a6f-838113a44ba1.png)

Model..
![Screenshot 2022-12-26 at 8 59 44 PM](https://user-images.githubusercontent.com/67068290/209564252-e5637c8b-f074-4f3f-8b58-e142e5c0cc88.png)
