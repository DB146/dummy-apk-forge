package ab;

import W1.C;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

/* loaded from: classes2.dex */
public final class j extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public LayoutInflater f12813a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f12814b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, C c10) {
        super(context);
        context.getClass();
        Q2.b bVar = new Q2.b(this, 2);
        this.f12813a = null;
        c10.getClass();
        c10.f10288c0.a(bVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(LayoutInflater layoutInflater, C c10) {
        super(r0);
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        Q2.b bVar = new Q2.b(this, 2);
        this.f12813a = layoutInflater;
        c10.getClass();
        c10.f10288c0.a(bVar);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f12814b == null) {
            if (this.f12813a == null) {
                this.f12813a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f12814b = this.f12813a.cloneInContext(this);
        }
        return this.f12814b;
    }
}
