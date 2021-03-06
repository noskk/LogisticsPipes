package logisticspipes.routing;

import logisticspipes.request.RequestTreeNode;

public class LogisticsExtraPromise extends LogisticsPromise {
	public RequestTreeNode extraSource;
	public boolean provided;
	
	public LogisticsExtraPromise copy() {
		LogisticsExtraPromise result = new LogisticsExtraPromise();
		result.item = item;
		result.numberOfItems = numberOfItems;
		result.sender = sender;
		result.extraSource = extraSource;
		result.provided = provided;
		return result;
	}
}
