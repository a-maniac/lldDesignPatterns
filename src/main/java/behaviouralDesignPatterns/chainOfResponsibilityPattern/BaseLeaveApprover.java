package behaviouralDesignPatterns.chainOfResponsibilityPattern;

public abstract class BaseLeaveApprover implements LeaveApprover{

    protected LeaveApprover next;
    @Override
    public void setNext(LeaveApprover nextLeaveApprover){
        this.next=nextLeaveApprover;
    }
}
