package com.backendmaximo.controllers;

import com.backendmaximo.entities.WorkOrder;
import com.backendmaximo.services.WorkOrderService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/workorders")
public class WorkOrderController {

    private final WorkOrderService workOrderService;

    public WorkOrderController(WorkOrderService workOrderService) {
        this.workOrderService = workOrderService;
    }

    @GetMapping
    public List<WorkOrder> getAll() {
        return workOrderService.findAll();
    }

    @GetMapping("/{id}")
    public WorkOrder getById(@PathVariable Long id) {
        return workOrderService.findById(id);
    }

    @PostMapping
    public WorkOrder create(@RequestBody WorkOrder workOrder) {
        return workOrderService.save(workOrder);
    }

    @PutMapping("/{id}")
    public WorkOrder update(@PathVariable Long id, @RequestBody WorkOrder workOrder) {
        workOrder.setWoId(id);
        return workOrderService.save(workOrder);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        workOrderService.delete(id);
    }
}
