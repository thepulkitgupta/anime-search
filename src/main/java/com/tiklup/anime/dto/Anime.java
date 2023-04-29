package com.tiklup.anime.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.tiklup.anime.dto.Datum;
import com.tiklup.anime.dto.Meta;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class Anime {

    @JsonProperty("data")
    private List<Datum> data;
    @JsonProperty("meta")
    private Meta meta;

    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum> data) {
        this.data = data;
    }

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "data=" + data +
                ", meta=" + meta +
                '}';
    }
}


