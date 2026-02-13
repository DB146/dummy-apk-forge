package m4;

import P4.C0477z;
import android.os.SystemClock;
import android.text.TextUtils;
import n5.AbstractC1705a;

/* renamed from: m4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1581m extends q0 {

    /* renamed from: c, reason: collision with root package name */
    public final int f20428c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20429d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20430e;

    /* renamed from: f, reason: collision with root package name */
    public final L f20431f;

    /* renamed from: u, reason: collision with root package name */
    public final int f20432u;

    /* renamed from: v, reason: collision with root package name */
    public final C0477z f20433v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f20434w;

    static {
        int i7 = n5.D.f21141a;
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    public C1581m(int i7, Exception exc, int i10) {
        this(i7, exc, i10, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1581m(int i7, Exception exc, int i10, String str, int i11, L l10, int i12, boolean z8) {
        this(TextUtils.isEmpty(null) ? r0 : X.c.h(r0, ": null"), exc, i10, i7, str, i11, l10, i12, null, SystemClock.elapsedRealtime(), z8);
        String str2;
        String str3;
        if (i7 == 0) {
            str2 = "Source error";
        } else if (i7 != 1) {
            str2 = i7 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" error, index=");
            sb2.append(i11);
            sb2.append(", format=");
            sb2.append(l10);
            sb2.append(", format_supported=");
            int i13 = n5.D.f21141a;
            if (i12 == 0) {
                str3 = "NO";
            } else if (i12 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i12 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i12 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            sb2.append(str3);
            str2 = sb2.toString();
        }
    }

    public C1581m(String str, Throwable th, int i7, int i10, String str2, int i11, L l10, int i12, C0477z c0477z, long j, boolean z8) {
        super(str, th, i7, j);
        AbstractC1705a.h(!z8 || i10 == 1);
        AbstractC1705a.h(th != null || i10 == 3);
        this.f20428c = i10;
        this.f20429d = str2;
        this.f20430e = i11;
        this.f20431f = l10;
        this.f20432u = i12;
        this.f20433v = c0477z;
        this.f20434w = z8;
    }

    public final C1581m a(C0477z c0477z) {
        String message = getMessage();
        int i7 = n5.D.f21141a;
        return new C1581m(message, getCause(), this.f20477a, this.f20428c, this.f20429d, this.f20430e, this.f20431f, this.f20432u, c0477z, this.f20478b, this.f20434w);
    }
}
