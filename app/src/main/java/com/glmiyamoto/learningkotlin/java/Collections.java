package com.glmiyamoto.learningkotlin.java;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    void test() {
        final List<Test> list = new ArrayList<>();
        list.add(new Test(0, "Test 0"));
        list.add(new Test(1, "Test 1"));
        list.add(new Test(2, "Test 2"));
        list.add(new Test(3, "Test 3"));
        list.add(new Test(4, "Test 4"));
        list.add(new Test(5, "Test 5"));

        Test first = null;
        for (Test item : list) {
            if (item.getId() >= 3 && item.getId() <= 5) {
                first = item;
                break;
            }
        }

        Test last = null;
        for (int i = list.size() - 1; i >= 0; i--) {
            Test item = list.get(i);
            if (item.getId() >= 3 && item.getId() <= 5) {
                last = item;
                break;
            }
        }

        List<Test> even = new ArrayList<>();
        for (Test item : list) {
            if (item.getId() % 2 == 0)
                even.add(item);
        }

        List<Integer> listId = new ArrayList<>();
        for (Test item : list) {
            listId.add(item.getId());
        }
    }

    class Test {
        private final int mId;
        private String mName;

        public Test(int id, String name) {
            mId = id;
            mName = name;
        }

        public int getId() {
            return mId;
        }

        public String getName() {
            return mName;
        }

        public void setName(String name) {
            mName = name;
        }
    }
}
