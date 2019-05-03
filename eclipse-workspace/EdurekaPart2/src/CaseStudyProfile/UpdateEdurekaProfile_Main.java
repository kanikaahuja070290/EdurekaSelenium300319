package CaseStudyProfile;

public class UpdateEdurekaProfile_Main {

	public static void main(String[] args) {
		UpdateEdurekaProfile profile = new UpdateEdurekaProfile();
		profile.invokeBrowser();
		profile.loginEdureka();
		profile.updateProfile();

	}

}
