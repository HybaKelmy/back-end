package com.backendmaximo.services;

import com.backendmaximo.entities.WorkOrder;
import com.backendmaximo.repositories.WorkOrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WorkOrderService {

    private final WorkOrderRepository workOrderRepository;

    public WorkOrderService(WorkOrderRepository workOrderRepository) {
        this.workOrderRepository = workOrderRepository;
    }

    public List<WorkOrder> findAll() {
        return workOrderRepository.findAll();
    }

    public WorkOrder findById(Long id) {
        return workOrderRepository.findById(String.valueOf(id)).orElse(null);
    }

    public WorkOrder save(WorkOrder workOrder) {
        return workOrderRepository.save(workOrder);
    }

    public void delete(Long id) {
        workOrderRepository.deleteById(String.valueOf(id));
    }
}
