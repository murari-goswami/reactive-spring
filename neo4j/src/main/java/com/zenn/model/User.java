package com.zenn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@NodeEntity
public class User {

    @Id
    private Long id;
    private String name;
    private Integer age;
    @Relationship(type = "RATED", direction = Relationship.Direction.INCOMING)
    private List<Movie> movies;

}
