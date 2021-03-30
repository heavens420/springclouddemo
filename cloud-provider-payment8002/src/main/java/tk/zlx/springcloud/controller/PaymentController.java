package tk.zlx.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import tk.zlx.springcloud.entries.CommonResult;
import tk.zlx.springcloud.entries.Payment;
import tk.zlx.springcloud.service.PaymentService;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("payment插入结果："+result);

        if (result > 0){
            return new CommonResult(200, "插入成功", result);
        }else {
            return new CommonResult(400, "插入失败", null);
        }
    }

    @GetMapping("/{id}")
    public CommonResult findPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.findPaymentById(id);
        log.info("查询结果："+payment);
        if (payment != null){
            return new CommonResult(200, "查询成功"+port, payment);
        }else {
            return new CommonResult(400, "查询失败", null);
        }
    }

}
