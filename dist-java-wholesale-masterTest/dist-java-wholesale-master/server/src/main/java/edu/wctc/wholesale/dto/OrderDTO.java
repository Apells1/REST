package edu.wctc.wholesale.dto;
import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
@Data
@NoArgConstructor
public class OrderDTO {
    private String customerName;
    private LocalDate date;
    Private String terms;
    private String ProductName;
    private String poNumber;
    private LocalDate shipped;
    private double total;
}
