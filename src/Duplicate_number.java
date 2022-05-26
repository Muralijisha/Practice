import java.util.HashSet;
import java.util.Set;

public class Duplicate_number {

	public static void main(String[] args) {
		int arrayValues[][] = {{2,4,5},{3,2,7},{1,2,9}};
        Set<Integer> expectedDuplicates = new HashSet<Integer>();
        Set<Integer> deleteRow = new HashSet<Integer>();
        boolean duplicates=true;
 
        for (int i = 0; i < arrayValues.length; i++) {
            for (int j = 0; j < arrayValues[i].length; j++) {
                if (i == 0)
                    expectedDuplicates.add(arrayValues[i][j]);
 
                else {
                    deleteRow.add(arrayValues[i][j]);
                }
            }
            if (i != 0) {
                expectedDuplicates.retainAll(deleteRow);
                deleteRow.clear();
                 
                if (expectedDuplicates.size() == 0) {
                    duplicates=false;
                    break;
                }
            }
 
        }
        if(duplicates)
            System.out.println("Duplicated elements are: "+expectedDuplicates);
        else
            System.out.println("There is no duplicate elements.");
           }

		}
				
		

	


