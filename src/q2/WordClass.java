/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

/**
 *
 * @author Tam Pham
 */
public class WordClass {
    private String id;
    private String name;
    
//     public WordClass() {
//        this.wordclass = "";
//    }

    public WordClass(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public String  entry() {
        return this.id +"-" + this.name + " is inserted";
    }
    public String print(){
        return this.id + "-" + this.name;
    }
    
}
