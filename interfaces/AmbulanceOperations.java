package interfaces;
import java.lang.*;
import classes.*;

public interface AmbulanceOperations
{
	boolean addAmbulance(Ambulance a);
	boolean removeAmbulance(Ambulance a);
	Ambulance searchAmbulance(String emnP);
	void showAllAmbulance();
}