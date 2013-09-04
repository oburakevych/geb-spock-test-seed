import geb.Page;


class DealPage extends Page {
	static url = "http://groupbuy.ebay.com.au/deal"
	
	static at = {buyDealBtn.present}
	
	static content = {
		buyDealBtn {$('#mskuOverlayLink')}
	}
}
