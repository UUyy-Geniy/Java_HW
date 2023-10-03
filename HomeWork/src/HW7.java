public class HW7 {
    public static class person{
        private String Name;
        private int Age;
        private String Hobby;

        public person(String name, int age, String hobby){
            Name = name;
            Age = age;
            Hobby = hobby;
        }
        public void changeHobby(person p){
            String tmp_hobby;
            tmp_hobby = Hobby;
            Hobby = p.Hobby;
            p.Hobby = tmp_hobby;
            System.out.println("Hobbies were changed");
        }
        public void personInfo(){
            System.out.println("Info about person:" + Name +" "+ Age + " " + Hobby);
        }
        public static void main(String[] args){
            person A = new person("Alex", 19, "Football");
            person B = new person("Jack", 15, "Basketboll");

            A.personInfo();
            B.personInfo();

            A.changeHobby(B);

            A.personInfo();
            B.personInfo();

        }
    }
}
