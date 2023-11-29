package com.geekbang.coupon.customer.feign;

import com.geekbang.coupon.calculation.api.beans.ShoppingCart;
import com.geekbang.coupon.calculation.api.beans.SimulationOrder;
import com.geekbang.coupon.calculation.api.beans.SimulationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "coupon-calculation-serv", path = "/calculator")
public interface CalculationService {

    @PostMapping("/checkout")
    ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart settlement);

    @PostMapping("/simulate")
    SimulationResponse simulate(@RequestBody SimulationOrder simulator);
}
