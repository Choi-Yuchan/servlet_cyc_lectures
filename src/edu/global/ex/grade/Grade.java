package edu.global.ex.grade;

public class Grade {
//	private String name;
	private int kor, eng, math;
	private char result;

	public Grade() {
	}

	public Grade(int kor, int eng, int math) {
//		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public double getTotal() {
		return (kor + eng + math);
	}

	public double getAvg() {
		return (kor + eng + math) / 3;
	}

	public char getGrade() {
		double avg = getAvg();
		if (avg >= 90) {
			result = 'A';
		} else if (avg >= 80) {
			result = 'B';
		} else if (avg >= 70) {
			result = 'C';
		} else if (avg >= 60) {
			result = 'D';
		} else {
			result = 'E';
		}

		return result;
	}
}
