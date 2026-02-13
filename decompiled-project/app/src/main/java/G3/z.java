package G3;

import J3.C0340d;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* loaded from: classes.dex */
public final class z implements t, O3.a {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f4349a;

    public /* synthetic */ z(Resources resources) {
        this.f4349a = resources;
    }

    @Override // O3.a
    public C3.A B(C3.A a9, A3.l lVar) {
        if (a9 == null) {
            return null;
        }
        return new C0340d(this.f4349a, a9);
    }

    @Override // G3.t
    public s m(y yVar) {
        return new C0280b(this.f4349a, yVar.a(Uri.class, AssetFileDescriptor.class));
    }
}
