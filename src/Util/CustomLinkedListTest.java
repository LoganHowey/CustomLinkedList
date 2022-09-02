package Util;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomLinkedListTest {

    @Test
    public void EmptyListReturnsSizeZero(){
        CustomLinkedList<Object> linkedList = new CustomLinkedList<>();
        Assert.assertThat(linkedList.size(), Is.is(0));
    }

    @Test
    public void addIncreasesSize_ExpectSizeOne(){
        CustomLinkedList<Object> linkedList = new CustomLinkedList<>();
        linkedList.add("Things");
        Assert.assertThat(linkedList.size(), Is.is(1));
    }

}