package l5;

import android.text.Layout;

/* loaded from: classes.dex */
public abstract /* synthetic */ class S {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19404a;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        f19404a = iArr;
        try {
            iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f19404a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f19404a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
