
package com.example.hackathoncontests.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ContestResponse {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("start_time")
    @Expose
    private String startTime;
    @SerializedName("end_time")
    @Expose
    private String endTime;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("site")
    @Expose
    private String site;
    @SerializedName("in_24_hours")
    @Expose
    private String in24Hours;
    @SerializedName("status")
    @Expose
    private String status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContestResponse() {
    }

    /**
     * 
     * @param duration
     * @param site
     * @param name
     * @param in24Hours
     * @param startTime
     * @param endTime
     * @param url
     * @param status
     */
    public ContestResponse(String name, String url, String startTime, String endTime, String duration, String site, String in24Hours, String status) {
        super();
        this.name = name;
        this.url = url;
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = duration;
        this.site = site;
        this.in24Hours = in24Hours;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getIn24Hours() {
        return in24Hours;
    }

    public void setIn24Hours(String in24Hours) {
        this.in24Hours = in24Hours;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
