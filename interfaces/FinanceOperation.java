package interfaces;
import java.lang.*;
import classes.*;

public interface FinanceOperation
{
	boolean addBooking(Finance f);
	boolean removeBooking(Finance f);
	void showAllBookedAmbulance();
	Finance searchBookedAmbulance(String nid);
}