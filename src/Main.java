public class Main {
    public static void main(String[] args) {
      Course mat = new Course("Matematik","MAT101","MAT");
      Course fizik= new Course("Fizik","FZK101","FZK");
      Course kimya= new Course("Kimya", "KMY101","KMY");

      Teacher t1= new Teacher("Mahmut Hoca", "MAT","905500000000");
      Teacher t2= new Teacher("Fatma Ayşe","FZK","905500000001");
      Teacher t3= new Teacher("Ali Veli","KMY","905500000002");

      mat.addTeacher(t1);
      fizik.addTeacher(t2);
      kimya.addTeacher(t3);

      Student s1=new Student("İnek Şaban",4,"192113001",mat,fizik,kimya);
      s1.addBulkExamNote(100,80,10,10,10,10);
      s1.isPass();

      Student s2=new Student("Güdük Necmi", 4,"192113002",mat,fizik,kimya);
      s2.addBulkExamNote(10,10,100,80,10,10);
      s2.isPass();

      Student s3=new Student("Hayta İsmail",4,"192113003",mat,fizik,kimya);
      s3.addBulkExamNote(10,10,10,10,100,80);
      s3.isPass();
    }
}
