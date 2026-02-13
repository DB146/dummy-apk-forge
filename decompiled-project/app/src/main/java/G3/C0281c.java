package G3;

import java.io.File;

/* renamed from: G3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4296a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4297b;

    public /* synthetic */ C0281c(Object obj, int i7) {
        this.f4296a = i7;
        this.f4297b = obj;
    }

    @Override // G3.s
    public final r a(Object obj, int i7, int i10, A3.l lVar) {
        switch (this.f4296a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new r(new V3.d(bArr), new n(1, bArr, (C) this.f4297b));
            case 1:
                return new r(new V3.d(obj), new B3.b(1, obj.toString(), (C) this.f4297b));
            default:
                File file = (File) obj;
                return new r(new V3.d(file), new B3.b(2, file, (C) this.f4297b));
        }
    }

    @Override // G3.s
    public final boolean b(Object obj) {
        switch (this.f4296a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }
}
