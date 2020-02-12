package com.telran.collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OurTreeSetTest {

    OurTreeSet<Integer> tree = new OurTreeSet<>();
    OurTreeSet<Integer> otherTree = new OurTreeSet<>();

    @Before
    public void setOurSet() {
        tree.add(4);
        tree.add(2);
        tree.add(6);
        tree.add(12);
        tree.add(1);
        tree.add(7);
        tree.add(28);

        otherTree.add(5);
        otherTree.add(8);
        otherTree.add(6);
        otherTree.add(7);
        otherTree.add(1);
    }

    @Test
    public void iteratorTest() {
        int arr[] = {1, 2, 4, 6, 7, 12, 28};
        int i = 0;

        for (int elt : tree) {
            Assert.assertEquals(arr[i], elt);
            i++;
        }
    }

    @Test
    public void addAllTest() {
        tree.addAll(otherTree);
        int arr[] = {1, 2, 4, 5, 6, 7, 8, 12, 28};
        int i = 0;

        for (int elt : tree) {
            Assert.assertEquals(arr[i], elt);
            i++;
        }
    }

    @Test
    public void removeAllTest() {
        tree.removeAll(otherTree);
        int arr[] = {2, 4, 12, 28};
        int i = 0;

        for (int elt : tree) {
            Assert.assertEquals(arr[i], elt);
            i++;
        }
    }

    @Test
    public void retainAllTest() {
        tree.retainAll(otherTree);
        int arr[] = {1, 6, 7};
        int i = 0;

        for (int elt : tree) {
            Assert.assertEquals(arr[i], elt);
            i++;
        }
    }

}
