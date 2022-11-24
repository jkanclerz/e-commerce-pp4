package pl.jkanclerz.sales;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CustomerInfo {
    private String firstname;
    private String lastname;
    private String email;


}
