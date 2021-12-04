# CQRS

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

---

Project using CQRS pattern to build event-driven microservices.

The Command and Query Responsibility Segregation (CQRS) is an architectural pattern where the main focus is to separate the way of reading and writing data. 
This pattern uses two separate models: 
- Queries — responsible for reading data. 
- Commands — responsible for update data.

---

### When to use CQRS pattern

This pattern isn't recommended when:
- The domain or the business rules are simple.
- A simple CRUD-style user interface and data access operations are sufficient.

However, CQRS can be considered for the following scenarios:
- Collaborative domains where many users access the same data in parallel. CQRS allows you to define commands with enough granularity to minimize merge conflicts at the domain level, and conflicts that do arise can be merged by the command.
- Task-based user interfaces where users are guided through a complex process as a series of steps or with complex domain models. The write model has a full command-processing stack with business logic, input validation, and business validation. The write model may treat a set of associated objects as a single unit for data changes (an aggregate, in DDD terminology) and ensure that these objects are always in a consistent state. The read model has no business logic or validation stack, and just returns a DTO for use in a view model. The read model is eventually consistent with the write model.
- Scenarios where performance of data reads must be fine-tuned separately from performance of data writes, especially when the number of reads is much greater than the number of writes. In this scenario, you can scale out the read model, but run the write model on just a few instances. A small number of write model instances also helps to minimize the occurrence of merge conflicts.
- Scenarios where one team of developers can focus on the complex domain model that is part of the write model, and another team can focus on the read model and the user interfaces.
- Scenarios where the system is expected to evolve over time and might contain multiple versions of the model, or where business rules change regularly.
- Integration with other systems, especially in combination with event sourcing, where the temporal failure of one subsystem shouldn't affect the availability of the others.

---

Technologies used in this project:
- Axon Server
- Spring Boot

---

Axon Server

1. Get it from https://axoniq.io/download
2. To run it :
- Either :
  - Unzip it to the location of your choice. 
  - Navigate to the location & run it using the command ` java -jar axonserver.jar `
- Or :
  - Run it on Docker `docker run -d --name axonserver -p 8024:8024 -p 8124:8124 axoniq/axonserver`
3. Go to 'localhost:8024' to see Axon Server running.
---

H2 Console

Go to : http://localhost:8081/h2-console/