import java.util.Stack;
class test {
    public static void main(String[] agr) {
        Stack<Integer> s = new Stack<>(); 
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        System.out.println("Position of 4 in stack: " + s.search(4));
    }
}