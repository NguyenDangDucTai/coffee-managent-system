package com.kenobi.cafe.controllers;

import com.kenobi.cafe.service.DashboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboards")
@RequiredArgsConstructor
public class DashboardController {
    private final DashboardService dashboardService;
}
