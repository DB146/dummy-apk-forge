package J3;

import A0.G0;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* renamed from: J3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342f implements A3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5470a;

    /* renamed from: b, reason: collision with root package name */
    public final q f5471b;

    public /* synthetic */ C0342f(q qVar, int i7) {
        this.f5470a = i7;
        this.f5471b = qVar;
    }

    @Override // A3.n
    public final boolean a(Object obj, A3.l lVar) {
        switch (this.f5470a) {
            case 0:
                this.f5471b.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }

    @Override // A3.n
    public final C3.A b(Object obj, int i7, int i10, A3.l lVar) {
        switch (this.f5470a) {
            case 0:
                q qVar = this.f5471b;
                return qVar.a(new G0((ByteBuffer) obj, qVar.f5493d, qVar.f5492c, 19), i7, i10, lVar, q.j);
            default:
                q qVar2 = this.f5471b;
                return qVar2.a(new G0((ParcelFileDescriptor) obj, qVar2.f5493d, qVar2.f5492c), i7, i10, lVar, q.j);
        }
    }
}
