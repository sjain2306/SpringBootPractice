import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {
    public static void main(String[] args) throws Exception {
    /*
     import package
     load and register
     create connection
     create statement
     execute statement
     process the results
     close
    */
        String url ="jdbc:postgresql://localhost:5432/demo";
        String uname ="postgres";
        String pass = "root";
//        String insert = "insert into student values(5,'Jatin',87)";
//        String update = "update student set sname='Max' where sid=5";
//        String delete ="delete from student where sid=5";
        int sid=6;
        String sname = "Shanu";
        int marks = 79;
        String insert = "insert into student values(?,?,?)";
        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");

        PreparedStatement st = con.prepareStatement(insert);
        st.setInt(1,sid);
        st.setString(2,sname);
        st.setInt(3,marks);

        st.execute();





        con.close();
        System.out.println("Connection closed");

    }
}
