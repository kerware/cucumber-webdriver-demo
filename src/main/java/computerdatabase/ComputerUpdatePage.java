package computerdatabase;

import testframework.WebOperations;

public class ComputerUpdatePage {
	
	private WebOperations _webOps = null;
	
	public ComputerUpdatePage( WebOperations webOp ) {
		_webOps = webOp;
	}
	
	public void updateComputerForm( String name, String introDate, String disDate, String company ) {
		if ( name != null ) {
			_webOps.type("txtName", name , false);
		}
		if ( introDate != null ) {
			_webOps.type("txtDateIntro", introDate , false);
		}
		if ( disDate != null ) {
			_webOps.type("txtDateDis", disDate , false);
		}
		if ( company != null ) {
			_webOps.selectOptionByText("selectCompany", company);
		}
		
	}
	
	public void submitComputerForm() {
		_webOps.click("btnSaveComputer");
	}
	
	public void updateComputer(  String name, String introDate, String disDate, String company ) {
		updateComputerForm( name, introDate, disDate, company );
		submitComputerForm();
		
	}
	
	public void cancelUpdate( ) {
		_webOps.click("btnCancel");
	}

	public void deleteComputer() {
		_webOps.click("btnDeleteComputer");
	}



}
