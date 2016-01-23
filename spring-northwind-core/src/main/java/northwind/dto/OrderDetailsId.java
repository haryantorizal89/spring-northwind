package northwind.dto;
// Generated Jan 22, 2016 12:15:57 AM by Hibernate Tools 4.0.0

/**
 * OrderDetailsId generated by hbm2java
 */
public class OrderDetailsId implements java.io.Serializable {

	private static final long serialVersionUID = -8519734995100109654L;
	private short orderId;
	private short productId;

	public OrderDetailsId() {
	}

	public OrderDetailsId(short orderId, short productId) {
		this.orderId = orderId;
		this.productId = productId;
	}

	public short getOrderId() {
		return this.orderId;
	}

	public void setOrderId(short orderId) {
		this.orderId = orderId;
	}

	public short getProductId() {
		return this.productId;
	}

	public void setProductId(short productId) {
		this.productId = productId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrderDetailsId))
			return false;
		OrderDetailsId castOther = (OrderDetailsId) other;

		return (this.getOrderId() == castOther.getOrderId()) && (this.getProductId() == castOther.getProductId());
	}

	public int hashCode() {
		int result = 17;
		result = 37 * result + this.getOrderId();
		result = 37 * result + this.getProductId();
		return result;
	}
}