package Contact;

public class Contact {


    protected String surname;
    protected String name;
    protected String fname;
    protected String birthdate;
    protected String phone;
    protected String sex;


    public Contact(String surname, String name, String fname, String birthdate, String phone, String sex) {
        this.surname = surname;
        this.name = name;
        this.fname = fname;
        this.birthdate = birthdate;
        this.phone = phone;
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getFname() {
        return fname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fname='" + fname + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
