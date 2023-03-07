public class test {
    public static void main(String[] args) {
        singleLinkedList<Integer>list=new singleLinkedList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);

        while (!list.isEmpty()){
            System.out.println(list.removeFirst()+" ");
        }
    }
}
