package behaviouralDesignPatterns.chainOfResponsibilityPattern;

public class Manager extends BaseLeaveApprover{
    @Override
    public void approveLeave(int days) {
        if(days<=5){
            System.out.println("Manager approved leaves for "+ days +" days");
        }else if(next!=null){
            next.approveLeave(days);
        }
    }
}
