package com.example.learn.innerclass;


public class Student {
    private String stuName;
    private Sync sync;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Sync getSync() {
        return sync;
    }

    public void setSync(Sync sync) {
        this.sync = sync;
    }

    public Student(String stuName, Sync sync) {
        this.stuName = stuName;
        this.sync = sync;
    }

    public Student(String stuName) {
        this.stuName = stuName;
        this.sync = new FairSync();
    }

    abstract static class Sync {
        private String syncName;

        public String getSyncName() {
            return syncName;
        }

        public void setSyncName(String syncName) {
            this.syncName = syncName;
        }
    }

     final class FairSync extends Sync {
        private String fairSyncName;

        public String getFairSyncName() {
            return fairSyncName;
        }

        public void setFairSyncName(String fairSyncName) {
            this.fairSyncName = fairSyncName;
        }
    }

    public static void main(String[] args){
        Student student1 = new Student("小明");
        student1.sync.setSyncName("sync小明");

        Student student2 = new Student("小红");
        student2.sync.setSyncName("sync小红");

        System.out.println(student1.getSync().syncName);
    }

}
