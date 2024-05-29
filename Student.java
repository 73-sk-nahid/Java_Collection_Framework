

public class Student implements Comparable<Student>{
    String Name;
    int rollNo;

    public Student(String Name, int rollNo){
        this.Name = Name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student [Name=" + Name + ", rollNo=" + rollNo + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollNo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return rollNo == other.rollNo;
    }

    @Override
    public int compareTo(Student that) {
        //return this.rollNo - that.rollNo;  //if want to sort using roll no
        return this.Name.compareTo(that.Name);  //if want to sort using name
    }
    
    
}   
