package prototype;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class __Main {
    public static void main(String[] args) {

        PlasticTree plasticTree = new PlasticTree("100", "150");
        plasticTree.setPosition("position");
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        anotherPlasticTree.setPosition("otherPosition");

        System.out.println("position".equals(plasticTree.getPosition()));
        //true

        System.out.println("otherPosition".equals(anotherPlasticTree.getPosition()));
        //true


        //////////////////////////////////////////////////////////////////////////

        PineTree pineTree = new PineTree("100", "150");
        List<Tree> trees = Arrays.asList(plasticTree, pineTree);
        List<Tree> treeClones = trees.stream().map(Tree::copy).collect(Collectors.toList());
        System.out.println(trees);
        System.out.println(treeClones);
        System.out.println(trees.get(0).equals(treeClones.get(0)));
        //false


    }
}
