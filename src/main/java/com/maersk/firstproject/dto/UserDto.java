package com.maersk.firstproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

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
