package Projects.parkinglot.models;

import Projects.parkinglot.strategies.BillingStrategy;

import java.time.LocalDateTime;
import java.util.List;

public class Bill {
    private LocalDateTime exitTime;
    private Ticket ticket;
    private Float billPayment;
    private BillingStatus billingStatus;
    private List<Payment> payments;
    private Gate gate;
    private Operator operator;

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Float getBillPayment() {
        return billPayment;
    }

    public void setBillPayment(Float billPayment) {
        this.billPayment = billPayment;
    }

    public BillingStatus getBillingStatus() {
        return billingStatus;
    }

    public void setBillingStatus(BillingStatus billingStatus) {
        this.billingStatus = billingStatus;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
