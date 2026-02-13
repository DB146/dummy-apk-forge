package J3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public final class C implements A3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5451a;

    public /* synthetic */ C(int i7) {
        this.f5451a = i7;
    }

    @Override // A3.n
    public final /* bridge */ /* synthetic */ boolean a(Object obj, A3.l lVar) {
        switch (this.f5451a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return true;
        }
    }

    @Override // A3.n
    public final C3.A b(Object obj, int i7, int i10, A3.l lVar) {
        switch (this.f5451a) {
            case 0:
                return new B((Bitmap) obj, 0);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new L3.b(0, drawable);
                }
                return null;
            default:
                return new B((File) obj);
        }
    }
}
