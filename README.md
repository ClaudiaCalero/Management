# Management
## Classes and its bookings' creation

## Project description:
### Story - Create Classes
As a studio owner i want to create classes for my studio so that my members can attend classes
Acceptance Criteria
● Implement an API to create classes(`/classes`). Assume this api doesn't need to have any
authentication to start with.
● Few bare minimum details we need to create classes are - class name, start_date, end_date,
capacity. For now, assume that there will be only one class per given day. Ex: If a class by
name pilates starts on 1st Dec and ends on 20th Dec, with capacity 10, that means Pilates
has 20 classes and for each class the maximum capacity of attendance is 10.
● No need to save the details in any database. Maintain an in memory array or a file to save the
info. (If you want to use the database, that's fine as well).
● Use Restful standards and create the api endpoint with proper success and error responses.
Story - Book for a class
As a member of a studio, I can book for a class, so that I can attend a class.
Acceptance Criteria
● Implement an API endpoint (`/bookings`). Assume this api doesn't need to have any
authentication to start with.
● Few bare minimum details we need for reserving a class are - name(name of the member
who is booking the class), date(date for which the member want to book a class)
● No need to save the details in DB. If you can maintain the state in an in memory array or a file
is good to start with. But no constraints if you want to use a database to save the state.
● Use REST standards and think through basic api responses for success and failure.
● No need to consider the scenario of overbooking for a given date. Ex: 14th Dec having a
capacity of 20 , but the number of bookings can be greater than 20.

### How to run this project

Download the .zip file and extract it
Clone the project using git
Build the project
Run the project and open POSTMAN

### Classes API:
POST: http://localhost:8084/classes

Data: {
"name":"Pilates",
"startDate":"11-12-2022",
"endDate":"22-12-2022",
"capacity": 30
}

Output data:

![b98f77b0-a49a-49e2-987a-ddb2943ed495](https://user-images.githubusercontent.com/92159714/196208018-f4b8f2b6-7a9c-4555-a242-2140580c241f.jpg)

Bookings API:
POST: http://localhost:8084/bookings

Data:  {
"memberName": "Clàudia",
"bookingDate": "21-12-2022" 
}

Output data:

![53b62cb6-00e0-4a85-8729-18e68403ef0b](https://user-images.githubusercontent.com/92159714/196208045-393199e3-5038-40be-9952-6a77a4a9f498.jpg)


### What can be improved here:
Add Frontend

Add Tests

Add validation and error responses
