package behaviouralDesignPatterns.chainOfResponsibilityPattern;

public interface LeaveApprover {
    void setNext(LeaveApprover leaveApprover);
    void approveLeave(int days);
}
