package com.tiklup.anime.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Datum {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("alternativeTitles")
    private List<String> alternativeTitles;
    @JsonProperty("ranking")
    private Integer ranking;
    @JsonProperty("genres")
    private List<String> genres;
    @JsonProperty("episodes")
    private Integer episodes;
    @JsonProperty("hasEpisode")
    private Boolean hasEpisode;
    @JsonProperty("hasRanking")
    private Boolean hasRanking;
    @JsonProperty("image")
    private String image;
    @JsonProperty("link")
    private String link;
    @JsonProperty("status")
    private String status;
    @JsonProperty("synopsis")
    private String synopsis;
    @JsonProperty("thumb")
    private String thumb;
    @JsonProperty("type")
    private String type;

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("alternativeTitles")
    public List<String> getAlternativeTitles() {
        return alternativeTitles;
    }

    @JsonProperty("alternativeTitles")
    public void setAlternativeTitles(List<String> alternativeTitles) {
        this.alternativeTitles = alternativeTitles;
    }

    @JsonProperty("ranking")
    public Integer getRanking() {
        return ranking;
    }

    @JsonProperty("ranking")
    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    @JsonProperty("genres")
    public List<String> getGenres() {
        return genres;
    }

    @JsonProperty("genres")
    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    @JsonProperty("episodes")
    public Integer getEpisodes() {
        return episodes;
    }

    @JsonProperty("episodes")
    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }

    @JsonProperty("hasEpisode")
    public Boolean getHasEpisode() {
        return hasEpisode;
    }

    @JsonProperty("hasEpisode")
    public void setHasEpisode(Boolean hasEpisode) {
        this.hasEpisode = hasEpisode;
    }

    @JsonProperty("hasRanking")
    public Boolean getHasRanking() {
        return hasRanking;
    }

    @JsonProperty("hasRanking")
    public void setHasRanking(Boolean hasRanking) {
        this.hasRanking = hasRanking;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("synopsis")
    public String getSynopsis() {
        return synopsis;
    }

    @JsonProperty("synopsis")
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @JsonProperty("thumb")
    public String getThumb() {
        return thumb;
    }

    @JsonProperty("thumb")
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", alternativeTitles=" + alternativeTitles +
                ", ranking=" + ranking +
                ", genres=" + genres +
                ", episodes=" + episodes +
                ", hasEpisode=" + hasEpisode +
                ", hasRanking=" + hasRanking +
                ", image='" + image + '\'' +
                ", link='" + link + '\'' +
                ", status='" + status + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", thumb='" + thumb + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}