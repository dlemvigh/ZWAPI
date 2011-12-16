package zwapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import zwapi.events.ZWBasicListener;
import zwapi.events.ZWEvent;
import zwapi.nodes.ZWEZMotionSensor;

public class ZWSQLLogger implements ZWBasicListener {
    
    Connection conn = null;
    Statement stmt;
    
    public ZWSQLLogger() {
        try {
            Class.forName("com.mysql.jdbc.Driver");//load the mysql driver
            conn = DriverManager.getConnection("jdbc:mysql://localhost/kiiib?user=KIIIB&password=42");//connect to the database
            stmt = conn.createStatement();
        }
        catch (SQLException se){
            System.out.println("SQLException: " + se.getMessage());
            System.out.println("SQLState: " + se.getSQLState());
            System.out.println("VendorError: " + se.getErrorCode());
 
        }
        catch (Exception e){
             e.printStackTrace();
       }
    }

    @Override
    public void ZWBasicEventOccurred(ZWEvent event) {
        // TODO Auto-generated method stub
        ZWEZMotionSensor sensor = (ZWEZMotionSensor) event.getSource();
        sensorEvent(sensor.getID());
    }

    private void sensorEvent(int sensorId){
        try{
            System.out.println("Sensor "+sensorId+" fired!");        
            stmt.executeUpdate("INSERT INTO sensor_events VALUES("+sensorId+",NOW())");
        }
        catch(SQLException se){
            System.out.println("SQLException: " + se.getMessage());
            System.out.println("SQLState: " + se.getSQLState());
            System.out.println("VendorError: " + se.getErrorCode());
        }
    }
    

}
