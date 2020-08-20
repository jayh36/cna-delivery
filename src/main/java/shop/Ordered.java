
package shop;

public class Ordered extends AbstractEvent {
//MSA 계약서 맵핑 서로 변경못하도록...못들었어
    private Long id;
    private String productId;
    private Integer qty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}
