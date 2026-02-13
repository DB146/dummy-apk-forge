package P8;

import java.util.EnumMap;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f8230a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8231b;

    /* renamed from: c, reason: collision with root package name */
    public p[] f8232c;

    /* renamed from: d, reason: collision with root package name */
    public final a f8233d;

    /* renamed from: e, reason: collision with root package name */
    public EnumMap f8234e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(String str, byte[] bArr, p[] pVarArr, a aVar) {
        this(str, bArr, pVarArr, aVar, 0);
        System.currentTimeMillis();
    }

    public n(String str, byte[] bArr, p[] pVarArr, a aVar, int i7) {
        this.f8230a = str;
        this.f8231b = bArr;
        this.f8232c = pVarArr;
        this.f8233d = aVar;
        this.f8234e = null;
    }

    public final void a(EnumMap enumMap) {
        if (enumMap != null) {
            EnumMap enumMap2 = this.f8234e;
            if (enumMap2 == null) {
                this.f8234e = enumMap;
            } else {
                enumMap2.putAll(enumMap);
            }
        }
    }

    public final void b(o oVar, Object obj) {
        if (this.f8234e == null) {
            this.f8234e = new EnumMap(o.class);
        }
        this.f8234e.put((EnumMap) oVar, (o) obj);
    }

    public final String toString() {
        return this.f8230a;
    }
}
