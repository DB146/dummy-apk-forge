package Y0;

import A0.t0;
import Q.C0502m;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f11126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rb.c f11127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0502m f11128c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z.j f11129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f11131f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, Rb.c cVar, C0502m c0502m, Z.j jVar, int i7, View view) {
        super(0);
        this.f11126a = context;
        this.f11127b = cVar;
        this.f11128c = c0502m;
        this.f11129d = jVar;
        this.f11130e = i7;
        this.f11131f = view;
    }

    @Override // Rb.a
    public final Object invoke() {
        KeyEvent.Callback callback = this.f11131f;
        kotlin.jvm.internal.l.c(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        t0 t0Var = (t0) callback;
        return new q(this.f11126a, this.f11127b, this.f11128c, this.f11129d, this.f11130e, t0Var).getLayoutNode();
    }
}
