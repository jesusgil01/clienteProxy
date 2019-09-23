package RemoteProxy;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class ReportGeneratorClient {

	public static void main(String[] args) {
		new ReportGeneratorClient().generateReport();
	}
	
	public void generateReport(){
		try {
                        
                        Registry registry = LocateRegistry.getRegistry("localhost", 9000);
			ReportGenerator reportGenerator = (ReportGenerator)registry.lookup("PizzaCoRemoteGenerator");
			//System.out.println(reportGenerator.generateDailyReport());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
