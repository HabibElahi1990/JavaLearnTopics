package javaEnum.example;

public class EducationInfo {
    enum GetEducationInfo{

        HIGH_SCHOOL(5),
        DIPLOMA(10),
        BACHELOR(20),
        DOCTORATE(30),
        PROFESSOR(40);

        private Integer value;
        GetEducationInfo(int value){
            this.value=value;
        }

        public Integer getValue() {
            return value;
        }

        Integer getId(){
            return ordinal();
        }

    }
}
