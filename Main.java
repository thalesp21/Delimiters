import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Delimiters d1 = new Delimiters("(",")");
        String[] tokens1 = {"(","x + y",")"," * 5"};
        System.out.println(d1.getDelimitersList(tokens1));
        Delimiters d2 = new Delimiters("<q>","</q>");
        String[] tokens2 = {"<q>","yy","</q>","zz","</q>"};
        System.out.println(d2.getDelimitersList(tokens2));
        Delimiters d3 = new Delimiters("<sup>", "</sup>");
        String[] tokens3 = {"<sup>","<sup>","</sup>","<sup>","</sup>","</sup>"};
        ArrayList<String> dels1 = d3.getDelimitersList(tokens3);
        System.out.println(d3.isBalanced(dels1));
        String[] tokens4 = {"<sup>","</sup>","</sup>","<sup>"};
        ArrayList<String> dels2 = d3.getDelimitersList(tokens4);
        System.out.println(d3.isBalanced(dels2));
        String[] tokens5 = {"</sup>"};
        ArrayList<String> dels3 = d3.getDelimitersList(tokens5);
        System.out.println(d3.isBalanced(dels3));
        String[] tokens6 = {"<sup>","<sup>","</sup>"};
        ArrayList<String> dels4 = d3.getDelimitersList(tokens6);
        System.out.println(d3.isBalanced(dels4));
    }
}