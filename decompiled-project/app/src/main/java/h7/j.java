package h7;

import Y5.C0662z;
import com.google.android.gms.common.api.internal.InterfaceC0961b;

/* loaded from: classes.dex */
public final class j implements InterfaceC0961b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1260f f17859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f17860b;

    public j(k kVar, C1260f c1260f, C0662z c0662z) {
        this.f17860b = kVar;
        this.f17859a = c1260f;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0961b
    public final void a(boolean z8) {
        this.f17860b.f17863c = z8;
        if (z8) {
            this.f17859a.a();
        } else if (this.f17860b.a()) {
            this.f17859a.b(this.f17860b.f17865e - System.currentTimeMillis());
        }
    }
}
