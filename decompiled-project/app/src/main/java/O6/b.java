package O6;

import Q5.e;

/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: d, reason: collision with root package name */
    public final char[] f7484d;

    public b(a aVar) {
        super(aVar, (Character) null);
        this.f7484d = new char[512];
        char[] cArr = aVar.f7480b;
        e.k(cArr.length == 16);
        for (int i7 = 0; i7 < 256; i7++) {
            char[] cArr2 = this.f7484d;
            cArr2[i7] = cArr[i7 >>> 4];
            cArr2[i7 | 256] = cArr[i7 & 15];
        }
    }
}
