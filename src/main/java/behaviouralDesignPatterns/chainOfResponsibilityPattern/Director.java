package behaviouralDesignPatterns.chainOfResponsibilityPattern;

public class Director extends BaseLeaveApprover {
    @Override
    public void approveLeave(int days) {

        System.out.println("Director approved leaves for " + days + " days");

    }
}
