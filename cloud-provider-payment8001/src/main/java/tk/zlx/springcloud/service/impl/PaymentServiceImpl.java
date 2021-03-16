package tk.zlx.springcloud.service.impl;

import org.springframework.stereotype.Service;
import tk.zlx.springcloud.dao.PaymentDao;
import tk.zlx.springcloud.entries.Payment;
import tk.zlx.springcloud.service.PaymentService;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment findPaymentById(Long id) {
        return paymentDao.findPaymentById(id);
    }
}
