package eg2;

public class Project {

	private int projectId;
	private String clientName;
	
	public Project(int projectId, String clientName) {
		this.projectId = projectId;
		this.clientName = clientName;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public void printProject() {
		
		System.out.println("Project Id : "+projectId);
		System.out.println("ClientName :"+clientName);
	}
}
