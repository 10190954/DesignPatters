interface Visitor {
	public void visit(Subject sub);
}

class MyVisitor implements Visitor {
	
	public void visit(Subject sub) {
		System.out.println(sub.getSubject());
	}
}

interface Subject {
	public void accept(Visitor visitor);
	public String getSubject();
}

class MySubject implements Subject {
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	public String getSubject() {
		return "success!";
	}
}
public class VisitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitor visitor = new MyVisitor();
		Subject subject = new MySubject();
		subject.accept(visitor);
	}

}
