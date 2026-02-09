package behaviouralDesignPatterns.chainOfResponsibilityPattern;

public class TeamLead extends BaseLeaveApprover{
    @Override
    public void approveLeave(int days) {
        if(days<=2){
            System.out.println("team lead approved leaves for "+ days+" days");
        }else if(next!=null){
            next.approveLeave(days);
        }
    }
}
