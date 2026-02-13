package b3;

import android.media.tv.TvContentRating;
import java.util.Arrays;

/* renamed from: b3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0829d {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f13818a = {"_id", "package_name", "type", "display_name", "description", "app_link_intent_uri", "internal_provider_id", "internal_provider_data", "internal_provider_flag1", "internal_provider_flag2", "internal_provider_flag3", "internal_provider_flag4"};

    /* renamed from: b, reason: collision with root package name */
    public static final TvContentRating[] f13819b = new TvContentRating[0];

    public static Object[] a(Object[] objArr, Object[]... objArr2) {
        int length = objArr.length;
        for (Object[] objArr3 : objArr2) {
            length += objArr3.length;
        }
        Object[] copyOf = Arrays.copyOf(objArr, length);
        int length2 = objArr.length;
        for (Object[] objArr4 : objArr2) {
            System.arraycopy(objArr4, 0, copyOf, length2, objArr4.length);
            length2 += objArr4.length;
        }
        return copyOf;
    }
}
