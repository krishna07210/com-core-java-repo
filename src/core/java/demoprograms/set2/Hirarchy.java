package core.java.demoprograms.set2;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Hirarchy {
public static class Entry {
    private String name;

    public Entry(String name) {
        this.name = name;
    }

    private List<Entry> children;
    public void add(Entry node) {
        if (children == null)
            children = new ArrayList<Entry>();
        children.add(node);
    }

    public static void main(String[] args) {
        List<String> listofParent = new ArrayList<String>();
        listofParent.add("Narasimhulu");
        listofParent.add("Harikrishna"); 

        List<String> listofChild = new ArrayList<String>();
        listofChild.add("Vamshi");
        listofChild.add("Krishna");
        listofChild.add("Likish");
        Entry mainRoot=null;
        for (int i = 0; i < listofParent.size(); i++) {
            Entry root = new Entry(listofParent.get(i));
            mainRoot= aMethod2form(root, listofChild);
            Entry e=new Entry("Root");
            e.add(mainRoot);
            Gson g=new Gson();
            System.out.println(g.toJson(e));
        }
    }
    private static Entry aMethod2form(Entry root, List<String> listofChild) {
        for(int i=0;i<listofChild.size();i++){
            root.add(new Entry(listofChild.get(i)));
        }
          return root;
    }
}
}