package miu.edu.cse.pageabledtodemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequestDto {
    private String title;
    private String ISBN;
    private LocalDate publishedLocalDate;
    private BigDecimal price;
}
