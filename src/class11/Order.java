package class11;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Order {

    private UUID id;
    private List <Goods> goodsList;
    private LocalDate dateOfOrder;

    public Order(List<Goods> goodsList) {
        this.id = UUID.randomUUID();
        this.goodsList = goodsList;
        this.dateOfOrder = LocalDate.now();
    }

    @Override
    public String toString() {
        return id + " " + goodsList + " " + dateOfOrder;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }
}
