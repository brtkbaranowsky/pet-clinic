package com.baranowski.bartosz.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class BaseEntity implements Serializable {
    private Long id;


}
