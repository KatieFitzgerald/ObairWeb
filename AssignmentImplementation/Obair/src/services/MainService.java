package services;

import business.Job;
import dao.JobDao;

public class MainService {
	
	private JobDao jobDao;
	
	public MainService(JobDao jobDao) {
		this.jobDao = jobDao;
	}

	public void requestJob(Job job) {
		
			jobDao.requestJob(job);
		
		
	}	
}
