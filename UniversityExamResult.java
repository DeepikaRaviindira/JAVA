abstract class Exam{
	protected String examId;
	protected String subject;
	protected double totalMarks;
	public Exam(String examId,String subject,double totalmarks){
	this.examId=examId;
	this.subject=subject;
	this.totalMarks=totalMarks;
}
abstract boolean evaluateResult();
public void displayResult(){
	System.out.println("ExamId:"+examId);
	System.out.println("subject:"+subject);
	System.out.println("totalMarks:"+totalMarks);
	System.out.println("Result:"+(evaluateResult()?"pass":"fail"));
}}
class TheoryExam extends Exam{
	public TheoryExam(String examId,String subject,double totalMarks){
		super(examId,subject,totalMarks);
	}
	boolean evaluateResult(){
		return totalMarks>=40;
}}
class practicalExam extends Exam{
	public practicalExam(String examId,String subject,double totalMarks){
		super(examId,subject,totalMarks);
	}
	boolean evaluateResult(){
		return totalMarks>=50;
}}
public class UniversityExamSystem{
	public static void main(String[]args){
		TheoryExam TE=new TheoryExam("51","maths",45);
		practicalExam PE=new practicalExam("52","physics",49);
		TE.displayResult();
		PE.displayResult();
}} 

output:
D:\oops34>java UniversityExamSystem
ExamId:51
subject:maths
totalMarks:0.0
Result:fail
ExamId:52
subject:physics
totalMarks:0.0
Result:fail
