==================================
package ;
public class Location
{
    private double Latitude;

    private double Longitude;

    public void setLatitude(double Latitude){
        this.Latitude = Latitude;
    }
    public double getLatitude(){
        return this.Latitude;
    }
    public void setLongitude(double Longitude){
        this.Longitude = Longitude;
    }
    public double getLongitude(){
        return this.Longitude;
    }
}

==================================
package ;
public class GeoSample
{
    private int Heading;

    private Location Location;

    public void setHeading(int Heading){
        this.Heading = Heading;
    }
    public int getHeading(){
        return this.Heading;
    }
    public void setLocation(Location Location){
        this.Location = Location;
    }
    public Location getLocation(){
        return this.Location;
    }
}

==================================
package ;
public class Request
{
    private String ClientAddress;

    private String Credentials;

    private String SessionCode;

    private GeoSample GeoSample;

    private String IncludeTopology;

    private String AsTurns;

    private String BearingType;

    private String MatchingMode;

    private String ReturnJSON;

    public void setClientAddress(String ClientAddress){
        this.ClientAddress = ClientAddress;
    }
    public String getClientAddress(){
        return this.ClientAddress;
    }
    public void setCredentials(String Credentials){
        this.Credentials = Credentials;
    }
    public String getCredentials(){
        return this.Credentials;
    }
    public void setSessionCode(String SessionCode){
        this.SessionCode = SessionCode;
    }
    public String getSessionCode(){
        return this.SessionCode;
    }
    public void setGeoSample(GeoSample GeoSample){
        this.GeoSample = GeoSample;
    }
    public GeoSample getGeoSample(){
        return this.GeoSample;
    }
    public void setIncludeTopology(String IncludeTopology){
        this.IncludeTopology = IncludeTopology;
    }
    public String getIncludeTopology(){
        return this.IncludeTopology;
    }
    public void setAsTurns(String AsTurns){
        this.AsTurns = AsTurns;
    }
    public String getAsTurns(){
        return this.AsTurns;
    }
    public void setBearingType(String BearingType){
        this.BearingType = BearingType;
    }
    public String getBearingType(){
        return this.BearingType;
    }
    public void setMatchingMode(String MatchingMode){
        this.MatchingMode = MatchingMode;
    }
    public String getMatchingMode(){
        return this.MatchingMode;
    }
    public void setReturnJSON(String ReturnJSON){
        this.ReturnJSON = ReturnJSON;
    }
    public String getReturnJSON(){
        return this.ReturnJSON;
    }
}

==================================
package ;
public class Items
{
    private int TimeToChange;

    private int Confidence;

    private String BulbColor;

    public void setTimeToChange(int TimeToChange){
        this.TimeToChange = TimeToChange;
    }
    public int getTimeToChange(){
        return this.TimeToChange;
    }
    public void setConfidence(int Confidence){
        this.Confidence = Confidence;
    }
    public int getConfidence(){
        return this.Confidence;
    }
    public void setBulbColor(String BulbColor){
        this.BulbColor = BulbColor;
    }
    public String getBulbColor(){
        return this.BulbColor;
    }
}

==================================
package ;
import java.util.ArrayList;
import java.util.List;
public class PredictiveChanges
{
    private List<Items> Items;

    public void setItems(List<Items> Items){
        this.Items = Items;
    }
    public List<Items> getItems(){
        return this.Items;
    }
}

==================================
package ;
public class Items
{
    private int PhaseNr;

    private String BulbColor;

    private PredictiveChanges PredictiveChanges;

    public void setPhaseNr(int PhaseNr){
        this.PhaseNr = PhaseNr;
    }
    public int getPhaseNr(){
        return this.PhaseNr;
    }
    public void setBulbColor(String BulbColor){
        this.BulbColor = BulbColor;
    }
    public String getBulbColor(){
        return this.BulbColor;
    }
    public void setPredictiveChanges(PredictiveChanges PredictiveChanges){
        this.PredictiveChanges = PredictiveChanges;
    }
    public PredictiveChanges getPredictiveChanges(){
        return this.PredictiveChanges;
    }
}

==================================
package ;
import java.util.ArrayList;
import java.util.List;
public class Phases
{
    private List<Items> Items;

    public void setItems(List<Items> Items){
        this.Items = Items;
    }
    public List<Items> getItems(){
        return this.Items;
    }
}

==================================
package ;
public class Items
{
    private String ManeuverType;

    private String SignalHeadIDs;

    public void setManeuverType(String ManeuverType){
        this.ManeuverType = ManeuverType;
    }
    public String getManeuverType(){
        return this.ManeuverType;
    }
    public void setSignalHeadIDs(String SignalHeadIDs){
        this.SignalHeadIDs = SignalHeadIDs;
    }
    public String getSignalHeadIDs(){
        return this.SignalHeadIDs;
    }
}

==================================
package ;
import java.util.ArrayList;
import java.util.List;
public class Maneuvers
{
    private List<Items> Items;

    public void setItems(List<Items> Items){
        this.Items = Items;
    }
    public List<Items> getItems(){
        return this.Items;
    }
}

==================================
package ;
public class Items
{
    private double X;

    private double Y;

    private int Z;

    public void setX(double X){
        this.X = X;
    }
    public double getX(){
        return this.X;
    }
    public void setY(double Y){
        this.Y = Y;
    }
    public double getY(){
        return this.Y;
    }
    public void setZ(int Z){
        this.Z = Z;
    }
    public int getZ(){
        return this.Z;
    }
}

==================================
package ;
import java.util.ArrayList;
import java.util.List;
public class Vertices
{
    private List<Items> Items;

    public void setItems(List<Items> Items){
        this.Items = Items;
    }
    public List<Items> getItems(){
        return this.Items;
    }
}

==================================
package ;
public class ApproachOutline
{
    private Vertices Vertices;

    public void setVertices(Vertices Vertices){
        this.Vertices = Vertices;
    }
    public Vertices getVertices(){
        return this.Vertices;
    }
}

==================================
package ;
public class Items
{
    private double X;

    private double Y;

    private int Z;

    public void setX(double X){
        this.X = X;
    }
    public double getX(){
        return this.X;
    }
    public void setY(double Y){
        this.Y = Y;
    }
    public double getY(){
        return this.Y;
    }
    public void setZ(int Z){
        this.Z = Z;
    }
    public int getZ(){
        return this.Z;
    }
}

==================================
package ;
import java.util.ArrayList;
import java.util.List;
public class Vertices
{
    private List<Items> Items;

    public void setItems(List<Items> Items){
        this.Items = Items;
    }
    public List<Items> getItems(){
        return this.Items;
    }
}

==================================
package ;
public class StopLineOutline
{
    private Vertices Vertices;

    public void setVertices(Vertices Vertices){
        this.Vertices = Vertices;
    }
    public Vertices getVertices(){
        return this.Vertices;
    }
}

==================================
package ;
public class Items
{
    private double X;

    private double Y;

    private int Z;

    public void setX(double X){
        this.X = X;
    }
    public double getX(){
        return this.X;
    }
    public void setY(double Y){
        this.Y = Y;
    }
    public double getY(){
        return this.Y;
    }
    public void setZ(int Z){
        this.Z = Z;
    }
    public int getZ(){
        return this.Z;
    }
}

==================================
package ;
import java.util.ArrayList;
import java.util.List;
public class Vertices
{
    private List<Items> Items;

    public void setItems(List<Items> Items){
        this.Items = Items;
    }
    public List<Items> getItems(){
        return this.Items;
    }
}

==================================
package ;
public class StopZoneOutline
{
    private Vertices Vertices;

    public void setVertices(Vertices Vertices){
        this.Vertices = Vertices;
    }
    public Vertices getVertices(){
        return this.Vertices;
    }
}

==================================
package ;
public class Items
{
    private double X;

    private double Y;

    private int Z;

    public void setX(double X){
        this.X = X;
    }
    public double getX(){
        return this.X;
    }
    public void setY(double Y){
        this.Y = Y;
    }
    public double getY(){
        return this.Y;
    }
    public void setZ(int Z){
        this.Z = Z;
    }
    public int getZ(){
        return this.Z;
    }
}

==================================
package ;
import java.util.ArrayList;
import java.util.List;
public class StopLineVertices
{
    private List<Items> Items;

    public void setItems(List<Items> Items){
        this.Items = Items;
    }
    public List<Items> getItems(){
        return this.Items;
    }
}

==================================
package ;
public class Topology
{
    private int ApproachID;

    private String OnStreet;

    private String AtStreet;

    private double ApproachBearing;

    private double StopLineBearing;

    private double DistanceToStopLine;

    private Maneuvers Maneuvers;

    private ApproachOutline ApproachOutline;

    private StopLineOutline StopLineOutline;

    private StopZoneOutline StopZoneOutline;

    private StopLineVertices StopLineVertices;

    public void setApproachID(int ApproachID){
        this.ApproachID = ApproachID;
    }
    public int getApproachID(){
        return this.ApproachID;
    }
    public void setOnStreet(String OnStreet){
        this.OnStreet = OnStreet;
    }
    public String getOnStreet(){
        return this.OnStreet;
    }
    public void setAtStreet(String AtStreet){
        this.AtStreet = AtStreet;
    }
    public String getAtStreet(){
        return this.AtStreet;
    }
    public void setApproachBearing(double ApproachBearing){
        this.ApproachBearing = ApproachBearing;
    }
    public double getApproachBearing(){
        return this.ApproachBearing;
    }
    public void setStopLineBearing(double StopLineBearing){
        this.StopLineBearing = StopLineBearing;
    }
    public double getStopLineBearing(){
        return this.StopLineBearing;
    }
    public void setDistanceToStopLine(double DistanceToStopLine){
        this.DistanceToStopLine = DistanceToStopLine;
    }
    public double getDistanceToStopLine(){
        return this.DistanceToStopLine;
    }
    public void setManeuvers(Maneuvers Maneuvers){
        this.Maneuvers = Maneuvers;
    }
    public Maneuvers getManeuvers(){
        return this.Maneuvers;
    }
    public void setApproachOutline(ApproachOutline ApproachOutline){
        this.ApproachOutline = ApproachOutline;
    }
    public ApproachOutline getApproachOutline(){
        return this.ApproachOutline;
    }
    public void setStopLineOutline(StopLineOutline StopLineOutline){
        this.StopLineOutline = StopLineOutline;
    }
    public StopLineOutline getStopLineOutline(){
        return this.StopLineOutline;
    }
    public void setStopZoneOutline(StopZoneOutline StopZoneOutline){
        this.StopZoneOutline = StopZoneOutline;
    }
    public StopZoneOutline getStopZoneOutline(){
        return this.StopZoneOutline;
    }
    public void setStopLineVertices(StopLineVertices StopLineVertices){
        this.StopLineVertices = StopLineVertices;
    }
    public StopLineVertices getStopLineVertices(){
        return this.StopLineVertices;
    }
}

==================================
package ;
public class Items
{
    private int SCNr;

    private int ActivePlan;

    private String Name;

    private String TSPrediction;

    private String Alert;

    private String IntersectionType;

    private Phases Phases;

    private Topology Topology;

    public void setSCNr(int SCNr){
        this.SCNr = SCNr;
    }
    public int getSCNr(){
        return this.SCNr;
    }
    public void setActivePlan(int ActivePlan){
        this.ActivePlan = ActivePlan;
    }
    public int getActivePlan(){
        return this.ActivePlan;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return this.Name;
    }
    public void setTSPrediction(String TSPrediction){
        this.TSPrediction = TSPrediction;
    }
    public String getTSPrediction(){
        return this.TSPrediction;
    }
    public void setAlert(String Alert){
        this.Alert = Alert;
    }
    public String getAlert(){
        return this.Alert;
    }
    public void setIntersectionType(String IntersectionType){
        this.IntersectionType = IntersectionType;
    }
    public String getIntersectionType(){
        return this.IntersectionType;
    }
    public void setPhases(Phases Phases){
        this.Phases = Phases;
    }
    public Phases getPhases(){
        return this.Phases;
    }
    public void setTopology(Topology Topology){
        this.Topology = Topology;
    }
    public Topology getTopology(){
        return this.Topology;
    }
}

==================================
package ;
import java.util.ArrayList;
import java.util.List;
public class Intersections
{
    private List<Items> Items;

    public void setItems(List<Items> Items){
        this.Items = Items;
    }
    public List<Items> getItems(){
        return this.Items;
    }
}

==================================
package ;
public class Items
{
    private double X;

    private double Y;

    private int Z;

    public void setX(double X){
        this.X = X;
    }
    public double getX(){
        return this.X;
    }
    public void setY(double Y){
        this.Y = Y;
    }
    public double getY(){
        return this.Y;
    }
    public void setZ(int Z){
        this.Z = Z;
    }
    public int getZ(){
        return this.Z;
    }
}

==================================
package ;
import java.util.ArrayList;
import java.util.List;
public class Vertices
{
    private List<Items> Items;

    public void setItems(List<Items> Items){
        this.Items = Items;
    }
    public List<Items> getItems(){
        return this.Items;
    }
}

==================================
package ;
public class RegionOutline
{
    private Vertices Vertices;

    public void setVertices(Vertices Vertices){
        this.Vertices = Vertices;
    }
    public Vertices getVertices(){
        return this.Vertices;
    }
}

==================================
package ;
public class Items
{
    private String Name;

    private int Distance;

    private int DistanceToIntersection;

    private Intersections Intersections;

    private RegionOutline RegionOutline;

    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return this.Name;
    }
    public void setDistance(int Distance){
        this.Distance = Distance;
    }
    public int getDistance(){
        return this.Distance;
    }
    public void setDistanceToIntersection(int DistanceToIntersection){
        this.DistanceToIntersection = DistanceToIntersection;
    }
    public int getDistanceToIntersection(){
        return this.DistanceToIntersection;
    }
    public void setIntersections(Intersections Intersections){
        this.Intersections = Intersections;
    }
    public Intersections getIntersections(){
        return this.Intersections;
    }
    public void setRegionOutline(RegionOutline RegionOutline){
        this.RegionOutline = RegionOutline;
    }
    public RegionOutline getRegionOutline(){
        return this.RegionOutline;
    }
}

==================================
package ;
import java.util.ArrayList;
import java.util.List;
public class Data
{
    private List<Items> Items;

    public void setItems(List<Items> Items){
        this.Items = Items;
    }
    public List<Items> getItems(){
        return this.Items;
    }
}

==================================
package ;
public class Data
{
    private String DataVersion;

    private String TSPackage;

    private Data Data;

    public void setDataVersion(String DataVersion){
        this.DataVersion = DataVersion;
    }
    public String getDataVersion(){
        return this.DataVersion;
    }
    public void setTSPackage(String TSPackage){
        this.TSPackage = TSPackage;
    }
    public String getTSPackage(){
        return this.TSPackage;
    }
    public void setData(Data Data){
        this.Data = Data;
    }
    public Data getData(){
        return this.Data;
    }
}

==================================
package ;
public class Root
{
    private Request Request;

    private Data Data;

    public void setRequest(Request Request){
        this.Request = Request;
    }
    public Request getRequest(){
        return this.Request;
    }
    public void setData(Data Data){
        this.Data = Data;
    }
    public Data getData(){
        return this.Data;
    }
}
