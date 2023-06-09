package com.example.models.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieGenre {
    private Integer mgId;
    private Integer movieId;
    private Integer genreId;
}
