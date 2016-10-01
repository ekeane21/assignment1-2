public class addStudents {
    String data;
    public addStudents(String data){
    this.data=data;
        }
    public static void main(String[] args){
        Student[] people1 = new Student[5];
            people1[0]= new Student("Bob","010296",20);   
            people1[1]= new Student("Ruth","141195",20);  
            people1[2]= new Student("James","020595",21);  
            people1[3]= new Student("Liz","030394",22);  
            people1[4]= new Student("Daisy","030493",23);  
        
        Student[] people2 = new Student[5];
            people2[0]= new Student("James","020595",21);  
            people2[1]= new Student("Liz","030394",22);  
            people2[2]= new Student("Daisy","030493",23);
            
        Student[] people3 = new Student[5];
            people3[0]= new Student("John","020595",21);  
            people3[1]= new Student("Mary","030394",22);  
            people3[2]= new Student("Petunia","030493",23);
                
        Student[] people4 = new Student[5];
            people1[0]= new Student("Jake","010296",20);   
            people1[1]= new Student("Bella","141195",20);  
            people1[2]= new Student("Milo","020595",21);  
    
        
        Module CT101 = new Module("Programming", "CT101", people1);
        Module EE123 = new Module("Electronics Design", "EE123", people2);
        Module QR145 = new Module("Quantics", "QR145", people3);
        Module GH789 = new Module("German Humanities", "GH789", people4);
        
        CourseProgramme programme1 = new CourseProgramme();
        
        
    }   
}
