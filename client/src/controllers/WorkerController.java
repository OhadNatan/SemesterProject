package controllers;

import entities.DataManager;
import entities.Park;
import entities.Worker;

public class WorkerController extends AbstractController {

	private DataManager DM = DataManager.getDataManager();
	private Worker worker=(Worker) DM.getCurrentUser();
	
	public WorkerController() {
	}

	public boolean availabilityCheck(int numOfRequestedVisitors) {
		Park park=worker.getPark();
		if (park.getMaxVisitorsLimit()-park.getCurrentNumOfVisitors()>=numOfRequestedVisitors)
			return true;
		else
			return false;
	}

	@Override
	public Object RunQueryOnDB(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
