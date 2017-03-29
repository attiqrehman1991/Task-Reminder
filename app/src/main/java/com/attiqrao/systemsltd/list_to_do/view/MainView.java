/*
 * MIT License
 *
 * Copyright (c) 2017 Attiq ur Rehman
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.attiqrao.systemsltd.list_to_do.view;

import android.content.Context;
import android.graphics.Color;
import android.widget.FrameLayout;

import com.attiqrao.systemsltd.list_to_do.R;

/**
 *  A simple frame layout with 2 child views, one for content one for splash
 *
 * Created by Attiq ur Rehman on 3/29/2017.
 * Senior Software Engineer at Systems Ltd
 * attiq.ur.rehman1991@gmail.com
 */
public class MainView extends FrameLayout {

    private SplashView mSplashView;

    public MainView(Context context) {
        super(context);
        initialize();
    }

    private void initialize() {
        Context context = getContext();

        // initialize the view with all default values
        // you don't need to set these default values, they are already set, except for setIconResource
        // this is only for demonstration purposes
        mSplashView = new SplashView(context);
        mSplashView.setDuration(500); // the animation will last 0.5 seconds
        mSplashView.setBackgroundColor(Color.WHITE); // transparent hole will look white before the animation
        mSplashView.setIconColor(Color.rgb(23, 169, 229)); // this is the Twitter blue color
        mSplashView.setIconResource(R.mipmap.ic_icon); // a Twitter icon with transparent hole in it
        mSplashView.setRemoveFromParentOnEnd(true); // remove the SplashView from MainView once animation is completed

        // add the view
        addView(mSplashView);
    }

    public void unsetSplashView() {
        mSplashView = null;
    }

    public SplashView getSplashView() {
        return mSplashView;
    }
}
