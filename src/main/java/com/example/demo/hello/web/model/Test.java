package com.example.demo.hello.web.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("ali_item_price")
public class Test  implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String itemId;
    private String fpId;
}
