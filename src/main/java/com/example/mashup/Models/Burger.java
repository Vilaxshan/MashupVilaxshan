package com.example.mashup.Models;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "restaurant",
        "web",
        "description",
        "ingredients",
        "addresses"

})
public class Burger {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("restaurant")
    private String restaurant;
    @JsonProperty("web")
    private String web;
    @JsonProperty("description")
    private String description;

    @JsonProperty("ingredients")
    private ArrayList<String> ingredients;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("restaurant")
    public String getRestaurant() {
        return restaurant;
    }

    @JsonProperty("restaurant")
    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    @JsonProperty("web")
    public String getWeb() {
        return web;
    }

    @JsonProperty("web")
    public void setWeb(String web) {
        this.web = web;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("ingredients")
    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    @JsonProperty("ingredients")
    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

