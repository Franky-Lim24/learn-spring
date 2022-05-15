# Spring Boot

An exploratory project to learn about Spring Boot framework for backend development

## PreRequisite

- Install Java 18 from Oracle
- Install Java Extension from VSCode
- Install Maven

## Create a new project

- Use Spring Initializr to Create a project
- Comment out JPA dependency
- Run mvn spring-boot:run

## API Layer

- Create a Controller
- Annotate with RestController and RequestMapping(path = "/api/v1/Something")
- Create a method
- Annotate with Mapping

## Business Layer

- Create a Service and annotate with Service
- Create a method
- Create dependency injection using Autowired

## Data Layer with JPA

- Edit application properties to add connection props
- Uncomment Dependency
- Create Repository extends JpaRepository<Type, ID>
- Create Config and annotate with Configuration
- Create CommandLineRunner and Annotate with Bean
- Create Instances and use saveAll
