package Chapter2.Item11;


public class MainClone {

    public static void main(String[] args) {

        /**
         *
         * contract
         *
         * x.clone() != x  will be true
         *
         * x.clone().getClass() == x.getClass will be true
         *
         * x.clone().equals(x) will be true
         *
         */

        String[] sampleString = {"1","2","3"};




        StackCloneable stackOriginal = new StackCloneable();
        for (String sample : sampleString){
            stackOriginal.push(sample);
        }

        StackCloneable stackShallowCopy = stackOriginal;
//
//        StackCloneable stackCopy = stackOriginal.clone();

        while (!stackOriginal.isEmpty())
            System.out.print(stackOriginal.pop() + " ");

        System.out.println();

        while (!stackShallowCopy.isEmpty())
            System.out.print(stackShallowCopy.pop() + " ");


    }

}
