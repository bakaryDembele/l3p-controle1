import java.util.*;

public class Employees {

    

    private String name;
    
    private String position;
    
    private Set<Employees> files = new HashSet<>();  
    
    private Boolean folder;

	public  void printEmployees(){
		
		File file1 = new File(); file1.setName("Yvette (CEO)"); 
		
        File file2 = new File(); file2.setName("Jean-Patrick (Developper)");
        File file3 = new File(); file3.setName("Sylvie (Accoutant)");        
        File file4 = new File(); file4.setName("Marie-Jeanne (Marketing)");
        
        File file5 = new File(); file5.setName("Jean-Christophe (Developper)");        
        File file6 = new File(); file6.setName("Jean-Yves (Developper)");
        File file7 = new File(); file7.setName("Marie-Christelle (CEO)");        
        File file8 = new File(); file8.setName("Jean-Claire (Developper)");
        
        File directory1 = new File();
        directory1.getFiles().add(file1);
        
        File directory11 = new File();
        directory1.setFolder(true);
        directory1.getFiles().add(file2);
        directory1.getFiles().add(file3);
        directory1.getFiles().add(file4);       
        
        File directory2 = new File();
        directory2.setFolder(true);
        directory2.getFiles().add(file5);
        directory2.getFiles().add(file5);
        
        File directory3 = new File();
        directory3.setFolder(true);
        directory3.getFiles().add(file7);
        directory3.getFiles().add(file8);
        
        
        directory1.getFiles().add(directory11);
        directory2.getFiles().add(directory11);
        directory1.getFiles().add(directory11);
        
        for (File f : directory1.getFiles()) {

            System.out.println(f);

        }
    	
    }
	
	public static void main(String[] args) {
		Employees emp = new Employees();
		
		emp.printEmployees();
	}
   
}