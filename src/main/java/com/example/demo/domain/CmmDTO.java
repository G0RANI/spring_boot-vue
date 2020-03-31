package com.example.demo.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * CmmDomain
 */
@Component
@Getter@Setter@ToString@Lazy
public class CmmDTO {
    private String test;
}