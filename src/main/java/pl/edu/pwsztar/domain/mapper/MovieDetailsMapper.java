package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.dto.DetailsMovieDto;
import pl.edu.pwsztar.domain.entity.Movie;

@Component
public class MovieDetailsMapper {

    public DetailsMovieDto mapToEntity(Movie movie) {
        return new DetailsMovieDto(movie.getTitle(), movie.getVideoId());
    }

}
