package Projects.parkinglot.models;

public class Gate {
    private GateType gatetype;
    private int gateNumber;
    private Operator operator;
    private GateStatus gateStatus;

    public GateType getGatetype() {
        return gatetype;
    }

    public void setGatetype(GateType gatetype) {
        this.gatetype = gatetype;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
