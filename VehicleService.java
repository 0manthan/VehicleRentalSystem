import java.sql.*;

public class VehicleService
{

    public void addVehicle(String name)
    {
        try(Connection con = DBConnection.getConnection())
        {
            PreparedStatement ps = con.prepareStatement("INSERT INTO vehicles(name, status) VALUES(?, 'available')");
            ps.setString(1, name);
            ps.executeUpdate();
            System.out.println("Vehicle added!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void viewVehicles()
    {
        try(Connection con = DBConnection.getConnection())
        {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM vehicles");

            while(rs.next())
            {
                System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void rentVehicle(int id)
    {
        try(Connection con = DBConnection.getConnection())
        {
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE vehicles SET status='rented' WHERE id=? AND status='available'"
            );
            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if(rows > 0)
            {
                System.out.println("Vehicle rented!");
            }
            else
            {
                System.out.println("Vehicle not available or invalid ID!");
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void returnVehicle(int id)
    {
        try(Connection con = DBConnection.getConnection())
        {
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE vehicles SET status='available' WHERE id=?"
            );
            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if(rows > 0)
            {
                System.out.println("Vehicle returned!");
            }
            else
            {
                System.out.println("Invalid vehicle ID!");
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void viewRentals(){
        viewVehicles();
    }
}
