package com.customer.entities;

public class Response {
	
	private int Status;
	private int ErrorCode;
	private String MessageType;
	private String Message;
	private CustomerDetails CustomerDetails;
	
	
	/**
	 * @param status
	 * @param errorCode
	 * @param messageType
	 * @param message
	 */
	
	public Response(int status, int errorCode, String messageType, String message,
			CustomerDetails customerDetails2) {
		super();
		Status = status;
		ErrorCode = errorCode;
		MessageType = messageType;
		Message = message;
		this.CustomerDetails = customerDetails2;
	}
	public Response() {
		
		// TODO Auto-generated constructor stub
	}
	
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public int getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(int errorCode) {
		ErrorCode = errorCode;
	}
	public String getMessageType() {
		return MessageType;
	}
	public void setMessageType(String messageType) {
		MessageType = messageType;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public CustomerDetails getCustomerDetails() {
		return CustomerDetails;
	}
	public void setCustomerDetails(CustomerDetails customerDetails) {
		CustomerDetails = (com.customer.entities.CustomerDetails) customerDetails;
	}
	@Override
	public String toString() {
		return "Response [Status=" + Status + ", ErrorCode=" + ErrorCode + ", MessageType=" + MessageType + ", Message="
				+ Message + ", CustomerDetails=" + CustomerDetails + "]";
	}
	
	

}
