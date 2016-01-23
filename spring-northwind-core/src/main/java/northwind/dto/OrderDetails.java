package northwind.dto;
// Generated Jan 22, 2016 12:15:57 AM by Hibernate Tools 4.0.0

/**
 * OrderDetails generated by hbm2java
 */
public class OrderDetails implements java.io.Serializable {

	private static final long serialVersionUID = -5556486651936121973L;

	private OrderDetailsId id;
	private float unitPrice;
	private short quantity;
	private float discount;

	public OrderDetails() {
	}

	public OrderDetails(OrderDetailsId id, float unitPrice, short quantity, float discount) {
		this.id = id;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.discount = discount;
	}

	public OrderDetailsId getId() {
		return this.id;
	}

	public void setId(OrderDetailsId id) {
		this.id = id;
	}

	public float getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public short getQuantity() {
		return this.quantity;
	}

	public void setQuantity(short quantity) {
		this.quantity = quantity;
	}

	public float getDiscount() {
		return this.discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
}