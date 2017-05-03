
public class Flyer {

	public static void main(String[] args) {
		
		Flyer StartProgram = new Flyer();

		AirplaneQuestions myQuestions = new AirplaneQuestions();
		myQuestions.createGUI();
		
		AirplaneData myData = new AirplaneData();
		myData.createAirplaneData();
		
		//with the answers to the above questions
		//tell which airplane it might be and for now
		//rule out planes it can't be

	}
}
