package DesignPatterns;

// Handles complex constructors
// Large number of parameters
// Makes it immutable after creation
// e.g =  String builder
// Flexibility over telescoping constructors
// Static inner class
// Calls appropriate constructor
// Negates the need for exposed setters

public class Builder {

    // Has private variables for all variables inside the public class
    public static class ActualBuilder{
        private String string1;
        private String string2;
        private String string3;

        public Builder build(){
            return new Builder(this);
        }

        public ActualBuilder(){}

        public ActualBuilder string1(String string1){
            this.string1 = string1;
            return this;
        }

        public ActualBuilder string2(String string2){
            this.string2 = string2;
            return this;
        }

        public ActualBuilder string3(String string3){
            this.string3 = string3;
            return this;
        }

    }

    private final String string1;
    private final String string2;
    private final String string3;


    private Builder(ActualBuilder builder){
        this.string1 = builder.string1;
        this.string2 = builder.string2;
        this.string3 = builder.string3;
    }

    public String getString1() {
        return string1;
    }

    public String getString2() {
        return string2;
    }

    public String getString3() {
        return string3;
    }


}
