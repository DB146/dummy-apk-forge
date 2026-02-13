package A9;

import android.view.View;

/* renamed from: A9.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC0063a0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0109l2 f1054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0067b0 f1055c;

    public ViewOnClickListenerC0063a0(C0067b0 c0067b0, int i7, C0109l2 c0109l2) {
        this.f1055c = c0067b0;
        this.f1053a = i7;
        this.f1054b = c0109l2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0067b0 c0067b0 = this.f1055c;
        Object obj = c0067b0.f1058b.f1233c.get(this.f1053a);
        T t5 = c0067b0.f1064i.f1087b;
        if (t5 != null) {
            C0101j2 c0101j2 = c0067b0.f1059c.f1221c;
            InterfaceC0149w interfaceC0149w = c0101j2.f1467n;
            if (interfaceC0149w != null) {
                interfaceC0149w.b(this.f1054b, obj, c0101j2, c0101j2.f1460d);
            }
            ((C9.d) t5.f964a).getClass();
        }
    }
}
