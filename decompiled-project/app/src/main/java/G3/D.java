package G3;

import java.io.File;

/* loaded from: classes.dex */
public final class D implements s {

    /* renamed from: b, reason: collision with root package name */
    public static final D f4287b = new D(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4288a;

    public /* synthetic */ D(int i7) {
        this.f4288a = i7;
    }

    @Override // G3.s
    public final r a(Object obj, int i7, int i10, A3.l lVar) {
        switch (this.f4288a) {
            case 0:
                return new r(new V3.d(obj), new C0282d(obj, 1));
            case 1:
                File file = (File) obj;
                return new r(new V3.d(file), new C0282d(file, 0));
            default:
                return null;
        }
    }

    @Override // G3.s
    public final boolean b(Object obj) {
        switch (this.f4288a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }
}
