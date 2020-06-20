package io.groud.spring.restdocs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述：
 *
 * @author Li.Wei by 2020/6/20
 */
@RestController("/order")
public class OrderController {

    @GetMapping("/getOrder/{id}")
    public Order getOrder(@PathVariable int id) {
        return new Order(id, 1, new Object().toString());
    }

    @GetMapping("/listOrder")
    public List<Order> listOrder() {
        List<Order> r = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            r.add(new Order(i, 1, new Object().toString()));
        }
        return r;
    }

    @GetMapping("/mapOrder")
    public Map<Integer, Order> mapOrder() {
        Map<Integer, Order> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, new Order(i, 1, "my id is " + i));
        }
        return map;
    }

}
