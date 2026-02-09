package behaviouralDesignPatterns.chainOfResponsibilityPattern;

public class Client {
    public static void main(String[] args){

        LeaveApprover teamLead= new TeamLead();
        LeaveApprover manager= new Manager();
        LeaveApprover director= new Director();

        teamLead.setNext(manager);
        manager.setNext(director);

        teamLead.approveLeave(13);
        teamLead.approveLeave(1);
        teamLead.approveLeave(4);
    }
}
