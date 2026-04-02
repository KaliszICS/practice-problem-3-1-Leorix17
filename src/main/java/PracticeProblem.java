public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static String evenOrOdd(int num) {
		if ((num % 2) == 0) {
			return "Even";
		}
		return "Odd";

	}

	public static String teacherOrStudent(String word) {
		if (word == "Kalisz") {
			return "Teacher";
		}
		return "Student";
	}

	public static int fartherFromZero(int num) {
		if (num > 0) {
			num = num + 5;
			return num;
		}
		if (num < 0) {
			num = num - 5;
			return num;
		}
		return 0;
	}
}