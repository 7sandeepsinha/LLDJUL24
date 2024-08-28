package lldmodule2.desingPatterns.prototypeAndRegistry;

import java.util.HashMap;

//ideally we can make registry singleton as well
public class StudentRegistry {// storing multiple template objects

    private HashMap<String, Prototype<Student>> registry;

    public StudentRegistry() {
        this.registry = new HashMap<>();
    }

    public Prototype<Student> add(String prototypeName, Prototype<Student> prototype){
        registry.put(prototypeName, prototype);
        return prototype;
    }

    public Prototype<Student> get(String prototypeName){
        return registry.get(prototypeName);
    }
}
