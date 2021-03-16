package tk.zlx.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tk.zlx.springcloud.entries.Payment;

@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment findPaymentById(@Param("id") Long id);
}
