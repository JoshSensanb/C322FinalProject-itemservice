package edu.iu.c322.group10.refundservice.model;


public class Refund {

    private int orderId;

    private int customerId;

    private String reason;

    private Status status;

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getReason() {
        return reason;
    }

    public Status getStatus() {
        return status;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
