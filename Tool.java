public class Tool {
	private String productName;
	private Integer quantity;
	private Double unitPrice;
	
	public Tool() {}

	public Tool(String productName, Integer quantity, Double unitPrice) {
		this.productName = productName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public String getProductName() {
		return productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setProductName(String pName) {
		this.productName = pName;
	}
}


