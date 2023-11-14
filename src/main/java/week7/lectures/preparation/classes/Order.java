package week7.lectures.preparation.classes;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Order {
    private String orderNo;
    private Date createAt;
    private List<HashMap<Item, Integer>> items;

    public Order(String orderNo, Date createAt, List<HashMap<Item, Integer>> items) {
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

    public List<HashMap<Item, Integer>> getItems() {
        return items;
    }

    public void setItems(List<HashMap<Item, Integer>> items) {
        this.items = items;
    }
}
