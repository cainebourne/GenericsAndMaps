package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import common.DogByName;
import java.util.Arrays;
import java.util.TreeSet;

/**
 *
 * @author L117student
 */
public class StartUp {

    public static void main(String[] args) {

        //Lab 1
        Set<Dog> dogSet = new TreeSet<>();
        dogSet.add(new Dog("Fido", 1,"001"));
        dogSet.add(new Dog("Rex",10,"002"));
        dogSet.add(new Dog("Rex", 14,"001"));//dupe
        dogSet.add(new Dog("Wolfie",7,"003"));
        
        System.out.println("Lab 1: TreeSet Sort By Primary (Rabies ID)");
        for(Dog dog : dogSet) System.out.println(dog);
        
        //Lab 2 
        List<Dog> dogList = new ArrayList<>(dogSet);
        Collections.sort(dogList, new DogByName());
        
        System.out.println("\nLab 2: List Sort By Alternet (Name) ");
        for(Dog dog : dogList) System.out.println(dog);
        
        //Lab 3
        Map<String,Dog> dogMap = new TreeMap<>();
        dogMap.put("1", new Dog("Fido", 1,"001"));
        dogMap.put("2",new Dog("Rex",10,"002"));
        dogMap.put("3",new Dog("Wolfie",7,"003"));
        dogMap.put("4",new Dog("Rex", 14, "001")); //Duplicate
        
        Collection<Dog> values = dogMap.values();
        List<Dog> dogListFromMap = new ArrayList<>(values);
        Collections.sort(dogListFromMap);
        
        System.out.println("\nLab 3: TreeMap -> List -> Sort By Primary (Rabies ID)");
        for(Dog dog : dogListFromMap) System.out.println(dog);
        
        //Lab 4
        Dog[] dogArray = dogList.toArray(new Dog[0]);
        Arrays.sort(dogArray);
        
        System.out.println("\nLab 4: Array Sort by Primary (Rabies ID)");
        for(Dog dog : dogArray) System.out.println(dog);
    }
}
