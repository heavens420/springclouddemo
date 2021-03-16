package tk.zlx.springcloud.service;

import org.apache.ibatis.annotations.Param;
import tk.zlx.springcloud.entries.Payment;

public interface PaymentService {
    int create(Payment payment);
    Payment findPaymentById(@Param("id") Long id);
}
