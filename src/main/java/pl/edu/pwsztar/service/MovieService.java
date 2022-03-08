package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.dto.DetailsMovieDto;
import pl.edu.pwsztar.domain.dto.MovieDto;

import java.util.List;

public interface MovieService {

    List<MovieDto> findAll();

    List<MovieDto> findAllByOrderByYearDesc();
    void creatMovie(CreateMovieDto createMovieDto);
    void deleteMovie(Long movieId);

    DetailsMovieDto getMovieDetails(Long movieId);
}
