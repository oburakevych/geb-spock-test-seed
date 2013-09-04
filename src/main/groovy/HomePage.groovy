import geb.Page;


class HomePage extends Page {
	static url = "http://groupbuy.ebay.com.au"
	//static url = "http://localhost:8000/app/index.html#/home"
	static at = {
		logo.present
		//mybtn.present
		//viewDealBtn.displayed
	}
	
	static content = {
		logo { $('#gh-logo') }
		viewDealBtn {$('#5000004352_viewDealAnc')}
		image1 {$('#fsItmImg_5000004352_1')}
		image_frame {$('#mainId_5000004352')}
	}
}
