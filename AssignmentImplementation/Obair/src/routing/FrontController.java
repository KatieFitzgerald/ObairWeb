package routing;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.Job;
import dao.JobDao;
import services.MainService;

@WebServlet(urlPatterns={"/controller"})
public class FrontController extends HttpServlet {
	
	private MainService mainService;

	public FrontController() {
		JobDao jobDao = new JobDao();
		this.mainService = new MainService(jobDao);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action;
		
		if((action = req.getParameter("action")) == null) {
			action = "";
		}
		
		switch (action) {
		case "newJob":
			
			Job job = new Job();
			
			String description = req.getParameter("description");
			String location = req.getParameter("location");
			
			if(description != null || location != null) 
			{
				job.setDescription(description);
				job.setLocation(location);
				
				mainService.requestJob(job);
				
				forwardToPage(req, resp, "/success.jsp");
			}
			else
			{
				forwardToPage(req, resp, "/fail.jsp");
			}
			break;
		}
	}
	
	private void forwardToPage(HttpServletRequest request, HttpServletResponse response, String page){
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
