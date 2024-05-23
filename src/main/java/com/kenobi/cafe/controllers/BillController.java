package com.kenobi.cafe.controllers;

import com.kenobi.cafe.pojo.Bill;
import com.kenobi.cafe.service.BillService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/bills")
@RequiredArgsConstructor
public class BillController {

    private final BillService billService;

    @PostMapping("/generate-report")
    public ResponseEntity<String> generateReport(@RequestBody Map<String, Object> requestMap) {
        try {
            return billService.generateReport(requestMap);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return ResponseEntity.internalServerError().body("Something went wrong");
    }

    @GetMapping
    public ResponseEntity<List<Bill>> getBills() {
        try {
            System.out.println("GetBill");
            return billService.getBills();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return ResponseEntity.internalServerError().body(null);
    }

    @PostMapping("/pdf")
    public ResponseEntity<byte[]> getPdf(@RequestBody Map<String, Object> requestMap) {
        try {
            return billService.getPdf(requestMap);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return ResponseEntity.internalServerError().body(new byte[0]);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBill(@PathVariable Integer id) {
        try {
            return billService.deleteBill(id);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return ResponseEntity.internalServerError().body("Something went wrong");
    }

}
