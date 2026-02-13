package m4;

import java.io.IOException;

/* renamed from: m4.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1586o0 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20469a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20470b;

    public C1586o0(String str, Exception exc, boolean z8, int i7) {
        super(str, exc);
        this.f20469a = z8;
        this.f20470b = i7;
    }

    public static C1586o0 a(String str, Exception exc) {
        return new C1586o0(str, exc, true, 1);
    }

    public static C1586o0 b(String str, Exception exc) {
        return new C1586o0(str, exc, true, 4);
    }

    public static C1586o0 c(String str) {
        return new C1586o0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.getMessage());
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f20469a);
        sb2.append(", dataType=");
        return A3.c.k(sb2, this.f20470b, "}");
    }
}
