package r4;

import java.util.UUID;
import q4.InterfaceC1888a;

/* loaded from: classes.dex */
public final class z implements InterfaceC1888a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f23781d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f23782a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f23783b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23784c;

    static {
        boolean z8;
        if ("Amazon".equals(n5.D.f21143c)) {
            String str = n5.D.f21144d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z8 = true;
                f23781d = z8;
            }
        }
        z8 = false;
        f23781d = z8;
    }

    public z(UUID uuid, byte[] bArr, boolean z8) {
        this.f23782a = uuid;
        this.f23783b = bArr;
        this.f23784c = z8;
    }
}
