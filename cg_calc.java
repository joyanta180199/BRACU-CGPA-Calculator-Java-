import java.util.*;
public class cg_calc{
 public static void main(String args[]){  

float weighted_gpa = 0; //gpa * credit hours
float total_weighted_gpa = 0;
float gpa = 0;
float credit_hours = 0;
float total_hours = 0;
float cgpa = 0;

Scanner sc =  new Scanner(System.in);
System.out.println("Please give me how many courses you want to get gpa?");
int j= sc.nextInt();
//String[] course_name = new String[j];

 for(int i=0;i<j;i++){
  System.out.println("Please give me your cg");
  gpa = sc.nextFloat();
  //System.out.println("Please give me your credit hours");
  //credit_hours = sc.nextFloat();
  //let's fix credit hours
  //adsjkghjksadghsajkdhsadjkhkljsadhnljk
  credit_hours = 3;
  total_hours = total_hours + credit_hours;
  weighted_gpa = gpa * credit_hours;
  total_weighted_gpa = total_weighted_gpa + weighted_gpa;
  gpa = 0;
  credit_hours = 0;
}
 sc.close();
 cgpa = total_weighted_gpa/total_hours;
 System.out.println(cgpa);

}
}