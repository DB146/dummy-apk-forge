package b4;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: b4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0837h {

    /* renamed from: a, reason: collision with root package name */
    public final String f13851a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f13852b;

    /* renamed from: c, reason: collision with root package name */
    public final C0840k f13853c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13854d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13855e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f13856f;
    public final Integer g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13857h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f13858i;
    public final byte[] j;

    public C0837h(String str, Integer num, C0840k c0840k, long j, long j10, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f13851a = str;
        this.f13852b = num;
        this.f13853c = c0840k;
        this.f13854d = j;
        this.f13855e = j10;
        this.f13856f = hashMap;
        this.g = num2;
        this.f13857h = str2;
        this.f13858i = bArr;
        this.j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f13856f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f13856f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y.k, java.lang.Object] */
    public final Y.k c() {
        ?? obj = new Object();
        String str = this.f13851a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        obj.f11054a = str;
        obj.f11055b = this.f13852b;
        obj.g = this.g;
        obj.f11060h = this.f13857h;
        obj.f11061i = this.f13858i;
        obj.j = this.j;
        C0840k c0840k = this.f13853c;
        if (c0840k == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        obj.f11056c = c0840k;
        obj.f11057d = Long.valueOf(this.f13854d);
        obj.f11058e = Long.valueOf(this.f13855e);
        obj.f11059f = new HashMap(this.f13856f);
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0837h)) {
            return false;
        }
        C0837h c0837h = (C0837h) obj;
        if (this.f13851a.equals(c0837h.f13851a)) {
            Integer num = c0837h.f13852b;
            Integer num2 = this.f13852b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f13853c.equals(c0837h.f13853c) && this.f13854d == c0837h.f13854d && this.f13855e == c0837h.f13855e && this.f13856f.equals(c0837h.f13856f)) {
                    Integer num3 = c0837h.g;
                    Integer num4 = this.g;
                    if (num4 != null ? num4.equals(num3) : num3 == null) {
                        String str = c0837h.f13857h;
                        String str2 = this.f13857h;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            if (Arrays.equals(this.f13858i, c0837h.f13858i) && Arrays.equals(this.j, c0837h.j)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f13851a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f13852b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f13853c.hashCode()) * 1000003;
        long j = this.f13854d;
        int i7 = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j10 = this.f13855e;
        int hashCode3 = (((i7 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f13856f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f13857h;
        return ((((hashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f13858i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f13851a + ", code=" + this.f13852b + ", encodedPayload=" + this.f13853c + ", eventMillis=" + this.f13854d + ", uptimeMillis=" + this.f13855e + ", autoMetadata=" + this.f13856f + ", productId=" + this.g + ", pseudonymousId=" + this.f13857h + ", experimentIdsClear=" + Arrays.toString(this.f13858i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
