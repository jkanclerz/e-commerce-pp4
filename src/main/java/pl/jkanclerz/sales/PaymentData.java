package pl.jkanclerz.sales;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentData {
    String paymentId;
    String reservationId;
    String url;
}
