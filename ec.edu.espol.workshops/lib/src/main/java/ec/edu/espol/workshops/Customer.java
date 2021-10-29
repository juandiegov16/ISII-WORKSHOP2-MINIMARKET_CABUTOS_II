package ec.edu.espol.workshops;

public class Customer {
	private int age;
    private String sex;
    private boolean isMarried;
    private boolean hasdrivingLicense;
    private int base;
    
    /*
     * Constructor cliente
     * */
    public Customer(int age, String sex, boolean estadoMarital, boolean licencia) {
        this.age = age;
        this.sex = sex;
        this.isMarried = estadoMarital;
        this.hasdrivingLicense = licencia;
        this.base = 500;
    }

    



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.isMarried = maritalStatus;
    }

    public boolean hasDrivingLicense() {
        return hasdrivingLicense;
    }

    public void setDrivingLicense(boolean drivingLicense) {
        this.hasdrivingLicense = drivingLicense;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

}
