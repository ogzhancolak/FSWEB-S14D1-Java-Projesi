package com.workintech.inheritance.model.developercompany;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, int salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[3];
        midDevelopers = new MidDeveloper[3];
        seniorDevelopers = new SeniorDeveloper[3];
    }

    @Override
    public void work() {
        System.out.println("HR Manager");
        setSalary(getSalary() + 3500);
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        for(int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = juniorDeveloper;
                return;
            }
        }

        System.out.println("Junior Developer full");
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        for(int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = midDeveloper;
                return;
            }
        }

        System.out.println("Mid Developer full");
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        for(int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = seniorDeveloper;
                return;
            }
        }

        System.out.println("Senior Developer full");
    }
}
