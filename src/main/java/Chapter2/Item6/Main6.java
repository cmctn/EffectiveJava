package Chapter2.Item6;

public class Main6 {

    public static void main(String[] args) {


        StackMemoryLeak example = new StackMemoryLeak();

        example.push(new Sample("red"));
        example.push(new Sample("blue"));

        example.pop();

    }



}
