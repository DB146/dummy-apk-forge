package j5;

import a5.C0775a;
import android.text.Layout;
import h3.o;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f18634c;

    /* renamed from: a, reason: collision with root package name */
    public long f18632a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f18633b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f18635d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f18636e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public int f18637f = 1;
    public int g = 0;

    /* renamed from: h, reason: collision with root package name */
    public float f18638h = -3.4028235E38f;

    /* renamed from: i, reason: collision with root package name */
    public int f18639i = Integer.MIN_VALUE;
    public float j = 1.0f;
    public int k = Integer.MIN_VALUE;

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0071, code lost:
    
        if (r7 == 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0775a a() {
        Layout.Alignment alignment;
        float f4;
        CharSequence charSequence;
        float f10 = this.f18638h;
        float f11 = -3.4028235E38f;
        if (f10 == -3.4028235E38f) {
            int i7 = this.f18635d;
            f10 = i7 != 4 ? i7 != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i10 = this.f18639i;
        if (i10 == Integer.MIN_VALUE) {
            int i11 = this.f18635d;
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            i10 = 1;
                        }
                    }
                }
                i10 = 2;
            }
            i10 = 0;
        }
        C0775a c0775a = new C0775a();
        int i12 = this.f18635d;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            o.u(i12, "Unknown textAlignment: ", "WebvttCueParser");
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            c0775a.f12696c = alignment;
            f4 = this.f18636e;
            int i13 = this.f18637f;
            if (f4 != -3.4028235E38f || i13 != 0 || (f4 >= 0.0f && f4 <= 1.0f)) {
                if (f4 == -3.4028235E38f) {
                    f11 = f4;
                }
                c0775a.f12698e = f11;
                c0775a.f12699f = i13;
                c0775a.g = this.g;
                c0775a.f12700h = f10;
                c0775a.f12701i = i10;
                float f12 = this.j;
                if (i10 == 0) {
                    f10 = 1.0f - f10;
                } else if (i10 == 1) {
                    f10 = f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
                } else if (i10 != 2) {
                    throw new IllegalStateException(String.valueOf(i10));
                }
                c0775a.f12702l = Math.min(f12, f10);
                c0775a.f12706p = this.k;
                charSequence = this.f18634c;
                if (charSequence != null) {
                    c0775a.f12694a = charSequence;
                }
                return c0775a;
            }
            f11 = 1.0f;
            c0775a.f12698e = f11;
            c0775a.f12699f = i13;
            c0775a.g = this.g;
            c0775a.f12700h = f10;
            c0775a.f12701i = i10;
            float f122 = this.j;
            if (i10 == 0) {
            }
            c0775a.f12702l = Math.min(f122, f10);
            c0775a.f12706p = this.k;
            charSequence = this.f18634c;
            if (charSequence != null) {
            }
            return c0775a;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        c0775a.f12696c = alignment;
        f4 = this.f18636e;
        int i132 = this.f18637f;
        if (f4 != -3.4028235E38f) {
        }
        if (f4 == -3.4028235E38f) {
        }
        c0775a.f12698e = f11;
        c0775a.f12699f = i132;
        c0775a.g = this.g;
        c0775a.f12700h = f10;
        c0775a.f12701i = i10;
        float f1222 = this.j;
        if (i10 == 0) {
        }
        c0775a.f12702l = Math.min(f1222, f10);
        c0775a.f12706p = this.k;
        charSequence = this.f18634c;
        if (charSequence != null) {
        }
        return c0775a;
    }
}
