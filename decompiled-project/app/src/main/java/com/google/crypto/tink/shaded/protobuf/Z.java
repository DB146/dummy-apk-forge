package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1007a f15751a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15752b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f15753c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15754d;

    public Z(AbstractC1007a abstractC1007a, String str, Object[] objArr) {
        this.f15751a = abstractC1007a;
        this.f15752b = str;
        this.f15753c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f15754d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 < 55296) {
                this.f15754d = i7 | (charAt2 << i11);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            }
        }
    }

    public final AbstractC1007a a() {
        return this.f15751a;
    }

    public final Object[] b() {
        return this.f15753c;
    }

    public final String c() {
        return this.f15752b;
    }

    public final int d() {
        return (this.f15754d & 1) == 1 ? 1 : 2;
    }
}
