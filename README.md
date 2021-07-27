# Spring-Data-JPA-Hibernate-One-To-Many-Mapping

Author and Book One to Many Relationship

![alt text](https://github.com/satishkumar11/Spring-Data-JPA-Hibernate-One-To-Many-Mapping/blob/master/src/main/resources/images/onetomany-relation.png)



```json
POST - localhost:7770/author
{
    "author": {
        "name": "Dennis Ritchie",
        "books": [
            {
                "title": "The C Programming Language. 2nd Edition"
            },
            {
                "title": "Programmieren in C. ANSI"
            }
        ]
    }
}
```
