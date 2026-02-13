package y1;

import android.text.TextUtils;
import android.view.View;

/* renamed from: y1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2375x extends Fb.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2375x(int i7, Class cls, int i10, int i11, int i12) {
        super(i7, cls, i10, i11);
        this.f26744e = i12;
    }

    @Override // Fb.e
    public final Object b(View view) {
        switch (this.f26744e) {
            case 0:
                return Boolean.valueOf(F.c(view));
            case 1:
                return F.a(view);
            case 2:
                return H.b(view);
            default:
                return Boolean.valueOf(F.b(view));
        }
    }

    @Override // Fb.e
    public final void c(View view, Object obj) {
        switch (this.f26744e) {
            case 0:
                F.f(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                F.e(view, (CharSequence) obj);
                return;
            case 2:
                H.c(view, (CharSequence) obj);
                return;
            default:
                F.d(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override // Fb.e
    public final boolean f(Object obj, Object obj2) {
        switch (this.f26744e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
