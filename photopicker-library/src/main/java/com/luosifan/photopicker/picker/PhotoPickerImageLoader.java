package com.luosifan.photopicker.picker;

import android.content.Context;
import android.widget.ImageView;

/**
 * 图片加载器
 * Created by wzfu on 16/6/4.
 */
public abstract class PhotoPickerImageLoader<IV extends ImageView, PV extends ImageView> {

    /**
     * 创建列表图片
     * @return
     */
    protected abstract IV onCreateGridItemView(Context context);

    /**
     * 加载选择列表图片
     * @param view
     * @param imagePath
     * @param tag
     * @param width
     * @param height
     */
    protected abstract void loadGridItemView(IV view, String imagePath, int tag, int width, int height);

    /**
     * 执行加载图片
     * @param mCxt
     * @param tag
     */
    public abstract void resumeRequests(Context mCxt, int tag);

    /**
     * 暂停加载图片
     * @param mCxt
     * @param tag
     */
    public abstract void pauseRequests(Context mCxt, int tag);

    /**
     * 创建预览图片
     * @return
     */
    protected abstract PV onCreatePreviewItemView(Context context);

    /**
     * 加载选择列表图片
     * @param view
     * @param imagePath
     * @param width
     * @param height
     */
    protected abstract void loadPreviewItemView(PV view, String imagePath, int width, int height);

    /**
     * 缓慢滑动图片列表的时候不去加载图片
     * @return
     */
    protected boolean pauseOnScroll() {
        return false;
    }

    /**
     * 手指在滑动或者猛地一滑动图片列表的时候不去加载图片
     * @return
     */
    protected boolean pauseOnFling() {
        return true;
    }

    public void clearMemoryCache() {

    }
}
