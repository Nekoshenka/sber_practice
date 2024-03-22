package Book;

public class Author {

    private String name;

    private boolean isMale;

    private String email;

    public Author(String name, boolean isMale, String email) {
        this.name = name;
        this.isMale = isMale;
        this.email = email;
        System.out.println("Author Created.");
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        String sex;
        if (isMale) {
            sex = "Мужчина";
        } else {
            sex = "Женщина";
        }
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public void getInfo() {

        System.out.println("\nName: " + getName()
        + "\nSex: " + getSex()
        + "\nEmail: " + getEmail());

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(boolean isMale) {
        this.isMale = isMale;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
