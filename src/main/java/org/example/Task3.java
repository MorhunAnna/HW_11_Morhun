package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class Task3 {

    public static void ArrayList()
    {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= 1_000_000; i++)
        {
            arrayList.add(i);
        }
        System.out.println("ArrayList: " );
        for (Integer number:arrayList)
        {
            System.out.println(number + ",");
        }
    }

    public static void randomArrayList()
    {
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1_000_000; i++)
        {
            int randomNumberArrayList = random.nextInt(1_000_000);
            arrayList.add(randomNumberArrayList);
        }
        int randomIndexArrayList = random.nextInt(arrayList.size());
        int randomElementArrayList = arrayList.get(randomIndexArrayList);
            System.out.println("Random number ArrayList: " + randomElementArrayList);
        }


    public static void LinkedList()
    {
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i <= 1_000_000; i++)
        {
            linkedList.add(i);
        }
        System.out.println("LinkedList: ");
        for (Integer numbers : linkedList)
        {
            System.out.print(numbers + ",");
        }
    }

    public static void randomLinkedList()
    {
        List<Integer> arrayList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 1_000_000; i++)
        {
            int randomNumberLinkedList = random.nextInt(1_000_000);
            arrayList.add(randomNumberLinkedList);
        }
        int randomIndexLinkedList = random.nextInt(arrayList.size());
        int randomElementLinkedList = arrayList.get(randomIndexLinkedList);
        System.out.println("Random number LinkedList: " + randomElementLinkedList);
    }




        public static void main(String[] args) {
        ArrayList();
            randomArrayList();



            LinkedList();
            randomLinkedList();
    }
}
