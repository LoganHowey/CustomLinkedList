package Util;

import org.hamcrest.Matcher;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class CustomLinkedListTest {

    @Test
    public void EmptyListReturnsSizeZero() {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        Assert.assertThat(customLinkedList.size(), Is.is(0));
    }

    @Test
    public void addingToList() {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add("Zero");
        customLinkedList.add("One");
        customLinkedList.add("Two");
        customLinkedList.add("Three");
        Object[] expected = new Object[]{"Zero", "One", "Two", "Three"};
        Assert.assertThat(customLinkedList.toArray(), Is.is(expected));
    }

    @Test
    public void addingToListIncreasesSize() {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add("Zero");
        customLinkedList.add("One");
        customLinkedList.add("Two");
        customLinkedList.add("Three");
        Assert.assertThat(customLinkedList.size(), Is.is(4));
    }

    @Test
    public void canGetEntryAtIndex() {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add("Zero");
        customLinkedList.add("One");
        customLinkedList.add("Two");
        customLinkedList.add("Three");
        Assert.assertThat(customLinkedList.get(0), Is.is("Zero"));
        Assert.assertThat(customLinkedList.get(1), Is.is("One"));
        Assert.assertThat(customLinkedList.get(2), Is.is("Two"));
        Assert.assertThat(customLinkedList.get(3), Is.is("Three"));
    }

    @Test(expected = NullPointerException.class)
    public void getEntryAtIndexOutOfBoundsIsNull() {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add("Zero");
        customLinkedList.add("One");
        customLinkedList.add("Two");
        customLinkedList.add("Three");
        customLinkedList.get(5);
    }

    @Test
    public void getIndexOfCheck() {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add("Zero");
        customLinkedList.add("One");
        customLinkedList.add("Two");
        customLinkedList.add("Three");
        Assert.assertThat(customLinkedList.indexOf("Zero"), Is.is(0));
        Assert.assertThat(customLinkedList.indexOf("One"), Is.is(1));
    }
    @Test
    public void getIndexOfOutOfNonExistentObjectCheck() {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add("Zero");
        customLinkedList.add("One");
        customLinkedList.add("Two");
        customLinkedList.add("Three");
        Assert.assertThat(customLinkedList.indexOf("DSDFSDFarfsaasdrtgf"), Is.is(999999));
    }
    @Test
    public void getLastIndexOf() {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.add("Zero");
        customLinkedList.add("One");
        customLinkedList.add("One");
        customLinkedList.add("Two");
        customLinkedList.add("Three");
        Assert.assertThat(customLinkedList.lastIndexOf("One"), Is.is(2));
    }



}