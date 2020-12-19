package entities;

public class Park {

		private String parkName;
		private int maxVisitorsLimit;
		private int stayTimeOfVisitors;
		private int currentNumOfVisitors;
		private int invitationVsVisitorGap;
		
		public Park(String parkName, int maxVisitorsLimit, int stayTimeOfVisitors, int currentNumOfVisitors, int invitationVsVisitorGap) {
			super();
			this.parkName=parkName;
			this.maxVisitorsLimit=maxVisitorsLimit;
			this.stayTimeOfVisitors=stayTimeOfVisitors;
			this.currentNumOfVisitors=currentNumOfVisitors;
			this.invitationVsVisitorGap=invitationVsVisitorGap;
		}

		
		public String getParkName() {
			return parkName;
		}
		public void setParkName(String parkName) {
			this.parkName = parkName;
		}
		public int getMaxVisitorsLimit() {
			return maxVisitorsLimit;
		}
		public void setMaxVisitorsLimit(int maxVisitorsLimit) {
			this.maxVisitorsLimit = maxVisitorsLimit;
		}
		public int getStayTimeOfVisitors() {
			return stayTimeOfVisitors;
		}
		public void setStayTimeOfVisitors(int stayTimeOfVisitors) {
			this.stayTimeOfVisitors = stayTimeOfVisitors;
		}
		public int getCurrentNumOfVisitors() {
			return currentNumOfVisitors;
		}
		public void setCurrentNumOfVisitors(int currentNumOfVisitors) {
			this.currentNumOfVisitors = currentNumOfVisitors;
		}
		public int getInvitationVsVisitorGap() {
			return invitationVsVisitorGap;
		}
		public void setInvitationVsVisitorGap(int invitationVsVisitorGap) {
			this.invitationVsVisitorGap = invitationVsVisitorGap;
		}
		
		
}
