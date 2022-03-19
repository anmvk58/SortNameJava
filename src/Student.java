public class Student implements Comparable<Student>{
    int id;
    String fullName;
    String lastName;
    String middleName;
    String firstName;

    public Student( String fullName) {
        this.id = 1;
        this.firstName = Utils.extractFirstName(fullName);
        this.lastName = Utils.extractLastName(fullName);
        this.middleName = Utils.extractMiddleName(fullName);
        this.fullName = this.lastName + " " + this.middleName + this.firstName;
    }


    @Override
    public int compareTo(Student o) {
        if(firstName.compareTo(o.firstName) == 0){
            if(lastName.compareTo(o.lastName) == 0){
                return middleName.compareTo(o.middleName);
            } else {
                return lastName.compareTo(o.lastName);
            }
        }
        return firstName.compareTo(o.firstName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
