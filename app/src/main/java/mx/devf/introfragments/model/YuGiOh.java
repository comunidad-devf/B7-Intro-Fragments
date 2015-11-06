package mx.devf.introfragments.model;

/**
 * Created by gerardogtn on 11/5/15.
 */
public class YuGiOh {

    private String mName;
    private int mAttack;
    private int mDefense;
    private int mImageId;

    public YuGiOh(String mName, int mAttack, int mDefense, int mImageId) {
        this.mName = mName;
        this.mAttack = mAttack;
        this.mDefense = mDefense;
        this.mImageId = mImageId;
    }


    public String getName() {
        return mName;
    }

    public int getAttack() {
        return mAttack;
    }

    public int getDefense() {
        return mDefense;
    }

    public int getmImageId() {
        return mImageId;
    }
}
