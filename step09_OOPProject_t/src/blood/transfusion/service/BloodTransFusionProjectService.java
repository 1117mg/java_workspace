package blood.transfusion.service;

import java.util.ArrayList;

import blood.transfusion.dto.BloodTransfusionProject;
import blood.transfusion.dto.Donor;
import blood.transfusion.dto.People;
import blood.transfusion.dto.Recipient;
import blood.transfusion.model.BloodTransfusionVirtualDB;

public class BloodTransFusionProjectService {
	private static BloodTransFusionProjectService instance = new BloodTransFusionProjectService();
	private BloodTransfusionVirtualDB projectVirtualData = BloodTransfusionVirtualDB.getInstance();

	private BloodTransFusionProjectService(){}
	public static BloodTransFusionProjectService getInstance(){
		return instance;
	}
	
	// 모든 프로젝트 반환
	public ArrayList<BloodTransfusionProject> getAllProjects(){
		return projectVirtualData.getProjectList();
	}
	
	// 프로젝트 검색_
	// 1. 모든 프로젝트
	// 2. 조건 : 프로젝트의 이름
	// 3. return 
	public BloodTransfusionProject getProject(String projectName) throws Exception {
		ArrayList<BloodTransfusionProject> projectList = projectVirtualData.getProjectList();
		BloodTransfusionProject project = null;
		
		for(int i=0; i<projectList.size(); i++) {
			if(projectList.get(i).getBtProjectName().equals(projectName)) {
				project = projectList.get(i);
			}
		}	
		
		// project == null이면 예외 발생!
		if(project == null) {
			throw new Exception("검색 요청하신 프로젝트는 존재하지 않습니다");
		}
		
		return project;
	}

	// 새로운 프로젝트 추가_
	public void projectInsert(BloodTransfusionProject newProject) {
		if(newProject != null) {
			projectVirtualData.insertProject(newProject);
		}
	}
	
	// 프로젝트 수정 - 프로젝트 명으로 현혈자 혹은 수혈자 수정_
	public void projectUpdate(String projectName, People people) throws Exception{
		
		// 프로젝트 이름으로 해당 프로젝트 존재 여부!
		BloodTransfusionProject project = getProject(projectName);
		
		// people이 수혈자 일때만
		if(people instanceof Recipient) {
			project.setRecipient((Recipient)people);
		} else if(people instanceof Donor) {
			project.setDonor((Donor)people);
		}
				
	}
	
	// 프로젝트 삭제_
	public void projectDelete(String projectName) throws Exception{
		
		
		BloodTransfusionProject project = getProject(projectName);
		projectVirtualData.deleteProject(project);
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
