package com.tiklup.anime.dto;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Meta {

    @JsonProperty("page")
    private Integer page;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("totalData")
    private Integer totalData;
    @JsonProperty("totalPage")
    private Integer totalPage;

    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("totalData")
    public Integer getTotalData() {
        return totalData;
    }

    @JsonProperty("totalData")
    public void setTotalData(Integer totalData) {
        this.totalData = totalData;
    }

    @JsonProperty("totalPage")
    public Integer getTotalPage() {
        return totalPage;
    }

    @JsonProperty("totalPage")
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "page=" + page +
                ", size=" + size +
                ", totalData=" + totalData +
                ", totalPage=" + totalPage +
                '}';
    }
}