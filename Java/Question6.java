/*
    Implement a banking system using java. Create 3 sub class of Bank :
    SBI, BOI, ICICI Classes should have attributes like Name, headofficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate.
    All 3 should have following methods:
    1. add getters and setters for the fields
    2. print details of every bank (override toString)
 */
class Bank {
    protected String name;
    protected String headOfficeAddress;
    protected String chairmanName;
    protected int branchCount;
    protected double fdInterestRate;
    protected double personalLoanInterestRate;
    protected double homeLoanInterestRate;

    public Bank(String name, String headOfficeAddress, String chairmanName, int branchCount,
                double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }
    public String getName() {
        return name;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    @Override
    public String toString() {
        return "SBI Details:\n" +
                "Name: " + name + "\n" +
                "Head Office: " + headOfficeAddress + "\n" +
                "Chairman: " + chairmanName + "\n" +
                "Branches: " + branchCount + "\n" +
                "FD Interest Rate: " + fdInterestRate + "%\n" +
                "Personal Loan Interest Rate: " + personalLoanInterestRate + "%\n" +
                "Home Loan Interest Rate: " + homeLoanInterestRate + "%\n";
    }
}

class SBI extends Bank {
    public SBI(String chairmanName, int branchCount) {
        super("Bank of India", "Mumbai, India", chairmanName, branchCount,
                5.2, 10.0, 7.8);
    }

    @Override
    public String toString() {
        return "SBI Details:\n" +
                "Name: " + name + "\n" +
                "Head Office: " + headOfficeAddress + "\n" +
                "Chairman: " + chairmanName + "\n" +
                "Branches: " + branchCount + "\n" +
                "FD Interest Rate: " + fdInterestRate + "%\n" +
                "Personal Loan Interest Rate: " + personalLoanInterestRate + "%\n" +
                "Home Loan Interest Rate: " + homeLoanInterestRate + "%\n";
    }
}

class BOI extends Bank {
    public BOI(String chairmanName, int branchCount) {
        super("Bank of India", "Mumbai, India", chairmanName, branchCount,
                5.2, 10.0, 7.8);
    }

    @Override
    public String toString() {
        return "BOI Details:\n" +
                "Name: " + name + "\n" +
                "Head Office: " + headOfficeAddress + "\n" +
                "Chairman: " + chairmanName + "\n" +
                "Branches: " + branchCount + "\n" +
                "FD Interest Rate: " + fdInterestRate + "%\n" +
                "Personal Loan Interest Rate: " + personalLoanInterestRate + "%\n" +
                "Home Loan Interest Rate: " + homeLoanInterestRate + "%\n";
    }
}

class ICICI extends Bank {
    public ICICI(String chairmanName, int branchCount) {
        super("ICICI Bank", "Mumbai, India", chairmanName, branchCount,
                5.6, 11.0, 7.5);
    }

    @Override
    public String toString() {
        return "ICICI Details:\n" +
                "Name: " + name + "\n" +
                "Head Office: " + headOfficeAddress + "\n" +
                "Chairman: " + chairmanName + "\n" +
                "Branches: " + branchCount + "\n" +
                "FD Interest Rate: " + fdInterestRate + "%\n" +
                "Personal Loan Interest Rate: " + personalLoanInterestRate + "%\n" +
                "Home Loan Interest Rate: " + homeLoanInterestRate + "%\n";
    }
}

public class Question6 {
    public static void main(String[] args) {
        SBI sbi = new SBI("Shashank Pandey", 1300);
        BOI boi = new BOI("Shashank pandey", 10230);
        ICICI icici = new ICICI("Shashank Pandey", 5300);

        System.out.println(sbi);
        System.out.println(boi);
        System.out.println(icici);
    }
}
