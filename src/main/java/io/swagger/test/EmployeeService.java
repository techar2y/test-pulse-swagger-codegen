package io.swagger.test;

import io.swagger.mappers.EmployeeMapper;
import io.swagger.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Employee service for working with database
 */
@Service
public class EmployeeService implements IEmployeeService
{
    @Autowired
    EmployeeMapper employeeMapper;

    public final Integer CNT_NEXT_OFFSET = 100;

    @Override
    public ResponseEntity<List<Employee>> getAll (String cnt_offset)
    {
        try {

            Integer int_cnt_offset = Integer.parseInt(cnt_offset);
            Integer int_cnt_next = int_cnt_offset + CNT_NEXT_OFFSET;

            List<Employee> employees = employeeMapper.getAll(int_cnt_offset, int_cnt_next);
            if(employees.size() == 0) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(employees, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Map<String, Object>> getAvgSalary ()
    {
        try {

            Map<String, Object> avgCompanySalary = employeeMapper.getAvgSalary();
            if(avgCompanySalary == null) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(avgCompanySalary, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<List<Map<String, Object>>> getAvgSalaryByDepartment (String cnt_offset)
    {
        try {
            Integer int_cnt_offset = Integer.parseInt(cnt_offset);
            Integer int_cnt_next = int_cnt_offset + CNT_NEXT_OFFSET;

            List<Map<String, Object>> avgSalaryByDepartment = employeeMapper.getAvgSalaryByDepartment(int_cnt_offset, int_cnt_next);
            if(avgSalaryByDepartment.size() == 0) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(avgSalaryByDepartment, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<List<Map<String, Object>>> getAvgSalaryByPosition (String cnt_offset)
    {
        try {
            Integer int_cnt_offset = Integer.parseInt(cnt_offset);
            Integer int_cnt_next = int_cnt_offset + CNT_NEXT_OFFSET;

            List<Map<String, Object>> avgSalaryByPosition = employeeMapper.getAvgSalaryByPosition(int_cnt_offset, int_cnt_next);
            if(avgSalaryByPosition.size() == 0) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(avgSalaryByPosition, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
