package com.satish.springdatajpamapping.dto;

import com.satish.springdatajpamapping.model.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookRequest {
    private Book book;
}
