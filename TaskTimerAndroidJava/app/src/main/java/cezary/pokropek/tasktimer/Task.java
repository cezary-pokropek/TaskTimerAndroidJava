package cezary.pokropek.tasktimer;

import java.io.Serializable;

class Task implements Serializable {
    public static final long serialVersionUID = 20200720L;

    private long m_Id;
    private final String mName;
    private final String mDescription;
    private final String mSortOrder;

    public Task(long id, String mName, String mDescription, String mSortOrder) {
        this.m_Id = id;
        this.mName = mName;
        this.mDescription = mDescription;
        this.mSortOrder = mSortOrder;
    }

    public long getId() {
        return m_Id;
    }

    public String getmName() {
        return mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmSortOrder() {
        return mSortOrder;
    }

    public void setId(long id) {
        this.m_Id = m_Id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "m_Id=" + m_Id +
                ", mName='" + mName + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mSortOrder='" + mSortOrder + '\'' +
                '}';
    }



    
}
