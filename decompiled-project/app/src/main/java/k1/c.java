package k1;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import l1.AbstractC1449a;

/* loaded from: classes.dex */
public abstract class c extends AbstractC1449a {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, String[] strArr, int i7) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (TextUtils.isEmpty(strArr[i10])) {
                throw new IllegalArgumentException(h3.o.p(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i10], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i10));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < strArr.length; i12++) {
                if (!hashSet.contains(Integer.valueOf(i12))) {
                    strArr2[i11] = strArr[i12];
                    i11++;
                }
            }
        }
        if (activity instanceof b) {
        }
        activity.requestPermissions(strArr, i7);
    }
}
