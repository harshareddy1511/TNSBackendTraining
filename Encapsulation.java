//java code to implement Encapsulation
public class DemoStudent {
    private int sid;
    private String sname;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void display() {
        System.out.println("The Student details are: " + sid + " " + sname);
    }
    public static void main(String[] args){
        DemoStudent obj = new DemoStudent();
        obj.setSid(101);
        obj.setSname("Harsha");
        System.out.println(obj.getSid());
        System.out.println(obj.getSname());

        // The following lines are not recommended as sid and sname are private
        // obj.sid=101;
        // obj.sname="Harsha Reddy";
        obj.display();
    }
}

