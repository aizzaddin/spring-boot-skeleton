package com.wildanaizzaddin.todolist.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RegisterDto {
    private String name;
    private String email;
    private String password;
}
