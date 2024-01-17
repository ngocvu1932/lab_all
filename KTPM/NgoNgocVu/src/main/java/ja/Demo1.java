package ja;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Optional;

public class Demo1 {

    public static void main(String[] args) throws Exception {
        ParseResult<CompilationUnit> parseResult = null;
        FileInputStream in = new FileInputStream("T:\\New folder\\NgoNgocVu\\src\\main\\java\\ja\\Account.java");
        
        try {
        	JavaParser parser = new JavaParser();
        	parseResult = parser.parse(in);
        	
        	
        	
        	Optional<CompilationUnit> optional= parseResult.getResult();
        	
        	if (optional.isPresent()) {
        		CompilationUnit cu = optional.get();
        		
        		System.out.println("=====Fields=====");
        		getFields(cu);
        		System.out.println("=====Methods & Parameter=====");
        		getMethods(cu);
        	}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			in.close();
		}
        
        
    	

    	
    	
    }
    
    static void readFiles(String folderName) {
    	File folder= new File(folderName);
    	File [] files = folder.listFiles();
    	for (File file : files) {
//    		if (file.isDirectory())
    		System.out.println(file.getAbsolutePath());
		}
    }

    private static void getMethods(CompilationUnit cu) {
		// TODO Auto-generated method stub
    	List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class);
		for (MethodDeclaration method : methods) {
			System.out.println(method.getName() + " " + method.getParameters());
		} 
		
	}

	private static void getFields(CompilationUnit cu) {
		// TODO Auto-generated method stub
		List<FieldDeclaration> fields = cu.findAll(FieldDeclaration.class);
		for (FieldDeclaration field : fields) {
			System.out.println(field);
		}
	}

}
