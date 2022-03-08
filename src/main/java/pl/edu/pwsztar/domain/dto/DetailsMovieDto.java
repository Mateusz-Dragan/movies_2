package pl.edu.pwsztar.domain.dto;

public class DetailsMovieDto {
  private String title;
  private String videoId;

  public DetailsMovieDto(String title, String videoId) {
    this.title = title;
    this.videoId = videoId;
  }

  public String getTitle() {
    return title;
  }

  public String getVideoId() {
    return videoId;
  }
}
