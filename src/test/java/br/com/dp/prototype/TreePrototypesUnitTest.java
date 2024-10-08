package br.com.dp.prototype;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreePrototypesUnitTest {

    Position position;
    Position otherPosition;

    @BeforeEach
    void setUp() {
        position = new Position(3, 7);
        otherPosition = new Position(4, 8);
    }

    @AfterEach
    void tearDown() {
        position = otherPosition = null;
    }

    @Test
    void givenAPlasticTreePrototypeWhenClonedThenCreateA_Clone() {
        double mass = 10.0;
        double height = 3.7;
        position = new Position(3, 7);
        otherPosition = new Position(4, 8);

        PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(position);
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        anotherPlasticTree.setPosition(otherPosition);

        assertEquals(position, plasticTree.getPosition());
        assertEquals(otherPosition, anotherPlasticTree.getPosition());
    }

    @Test
    void givenAPineTreePrototypeWhenClonedThenCreateA_Clone() {
        double mass = 10.0;
        double height = 3.7;
        position = new Position(3, 7);
        otherPosition = new Position(4, 8);

        PineTree pineTree = new PineTree(mass, height);
        pineTree.setPosition(position);
        PineTree anotherPineTree = (PineTree) pineTree.copy();
        anotherPineTree.setPosition(otherPosition);

        assertEquals(position, pineTree.getPosition());
        assertEquals(otherPosition, anotherPineTree.getPosition());
    }

    @Test
    void givenA_ListOfTreesWhenClonedThenCreateListOfClones() {
        double mass = 10.0;
        double height = 3.7;
        position = new Position(3, 7);
        otherPosition = new Position(4, 8);

        PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(position);
        PineTree pineTree = new PineTree(mass, height);
        pineTree.setPosition(otherPosition);

        List<Tree> trees = Arrays.asList(plasticTree, pineTree);

        List<Tree> treeClones = trees.stream().map(Tree::copy).toList();

        Tree plasticTreeClone = treeClones.get(0);

        assertEquals(mass, plasticTreeClone.getMass());
        assertEquals(height, plasticTreeClone.getHeight());
        assertEquals(position, plasticTreeClone.getPosition());
    }
}
