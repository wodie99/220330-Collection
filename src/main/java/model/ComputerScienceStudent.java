package model;

public class ComputerScienceStudent extends Student implements Citizen {
    protected String favoritProgramLanguage;
    protected String adress;
    protected int identityCardNumber;

    public ComputerScienceStudent(String name, int id) {
        super(name, id);
    }

    public int getAge() {
        return age;
    }

    public ComputerScienceStudent(String name, int id, String favoritProgramLanguage) {
        super(name, id);
        this.favoritProgramLanguage = favoritProgramLanguage;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "adress='" + adress + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public String getAdress() {
        return null;
    }


    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public int getIdentityCardNumber() {
        return 0;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }
}
