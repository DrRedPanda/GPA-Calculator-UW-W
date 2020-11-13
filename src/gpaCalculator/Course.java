package gpaCalculator;

public class Course {
	private String lettergrade;
	private String weighted;
	private double credits;
	private double numgrade;
	private double weightednumgrade;
	
	public Course(String c, double d, String m) {
		this.credits = d;
		this.lettergrade = c;
		this.weighted = m;
		switch (lettergrade) {
			case "A+": this.numgrade = 4.3; break;
			case "A": this.numgrade = 4.0; break;
			case "A-": this.numgrade = 3.7; break;
			case "B+": this.numgrade = 3.3; break;
			case "B": this.numgrade = 3.0; break;
			case "B-": this.numgrade = 2.7; break;
			case "C+": this.numgrade = 2.3; break;
			case "C": this.numgrade = 2.0; break;
			case "C-": this.numgrade = 1.7; break;
			case "D+": this.numgrade = 1.3; break;
			case "D": this.numgrade = 1.0; break;
			default: this.numgrade = 0.0; break;
		}
		switch (weighted) {
			case "H": this.weightednumgrade = numgrade + 0.5; break;
			case "AP": this.weightednumgrade = numgrade + 1.0; break;
			default: this.weightednumgrade = numgrade; break;
		}
	}
	public double getEarned() {
		return this.credits * numgrade;
	}
	public double getCredits() {
		return this.credits;
	}
	public double getWeighted() {
		return this.credits * this.weightednumgrade;
	}
}
	
