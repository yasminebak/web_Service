package ProductService.DTO;

public class TransferDTO {
	private String srcIban;
	private String desIban;
	private Double amount;

	public TransferDTO() {

	}

	public TransferDTO(String srcIban, String desIban, Double amount) {
		this.srcIban = srcIban;
		this.desIban = desIban;
		this.amount = amount;
	}

	public String getSrcIban() {
		return srcIban;
	}

	public void setSrcIban(String srcIban) {
		this.srcIban = srcIban;
	}

	public String getDesIban() {
		return desIban;
	}

	public void setDesIban(String desIban) {
		this.desIban = desIban;
	}


	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
