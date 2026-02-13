package M6;

import android.util.Base64;
import m4.C1575j;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6818a;

    @Override // M6.q
    public final Object get() {
        switch (this.f6818a) {
            case 0:
                throw new IllegalStateException();
            case 1:
                return new C1575j();
            default:
                byte[] bArr = new byte[12];
                n4.h.f21102i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}
