package com.kenobi.cafe.controllers;

import com.kenobi.cafe.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorys")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
}
