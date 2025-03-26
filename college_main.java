class college{
    String name;
    int age;
    String gender;
    college(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        }
}
class UG extends college{
    String branch;
    int persentage;
    UG(String name, int age, String gender, String branch, int percentage){
        super(name, age, gender);
        this.branch = branch;
        this.persentage = percentage;
        }
        void display(){
            super.display();
            System.out.println("Branch: "+branch);
            System.out.println("Percentage: "+persentage);
            }
        void eligibility(){
            if(persentage>=60){
                System.out.println("Eligible for higher studies");
                }
                else{
                    System.out.println("Not Eligible for higher studies");
                    }
                }
        }
        class PG extends college{
            String branch;
            int persentage;
            PG(String name, int age, String gender, String branch, int percentage){
                super(name, age, gender);
                this.branch = branch;
                this.persentage = percentage;
                }
                void display(){
                    super.display();
                    System.out.println("Branch: "+branch);
                    System.out.println("Percentage: "+persentage);
                    }
                    void eligibility(){
                        if(persentage>=60){
                            System.out.println("Eligible for higher studies");
                            }
                            else{
                                System.out.println("Not Eligible for higher studies");
                                }
                        }
            }
        class college_main{
            public static void main(String[] args){
                UG ug = new UG("Rahul", 20, "Male", "CSE",68);
                ug.display();
                ug.eligibility();
                PG pg = new PG("Rahul", 20, "Male", "CSE",72);
                pg.display();
                pg.eligibility();
                }
        }