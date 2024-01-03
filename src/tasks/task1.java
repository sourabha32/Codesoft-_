package tasks;
import java.util.HashMap;
import java.util.Map;
public class task1 {
	 public static void main(String[] args) {
	        
	        Map<String, Integer> marks = new HashMap<>();
	        marks.put("English", 85);
	        marks.put("Mathematics", 90);
	        marks.put("Science", 95);
	        marks.put("History", 75);
	        marks.put("Geography", 80);

	       
	        int totalMarks = 0;
	        for (int mark : marks.values()) {
	            totalMarks += mark;
	        }

	        
	        int numberOfSubjects = marks.size();

	        // Calculate average percentage
	        double averagePercentage = (double) totalMarks / numberOfSubjects;

	        
	        Map<String, double[]> gradeBoundaries = new HashMap<>();
	        gradeBoundaries.put("A+", new double[]{95, 100});
	        gradeBoundaries.put("A", new double[]{90, 94});
	        gradeBoundaries.put("B+", new double[]{85, 89});
	        gradeBoundaries.put("B", new double[]{80, 84});
	        gradeBoundaries.put("C+", new double[]{75, 79});
	        gradeBoundaries.put("C", new double[]{70, 74});
	        gradeBoundaries.put("D+", new double[]{65, 69});
	        gradeBoundaries.put("D", new double[]{60, 64});
	        gradeBoundaries.put("E", new double[]{0, 59});

	       
	        String grade = "";
	        for (Map.Entry<String, double[]> entry : gradeBoundaries.entrySet()) {
	            if (averagePercentage >= entry.getValue()[0] && averagePercentage <= entry.getValue()[1]) {
	                grade = entry.getKey();
	                break;
	            }
	        }

	   
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + averagePercentage);
	        System.out.println("Grade: " + grade);
	    }

}
