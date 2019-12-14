package com.felixmbikogbia.horology.delegate;

import com.felixmbikogbia.horology.pojo.Zodiac;

/**
 * Created by Barry Allen .
 * boxforbot@gmail.com
 */

public interface Response {
    void onResponseObtained(Zodiac zodiac);

    void onErrorObtained(String errormsg);
}
