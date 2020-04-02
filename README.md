# onlinebookstore
we Start in this project by creating a Spring Boot Project named onlinebookstore on in.nahed Groupe
I Add the below dependencie:
Spring DataJPA
RestRepositories
Lombok
MySql Driver

And then I configure the application.properties file

in the Next Step,
I have created the Book & Category Entity and put the relation ship between them 
in Book there is an attribute category of BookCategory annotated with ManyToOne 
although in BookCategory class there is an attribute book of Book annotated with OnToMany 
