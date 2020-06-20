package io.groud.spring.restdocs;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 订单实体
 *
 * @author Li.Wei by 2020/6/20
 */
@Data
@AllArgsConstructor
public class Order {

    private int id;
    private int type;
    private String desc;

}
