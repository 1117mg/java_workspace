package blood.transfusion.controller;

import java.util.ArrayList;

import blood.transfusion.dto.BloodTransfusionProject;
import blood.transfusion.dto.People;
import blood.transfusion.service.BloodTransFusionProjectService;
import blood.transfusion.view.EndView;
import blood.transfusion.view.FailView;

public class BloodTransfusionController {
	private static BloodTransfusionController instance = new BloodTransfusionController();
	private BloodTransFusionProjectService service = BloodTransFusionProjectService.getInstance();

	private BloodTransfusionController() {}

	public static BloodTransfusionController getInstance() {
		return instance;
	}

	// 모든 프로젝트 검색
	public void projectListView() {
		ArrayList<BloodTransfusionProject> projectList = service.getAllProjects();
		EndView.projectListView(projectList);
	}
	
	// 특정 프로젝트 검색_
	public void projectView(String projectName) {
		BloodTransfusionProject project;
		try {
			project = service.getProject(projectName);
			EndView.projectView(project);
		} catch (Exception e) {
//			e.printStackTrace();
			FailView.failMessageView(e.getMessage());
		}
	}

	// 새로운 프로젝트 저장_
	public void insertProject(BloodTransfusionProject newProject) {
		service.projectInsert(newProject);
	}
	
	// 존재하는 프로젝트 수정_
	public void updateProject(String projectName, People people) {
		try {
			service.projectUpdate(projectName, people);
		} catch (Exception e) {
//			e.printStackTrace();
			FailView.failMessageView(e.getMessage());
		}
	}

	// 이름으로 검색한 프로젝트 삭제_
	public void deleteProject(String projectName) {
		try {
			service.projectDelete(projectName);
		} catch (Exception e) {
			// TODO: handle exception
			FailView.failMessageView(e.getMessage());
		}
	}
}




























