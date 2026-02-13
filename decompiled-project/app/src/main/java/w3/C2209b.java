package w3;

import I2.C0330t;
import java.io.File;

/* renamed from: w3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2209b {

    /* renamed from: a, reason: collision with root package name */
    public final String f25753a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f25754b;

    /* renamed from: c, reason: collision with root package name */
    public final File[] f25755c;

    /* renamed from: d, reason: collision with root package name */
    public final File[] f25756d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25757e;

    /* renamed from: f, reason: collision with root package name */
    public C0330t f25758f;
    public final /* synthetic */ C2210c g;

    public C2209b(C2210c c2210c, String str) {
        this.g = c2210c;
        this.f25753a = str;
        int i7 = c2210c.f25767u;
        this.f25754b = new long[i7];
        this.f25755c = new File[i7];
        this.f25756d = new File[i7];
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i10 = 0; i10 < c2210c.f25767u; i10++) {
            sb2.append(i10);
            File[] fileArr = this.f25755c;
            String sb3 = sb2.toString();
            File file = c2210c.f25761a;
            fileArr[i10] = new File(file, sb3);
            sb2.append(".tmp");
            this.f25756d[i10] = new File(file, sb2.toString());
            sb2.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        for (long j : this.f25754b) {
            sb2.append(' ');
            sb2.append(j);
        }
        return sb2.toString();
    }
}
