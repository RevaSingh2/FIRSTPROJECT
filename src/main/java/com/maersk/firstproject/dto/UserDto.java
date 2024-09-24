package com.maersk.firstproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

//the UserDto class  is a convenient way to represent and transfer data in a structured format,
// with annotations that aid in JSON serialization/deserialization and reduce boilerplate code.

@Data
@Getter
@Setter
public class UserDto {

    @JsonProperty("name")
    @NonNull
    private String name;

    @JsonProperty("city")
    @NonNull
    private String city;

    @JsonProperty("status")
    @NonNull
    private int status ;


}
