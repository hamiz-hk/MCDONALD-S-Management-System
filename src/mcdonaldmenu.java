
public class mcdonaldmenu {

	private static int cheeseburger;
	private static int softdrink;
	private static int icecream;
	private static int rice;
	private static int frenchfries;
	private static int juice;
	private String name;
		mcdonaldmenu(){
		this.cheeseburger=0;
		this.softdrink=0;
		this.icecream=0;
		this.rice=0;
		this.frenchfries=0;
		this.juice=0;
		this.name="";
		
	}
	
		mcdonaldmenu(int cb,int sd,int ic,int ri,int ff,int j,String na){
			
		this.cheeseburger=cb;
		this.softdrink=sd;
		this.icecream=ic;
		this.rice=ri;
		this.frenchfries=ff;
		this.juice=j;
		this.name=na;
	}

		public static int getCheeseburger() {
			return cheeseburger;
		}

		public static void setCheeseburger(int cheeseburger) {
			mcdonaldmenu.cheeseburger = cheeseburger;
		}

		public static int getSoftdrink() {
			return softdrink;
		}

		public static void setSoftdrink(int softdrink) {
			mcdonaldmenu.softdrink = softdrink;
		}

		public static int getIcecream() {
			return icecream;
		}

		public static void setIcecream(int icecream) {
			mcdonaldmenu.icecream = icecream;
		}

		public static int getRice() {
			return rice;
		}

		public static void setRice(int rice) {
			mcdonaldmenu.rice = rice;
		}

		public static int getFrenchfries() {
			return frenchfries;
		}

		public static void setFrenchfries(int frenchfries) {
			mcdonaldmenu.frenchfries = frenchfries;
		}

		public static int getJuice() {
			return juice;
		}

		public static void setJuice(int juice) {
			mcdonaldmenu.juice = juice;
		}
	
	
	
}
