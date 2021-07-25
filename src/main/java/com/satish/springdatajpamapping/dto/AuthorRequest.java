package com.satish.springdatajpamapping.dto;

import com.satish.springdatajpamapping.model.Author;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthorRequest {

    private Author author;
}
