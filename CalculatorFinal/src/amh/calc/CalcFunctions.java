package amh.calc;

public enum CalcFunctions {
	ADD
	{
		public int solveProblem(int firstNum, int secondNum) {
			return firstNum+secondNum;
		}
	},
	SUBTRACT
	{
		public int solveProblem(int firstNum, int secondNum) {
			return firstNum-secondNum;
		}
	},
	DIVIDE
	{
		public int solveProblem(int firstNum, int secondNum) {
			return firstNum/secondNum;
		}
	},
	MULTIPLY
	{
		public int solveProblem(int firstNum, int secondNum) {
			return firstNum*secondNum;
		}
	};
	public int solveProblem(int firstNum, int secondNum) {
		return firstNum+secondNum;
	}
}