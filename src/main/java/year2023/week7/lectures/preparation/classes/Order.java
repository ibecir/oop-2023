package year2023.week7.lectures.preparation.classes;

import java.util.Date;
import java.util.HashMap;

public class Order {
    private String orderNo;
    private Date createAt;
    private HashMap<Item, Integer> items;

    public Order(String orderNo, Date createAt, HashMap<Item, Integer> items) {
        this.orderNo = orderNo;
        this.createAt = createAt;
        this.items = items;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public HashMap<Item, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<Item, Integer> items) {
        this.items = items;
    }
}
