package database.spring.data.Utils

import database.spring.data.Dto.MovieDTO
import database.spring.data.entity.Movie

class MovieMapper: Mapper<MovieDTO, Movie> {
    override fun toEntity(domain: MovieDTO): Movie = Movie(
        domain.id,
        domain.name,
        domain.rating
    )

    override fun fromEntity(entity: Movie): MovieDTO = MovieDTO(
        entity.id,
        entity.name,
        entity.rating
    )
}