package study;

public class Student implements StudentUtil {
	private String name;
	private int korScore;
	private int mathScore;
	private int engScore;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}


	@Override
	public int getTotalScore() {
		int sum = 0;
		sum = getKorScore() + getEngScore() + getMathScore();
		return sum;
	}

	@Override
	public Student getHighScoreStudent(Student s1, Student s2) {
		return getTotalScore(s1) > getTotalScore(s2) ? s1 : s2;

	}

	@Override
	public String getGradeByStudentName(Student[] stu, String name) {
		String grade = "학생정보없음";

		for (int i = 0; i < stu.length; i++) {
			if (stu[i].getName().equals(name)) {
				double avg = getTotalScore(stu[i]) / 3.0;
				grade = getGradeByAvg(avg);
				break;
			}
		}


		//평균점수로 등급을 문자열로 리턴하는 메서드
		public String getGradeByAvg ( double avg){

			if (90 <= avg && avg <= 100) {
				grade = "A";
			} else if (80 <= avg) {
				grade = "B";
			} else if (70 <= avg) {
				grade = "C";
			} else {
				grade = "D";
			}
		}
		return "";
	}


	@Override
	public int[] getTotalScoresToArray(Student[] stu1) {
		int[] resultArr = new int[stu1.length];


		for (int i = 0; i < stu1.length; i++) {
			resultArr[0] = getTotalScore(stu1[i]);
		}
		return resultArr;
	}
}
