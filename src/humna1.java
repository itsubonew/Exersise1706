public class Human {
    String name;
    int birthday;
    int do;


    Human(String name, int birthday, int do){
        this.name = name;
        this.birthday;
        this.do = do
    }
    Human(String name,int birthday){
this(name,birthday,50);
    }
    Human(String name){
        this(name,0,50);
    }
    Human(){
        This("unknown",0,50);
    }

    void eat(){
        this.do += 60;
    }
    
}


