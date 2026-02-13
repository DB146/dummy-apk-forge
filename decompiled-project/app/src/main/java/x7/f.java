package x7;

import Y5.C0662z;

/* loaded from: classes.dex */
public final class f implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final C0662z f26252c = new C0662z(19);

    /* renamed from: a, reason: collision with root package name */
    public final Object f26253a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26254b;

    public f(B7.d dVar) {
        this.f26253a = dVar;
        this.f26254b = f26252c;
    }

    public f(byte[] bArr, int[] iArr) {
        this.f26253a = bArr;
        this.f26254b = iArr;
    }

    @Override // x7.k
    public void a(j jVar, int i7) {
        int[] iArr = (int[]) this.f26254b;
        try {
            jVar.read((byte[]) this.f26253a, iArr[0], i7);
            iArr[0] = iArr[0] + i7;
        } finally {
            jVar.close();
        }
    }
}
