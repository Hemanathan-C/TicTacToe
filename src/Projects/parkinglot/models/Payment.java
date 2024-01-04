package Projects.parkinglot.models;

import Exercise.Day136.FacadeBooking.Models.PaymentStatus;

import java.time.LocalDateTime;

public class Payment {
    private PaymentMode mode;
    private Float amount;
    private int refNumber;
    private LocalDateTime time;
    private PaymentStatus status;

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public int getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(int refNumber) {
        this.refNumber = refNumber;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
