package com.glmiyamoto.learningkotlin.java;

import android.os.AsyncTask;

public class AsyncTasks {
    void run() {
        new Task().execute();
    }

    class Task extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            // Do something
            return null;
        }
    }
}
