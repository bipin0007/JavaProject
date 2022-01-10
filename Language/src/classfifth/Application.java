package classfifth;

public class Application extends TeacherDemo {

	public static void main(String[] args) {
		StudentDemo s = new StudentDemo();
		
		s.eat();
		s.ex();
		s.sleeps();
		s.walk();
		s.read();
		s.writeexam();
		
		TeacherDemo t = new TeacherDemo();   //these methods got increased by multi Level inheritance
		t.doConducctExam();
		t.doconductlecture();
		t.eat();
		t.ex();
		t.read();
		t.sleeps();
		t.walk();
		t.writeexam();

	}

}
