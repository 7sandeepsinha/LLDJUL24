package lldmodule2.desingPatterns.prototypeAndRegistry;

public class Demo {
    public static void main(String[] args) {
        Student originalObj = null;

        //copy constructor does not solve our problem
//        Student copyObj = new Student(originalObj);
//        Student copyObj = new GeniusStudent(copyObj);

        Student copy = originalObj.clone(); // parent obj -> clone parent || child obj -> clone child
        copy.setName("Some unique value");

        StudentRegistry registry = new StudentRegistry();
        Student aprbatch = new Student();
        aprbatch.setBatchName("April 2024 batch");

        registry.add("APR_2024", aprbatch);
        Student copyApr2024 = registry.get("APR_2024").clone();

        //String userQuery = "asdasdassa";
        //SearchAPIRequest req = searchAPITemplate.clone(); || gives all the saved values
        //req.setQuery(userQuery);
        //req.send();
    }
}
